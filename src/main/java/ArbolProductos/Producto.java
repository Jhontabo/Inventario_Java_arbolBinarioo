package ArbolProductos;

/**
 *
 * @author Jhontabo
 */
public class Producto {
    private String nombre;
    private String Tipo;
    private Double precio;
    private int cantidad;
    private int Id_producto;
   
    
    
    
    public Producto(String nombre, String Tipo, Double precio, int cantidad, int Id_producto) {
        this.nombre = nombre;
        this.Tipo = Tipo;
        this.precio = precio;
        this.cantidad = cantidad;
        this.Id_producto = Id_producto;
    }
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the precio
     */
    public Double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    

    
    /**
     * @return the cantidad
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * @return the Tipo
     */
    public String getTipo() {
        return Tipo;
    }

    /**
     * @param Tipo the Tipo to set
     */
    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    /**
     * @return the Id_producto
     */
    public int getId_producto() {
        return Id_producto;
    }

    /**
     * @param Id_producto the Id_producto to set
     */
    public void setId_producto(int Id_producto) {
        this.Id_producto = Id_producto;
    }
}

