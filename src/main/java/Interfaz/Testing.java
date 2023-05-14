
package Interfaz;

import Arbol.ArbolProductos;
import Arbol.Inventario_Impl;
import Arbol.Producto;
import Arbol.Tad_Inventario;
import javax.swing.JOptionPane;
/**
 *
 * @author Jhontabo
 */
public class Testing {
    
    ArbolProductos ab;

    public Testing(ArbolProductos ab) {
        this.ab = ab;
    }
    
    
    public static void main(String[] args) {
    
        
        ArbolProductos ab= new ArbolProductos();
        
        Producto p1 = new Producto("Celular","Electronica",80.0,2,1);

        Producto p2 = new Producto("libros","Electronica",400.0,2,10);
        
        Producto p4 = new Producto("Computador","Electronica",900.00,5,3);
        
        
        ab.insertar(p1);
        ab.insertar(p2);
       
        
        Tad_Inventario<Producto> ar= ab.getRaiz();
        JOptionPane.showMessageDialog(null,"Producto : \n"+ab.mostrar(ar)+"\n");
       JOptionPane.showMessageDialog(null,"Producto : "+ab.buscarPorId(1).obtener().getNombre() + " " +"        Producto : "+ab.buscarPorId(1).obtener().getTipo() );
        ab.eliminar(10);
        JOptionPane.showMessageDialog(null,"Producto : \n"+ab.mostrar(ar)+"\n");
        JOptionPane.showMessageDialog(null,"Se elimino con exito \n" + "Productos actualizados : \n" + ab.mostrar(ar));
        ab.insertar(p4);
        ab.modificar(ar, 1, 50.00, "Comida");
        
        
        JOptionPane.showMessageDialog(null,"Productos Actializados: \n"+ab.mostrar(ar));
        JOptionPane.showMessageDialog(null,"Producto : \n"+ab.mostrar(ar)+"\n");
    }
    
}
