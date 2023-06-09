
package Modelo;

/**
 *
 * @author Jhontabo
 */
public class Cliente {
    
   private int id;
   private String cedula;
   private String nombre;
   private String direccion;
   private String telefono;
   private String correo;
   private String fecha;

    public Cliente() {
    }

    public Cliente(int id,String cedula, String nombre, String direccion, String telefono, String correo) {
        this.id = id;
        this.cedula=cedula;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String corre) {
        this.correo = corre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    
    
   
    
}
