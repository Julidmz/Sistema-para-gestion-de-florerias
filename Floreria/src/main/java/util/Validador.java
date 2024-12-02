package util;

public class Validador {
    
    // Método para validar que un nombre sea válido (solo letras)
    public static boolean validarNombre(String nombre) {
        return nombre.matches("[A-Za-z]+");
    }
    
    // Método para validar que un precio sea positivo
    public static boolean validarPrecio(double precio) {
        return precio > 0;
    }
    
    // Método para validar el correo electrónico
    public static boolean validarEmail(String email) {
        return email.contains("@") && email.contains(".");
    }
}
