package laboratorio_programacion_samuel_moises;

import java.util.Scanner;


public class Vasquez_Samuel_Ceballos_Moises_Estructura {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in).useDelimiter("\n");
        int opc;
      
        do{
            System.out.println("\n-------Menu-------");
            System.out.println("[1] Cifrado Cesar");
            System.out.println("[2] Filtrar");
            System.out.println("[3] Codigo Enigma");
            System.out.println("------------------");
            System.out.print("Introduzca la opcion que desea: ");
            opc = entrada.nextInt();
            switch(opc){
                case 1: // Cifrado Cesar
                    System.out.println("\n****Cifrado Cesar****");
                    // Se le pide al usuario que introduzca una frase
                    System.out.print("Introduzca la frase a cifrar: ");
                    String frase = entrada.next();
                    // Se le pide la cantidad de desplazamiento que quiere
                    System.out.print("Introduzca el desplazamiento (en numeros enteros): ");
                    int desplaz = entrada.nextInt();
                    // Se asegura que el desplazamiento sea segun la cantidad de numeros en el abecedario
                    desplaz = desplaz % 26;
                    
                    String resultado = "";
                    
                    for (int i = 0; i < frase.length(); i++) {
                      char letra =  frase.charAt(i);
                      if(Character.isLetter(letra)){ // Se verifica que los caracteres dentro de la frase sean letras para poder encriptarlos
                          char base = (Character.isUpperCase(letra)) ? 'A' : 'a'; // Se usa para asegurar que las letras mayuscula y minuscula no sean confundidas
                          char cifrado = (char) ((letra - base + desplaz + 26)%26 + base); /* Hace la conversion tipo casting de la letra para 
                          obtener su posicion y asi cifrara segun el desplazamiento*/
                          resultado += cifrado; // Despues de cifrar se suma la letra cifrada al resultado, que es la palabra modificada 
                      }else{
                          resultado += letra; // Si es un signo de puntuacion o un espacio se suma sin modificaro
                      }
                    }
                    System.out.println("---- RESULTADO ----");
                    System.out.println(resultado);
                    System.out.println("-------------------");
                    break;
                case 2: // Filtrar
                    System.out.println("---Filtrar---"); //CORRECIONES (MOSTRAR TEXTO SI NO SE ENCUENTRN , AGREGAR MAS SIGNOS A IGNORAR)
                    
                    //VARIABLES
                    
                    int longitudMin = -1;
                    char letra =' ';
                    String palabra = "";
                          
                    System.out.print("Ingrese una frase: "); //PIDE FRASE
                    String frase = entrada.next();
                    
                    
                    while (longitudMin<0){ //CICLO QUE VALIDA SI ES NUMERO POSITIVO
                        System.out.print("Ingrese un numero positivo para la longitud minima requerida: ");
                        longitudMin = entrada.nextInt();
                    }
                                        
                    System.out.println("Palabras cuya longitud es mayor a " + longitudMin + ": ");
                    
                    for (int index = 0; index<frase.length();index++){
                        
                        letra = frase.charAt(index);
                        if (letra!=' ' && letra!=',' && letra !='.' && letra!= ':'){  //CONSTRUYE LA PALABRA SI NO ENCUENTRA UN ESPACIO
                       
                            palabra+=letra;
                        
                        } else { 
                            
                            if (palabra.length() > longitudMin){ //VALIDA SI LA PALABRA ES MAYOR A LA LONGITUD INGRESADA
                            System.out.println(palabra);
                            
                            
                            }
                            palabra="";   //REINICIA LA PALABRA 
                            
                            
                        }
                        
                        
                        
                        
                        
                        
                    }
                        
                    
                    
                    
                    
                    
                    
                    break;
                case 3: // Codigo Enigma
                   
                    break;
                default: //Opcion erronea
                    System.out.println("Porfavor, solo introduzca las opciones validas.");
                    break;
            }
            
        }while(opc != 1 && opc !=2 && opc!=3); 
        
       
    }
    
}
