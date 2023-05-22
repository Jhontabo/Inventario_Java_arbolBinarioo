
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
    
    
    public boolean AgregarProducto(Producto producto) {
  	  String sql = "INSERT INTO productos (codigo, nombre,tipo,cantidad,precio) VALUES (?, ?, ?, ?, ?)";
  	  
          try
        {
          con =cn.getConnection();
          ps=con.prepareStatement(sql);
  	  ps.setInt(1, producto.getCodigo());
  	  ps.setString(2, producto.getNombre());
  	  ps.setString(3, producto.getTipo());
  	  ps.setInt(4, producto.getCantidad());
  	  ps.setDouble(5, producto.getPrecio());
  	  ps.execute();
          miArbol.agregarNodo(producto);
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
    
    
     public boolean EliminarProductos(int id) {
    String sql = "DELETE FROM productos WHERE id = ?";
    try {
        con = cn.getConnection();
        ps = con.prepareStatement(sql);
        ps.setInt(1, id);
        ps.execute();
        return miArbol.eliminarProducto(id); // Eliminar el producto del árbol
    } catch (SQLException e) {
        System.out.println(e.toString());
        return false;
    } finally {
        // Código de cierre de conexión y manejo de excepciones
         try
            {
                con.close();
            } catch (SQLException e)
            {
                System.out.println(e.toString());
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
                Producto prd= new Producto();
                prd.setId(rs.getInt("id"));
                prd.setCodigo(rs.getInt("codigo"));
                prd.setNombre(rs.getString("nombre"));
                prd.setTipo(rs.getString("tipo"));
                prd.setCantidad(rs.getInt("cantidad")); 
                prd.setPrecio(rs.getDouble("precio"));
                
                ListaPr.add(prd);
            }
        } catch (SQLException e)
        {
            System.out.println(e.toString());
        }
        return ListaPr;
    }
      
    

    
      public boolean ModificarProducto(Producto pr){
        String sql ="UPDATE Productos SET codigo=?,nombre=?,tipo=?,cantidad=?,precio=? WHERE id=?"; 
        
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
