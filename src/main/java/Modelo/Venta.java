package Modelo;

/**
 *
 * @author Jhontabo
 */
public class Venta {
    private int id;
    private int cliente;

   
    private String Vendedor;
    private double Total;

    public Venta() {
    }

    public Venta(int id, int cliente, double Total,String vendedor) {
        this.id = id;
        this.cliente = cliente;
        this.Total = Total;
        this.Vendedor=vendedor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

   
    public double getTotal() {
        return Total;
    }

    public void setTotal(double Total) {
        this.Total = Total;
    }

    public String getVendedor() {
        return Vendedor;
    }

    public void setVendedor(String Vendedor) {
        this.Vendedor = Vendedor;
    }
    
     public int getCliente() {
        return cliente;
    }

    public void setCliente(int cliente) {
        this.cliente = cliente;
    }
    
    
}
