package modelo;

import java.util.List;
import java.util.Date;

public class Pedido {
    private int id;
    private Date fecha;
    private Cliente cliente;
    private List<Promocion> promociones;

    // Constructor con la fecha
    public Pedido(int id, Date fecha, Cliente cliente, List<Promocion> promociones) {
        this.id = id;
        this.fecha = fecha;
        this.cliente = cliente;
        this.promociones = promociones;
    }

    // Getters y setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Promocion> getPromociones() {
        return promociones;
    }

    public void setPromociones(List<Promocion> promociones) {
        this.promociones = promociones;
    }

    // Métodos adicionales
    public double calcularTotal() {
        double total = 0;
        for (Promocion promocion : promociones) {
            total += promocion.calcularPrecioTotal();
        }
        return total;
    }

    public void generarRecibo() {
        System.out.println("Generando recibo para el pedido ID: " + id);
        System.out.println("Fecha: " + fecha);
        // Agrega detalles del recibo como el cliente, promociones, etc.
    }
}


