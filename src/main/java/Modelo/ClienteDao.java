
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Jhontabo
 */
public class ClienteDao {
    
    
    Conexion cn= new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    public boolean RegistrarCliente(Cliente cl){
        String sql ="INSERT INTO clientes (nombre,direccion,telefono,correo)VALUES(?,?,?,?)"; 
        
        try
        {
           con =cn.getConnection();
           ps=con.prepareStatement(sql);
           ps.setString(1, cl.getNombre());
           ps.setString(2, cl.getDireccion());
           ps.setString(3, cl.getTelefono());
           ps.setString(4, cl.getCorreo());
           ps.execute();
           return true;
        } catch (Exception e){
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
    
    
    public List Listarcliente(){
        List<Cliente> ListaCl = new ArrayList();
        String sql="SELECT * FROM clientes";
        try
        {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            
            while(rs.next()){
                Cliente cl= new Cliente();
                cl.setId(rs.getInt("id"));
                cl.setNombre(rs.getString("nombre"));
                cl.setDireccion(rs.getString("direccion"));
                cl.setTelefono(rs.getString("telefono"));
                cl.setCorreo(rs.getString("correo"));
                ListaCl.add(cl);
            }
        } catch (SQLException e)
        {
            System.out.println(e.toString());
        }
        return ListaCl;
    }
    
}
