package springframeworkop;

public class GestorFacturas {
    Calculadora calculadora;
    String nombre;

    public GestorFacturas(Calculadora calculadora, String nombre) {
        System.out.println("Ejecutando contructor GestorFacturas");
        this.calculadora = calculadora;
        this.nombre = nombre;
    }
}
