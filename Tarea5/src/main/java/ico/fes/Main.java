package ico.fes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cafetera cafetera1 = new Cafetera((short) 5000, (short) 1000, (short) 1500, (short) 50);
        String salir;
        Main.menu();
        do {
            String opcion;
            Scanner scannerOpcion = new Scanner(System.in);
            System.out.print("Introduce el numero: ");
            opcion = scannerOpcion.nextLine();
            while (!Main.opcionUser(opcion)){
                System.out.println("Opcion no valida por favor introduce otro caracter: ");
                opcion = scannerOpcion.nextLine();
            }
                switch (opcion) {
                    case "1" -> {
                        if (cafetera1.verifIngredientes()) {
                            cafetera1.americano();
                            if (cafetera1.verifNextCafe("americano")){
                                System.out.println("Ya no podemos seguir preparando americanos");
                            }else{
                                System.out.println("Todavia podemos seguir sirviendo americanos");
                            }
                        } else {
                            System.out.println("Ya no hay sufientes ingredientes para hacer tu cafe :c");
                        }
                    }
                    case "2" -> {
                        if (cafetera1.verifIngredientes()) {
                            cafetera1.expreso();
                            if (cafetera1.verifNextCafe("expreso")){
                                System.out.println("Ya no podemos seguir preparando expresos");
                            }else {
                                System.out.println("Todavia podemos seguir sirviendo expresos");
                            }
                        } else {
                            System.out.println("Ya no hay sufientes ingredientes para hacer tu cafe :c");
                        }
                    }
                    case "3" -> {
                        if (cafetera1.verifIngredientes()) {
                            cafetera1.capuchino();
                            if (cafetera1.verifNextCafe("capuchino")){
                                System.out.println("Ya no podemos seguir preparando capuchinos");
                            }else {
                                System.out.println("Todavia podemos seguir sirviendo capuchinos");
                            }
                        } else {
                            System.out.println("Ya no hay sufientes ingredientes para hacer tu cafe :c");
                        }
                    }
                    case "4" -> System.out.println(cafetera1);
                }

            if (cafetera1.suficientesIngredientes()){
                System.out.println("Ya no contamos con materiales para mas cafes, lo sentimos :c");
                break;
            }
            Scanner sc = new Scanner(System.in);
            System.out.print("Quieres seguir usando el programa? [S/N]");
            salir = sc.nextLine().toUpperCase();
        } while (!salir.equals("N"));
        System.out.println("########################################################################");
        System.out.println("\t\t\tDisfruta tu(s) cafe(s) :D");
        System.out.println(cafetera1);
        System.out.println("#######################################################################");
    }

    public static void menu() {
        System.out.println("""
                \t\tBIENVENIDO A LA CAFETERIA
                \tLA CAFETERA ESTA A SU MAXIMA CAPACIDAD
                TIPOS DE CAFE DISPONIBLES:
                1) Americano
                2) Expreso
                3) Capuchino
                4) Ver estado de la cafetera
                --> Elija un sabor y despues introzduca el numero en la parte de abajo <--
                """);
    }

    public static boolean opcionUser(String opcion) {
        return opcion.equals("1") || opcion.equals("2") || opcion.equals("3") || opcion.equals("4");
}
}

