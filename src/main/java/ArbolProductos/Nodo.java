
package ArbolProductos;

/**
 *
 * @author Jhontabo
 */

public class Nodo {
    private Producto producto;
    private Nodo izquierdo;
    private Nodo derecho;
  
    public Nodo(Producto producto,Nodo izquierdo,Nodo derecho) {
        this.producto = producto;
        this.izquierdo = null;
        this.derecho = null;
    }
  
    public Producto getProducto() {
        return producto;
    }
  
    public void setProducto(Producto producto) {
        this.producto = producto;
    }
  
    public Nodo getIzquierdo() {
        return izquierdo;
    }
  
    public void setIzquierdo(Nodo izquierdo) {
        this.izquierdo = izquierdo;
    }
  
    public Nodo getDerecho() {
        return derecho;
    }
  
    public void setDerecho(Nodo derecho) {
        this.derecho = derecho;
    }
}

