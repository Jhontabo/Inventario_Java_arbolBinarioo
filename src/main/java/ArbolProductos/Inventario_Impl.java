
package ArbolProductos;

/**
 *
 * @author Jhontabo
 */



public class Inventario_Impl<E> implements Tad_Inventario<E>{

    E dato;
    Tad_Inventario<E> izq;
    Tad_Inventario<E> der;
   
    
    public Inventario_Impl(E dato) {
        this.dato = dato;
    }
    
    public E obtener() {
        return dato;
    }

    @Override
    public Tad_Inventario<E> izq() {
        return izq;
    }

    @Override
    public Tad_Inventario<E> der() {
        return der;
    }

    @Override
    public void enlIzq(Tad_Inventario<E> x) {
        izq=x;
    }

    

    @Override
    public void enlDer(Tad_Inventario<E> x) {
        der=x;
    }

    @Override
    public void Modificar(E x) {
       dato=x; 
    }
    
}
