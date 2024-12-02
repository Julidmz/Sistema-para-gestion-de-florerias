package controlador;

import modelo.Pedido;
import modelo.Promocion;
import modelo.Cliente;
import java.util.List;
import java.util.Date; // Importar la clase Date si necesitas usar fecha

public class GestionarPedidos {
    
    // Método para crear un nuevo pedido
    public Pedido crearPedido(int id, Cliente cliente, List<Promocion> promociones) {
        // Declarar e inicializar la variable fecha
        Date fecha = new Date();  // Aquí puedes usar la fecha actual o asignar una fecha específica
        Pedido pedido = new Pedido(id, fecha, cliente, promociones); // Crear el pedido
        return pedido; // Retornar el pedido creado
    }
    
    // Método para calcular el total de un pedido
    public double calcularTotal(Pedido pedido) {
        return pedido.calcularTotal(); // Suponiendo que la clase Pedido tiene este método
    }

    // Método para generar un recibo del pedido
    public void generarRecibo(Pedido pedido) {
        pedido.generarRecibo(); // Suponiendo que la clase Pedido tiene este método
    }
}


