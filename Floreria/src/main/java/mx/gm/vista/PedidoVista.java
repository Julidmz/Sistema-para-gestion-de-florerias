package vista;

import modelo.Pedido;
import modelo.Promocion;
import modelo.Cliente;

import java.util.List;

public class PedidoVista {
    
    // Método para mostrar el detalle de un pedido
    public void mostrarPedido(Pedido pedido) {
        System.out.println("Pedido ID: " + pedido.getId());
        System.out.println("Cliente: " + pedido.getCliente().getNombre() + " " + pedido.getCliente().getApellido());
        System.out.println("Promociones en este pedido:");
        for (Promocion promocion : pedido.getPromociones()) {
            promocion.mostrarInformacion();
        }
        System.out.println("Total del Pedido: $" + pedido.calcularTotal());
    }

    // Método para mostrar el recibo
    public void mostrarRecibo(Pedido pedido) {
        System.out.println("Recibo del Pedido ID: " + pedido.getId());
        // Agregar más detalles según lo necesario
    }
}

