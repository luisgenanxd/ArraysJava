package matrices;
public class ejm {
    public static void main(String[] args){
        int[][] array = new int [3][3];
        int[][] array2 = new int [3][3];
        int[][] array3 = new int [3][3];
        int aux = 0;
        int i = 0,j = 0;
        int suma = 0, suma2 = 0;
        for( int fila = 0; fila < array.length; fila++){
            for( int columna = 0; columna < array[fila].length; columna++){
                array [fila][columna] = (int) (Math.random()*20)+1;
            }
        }
        for( int fila = 0; fila < array2.length; fila++){
            for( int columna = 0; columna < array2[fila].length; columna++){
                array2 [fila][columna] = (int) (Math.random()*20)+1;
            }
        }
        for( int fila = 0; fila < array.length;fila++){
            for( int columna = 0; columna < array.length; columna++){
                aux+= array[columna][fila];
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
        i++;
        j = 0;
        for( int fila = 0; fila < array2.length;fila++){
            for( int columna = 0; columna < array2.length; columna++){
                aux+= array2[columna][fila];
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
        i++;
        j = 0;
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
        System.out.println("1° Matriz");
        for(int fila = 0;fila < array.length; fila++){
            for(int columna = 0; columna < array[fila].length; columna++){
                System.out.printf("%d    ",array[fila][columna]);
            }
            System.out.println();
        }
        System.out.println("2° Matriz");
        for(int fila = 0;fila < array2.length; fila++){
            for(int columna = 0; columna < array2[fila].length; columna++){
                System.out.printf("%d    ",array2[fila][columna]);
            }
            System.out.println();
        }
        System.out.println("3° Matriz");
        for(int fila = 0;fila < array3.length; fila++){
            for(int columna = 0; columna < array3[fila].length; columna++){
                System.out.printf("%d    ",array3[fila][columna]);
            }
            System.out.println();
        }
    }
}
