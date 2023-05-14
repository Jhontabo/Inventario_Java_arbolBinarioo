
package Arbol;

/**
 *
 * @author Jhontabo
 */

///Es importante resaltar qeu el Tad es un tad generico por ello se debe poner lo siguiente <E>
public interface Tad_Inventario<E>{
    
    E obtener();
    Tad_Inventario<E> izq();
    Tad_Inventario<E> der();
    void enlIzq(Tad_Inventario<E> x);
    void enlDer(Tad_Inventario<E> x);
    void Modificar(E x);
    
}
