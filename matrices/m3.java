package matrices;
import javax.swing.JOptionPane;
/**
 *Luis Angel Orduña Marquez
 * 03/12/2016
 * Matrices
 */
public class m3 {
    public static void main(String[]args){
        //Variables a utilizar
        int arreglo [][] = new int [3][3];
        int dato, aux;
        String x,cadena = "";
        //Recoleccion de los datos de la matriz
        for(int fila = 0;fila < arreglo.length; fila++){
            for(int columna = 0; columna < arreglo[fila].length; columna++){
                x = JOptionPane.showInputDialog("Ingrese un numero aleatorio: ");
                dato = Integer.parseInt(x);
                arreglo[fila][columna] = dato;
            }
        }
        //Se imprime la matriz desordenada
        for(int fila = 0;fila < arreglo.length; fila++){
            for(int columna = 0; columna < arreglo[fila].length; columna++){
                cadena+=arreglo[fila][columna]+" ";
            }
            cadena+="\n";
        }
        
        JOptionPane.showMessageDialog(null,cadena, "Arreglos y Matrices", JOptionPane.INFORMATION_MESSAGE);
        cadena="";
        //Ordenacion de la matriz
        for(int p = 0; p < arreglo.length; p++){
            for(int u = 0; u < arreglo.length; u++){
                for(int t = 0; t < arreglo.length; t++){
                    for(int o = 0; o < arreglo.length; o++){
                        if(arreglo[p][u] < arreglo[t][o]){
                            aux = arreglo[p][u];
                            arreglo[p][u] = arreglo[t][o];
                            arreglo[t][o] = aux;
                        }
                    }
                }
            }     
        }
        //Imprime la matriz ordenada
        for(int fila = 0;fila < arreglo.length; fila++){
            for(int columna = 0; columna < arreglo[fila].length; columna++){
                cadena+=arreglo[fila][columna]+" ";
            }
            cadena+="\n";
        }
        
        JOptionPane.showMessageDialog(null,cadena, "Arreglos y Matrices", JOptionPane.INFORMATION_MESSAGE);
    }
}
