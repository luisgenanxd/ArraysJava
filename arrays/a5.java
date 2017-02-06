/*
 * Ingresar 20 números aleatorios a 
 * un array y luego mostrar una lista de las posiciones que ocupan los números pares.
 */
package arrays;

/**
 * Luis Angel Orduña Marquez
 * 03/12/2016
 * Arreglos
 */
import java.util.Scanner;
public class a5 {
    public static void main(String[] args){
            
    Scanner entrada = new Scanner(System.in);
        //Declaracion de variables
        int x,pares,b;
        int[] arreglo;
        int[] par;
        
        //Fase de inicializacion
        arreglo = new int [20];
        pares = 0;
        b = 0;
        
        //Rellenado del arreglo
        for( int numero = 0; numero < arreglo.length; numero++){
            System.out.print("Ingrese el numero: ");
            x = entrada.nextInt();
            arreglo[numero] = x;
        }
        
        //Obtencion de los datos de creacion del arreglo
        for ( int contador =  0; contador < arreglo.length; contador++){
            if(arreglo[contador]%2 == 0)
                pares++;
            }
        //Se añade cuantos elementos tendra el arreglo
        par = new int [ pares ];
        
        //Acumulacion en el nuevo arreglo
        for( int i = 0; i < arreglo.length; i++){
            if(arreglo[i]%2 == 0){
                par[ b ] = i;
                b++;
            }
            
        }
        System.out.println();
        
        System.out.printf("%s%11s\n","No. de pares","Pocicion que ocupa");
        for( int f = 0; f < par.length; f++){
            System.out.printf("%4d°par%9d\n",f,par[ f ]);
        }
        
        }
    
    }
    

