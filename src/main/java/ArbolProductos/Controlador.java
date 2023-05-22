
package ArbolProductos;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;


import ArbolProductos.ArbolProductos;
import ArbolProductos.Producto;
import Modelo.Conexion;
import javax.swing.JOptionPane;


public class Controlador {

    ArbolProductos miArbol = new ArbolProductos();
    
    Conexion cn= new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    public Controlador() {
    }
    
    
    public boolean insertar(Producto producto) {
  	  String sql = "INSERT INTO productos (codigo, nombre,tipo,cantidad,precio) VALUES (?, ?, ?, ?, ?)";
  	  
          try
        {
  	  ps.setInt(1, producto.getCodigo());
  	  ps.setString(2, producto.getNombre());
  	  ps.setString(3, producto.getTipo());
  	  ps.setInt(4, producto.getCantidad());
  	  ps.setDouble(5, producto.getPrecio());
  	  ps.execute();
          return true;
        } catch (SQLException e)
        {
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        }finally{
            try
            {
                con.close();
            } catch (SQLException e)
            {
                System.out.println(e.toString());
            }
        }
        
    }
    
    
     public boolean EliminarProductos(int codigo){
       String sql="DELETE FROM productos WHERE id =?";
       
        try
        {
            ps=con.prepareStatement(sql);
            ps.setInt(1, codigo);
            ps.execute();
            return miArbol.eliminarProducto(codigo);
        } catch (SQLException e)
        {
            System.out.println(e.toString());
            return false;
        }finally{
           try
           {
               con.close();
           } catch (SQLException ex)
           {
               System.out.println(ex.toString());
           }
        }
    }
     
      public List ListarPr(){
        List<Producto> ListaPr = new ArrayList();
        String sql="SELECT * FROM productos";
        try
        {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            
            while(rs.next()){
                
                int codigo=rs.getInt("codigo");
                String nombre=rs.getString("nombre");
                String tipo=rs.getString("tipo");
                int cantidad =rs.getInt("cantidad");
                double precio=rs.getDouble("precio");
                int id=rs.getInt("id");
                ListaPr.add(new Producto(id,codigo, nombre, tipo, cantidad,precio));
            }
        } catch (SQLException e)
        {
            System.out.println(e.toString());
        }
        return ListaPr;
    }
      
    

    
      public boolean ModificarProducto(Producto pr){
        String sql ="UPDATE Productos SET codigo=?,nombre=?,tipo=?,cantidad=?,preicio=? WHERE id=?"; 
        
        try
        {
           //con =cn.getConnection();
           ps=con.prepareStatement(sql);
           ps.setInt(1, pr.getCodigo());
           ps.setString(2,pr.getNombre());
           ps.setString(3, pr.getTipo());
           ps.setInt(4, pr.getCantidad());
           ps.setDouble(5, pr.getPrecio());
           ps.setInt(6,pr.getId());
           ps.execute();
           return true;
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        }finally{
            try
            {
                con.close();
            } catch (SQLException e)
            {
                System.out.println(e.toString());
            }
        }
    }
}
