/*
 *Hacer un programa que registre 7 números en un array de 10 elementos, 
 *y luego se ingrese en la posición 4 un nuevo numero..
 */
package arrays;
/**
 * Luis Angel Orduña Marquez
 * 03/12/2016
 * Arreglos
 */
import java.util.Scanner;

public class a3 {
    
    public static void main(String[]args){
    Scanner entrada = new Scanner(System.in);
        //Declaracion de variables
        int x;
        int[] arreglo;
        
        //Fase de inicializacion
        arreglo = new int [10];
        
        //Rellenado del arreglo
        for( int numero = 0; numero < 8; numero++){
            System.out.print("Ingrese el numero: ");
            x = entrada.nextInt();
            arreglo[numero] = x;
        }
        System.out.println();
        
        System.out.printf("%s%8s\n","Indice","Valor");
        for( int i = 0; i < arreglo.length; i++){
            System.out.printf("%4d%7d\n",i,arreglo[ i ]);
        }
        
        System.out.print("Ingrese el numero: ");
            x = entrada.nextInt();
            arreglo[4] = x;
            
        System.out.println();
        
        System.out.printf("%s%8s\n","Indice","Valor");
        for( int i = 0; i < arreglo.length; i++){
            System.out.printf("%4d%7d\n",i,arreglo[ i ]);
        }
}
}
