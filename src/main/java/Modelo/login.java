
package Modelo;

public class login {
    private int id;
    private String nombre;
    private String correo;
    private String contraseña;
   // private String rol;

    public login() {
    }

    public login(int id, String nombre, String correo, String contraseña) {//quite el rol volver a ponerlo
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        this.contraseña = contraseña;
        //this.rol = rol;
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

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

   /* public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }*/


    
}
