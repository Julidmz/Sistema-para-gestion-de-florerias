package controlador;

import modelo.Pedido;
import modelo.Promocion;
import modelo.Cliente;
import java.util.List;

public class GestionarPedidos {
    
    // Método para crear un nuevo pedido
    public Pedido crearPedido(int id, Cliente cliente, List<Promocion> promociones) {
        Pedido nuevoPedido = new Pedido(id, cliente, promociones);
        return nuevoPedido;
    }
    
    // Método para calcular el total de un pedido
    public double calcularTotal(Pedido pedido) {
        return pedido.calcularTotal();
    }

    // Método para generar un recibo del pedido
    public void generarRecibo(Pedido pedido) {
        pedido.generarRecibo();
    }
}

