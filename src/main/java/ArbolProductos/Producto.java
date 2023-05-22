
package ArbolProductos;

/**
 *
 * @author Jhontabo
 */
public class Producto {
    private int id;
    private int codigo;
    private String nombre;
    private String tipo;
    private int cantidad;
    private double precio;

    public Producto() {
    }

    public Producto(int id, int codigo, String nombre, String tipo, int cantidad, double precio) {
        this.id = id;
        this.codigo = codigo;
        this.nombre = nombre;
        this.tipo = tipo;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    // Constructor, getters y setters aquí
    
    // Resto de los métodos de la clase Producto

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}

