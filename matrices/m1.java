package matrices;


/**
 *Luis Angel Orduña Marquez
 * 03/12/2016
 * Matrices
 */
import javax.swing.JOptionPane;
public class m1 {
    public static void main(String[]args){
        //Declaracion de los arreglos bidimensionales
                            //Columnas
        int[][] arreglo = { {1,2,3}, //Filas
                            {1,2,3},//Filas
                            {1,2,3}};//Filas
        int total = 0;
        int total2 = 0;
        String cadena = "", cadena2 = "";
        
        //Mantiene el ciclo por las filas(Horizontalmente)
        for ( int fila = 0; fila < arreglo.length; fila++)
        {
            //Mantiene el ciclo por las columnas(Verticalmente)
            for( int columna = 0; columna < arreglo[fila].length; columna++){
                //En la primera elige el valor de la fila 0 y la columna 0 
                //Hasta terminar con las columnas para seguir en la siguiente fila
                cadena2+= arreglo[fila][columna]+" ";
                
                //Sumo el total de la primera fila
                total += arreglo[fila][columna];
            }
           cadena2+=" = "+total+"\n";
           total = 0;
        }
        
        
        for( int fila = 0; fila < arreglo.length;fila++){
            for( int columna = 0; columna < arreglo.length; columna++){
                total2+= arreglo[columna][fila];
            }        
            cadena += total2+" ";
            total2 = 0;
        }
        cadena2+="= = =\n"+cadena;
        JOptionPane.showMessageDialog(null,cadena2);
        
}
}