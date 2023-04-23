package ico.fesaragon.herenciaMultiple;

public class Alumno extends Persona{
    private int numerCuenta;
    private String carrera;
    private double promedio;

    public Alumno() {
    }

    public Alumno(String nombre, int edad) {
        super(nombre, edad);
    }

    public Alumno(String nombre, int edad, int numerCuenta, String carrera, double promedio) {
        super(nombre, edad);
        this.numerCuenta = numerCuenta;
        this.carrera = carrera;
        this.promedio = promedio;
    }
}
