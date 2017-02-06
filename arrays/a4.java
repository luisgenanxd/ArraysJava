/*
 * Hacer un programa que registre 10 números en un array y 
 * luego muestre los números ingresados en un orden ascendente empezando por los pares y luego los impares.
 */
package arrays;


/**
 * Luis Angel Orduña Marquez
 * 03/12/2016
 * Arreglos
 */
import java.util.Scanner;
public class a4 {
    public static void main(String[]args){
        
    Scanner entrada = new Scanner(System.in);
        //Declaracion de variables
        int x,pares,impares,b,c;
        int[] arreglo;
        int[] par;
        int[] impar;
        
        //Fase de inicializacion
        arreglo = new int [10];
        pares = 0;
        impares = 0;
        b = 0;
        c = 0;
        
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
             else
                  impares++;
        }
        
        par = new int [ pares ];
        impar = new int [ impares ];
        
        //Repartimos los datos en los arreglos
        for( int n = 0; n < arreglo.length; n++){
            if(arreglo[n]%2 == 0){
                  par[b] = arreglo[n];
                  b++;
            }
            else{
                  impar[c] = arreglo[n];
                  c++;
            }
        }
        System.out.println();
        
        //Ordenamiento de los pares 
        System.out.println("Orden del arreglo");
        for (int i = 0 ; i < par.length - 1 ; i++) {
            int min = i;
 
            //buscamos el menor número
            for (int j = i + 1 ; j < par.length ; j++) {
                if (par[j] < par[min]) {
                    min = j;    //encontramos el menor número
                }
            }
 
            if (i != min) {
                //permutamos los valores
                int aux = par[i];
                par[i] = par[min];
                par[min] = aux;
            }
        }
        for (int num : par) {
            System.out.println(num);
        }
        
        //Orden acendente de los impares
        for (int i = 0 ; i < impar.length - 1 ; i++) {
            int min = i;
 
            //buscamos el menor número
            for (int j = i + 1 ; j < impar.length ; j++) {
                if (impar[j] < impar[min]) {
                    min = j;    //encontramos el menor número
                }
            }
 
            if (i != min) {
                //permutamos los valores
                int aux = impar[i];
                impar[i] = impar[min];
                impar[min] = aux;
            }
        }
        for (int num : impar) {
            System.out.println(num);
        }
        
        }
        
        
    }
    

