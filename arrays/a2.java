/*
 * Ingresar 10 valores numéricos a un array y mostrar cuantos son pares y cuantos impares.
 */
package arrays;

/**
 * Luis Angel Orduña Marquez
 * 03/12/2016
 * Arreglos
 */
import java.util.Scanner;
public class a2 {
    
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        //Declaracion de variables
        int x,par,impa;
        int[] array;
        
        //Fase de inicializacion
        array = new int [10];
        par = 0;
        impa = 0;
        
        //Rellenado del arreglo
        for( int numero = 0; numero < array.length; numero++){
            System.out.print("Ingrese el numero: ");
            x = entrada.nextInt();
            array[numero] = x;
        }
        //Dejo un espacio
        System.out.println();
        
        //Calculo cuantos son impares y cuantos son pares
        for ( int contador =  0; contador < array.length; contador++){
            if(array[contador]%2 == 0)
                  par++;
             else
                  impa++;
        }
        System.out.printf("%s%8s\n","Pares", "Impares");
        System.out.printf("%4d%7d\n",par, impa);
    
    }
}
