/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrices;

import javax.swing.JOptionPane;
/**
 *Luis Angel Orduña Marquez
 * 03/12/2016
 * Matrices
 */
public class m5 {
    public static void main(String[] args){
        
        int [][] b = new int [3][6];
        int x = 1,f = 0;
        String cadena = "";
        
        for(int fila = 0; fila < b.length; fila++){
            if(fila == 0){
            for(int columna = 0; columna < b[fila].length; columna++){
                b[fila][columna] = columna + 1;
            }
            }else{
                if(fila==1){
                    for(int columna = 0; columna < b[fila].length; columna++){
                    b[fila][columna] = 2 + 2 * columna;
                    }
                    }else{
                        if(fila == 2){
                            while(f < b[fila].length){
                                if((x%2) != 0){
                                    b[fila][f] = x;
                                    f++;
                                }
                                x++;
                            }
                        }
                    }
                }
        }
        for ( int fila = 0; fila < b.length; fila++){
            for(int columna = 0; columna < b[fila].length; columna++){
                cadena += b[fila][columna]+" ";
            }
            cadena+="\n";
        }
        JOptionPane.showMessageDialog(null,cadena, "Arreglos y Matrices", JOptionPane.INFORMATION_MESSAGE);
        
    }
}
