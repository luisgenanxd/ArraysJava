
package matrices;

import javax.swing.JOptionPane;

/**
 *Luis Angel Orduña Marquez
 * 11/12/2016 - Editado
 * Matrices
 */
public class m8 {
    //Decalracion de variables
    private static    int[][] array = new int [3][3];
    private static    int[][] array2 = new int [3][3];
    private static    int[][] array3 = new int [3][3];
    private static int aux = 0, i = 0, j = 0;
    private static String cadena = ""; 
    
    public static void main(String[] args){

        //Rellenar la matriz con numeros aleatorios
        rellenoArray(array);
        
        rellenoArray(array2);
        
        //Rellenamos la primer fila del array3
        rellenoArray3(array,array3);
        i++;
        j = 0;
        //Rellenamos la segunda fila del array
        rellenoArray3(array2,array3);
        i++;
        j = 0;
        //Rellenamos la tercer fila del array3
        for( int fila = 0; fila < 3;fila++){
            for( int columna = 0; columna < 3; columna++){
                aux+= array3[columna][fila];
            }
            if(fila == 0){
                array3[i][j] = aux;
                j++;
            }else{
                if(fila == 1){
                    array3[i][j] = aux;
                    j++;
                }else{
                    if(fila == 2){
                        array3[i][j] = aux;
                    }
                }
            }
            aux = 0;
        }
        
        //Imprimimos las matrices
        JOptionPane.showMessageDialog(null,"Matriz 1","Arreglos y Matrices",JOptionPane.INFORMATION_MESSAGE);
        impArreglo(array);
        cadena="";
        
        JOptionPane.showMessageDialog(null,"Matriz 2","Arreglos y Matrices",JOptionPane.INFORMATION_MESSAGE);
        impArreglo(array2);
        cadena="";
        
        JOptionPane.showMessageDialog(null,"Matriz compuesta por las sumas","Arreglos y Matrices",JOptionPane.INFORMATION_MESSAGE);
        impArreglo(array3);
        cadena="";
    }//Fin del Metodo Main
    
    /*
        Metodo para rellenar los dos primeros arreglos
    */
    static void rellenoArray(int[][] arreglo){
        for( int fila = 0; fila < arreglo.length; fila++){
            for( int columna = 0; columna < arreglo[fila].length; columna++){
                arreglo [fila][columna] = (int) (Math.random()*20)+1;//Funcion para generar numeros aleatorios
            }
        }
    }
    /*
        Metodo para rellenar el tercer Arreglo
    */
    static void rellenoArray3(int[][] arreglo,int[][]arreglo3){
    for( int fila = 0; fila < arreglo.length;fila++){
            for( int columna = 0; columna < arreglo.length; columna++){
                aux+= arreglo[columna][fila];
            }        
            if(fila == 0){
                arreglo3[i][j] = aux;
                j++;
            }else{
                if(fila == 1){
                    arreglo3[i][j] = aux;
                    j++;
                }else{
                    if(fila == 2){
                        arreglo3[i][j] = aux;
                    }
                }
            }
            aux = 0;
        }
    }
    /**
     * Metodo para imprimir los arreglos
    */
    static void impArreglo(int[][] arreglo){
        for(int fila = 0;fila < arreglo.length; fila++){
            for(int columna = 0; columna < arreglo[fila].length; columna++){
                cadena+=arreglo[fila][columna]+"  ";
            }
            cadena += "\n"; 
        }
        JOptionPane.showMessageDialog(null,cadena,"Arreglos y Matrices",JOptionPane.INFORMATION_MESSAGE);
    }
    
}