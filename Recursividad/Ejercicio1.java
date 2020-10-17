package Recursividad;

import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args){
         
        Scanner leer = new Scanner(System.in);
        boolean continuar = true;
        int opcion;
        
         while(continuar){
            System.out.println("");
            System.out.println("*********************************************");
            System.out.println("********************Menú*********************");
            System.out.println("****1.- Serie Fibonacci                  ****");
            System.out.println("****2.- Presentar números del 1 al 10    ****");
            System.out.println("****3.- Factorial                        ****");
            System.out.println("****4.- Desaparece números               ****");
            System.out.println("****5.- Palíndromo                       ****");
            System.out.println("****6.- Salir                            ****");
            System.out.println("*********************************************");
            System.out.println("*********************************************");
            opcion = leer.nextInt();
            Recursividad recursividad = null;
            switch(opcion){
                case 1:
                    recursividad = new Recursividad();
                    System.out.println("Ingrese cantidad de elementos para la serie: ");
                    int n = leer.nextInt();
                    System.out.println("");
                    for(int i = 0; i <= n; i++){
                        System.out.print(recursividad.recursividadFibo(i) +" ");   
                    }
                    System.out.println("");
                    break;
                case 2:
                    recursividad = new Recursividad();
                    System.out.println("");           
                    recursividad.recursividadNum(1);
                    System.out.println("");
                    break;
                case 3:
                    recursividad = new Recursividad();
                    System.out.println("Introduce un número: ");
                    int numero = leer.nextInt();
                    int fact = recursividad.recursividadFact(numero);
                    System.out.println("Factorial de " + numero + " = " + fact);
                    break;

                case 4:
                    System.out.println("");                    
                    recursividad = new Recursividad();
                    recursividad.recursividadDes(10);
                    break;
                case 5:
                    recursividad = new Recursividad();
                    leer.skip("\n");
                    System.out.println("Introduce una Palabra: ");
                    String frase = leer.nextLine();                    
                    if(recursividad.recursividadPal(frase)){
                        System.out.println("La palabra '"+frase+"' es PALÍNDROMO");
                    }
                    else{
                        System.out.println("La palabra '"+frase+"' NO es PALÍNDROMO");
                    }                    
                    break;
                case 6: 
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción incorrecta.....Vuelve a intentarlo");
                    
            }               
        }
     }   
}
