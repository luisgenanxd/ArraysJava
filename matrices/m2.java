package matrices;

import javax.swing.JOptionPane;
/**
 *Luis Angel Orduña Marquez
 * 03/12/2016
 * Matrices
 */
public class m2 {
        public static void main(String[]args){
            
            int arreglo[][] ={{4,3,2,1},{4,3,2,1},{4,3,2,1}};
            String cadena = "";
            for(int fila = 0; fila < arreglo.length; fila++){
                for(int columna = 0; columna < arreglo[fila].length;columna++){
                    cadena += arreglo[fila][columna]+" ";
                }
                cadena+="\n";
            }
            JOptionPane.showMessageDialog(null,cadena);
        }
}
