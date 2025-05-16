package laboratorio_programacion_samuel_moises;

import java.util.Scanner;


public class Vasquez_Samuel_Ceballos_Moises_Estructura {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in).useDelimiter("\n");
        int opc;
      
        do{
            System.out.println("-------Menu-------");
            System.out.println("[1] Cifrado Cesar");
            System.out.println("[2] Filtrar");
            System.out.println("[3] Codigo Enigma");
            System.out.println("------------------");
            System.out.print("Introduzca la opcion que desea: ");
            opc = entrada.nextInt();
            switch(opc){
                case 1: // Cifrado Cesar
                    break;
                case 2: // Filtrar
                    break;
                case 3: // Codigo Enigma
                    System.out.println("aaaa");
                    break;
                default: //Opcion erronea
                    System.out.println("Porfavor, solo introduzca las opciones validas.");
                    break;
            }
        }while(opc > 0 && opc < 4);
        
       
    }
    
}
