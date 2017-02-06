package matrices;

/**
 *Luis Angel Orduña Marquez
 * 03/12/2016
 * Matrices
 */
import javax.swing.*;
public class m6 {
    public static void main(String[] args){
        
        int[][] array = new int [3][3];
        String cadena = "";
        int suma = 0, suma2 = 0;
        //Rellenar la matriz con numeros aleatorios
        for( int fila = 0; fila < array.length; fila++){
            for( int columna = 0; columna < array[fila].length; columna++){
                array [fila][columna] = (int) (Math.random()*20)+1;//Funcion para generar numeros aleatorios
            }
        }
        //Sumar los datos
        for( int fila = 0; fila < array.length; fila++){
            for( int columna = 0; columna < array[fila].length; columna++){
                if(fila == columna){
                    suma+=array[fila][columna];
                }
            }
        }
        for( int fila = 0; fila < array.length; fila++){
            for( int columna = 0; columna < array[fila].length; columna++){
                if(fila == 0 && columna == 2){
                    suma2+=array[fila][columna];
                }else{
                    if(fila == 1 && columna == 1){
                        suma2+=array[fila][columna];
                    }else{
                        if(fila == 2 && columna == 0)
                            suma2+=array[fila][columna];
                    }
                }
            }
        }
        
        //Mostrar la cadena
        for( int fila = 0; fila < array.length; fila++){
            for( int columna = 0; columna < array[fila].length; columna++){
                cadena += array[fila][columna]+"  ";
            }
            if(fila == 0){
                cadena += " = " +suma2;
            }
            if(fila == 2){
                cadena += " = "+suma;
            }
            cadena += "\n"; 
        }
        
        JOptionPane.showMessageDialog(null,cadena,"Arreglos y Matrices",JOptionPane.INFORMATION_MESSAGE);
    }
}
