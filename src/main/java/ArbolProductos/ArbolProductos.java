
package ArbolProductos;

/**
 *
 * @author Jhontabo
 */



import java.util.LinkedList;

public class ArbolProductos {

	private Nodo raiz;
	int numNodos;
	int altura;

	public ArbolProductos() {
		raiz = null;
	}
        
        public Nodo getRaiz() {
		return raiz;
	}

	public void setRaiz(Nodo raiz) {
		this.raiz = raiz;
	}

	public boolean agregar(Producto producto) {
		Nodo nuevo = new Nodo(producto, null, null);
		insertar(nuevo, raiz);
		return true;
	}
        
        
        public boolean eliminar(Producto producto) {
		Nodo nuevo = new Nodo(producto, null, null);
		eliminar(nuevo, raiz,null,true);
		return true;
	}

	public void insertar(Nodo nuevo, Nodo pivote) {
		if (this.raiz == null) {
			raiz = nuevo;
		} else {
			if (nuevo.getProducto().getId() == pivote.getProducto().getId()) {
				nuevo = null;
			}
			if (nuevo.getProducto().getId() <= pivote.getProducto().getId()) {
				if (pivote.getIzquierdo() == null) {
					pivote.setIzquierdo(nuevo);
				} else {
					insertar(nuevo, pivote.getIzquierdo());
				}
			} else {
				if (pivote.getDerecho() == null) {
					pivote.setDerecho(nuevo);
				} else {
					insertar(nuevo, pivote.getDerecho());
				}
			}
		}
	}

	public LinkedList<Producto> preOrden() {
		LinkedList<Producto> recorrido = new LinkedList<>();
		preOrden(raiz, recorrido);
		return recorrido;
	}

	public void preOrden(Nodo aux, LinkedList<Producto> recorrido) {
		if (aux != null) {
			recorrido.add(aux.getProducto());
			preOrden(aux.getIzquierdo(), recorrido);
			preOrden(aux.getDerecho(), recorrido);
		}
	}

	public LinkedList<Producto> inOrden() {
		LinkedList<Producto> recorrido = new LinkedList<>();
		inOrden(raiz, recorrido);
		return recorrido;
	}

	public void inOrden(Nodo aux, LinkedList<Producto> recorrido) {
		if (aux != null) {
			inOrden(aux.getIzquierdo(), recorrido);
			recorrido.add(aux.getProducto());
			inOrden(aux.getDerecho(), recorrido);
		}
	}

	public LinkedList<Producto> postOrden() {
		LinkedList<Producto> recorrido = new LinkedList<>();
		postOrden(raiz, recorrido);
		return recorrido;
	}

	public void postOrden(Nodo aux, LinkedList<Producto> recorrido) {
		if (aux != null) {
			postOrden(aux.getIzquierdo(), recorrido);
			postOrden(aux.getDerecho(), recorrido);
			recorrido.add(aux.getProducto());
		}
	}
        
        
        public void eliminar(Nodo nuevo, Nodo pivote, Nodo padre, boolean esHijoIzquierdo) {
		if (this.raiz.getProducto().getId() == nuevo.getProducto().getId()) {
			this.raiz = null;
		} else {
			if (nuevo.getProducto().getId() == pivote.getProducto().getId()) {
				if (esHijoIzquierdo) {
					padre.setIzquierdo(null);
				} else {
					padre.setDerecho(null);
				}
			}
			if (nuevo.getProducto().getId() <= pivote.getProducto().getId()) {
				if (pivote.getIzquierdo() == null) {
					pivote.setIzquierdo(null);
				} else {
					eliminar(nuevo, pivote.getIzquierdo(), pivote, true);
				}
			} else {
				if (pivote.getDerecho() == null) {
					pivote.setDerecho(null);
				} else {
					eliminar(nuevo, pivote.getDerecho(), pivote, false);
				}
			}
		}
	}

	public boolean existe(int id) {
		Nodo aux = raiz;
		while (aux != null) {
			if (id == aux.getProducto().getId()) {
				return true;
			} else if (id > aux.getProducto().getId()) {
				aux = aux.getDerecho();
			} else {
				aux = aux.getIzquierdo();
			}
		}
		return false;
	}

	
}
