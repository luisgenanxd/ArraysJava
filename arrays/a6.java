/*
 * Hacer un programa que permita ingresar 10 valores 
 * a un array y muestre cuantos son positivos, cuantos negativos y cuantos son nulos.
 */
package arrays;

/**
 * Luis Angel Orduña Marquez
 * 03/12/2016
 * Arreglos
 */
import java.util.Scanner;
public class a6 {
    public static void main(String[] args){
        Scanner entrada =  new Scanner(System.in);
        //Declaracion de variables
        int[] array;
        int x,positivos,negativos,nulos;
        
        //Inicializacion
        array = new int [10];
        positivos = 0;
        negativos = 0;
        nulos = 0;
        
        //Rellenado del arreglo
        for( int numero = 0; numero < array.length; numero++){
            System.out.print("Ingrese el numero: ");
            x = entrada.nextInt();
            array[numero] = x;
        }
        
        //Acumuladores de los tipos de dato
        for ( int contador =  0; contador < array.length; contador++){
        if (array[contador]>0)
            {
                positivos+=+1;
            }
            else
                if(array[contador]<0)
                    {
                        negativos+=+1;
                    }
                    else
                        nulos+=+1;
    }
        System.out.printf("%s%8s%8s\n","Positivos", "Negativos","Nulos");
        System.out.printf("%4d%7d%7d\n",positivos, negativos,nulos);
}
}