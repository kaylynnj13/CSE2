// Kaylynn Johnson
// 04/17/2015
// CSE 2 hw 12 Multiply
// The purpose of this program is to create 2 random numbered two dimensional
//      arrays and multiply the to create a new array (dimensions of the two
//      arrays must be able to be multiplied)

import java.util.Scanner;

public class Multiply{
    //main method required for all java programs
    public static void main(String[] args){
        Scanner scan = new Scanner( System.in );
        int width1 = 0; int width2 = 0; int height1 = 0; int height2 = 0;
        //Ask for height and widths of the two matrices and check whether they are
        //   a positive integer and if the dimensions are okay for matrix multiplication
        do{
            if(width1 != height2){
                System.out.println();
                System.out.println("Number of columns in the first matrix must be equal to number of rows in the second column" + 
                "for matrix multiplication.  Enter in dimensions again: ");
            }
            boolean is1 = true;
            System.out.print("Enter the desired width for the first matrix: ");
            is1 = scan.hasNextInt();
            do{
                while( !is1 ){
                    System.out.print("Dimension must be an integer. Try again: ");
                    scan.next();
                    is1 = scan.hasNextInt();
                }
                width1 = scan.nextInt();
                if( width1 <= 0 ){
                    System.out.print("Dimension must be greater than zero. Try again: ");
                }
                
            }while( width1 <= 0 );
            boolean is2 = true;
            System.out.print("Enter the desired height for the first matrix: ");
            is2 = scan.hasNextInt();
            do{
                while( !is2 ){
                    System.out.print("Dimension must be an integer. Try again: ");
                    scan.next();
                    is2 = scan.hasNextInt();
                }
                height1 = scan.nextInt();
                if( height1 <= 0 ){
                    System.out.print("Dimension must be greater than zero. Try again: ");
                }
                
            }while( height1 <= 0 );
            boolean is3 = true;
            System.out.print("Enter the desired width for the second matrix: ");
            is3 = scan.hasNextInt();
            do{
                while( !is3 ){
                    System.out.print("Dimension must be an integer. Try again: ");
                    scan.next();
                    is3 = scan.hasNextInt();
                }
                width2 = scan.nextInt();
                if( width2 <= 0 ){
                    System.out.print("Dimension must be greater than zero. Try again: ");
                }
                
            }while( width2 <= 0 );
            boolean is4 = true;
            System.out.print("Enter the desired height for the second matrix: ");
            is4 = scan.hasNextInt();
            do{
                while( !is4 ){
                    System.out.print("Dimension must be an integer. Try again: ");
                    scan.next();
                    is4 = scan.hasNextInt();
                }
                height2 = scan.nextInt();
                if( height2 <= 0 ){
                    System.out.print("Dimension must be greater than zero. Try again: ");
                }
                
            }while( height2 <= 0 );
        }while( width1 != height2 );
        
        //create two random matrices
        int[][] random1 = new int[width1][height1];
        for( int j = 0; j < height1; j++ ){
            System.out.print("[ ");
            for( int k = 0; k < width1; k++ ){
                random1[k][j] = (int)(Math.random()*10);
                System.out.print( random1[k][j] + " ");
            }
            System.out.println("]");
        }
        System.out.println("Multiplied by: ");
        int[][] random2 = new int[width2][height2];
        for( int j = 0; j < height2; j++ ){
            System.out.print("[ ");
            for( int k = 0; k < width2; k++ ){
                random2[k][j] = (int)(Math.random()*10);
                System.out.print( random2[k][j] + " ");
            }
            System.out.println("]");
        }
        
        int[][] productArray = matrixMultiply( random1, random2 );
        System.out.println("Gives: ");
        for( int j = 0; j < productArray[0].length; j++ ){
            System.out.print("[ ");
            for( int k = 0; k < productArray.length; k++ ){
                System.out.print( productArray[k][j] + " ");
            }
            System.out.println("]");
        }
       
            
        
    }
    
    //method to multiply the arrays
    public static int[][] matrixMultiply( int[][] one, int[][] two ){
        int[][] product = new int[two.length][one[0].length];
        
        if( one.length != two[0].length ){
            product = null;
        }
        else{
            for( int l = 0; l < one[0].length; l++ ){
                for( int i = 0; i < two.length; i++ ){
                    int sum = 0;
                    for( int j = 0; j < two[0].length; j++ ){
                        sum += one[j][l]*two[i][j];
                    }
                    product[i][l] = sum;
                }
            }
        }
        return product;
    }
}