package ArbolProductos;

import java.util.ArrayList;
import java.util.List;

public class ArbolProductos {
    private Nodo raiz;
    int num_nodos;

    public ArbolProductos() {
        raiz = null;
    }

    public boolean agregarNodo(Producto producto) {
        Nodo nuevo = new Nodo(producto, null, null);
        insertarNodoProducto(nuevo, raiz);
        return true;
    }

    public void insertarNodoProducto(Nodo nuevoNodo, Nodo nodoPadre) {
        if (raiz == null) {
            raiz = nuevoNodo;
        } else if ((nuevoNodo.getProducto().getId()) < (nodoPadre.getProducto().getId())) {
            if (nodoPadre.getIzquierdo()== null) {
                nodoPadre.setIzquierdo(nuevoNodo);
            } else {
                insertarNodoProducto(nuevoNodo, nodoPadre.getIzquierdo());
            }
        } else if ((nuevoNodo.getProducto().getId()) > (nodoPadre.getProducto().getId())) {
            if (nodoPadre.getDerecho()== null) {
                nodoPadre.setDerecho(nuevoNodo);
            } else {
                insertarNodoProducto(nuevoNodo, nodoPadre.getDerecho());
            }
        }
    }

    public Nodo getRaiz() {
        return raiz;
    }

    public void setRaiz(Nodo raiz) {
        this.raiz = raiz;
    }

    public List<Producto> recorrerPreorden() {
        List<Producto> productos = new ArrayList<>();
        recorrerPreorden(raiz, productos);
        return productos;
    }

    private void recorrerPreorden(Nodo nodoActual, List<Producto> productos) {
        if (nodoActual != null) {
            productos.add(nodoActual.getProducto());
            recorrerPreorden(nodoActual.getIzquierdo(), productos);
            recorrerPreorden(nodoActual.getDerecho(), productos);
        }
    }

    public List<Producto> recorrerInorden() {
        List<Producto> productos = new ArrayList<>();
        recorrerInorden(raiz, productos);
        return productos;
    }

    private void recorrerInorden(Nodo nodoActual, List<Producto> productos) {
        if (nodoActual != null) {
            recorrerInorden(nodoActual.getIzquierdo(), productos);
            productos.add(nodoActual.getProducto());
            recorrerInorden(nodoActual.getDerecho(), productos);
        }
    }

    public List<Producto> recorrerPostorden() {
        List<Producto> productos = new ArrayList<>();
        recorrerPostorden(raiz, productos);
        return productos;
    }

    private void recorrerPostorden(Nodo nodoActual, List<Producto> productos) {
        if (nodoActual != null) {
            recorrerPostorden(nodoActual.getIzquierdo(), productos);
            recorrerPostorden(nodoActual.getDerecho(), productos);
            productos.add(nodoActual.getProducto());
        }
    }

    public boolean existeNodo(Producto producto) {
        Nodo aux = raiz;
        while (aux != null) {
            if (producto.getId() == (aux.getProducto().getId())) {
                return true;
            } else if (producto.getId() > (aux.getProducto().getId())) {
                aux = aux.getDerecho();
            } else {
                aux = aux.getIzquierdo();
            }
        }
        return false;
    }

    public Producto buscarProducto(int id) {
        Nodo nodoActual = raiz;
        while (nodoActual != null && !(nodoActual.getProducto().getId() == id)) {
            if (id < nodoActual.getProducto().getId()) {
                nodoActual = nodoActual.getIzquierdo();
            } else {
                nodoActual = nodoActual.getDerecho();
            }
        }
        if (nodoActual != null) {
            return nodoActual.getProducto();
        } else {
            return null;
        }
    }

    public boolean eliminarProducto(int id) {
        raiz = eliminarProducto(raiz, id);
        return true;
    }

    private Nodo eliminarProducto(Nodo nodoActual, int id) {
        if (nodoActual == null) {
            return nodoActual;
        }
        if (id == nodoActual.getProducto().getId()) {
            nodoActual.setIzquierdo(eliminarProducto(nodoActual.getIzquierdo(), id));
        } else if (id > nodoActual.getProducto().getId()) {
            nodoActual.setDerecho(eliminarProducto(nodoActual.getDerecho(), id));
        } else {
            if (nodoActual.getIzquierdo()== null) {
                return nodoActual.getDerecho();
            } else if (nodoActual.getDerecho()== null) {
                return nodoActual.getIzquierdo();
            }
            Nodo sucesor = encontrarSucesor(nodoActual.getDerecho());
            nodoActual.setProducto(sucesor.getProducto());
            nodoActual.setDerecho(eliminarProducto(nodoActual.getDerecho(), sucesor.getProducto().getId()));
        }
        return nodoActual;
    }

    private Nodo encontrarSucesor(Nodo nodoActual) {
        while (nodoActual.getIzquierdo()!= null) {
            nodoActual = nodoActual.getIzquierdo();
        }
        return nodoActual;
    }
}
