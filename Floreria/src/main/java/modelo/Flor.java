package modelo;

public class Flor {
    private int id;
    private String nombreFlor;
    private int cantidadVaras;
    private double precioUnitario;

    // Constructor
    public Flor(int id, String nombreFlor, int cantidadVaras, double precioUnitario) {
        this.id = id;
        this.nombreFlor = nombreFlor;
        this.cantidadVaras = cantidadVaras;
        this.precioUnitario = precioUnitario;
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreFlor() {
        return nombreFlor;
    }

    public void setNombreFlor(String nombreFlor) {
        this.nombreFlor = nombreFlor;
    }

    public int getCantidadVaras() {
        return cantidadVaras;
    }

    public void setCantidadVaras(int cantidadVaras) {
        this.cantidadVaras = cantidadVaras;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    // Métodos
    public void actualizarStock(int cantidad) {
        this.cantidadVaras += cantidad;
    }

    public double calcularPrecioTotal(int cantidad) {
        return cantidad * precioUnitario;
    }
}

