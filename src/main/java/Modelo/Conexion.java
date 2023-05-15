package Modelo;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.filechooser.FileSystemView;

public class Conexion {

    Connection con;

    public Connection getConnection() {
        try {
            String myDB="jdbc:mysql://localhost:3306/inventario?serverTimezone=UTC";
            con = DriverManager.getConnection(myDB,"root","");
            return con;
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return null;
    }

}
