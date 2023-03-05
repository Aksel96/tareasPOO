package ico.fes;

import java.awt.*;
import java.io.StringReader;

public class Perico {
    private String nombre;
    private Color color;
    private byte edad;
    private byte altura;
    private double peso;

    //Constructores
    public Perico() { //Constructor por defecto
    }

    public Perico(String nombre, Color color, byte edad, byte altura, double peso) { //Constructor sobrecargado
        this.nombre = nombre;
        this.color = color;
        this.edad = edad;
        this.altura = altura;
        this.peso = peso;
    }
    //Setter y los Getters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public byte getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        if (edad < 10 && edad > 0){
            this.edad = edad;
        }else System.out.println("Edad no valida");
    }

    public byte getAltura() {
        return altura;
    }

    public void setAltura(byte altura) {
        if (altura < 60 && altura > 0){
            this.altura = altura;
        }else System.out.println("Altura no valida");

    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if (peso < 5 && peso > 0){
            this.peso = peso;
        }else System.out.println("Peso no valido");

    }
    // Metodo to.String()

    @Override
    public String toString() {
        return "Perico{" +
                "nombre='" + nombre + '\'' +
                ", color=" + color +
                ", edad=" + edad +
                ", altura=" + altura +
                ", peso=" + peso +
                '}';
    }
    //Metodos
    public boolean cantar(){
        return Math.random() < 0.51;
    }
    public boolean pensar(String vocalUsuario){
        String[] listaVocales = {"a","e","i","o","u"} ; //Lista de las vocales
        boolean resultado = false;
        int numeroVocalPensando = (int) ((Math.random() * 10) / 2); //Genramos un numero entre el 1 y el 5
        System.out.println("Jugando.....");
        System.out.println("Estoy pensando en la: " + listaVocales[numeroVocalPensando]);
        if (listaVocales[numeroVocalPensando].equals(vocalUsuario)){ //Como los strings son objetos se usa el operador "equals"
            resultado = true;
            }
        return resultado;
    }
    public int volar(){
        return (int) (Math.random() * 10);
    }
    public String saludar(){
        return "\n\t\t### Hola mi nombre es " + nombre + " tengo "+ edad +" años de edad, un placer conocerte ###";

    }
}
