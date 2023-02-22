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
package ico.fes;

import java.util.Scanner;

public class Tarea2 {
    public static void main(String[] args) {
        //Inicio del programa, pedimos la cadena, la asignamos a una variable y limpiamos la basura con trim()
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce el Texto inicial: ");
        String entrada = teclado.nextLine().trim();

        //Creamos un arreglo de enteros para guardar cada elemento de la cadena que ingrese el usuario
        int[] listaDecimales = new int[entrada.length()];
        boolean verificadorOrden = false; //Variable para verificar si estan ordenados
        int contador = 0; //Contador

        //Primer bucle para convertir cada elemento de la cadena a entero y almacenarlo en un arreglo de enteros
        for (int i = 0; i < entrada.length(); i++) {
            int almacenadorChars = entrada.charAt(i);
            listaDecimales[i] = almacenadorChars;
        }

        //Segundo bucle para verificar que el segundo elemento sea el sucesor directo del primero
        for (int i = 1; i < listaDecimales.length - 1; i++) {
            int elemento = listaDecimales[i - 1]; //asignamos el elemento a una variable
            //Verificamos que si el elemento es igual al siguiente elemento menos uno , sumamos en uno al contador
            if (elemento == listaDecimales[i] - 1){
                 contador += 1;
            }
            //Si el contador es igual a la extension del arreglo menos dos, decimos que el arreglo esta ordenado
            if (contador == listaDecimales.length - 2){ // Es -2 ya que el arreglo empieza desde cero
                verificadorOrden = true;
            }
        }
        //Imprimimos el resultado
        System.out.println("Resultado de la comprobacion: " + verificadorOrden);
    }
}
