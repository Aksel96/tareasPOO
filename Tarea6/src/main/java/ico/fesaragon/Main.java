package ico.fesaragon;
/*
Aksel Villela Andrade
ICO FES Aragon
POO
Tarea 6
 */

import ico.fesaragon.herenciaMultiple.AlumnoDeportistaArtista;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Cuadrado cuadrado = new Cuadrado();
        cuadrado.setLado(5);
        System.out.println("Area = " + cuadrado.calcularArea());
        Circulo circulo = new Circulo();
        circulo.setRadio(2.4);
        System.out.println("Area del circulo: " + circulo.calcularArea());
        AlumnoDeportistaArtista ada = new AlumnoDeportistaArtista();
        ada.setNombre("Juan");
        ada.setArte("pintura");
        ada.setDeporte("Basket");
        System.out.println(ada);
        ada.ensayar("oleo");
        ada.entrenar();
        ada.presentarCompetencia("Naucalli");
        ada.presentrObra();
    }
}