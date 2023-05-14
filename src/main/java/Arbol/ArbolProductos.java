
package Arbol;

/**
 *
 * @author Jhontabo
 */
public class ArbolProductos {
    
    private Tad_Inventario<Producto> raiz;

    /**
     * @return the raiz
     */
    public Tad_Inventario<Producto> getRaiz() {
        return raiz;
    }
    
    public void insertar(Producto a){
        if(raiz==null){
            raiz=new Inventario_Impl<>(a);
        }else{
            insertar(raiz,a);
        }
    }

    private void insertar(Tad_Inventario<Producto> raiz, Producto a) {
        
        if(a.getId_producto()<raiz.obtener().getId_producto()){
            if(raiz.izq()==null){
                raiz.enlIzq(new Inventario_Impl<>(a));
            }else{
                insertar(raiz.izq(), a);
            }
                   
            }else{
            if(raiz.izq()==null){
                raiz.enlDer(new Inventario_Impl<>(a));        
                }else{
                    insertar(raiz.der(),a);
                }
        }
    }
    
    
    String con="";
    
    public void mostrarTodo(Tad_Inventario<Producto>r){
        if(r!=null){
            visitar(r);
            mostrarTodo(r.izq());
            mostrarTodo(r.der());
        
        }
    }

    public void visitar(Tad_Inventario<Producto> r) {
        con+="Nombre : "+ r.obtener().getNombre() + "       Tipo :"+r.obtener().getTipo()+"           Precio :"+r.obtener().getPrecio()+"                           Cantidad :"+r.obtener().getCantidad()+"       Referencia :"+r.obtener().getId_producto() +"\n";
    }
    
    public String mostrar(Tad_Inventario<Producto>r){
        con="";
        mostrarTodo(r);
        return con;
    }
    
    
   public Tad_Inventario<Producto>buscarPorId(int idP){
       if(raiz==null){
           return null;
       }else{
           return buscar(raiz,idP);
       }
   } 

    private Tad_Inventario<Producto> buscar(Tad_Inventario<Producto> raiz, int idP) {
        if(idP==raiz.obtener().getId_producto()){
            return raiz;
        }else{
            if(idP<raiz.obtener().getId_producto()){
                if(raiz.izq()==null){
                    return null;
                }else{
                    return buscar(raiz.izq(),idP);
                }
            }else{
                if(raiz.der()==null){
                    return null;
                }else{
                    return buscar(raiz.der(), idP);
                }
            }
        }
    }
    
    
    public void modificar(Tad_Inventario<Producto>r,int idP,double precio,String tipo){
        if(buscarPorId(idP)!=null){
            if(r.obtener().getId_producto()==idP){
                r.obtener().setPrecio(precio);
                r.obtener().setTipo(tipo);
            }
        }
    }
    
    public void eliminar(int x){
        if(buscarPorId(x)!=null){
            raiz=eliminar(raiz,x);
        }
    }

    private Tad_Inventario<Producto> eliminar(Tad_Inventario<Producto> raiz, int x) {
        if(raiz.obtener().getId_producto()==x){
            return borrar(raiz,x);
        }else{
            if(x<raiz.obtener().getId_producto()){
                raiz.enlIzq(eliminar(raiz.izq(),x));
            }else{
                raiz.enlDer(eliminar(raiz.der(),x));
            }
            return raiz;
        }
    }

    public Tad_Inventario<Producto> borrar(Tad_Inventario<Producto> raiz, int x) {
        if(raiz.izq()==null && raiz.der() ==null){
            return null;
        }else{
            if(raiz.izq()==null){
                return raiz.der();
            }else{
                if(raiz.der()==null){
                    return raiz.izq();
                }else{
                    Tad_Inventario<Producto>may=numeroMayor(raiz.izq());
                    raiz.Modificar(may.obtener());
                    raiz.enlIzq(eliminar(raiz.izq(),may.obtener().getId_producto()));
                    return raiz;
                }
            }
        }
    }

    public Tad_Inventario<Producto> numeroMayor(Tad_Inventario<Producto> izq) {
        
        if(raiz!=null){
            if(raiz.der()!=null){
                return numeroMayor(raiz.der());
            }else{
                return raiz;
            }
        }else{
            return null;
        }
    }
    
}
 