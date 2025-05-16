package laboratorio_programacion_samuel_moises;

import java.util.Scanner;

public class Vasquez_Samuel_Ceballos_Moises_Estructura {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in).useDelimiter("\n");
        int opc;

        do {
            System.out.println("-------Menu-------");
            System.out.println("[1] Cifrado Cesar");
            System.out.println("[2] Filtrar");
            System.out.println("[3] Codigo Enigma");
            System.out.println("------------------");
            System.out.print("Introduzca la opcion que desea: ");
            opc = entrada.nextInt();
            switch (opc) {
                case 1: // Cifrado Cesar
                    break;
                case 2: // Filtrar
                    System.out.println("---Filtrar---"); //CORRECIONES (MOSTRAR TEXTO SI NO SE ENCUENTRN , AGREGAR MAS SIGNOS A IGNORAR)

                    //VARIABLES
                    int longitudMin = -1;
                    char letra = ' ';
                    String palabra = "";
                    boolean seEncontro = false;

                    System.out.print("Ingrese una frase: "); //PIDE FRASE
                    String frase = entrada.next();

                    while (longitudMin < 0) { // VALIDA SI ES NÚMERO POSITIVO
                        System.out.print("Ingrese un numero positivo para la longitud minima requerida: ");
                        longitudMin = entrada.nextInt();
                    }

                    System.out.println("Palabras cuya longitud es mayor a " + longitudMin + ": ");

                    for (int index = 0; index < frase.length(); index++) {
                        letra = frase.charAt(index);

                        // Ignorar mas signos de puntuación
                        if (letra != ' ' && letra != ',' && letra != '.' && letra != ':' && letra != ';' && letra != '!' && letra != '?') {
                            palabra += letra;
                        } else {
                            if (palabra.length() > longitudMin) {
                                System.out.println(palabra);
                                seEncontro = true;
                            }
                            palabra = ""; // Reiniciar palabra
                        }
                    }

                    // Evaluar la última palabra si no termina en signo
                    if (palabra.length() > longitudMin) {
                        System.out.println(palabra);
                        seEncontro = true;
                    }

                    if (!seEncontro) {
                        System.out.println("No se encontraron palabras que cumplan la condicion.");
                    }
                    break;
                    
                case 3: // Codigo Enigma

                    break;
                default: //Opcion erronea
                    System.out.println("Porfavor, solo introduzca las opciones validas.");
                    break;
            }

        } while (opc != 1 && opc != 2 && opc != 3);

    }

}
