package ico.fes;

import java.awt.*;
import java.util.Scanner;

public class ClasesDriver {
    public static void main(String[] args) {
        //Probamos la clase Perro

        Scanner scanner = new Scanner(System.in);
        Perro perro = new Perro("Chihuahua",(byte) 3, (byte) 28,4.3,"Fredy");
        System.out.println(perro);
        // Usamos el metodo saludar
        System.out.println(perro.saludar());
        //Usamos el metodo despierto
        if (perro.despierto()){
            System.out.println("Esta despierto!!! Vamos a jugar :)\n");
        }else System.out.println("Shhhh... Esta durmiendo, alejemonos en silencio...\n");
        // Usamos el metodo feliz
        if (perro.feliz()){
            System.out.println("Y viene feliz! :D\n");
        }else System.out.println("Y viene triste... :c\n");
        //Pintamos el menu para usar el metodo jugar
        System.out.println("\n ----## El perrito quiere jugar! ##----  \n ----## Esta pensando en un numero del 0 al 10 ##----");
        System.out.print("Intenta adivinar que numero esta pensando!\nIntroduce: ");
        int numero = scanner.nextInt();
        //Verificamos que solo introduzcan numeros del 0 al 10
        while (numero > 10 || numero < 0 ){
            System.out.println("Numero incorrecto, Solo numeros del 0-10\nIntenta nuevamente: ");
            numero = scanner.nextInt();
        }
        // Usamos el metodo jugar
        if (perro.jugar(numero)){
            System.out.println("Acertaste!!!\n");
        }else System.out.println("Fallaste, suerte para la proxima\n");
        //Probamos cambiar los valores de los atributos
        perro.setEdad((byte) 0);
        perro.setAltura((byte) 30);
        System.out.println(perro);
        //sepramos las pruebas de las dos clases
        System.out.println("\n\n#########################################################################\n");

        //Probamos la siguiente clase
        Scanner scannerPerico = new Scanner(System.in);
        Perico perico = new Perico("Perry", Color.BLACK,(byte) 2,(byte) 5,0.7);
        System.out.println("\n"+ perico);
        // Metodo saludar
        System.out.println(perico.saludar());
        //probamos el metodo cantar
        if (perico.cantar()){
            System.out.println("\nOh! El periquito esta cantando!\n");
        }else System.out.println("\nParece ser que el Perico no canta hoy\n");
        //Probamos el metodo volar
        int kilometros = perico.volar();
        System.out.println("El perico ha volado un total de "+ kilometros + " Kilometros\n");
        //Probamos el metodo pensar
        System.out.println(" --- El perico acaba de aprender las vocales! ---\n---- Y quiere jugar un juego :O ----");
        System.out.println("Dice que intentes adivinar en que vocal esta pensando ?.?");
        System.out.print("Introduce tu vocal: ");
        String vocal = scannerPerico.nextLine().toLowerCase();
        //Comprabacion para que solo acepte vocales por teclado
        while (!vocal.equals("a") && !vocal.equals("e") && !vocal.equals("i") && !vocal.equals("o") && !vocal.equals("u") ){
            System.out.print("Caracter incorrecto, Prueba de nuevo\nIntroduce tu vocal: ");
             vocal = scannerPerico.nextLine().toLowerCase();
        }
        //Usamos el metodo volar para ver si acertamos
        if (perico.pensar(vocal)){
            System.out.println("Acertaste!!!\n");
        }else System.out.println("Fallaste, suerte para la proxima\n");
        //Probamos cambiar los valores de los atributos
        perico.setColor(Color.RED);
        perico.setEdad((byte) 7);
        System.out.println(perico);

    }
}
