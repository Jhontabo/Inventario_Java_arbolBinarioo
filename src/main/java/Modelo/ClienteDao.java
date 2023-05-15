
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Jhontabo
 */
public class ClienteDao {
    
    
    Conexion cn= new Conexion();
    Connection con;
    PreparedStatement ps;
    
    public boolean RegistrarCliente(Cliente cl){
        String sql ="INSERT INTO clientes (nombre,dirección,telefono,correo)VALUES(?,?,?,?)"; 
        
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
    
}
