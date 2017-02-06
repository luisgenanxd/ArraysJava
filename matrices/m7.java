
package matrices;
/**
 *Luis Angel Orduña Marquez
 * 03/12/2016
 * Matrices
 */
import javax.swing.JOptionPane;
public class m7 {
    public static void main(String[]args){
        int[][] b = new int [3][3];
        int n,s = 1;
        String cadena= "";
        String x = JOptionPane.showInputDialog("Ingrese un numero ");
        n = Integer.parseInt(x);
        
        for( int fila = 0; fila < b.length; fila++){
            for( int columna = 0; columna < b[fila].length; columna++){
                b[fila][columna] = n+s;
                s++;
            }
        }
        for( int fila = 0; fila < b.length; fila++){
            for( int columna = 0; columna < b[fila].length; columna++){
                cadena += b[fila][columna]+"   ";
            }
            
            cadena +="\n";
        }
        
        JOptionPane.showMessageDialog(null,cadena+"\nEl numero ingresado fue: "+n,"Arreglos y matrices",JOptionPane.INFORMATION_MESSAGE);
        
    }
}
