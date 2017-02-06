/*
 * Llenar un Array de 10 valores numéricos y ordenarlos de forma ascendente y descendente
 */
package arrays;

/**
 * Luis Angel Orduña Marquez
 * 03/12/2016
 * Arreglos
 */
public class a1 {
    
    private static int numeros[] = { 7, 0, 9, 8, 1, 4, 6, 2, 3, 5 };

    public static void main(String[] args) {
        
        
        //imprimimos por pantalla el arreglo de números enteros
        System.out.println("Arreglo sin orden:");
        for (int num : numeros) {
            System.out.println(num);
        }
 
        System.out.println();
 
        //ordenamos en forma ascendente el arreglo de números enteros y lo imprimimos por pantalla
        System.out.println("Orden ascendente:");
        ordSelAsc(numeros);
        for (int num : numeros) {
            System.out.println(num);
        }
 
        System.out.println();
 
        //ordenamos en forma descendente el arreglo de números enteros y lo imprimimos por pantalla
        System.out.println("Orden descendente:");
        ordSelDesc(numeros);
        for (int num : numeros) {
            System.out.println(num);
        }
    }
 
    /**
     * Este método ordena en forma ascendente el arreglo pasado como argumento usando el
     * algoritmo de selección.
     */
    static void ordSelAsc(int[] arreglo) {
        //iteramos sobre los elementos del arreglo
        for (int i = 0 ; i < arreglo.length - 1 ; i++) {
            int min = i;
 
            //buscamos el menor número
            for (int j = i + 1 ; j < arreglo.length ; j++) {
                if (arreglo[j] < arreglo[min]) {
                    min = j;    //encontramos el menor número
                }
            }
 
            if (i != min) {
                //permutamos los valores
                int aux = arreglo[i];
                arreglo[i] = arreglo[min];
                arreglo[min] = aux;
            }
        }
    }
 
    /**
     * Este método ordena en forma descendente el arreglo pasado como argumento usando el
     * algoritmo de selección.
     * 
     * @param arreglo el arreglo que sera ordenado.
     */
    static void ordSelDesc(int[] arreglo) {
        //iteramos sobre los elementos del arreglo
        for (int i = 0 ; i < arreglo.length - 1 ; i++) {
            int max = i;
 
            //buscamos el mayor número
            for (int j = i + 1 ; j < arreglo.length ; j++) {
                if (arreglo[j] > arreglo[max]) {
                    max = j;    //encontramos el mayor número
                }
            }
 
            if (i != max) {
                //permutamos los valores
                int aux = arreglo[i];
                arreglo[i] = arreglo[max];
                arreglo[max] = aux;
            }
        }
    }
}
