// Kaylynn Johnson
// 04/24/2015
// CSE 2 lab 13 Sorting
// The purpose of this lab is to create a ragged two dimensional
//      array and utilize sorting to sort each row of the array
//      in ascending order.  Then the row of arrays will be converted
//      to have a length of the longest array

public class sortArrays{
    
    public static void main(String[] args){
        
        int[][] x = new int[5][];
        for(int i = 0; i < x.length; i++ ){
            x[i] = new int[i*3+5];
        }
        System.out.println("The array before sorting: ");
        for(int i = 0; i < x.length; i++ ){
            System.out.print("row " + (i + 1) + ": ");
            for(int j = 0; j < x[i].length; j++ ){
                x[i][j] = (int)(Math.random()*40);
                System.out.print(x[i][j] + " ");
            }
            System.out.println();
        }
        int index = 0;
        for( int i = 0; i < x.length; i++ ){
            int min = 50;
            for( int j = 0; j < x[i].length; j++){
                min = x[i][j];
                index = j;
                for( int k = j; k < x[i].length; k++ ){
                    if( x[i][k] < min ){
                        min = x[i][k];
                        index = k;
                    }
                }
                int temp = x[i][j];
                x[i][j] = x[i][index];
                x[i][index] = temp;
            }
            
        }
        System.out.println();
        System.out.println("The array after sorting: ");
        for(int i = 0; i < x.length; i++ ){
            System.out.print("row " + (i + 1) + ":  ");
            for(int j = 0; j < x[i].length; j++ ){
                System.out.print(x[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("The array after sorting and copying: ");
        int[][] resize = new int[5][x[4].length];
        for(int i = 0; i < resize.length; i++ ){
            System.out.print("row " + (i + 1) + ":  ");
            for(int j = 0; j < resize[i].length; j++ ){
                
                if( (j + 1) > (i*3+5) ){
                    resize[i][j] = 0;
                }
                else{
                    resize[i][j] = x[i][j];
                }
                System.out.print(resize[i][j] + "  ");
            }
            System.out.println();
        }
        
    }
}