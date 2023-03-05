package ico.fes;

public class Perro{
    //Atributos
    private String raza;
    private byte edad;
    private byte altura;
    private double peso;
    private String nombre;

    //Constructores

    public Perro() { //Constructor por defecto
    }

    public Perro(String raza, byte edad, byte altura, double peso, String nombre) { //Constructor sobre cargado
        this.raza = raza;
        this.edad = edad;
        this.altura = altura;
        this.peso = peso;
        this.nombre = nombre;
    }

    //Setters y Getters

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public byte getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        if (edad < 25 && edad > 0){
            this.edad = edad;
        }else System.out.println("Edad no valida");

    }

    public byte getAltura() {
        return altura;
    }

    public void setAltura(byte altura) {
        if (altura < 120 && altura > 0 ){
            this.altura = altura;
        }

    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if (peso < 70 && peso > 0){
            this.peso = peso;
        }else System.out.println("Peso no valido");

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //Metodo to.string()

    @Override
    public String toString() {
        return "Perro{" +
                "raza='" + raza + '\'' +
                ", edad=" + edad +
                ", altura=" + altura +
                ", peso=" + peso +
                ", nombre='" + nombre + '\'' +
                '}';
    }

    //Metodos

    public boolean feliz(){ //Metodo para ver si el perrito esta feliz
        System.out.println("Oh! el prerrito se esta acercando!");
        return Math.random() > 0.20;
    }
    public boolean despierto(){ //Metodo para ver si el perrit esta despierto
        System.out.println("Buscamos al perrito...");
        return Math.random() > 0.51;
    }
    public boolean jugar(int numeroUsuario){ //Metodo para jugar con el perrito
        int numeroPerro = (int) (Math.random() * 10); //Aqui generamos un numero aleatorio entre 0 - 10 y lo casteamos a entero
        System.out.println("Jugando....");
        System.out.println("Estoy pensando en el numero: " + numeroPerro);
        return numeroPerro == numeroUsuario;
    }
    public String saludar(){
     return "\n\t\t### Hola mi nombre es " + nombre + " tengo "+ edad +" años de edad, un placer conocerte ###";
    }
}