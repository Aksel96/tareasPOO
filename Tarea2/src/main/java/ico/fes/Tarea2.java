
package ico.fes;

import java.util.Scanner;
/*
#######################################################################################################################
##                                    UNIVERSIDAD NACIONAL AUTONOMA DE MEXICO                                        ##
##                                                 FES ARAGON                                                        ##
##                                         INGENIERIA EN COMPUTACION                                                 ##
##                                     PROGRAMACION ORIENTADA A OBJETOS                                              ##
##                                                  TAREA 2                                                          ##
##                                           AKSEL VILLELA ANDRADE                                                   ##
#######################################################################################################################
*/
public class Tarea2 {
    public static void main(String[] args) {
        //Inicio del programa, pedimos la cadena, la asignamos a una variable y limpiamos la basura con trim()
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce el Texto inicial: ");
        String entrada = teclado.nextLine().trim();

        //Creamos un arreglo de enteros para guardar cada elemento de la cadena que ingrese el usuario
        int[] listaDecimales = new int[entrada.length()];
        boolean verificadorOrden = true; //Variable para verificar si estan ordenados


        //Primer bucle para convertir cada elemento de la cadena a entero y almacenarlo en un arreglo de enteros
        for (int i = 0; i < entrada.length(); i++) {
            int almacenadorChars = entrada.charAt(i);
            listaDecimales[i] = almacenadorChars;
        }

        //Segundo bucle para verificar que el segundo elemento sea el sucesor directo del primero
        for (int i = 0; i < listaDecimales.length - 1; i++) {
            //Restamos el indice actual menos el siguiente y si el resultado no es 1, no es el sucesor consecutivo
            if (listaDecimales[i +1] - listaDecimales[i] != 1){
                verificadorOrden= false;
                break;
            }

        }
        //Imprimimos el resultado
        System.out.println("Resultado de la comprobacion: " + verificadorOrden);
    }
}
