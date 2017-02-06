package matrices;
/**
 *Luis Angel Orduña Marquez
 * 03/12/2016
 * Matrices
 */
import javax.swing.JOptionPane;
public class m4 {
    public static void main(String [] args){
        
        String[][] array =  {{"Juan","Perez","Callao"},
                             {"Luis","Castro","Lima"},
                             {"Maria","Osores","Olivos"}};
        String cadena = "";
        for( int i = 0; i < array.length; i++){
            for( int j = 0; j < array[i].length;j++)
            {
                cadena += array[i][j]+"    ";
            }
            
            cadena+="\n";
        }
        
        JOptionPane.showMessageDialog(null,cadena,"Arreglos y Matrices", JOptionPane.INFORMATION_MESSAGE);
        
    }
}
