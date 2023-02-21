package ICO.FES;
import java.util.Scanner;
public class Tarea1 {
    public static void main(String[] args){
        //Usamos scanner para pedir por teclado la cadena
        Scanner teclado = new Scanner(System.in); // creamos la instancia teclado
        System.out.print("Escribe tu Nombre, Profesion y Pais de origen: "); //Pedimos la cadena
        //Creamos un string con la cadena sin modificaciones para trabajar en ella
        String entrada = teclado.nextLine().trim();
        //Creamos un Arreglo de la cadena y le hacemos rebanado elemento por elemento para comprobar si hay un numero
        String[] comprobacionEntrada = entrada.split("");
        //Llamamos a la funcion de comprobacion, para ver si hay un numero en la cadena
        boolean resultadoComprobacion = verificaNumero(comprobacionEntrada);
        //Comprobamos el resultado
        if (!resultadoComprobacion){ //Si no hay numeros entonces...
            //Creamos una cadena y la splitemos con los datos validos
            String[] datosUsuario = entrada.trim().split(" ");
            //Comprobamos que la longitud de la cadena
            if (datosUsuario.length < 1 || datosUsuario.length > 3){
                System.out.println("\n ---> ERROR, Numero de palabras o espaciado incorrecto <--\n \t (Recuerda usar solo un espacio entre cada palabra)\n \n");
            }else{
                //De ser 3 el largo de la cadena continuamos
                //Iteramos la cadena para imprimir la informacion
                for (int i = 0; i < 3; i++) {
                    if(i == 0) System.out.println("+-----------------------+");
                    if (i == 0) {
                        System.out.println("    Nombre: " + datosUsuario[i].toUpperCase());
                    }
                    if (i == 1){
                        System.out.println("    Profesion: " + datosUsuario[i].toUpperCase());
                    }
                    if (i == 2){
                        System.out.println("    Pais: " + datosUsuario[i].toUpperCase());
                    }
                    if(i == 2) System.out.println("+-----------------------+");
                }}
        }else {
            //Si hay numeros en la cadena mostramos error
            System.out.println("\nCARACTERES NO VALIDOS, POR FAVOR INTRODUCE OTROS \n\t(--> ¡No se admiten numeros! <--)\n");
        }
    }
    //Funcion para verificar si hay un numero en la cadena
    public static boolean verificaNumero(String[] entrada){
        for (String elemento:entrada){
            //Usamos un control de excepciones para ver si se puede castear de string a entero
            try {
                int compruebaNumero = Integer.parseInt(elemento);
                return true;
            }catch (NumberFormatException e){//Si no se puede hacer casting, continua con el bucle
            }
        }
        return false;
    }
}