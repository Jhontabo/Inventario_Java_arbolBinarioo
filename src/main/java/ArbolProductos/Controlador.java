
package ArbolProductos;

/**
 *
 * @author Jhontabo
 */


import java.util.LinkedList;

public class Controlador {

    ArbolProductos arbolProductos = new ArbolProductos();

    public Controlador() {
    }

    public boolean agregarProducto(Producto producto) {
        return arbolProductos.agregar(producto);
    }

    public boolean eliminarProducto(int id) {
        Producto producto = new Producto(id, "", "", "", 0, 0.0);
        return arbolProductos.eliminar(producto);
    }

    public String preOrden() {
        LinkedList<Producto> productos = arbolProductos.preOrden();
        return recorrido(productos, "PreOrden");
    }

    public String inOrden() {
        LinkedList<Producto> productos = arbolProductos.inOrden();
        return recorrido(productos, "InOrden");
    }

    public String postOrden() {
        LinkedList<Producto> productos = arbolProductos.postOrden();
        return recorrido(productos, "PosOrden");
    }

    private String recorrido(LinkedList<Producto> productos, String msg) {
        StringBuilder builder = new StringBuilder();
        builder.append(msg).append("\n");
        for (Producto producto : productos) {
            builder.append("\t").append(producto.toString()).append("\n");
        }
        return builder.toString();
    }

    public String buscarProducto(int id) {
        Producto producto = new Producto(id, "", "", "", 0, 0.0);
        boolean existe = arbolProductos.existe(id);
        String resultado = "El producto con ID " + id + "\n";
        resultado += existe ? "Se encuentra en el inventario" : "No se encuentra en el inventario";
        return resultado;
    }
}
