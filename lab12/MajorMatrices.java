// Kaylynn Johnson
// 04/17/2015
// CSE 2 lab12 Major Matrices
//  The purpose of this program is to utilize row- major and columnn-major
//      multi-dimensional awways.

import java.util.Scanner;

public class MajorMatrices{
    public static void main(String[] args){
        Scanner scan = new Scanner( System.in );
        int width1 = (int)(Math.random()*6 + 2);
        int height1 = (int)(Math.random()*6 + 2);
        int width2 = (int)(Math.random()*6 + 2);
        int height2 = (int)(Math.random()*6 + 2);
        int[][] arrayA = increasingMatrix( width1, height1, true);
        int[][] arrayB = increasingMatrix( width1, height1, false);
        System.out.println("Generating row-array with width " + width1 + " and height " + height1 + ":");
        printMatrix(arrayA,true);
        System.out.println("Generating row-array with width " + width1 + " and height " + height1 + ":");
        printMatrix(arrayB,false);
        int[][] arrayC = increasingMatrix( width2, height2, true);
        System.out.println("Generating row-array with width " + width2 + " and height " + height2 + ":");
        printMatrix(arrayC,true);
        addMatrix( arrayA, true, arrayB, false );
        addMatrix( arrayA, true, arrayC, true );
        
    }
    //method to created column and row arrays
    public static int[][] increasingMatrix( int width, int height, boolean format){
       int[][] thisArray = new int[width][height];
        //create a row-array if format is true
        if(format){
            int count = 1;
            for( int j = 0; j < height; j++ ){
                for( int k = 0; k < width; k++ ){
                    thisArray[k][j] = count;
                    count++;
                }
            }
        }
        //create a column-array if format is false
        else{
            int count = 1;
            for( int j = 0; j < width; j++ ){
                for( int k = 0; k < height; k++ ){
                    thisArray[j][k] = count;
                    count++;
                }
            }
        }
        return thisArray;
    }
    //method to print arrays
    public static void printMatrix( int[][] array, boolean format ){
        if( array == null ){
            System.out.println("The array was empty!");
        }
        if(format){
            int count = 1;
            for( int j = 0; j < array[0].length; j++ ){
                System.out.print("[ ");
                for( int k = 0; k < array.length; k++ ){
                    System.out.print(count + " ");
                    count++;
                }
                System.out.println("]");
            }
        }
        //create a column-array if format is false
        else{
            int count = 1;
            for( int j = 0; j < array[0].length; j++ ){
                System.out.print("[ ");
                for( int k = 0; k < array.length; k++ ){
                    System.out.print(count + " ");
                    count++;
                }
                System.out.println("]");
            }
        }
        
    }
    //translate array from column major to row major
    public static int[][] translate( int[][] array ){
        int[][] translated = new int[array.length][array[0].length];
        int count = 1;
        for( int j = 0; j < array[0].length; j++ ){
                for( int k = 0; k < array.length; k++ ){
                    translated[k][j] = count;
                    count++;
                }
        }
        return translated;
    }
    //method to add matrix
    public static void addMatrix( int[][] a, boolean formata, int[][] b, boolean formatb ){
        int[][] addArray = new int[a.length][a[0].length];
        if( a[0].length == b[0].length && a.length == b.length ){
            System.out.println("Adding two matrices: ");
            printMatrix(a,formata);
            System.out.println("plus");
            printMatrix(b,formatb);
            if( !formata ){
                System.out.println("Translating column major to row major output");
                a = translate(a);
            }
            if( !formatb ){
                System.out.println("Translating column major to row major output");
                b = translate(b);
            }
            for( int j = 0; j < a[0].length; j++ ){
                for( int k = 0; k < a.length; k++ ){
                    addArray[k][j] = a[k][j] + b[k][j];
                }
            }
            System.out.println("Output: ");
            for( int j = 0; j < addArray[0].length; j++ ){
                System.out.print("[ ");
                for( int k = 0; k < addArray.length; k++ ){
                    System.out.print(addArray[k][j] + " ");
                }
                System.out.println("]");
            }
        }
        else{
            System.out.println("Matrices can not be added.");
        }
    }
}