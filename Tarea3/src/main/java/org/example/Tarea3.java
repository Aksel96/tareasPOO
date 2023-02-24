package org.example;

import java.util.Scanner;
/*
#######################################################################################################################
##                                    UNIVERSIDAD NACIONAL AUTONOMA DE MEXICO                                        ##
##                                                 FES ARAGON                                                        ##
##                                         INGENIERIA EN COMPUTACION                                                 ##
##                                     PROGRAMACION ORIENTADA A OBJETOS                                              ##
##                                                  TAREA 3                                                          ##
##                                           AKSEL VILLELA ANDRADE                                                   ##
#######################################################################################################################
*/
public class Tarea3 {
    public static void main(String[] args) {

        char[] caracteresPermitidos = {'X', 'O', '_'};

        Scanner teclado = new Scanner(System.in);

        String entrada2;
        pintarMenu();
        do {
            System.out.print("Introduce la Cadena: ");
            String entrada = teclado.nextLine().trim();
            entrada2 = validadorLargo(entrada);

        } while (!validadorCaracteres(entrada2.toUpperCase(), caracteresPermitidos));

        String[] jugadas2 = entrada2.split("");

        pintarTable(jugadas2, entrada2);
    }
    static String validadorLargo(String entrada){
        while (entrada.length() != 9){
            System.out.print("\t\t-> ERROR <-\nLargo de la cadena no valido (Tienen que ser 9 caracteres)\nIngrese de nuevo: ");
            Scanner teclado = new Scanner(System.in);
            entrada = teclado.nextLine().trim();
        }
        return entrada;
    }
    static boolean validadorCaracteres(String entrada2, char[] caracteresPermitidos){
        for (int i = 0; i < entrada2.length() ; i++) {
            char caracter = entrada2.charAt(i);
            if (!validadorCadenaContiene(caracteresPermitidos, caracter)){
                System.out.println("\t\t-> ERROR <-\nLa cadena tiene caracteres no validos");
                System.out.println("Los caracteres validos son : \"X\" , \"O\" , \"_\"  \nIntentelo de nuevo\n ");
                return false;
            }
        }
        return true;
    }
    static boolean validadorCadenaContiene(char[] entrada2, char caracter){
        for (char c : entrada2)
            if (c == caracter) {
                return true;
            }
        return false;
    }

    static void pintarTable(String[] jugadas2, String entrada2){
        for (int i = 0; i < 3; i++) {
            if(i == 0){
                System.out.println(entrada2);
                System.out.println("-----");
            }
            if (i == 0) System.out.println("|" + jugadas2[0] + jugadas2[1] + jugadas2[2] + "|");
            if (i == 1) System.out.println("|" + jugadas2[3] + jugadas2[4] + jugadas2[5] + "|");
            if (i == 2) System.out.println("|" + jugadas2[6] + jugadas2[7] + jugadas2[8] + "|");
            if (i == 2) System.out.println("-----");

        }
    }
    static void pintarMenu(){
        System.out.println("#########################################################");
        System.out.println("\t\t\t\t\tJUEGO DEL GATO");
        System.out.println("\t\t\t--- Introduce tus jugadas ---");
        System.out.println("\t\tSolo son validos los caracteres: \"X\" , \"O\" , \"_\"");
        System.out.println("#########################################################\n");
    }
}