// Kaylynn Johnson
// 04/26/2015
// CSE 2 hw 13 Four D Win
// The purpose of this program is to create a ragged 4D array with random
//      numbers. Methods will be called to calculate the sum, mean and number
//      of elements in the array, to sort the array using insertion and selection
//      sort and to print the array.

import java.util.Scanner;

public class FourDwin{
    //main method required for every java program
    public static void main(String[] args){
        Scanner scan = new Scanner( System.in );
        int x = 1;
        int y = 0;
        //ask for user input for upper and lower bounds to the amound of elements in a subarray
        while( x >= y ){
            boolean isx = true;
            System.out.print("Enter the lower bound of the amount of elements in a sub array: ");
            isx = scan.hasNextInt();
            do{
                while( !isx ){
                    System.out.print("Number must be an integer. Try again: ");
                    scan.next();
                    isx = scan.hasNextInt();
                }
                x = scan.nextInt();
                if( x <= 0 ){
                    System.out.print("Number must be greater than zero. Try again: ");
                }
                
            }while( x <= 0 );
            
            boolean isy = true;
            System.out.print("Enter the upper bound of the amount of elements in a sub array: ");
            isy = scan.hasNextInt();
            do{
                while( !isy ){
                    System.out.print("Number must be an integer. Try again: ");
                    scan.next();
                    isx = scan.hasNextInt();
                }
                y = scan.nextInt();
                if( y <= 0 ){
                    System.out.print("Number must be greater than zero. Try again: ");
                }
                
            }while( y <= 0 );
            if( x >= y ){
                System.out.println("Upper bound must be greater than the lower bound.  Try again: ");
            }
        }
        
        //Create the 4D array and assign random numbers between 0 and 30
        double[][][][] A = new double[3][][][];
        for( int i = 0; i < A.length; i++ ){
            int length1 = x + (int)(Math.random() * ((y - x) + 1));
            A[i] = new double[length1][][];
            for( int j = 0; j < length1; j++ ){
                int length2 = x + (int)(Math.random() * ((y - x) + 1));
                A[i][j] = new double[length2][];
                for( int k = 0; k < length2; k++ ){
                    int length3 = x + (int)(Math.random() * ((y - x) + 1));
                    A[i][j][k] = new double[length3];
                    for( int l = 0; l < length3; l++ ){
                        A[i][j][k][l] = Math.random()*30;
                    }
                }
            }
        }
        System.out.println("Original Array: ");
        printArray(A);
        //Sort the array
        sort4DArray(A);
        sort3DArray(A);
        System.out.println();
        System.out.println("Sorted Array: ");
        printArray(A);
        System.out.println();
        statArray(A);
        
    }
    //Method to print the 4D array
    public static void printArray( double[][][][] A ){
        System.out.print("{");
        for( int i = 0; i < A.length; i++ ){
            System.out.print("{");
            for( int j = 0; j < A[i].length; j++ ){
                System.out.print("{");
                for( int k = 0; k < A[i][j].length; k++ ){
                    System.out.print("{");
                    for( int l = 0; l < A[i][j][k].length; l++ ){
                        System.out.printf(  " %2.1f,", A[i][j][k][l]);
                    }
                    System.out.print("}");
                }
                System.out.print("}");
            }
            System.out.println("}");
        }
        System.out.println("}");
        
    }
    
    //method to calculate the array's sum, mean and number of elements and print them
    public static void statArray( double[][][][] A ){
        double sum = 0;
        int count = 0;
        for( int i = 0; i < A.length; i++ ){
            for( int j = 0; j < A[i].length; j++ ){
                for( int k = 0; k < A[i][j].length; k++ ){
                    for( int l = 0; l < A[i][j][k].length; l++ ){
                        sum += A[i][j][k][l];
                        count ++;
                    }
                }
            }
        }
        //calculate the mean
        double mean = sum/count;
        //print the calculated values
        System.out.println("Members: " + count);
        System.out.printf("Sum: %3.1f \n", sum);
        System.out.printf("Mean: %2.3f \n", mean);
        
    }
    
    //Method to sort (insertion method) the 4D array
    public static void sort4DArray( double[][][][] A ){
        
        for( int i = 0; i < A.length; i++ ){
            for( int j = 0; j < A[i].length; j++ ){
                for( int k = 0; k < A[i][j].length; k++ ){
                    double min = 99;
                    for (int l = 0; l < A[i][j][k].length - 1; l++){
                        int index = l;
                        for (int m = l + 1; m < A[i][j][k].length; m++){
                            if (A[i][j][k][m] < A[i][j][k][index]){
                                index = m;
                            }
                        }
                        double temp = A[i][j][k][index]; 
                        A[i][j][k][index] = A[i][j][k][l];
                        A[i][j][k][l] = temp;
                    }
                }
            }
        }
    }
    
    //Method to sort (Selection method) of the 3D array
    public static void sort3DArray( double[][][][] A ){
        int index = 0;
        for( int i = 0; i < A.length; i++ ){
            for( int j = 0; j < A[i].length; j++ ){
                int min = 9999;
                for( int k = 0; k < A[i][j].length; k++ ){
                    min = A[i][j][k].length;
                    for( int m = k; m < A[i][j].length; m++){
                        if( A[i][j][m].length < min ){
                            min = A[i][j][m].length;
                            index = m;
                        }
                        else if( A[i][j][m].length == min ){
                            double min4d = 50;
                            //Find the minimum in the two arrays that have equal length
                            for( int h = 0; h < A[i][j][k].length; h++ ){
                                    if( A[i][j][k][h] < min4d ){
                                        min4d = A[i][j][k][h];
                                        index = k;
                                    }
                            }
                            for( int g = 0; g < A[i][j][m].length; g++ ){
                                    if( A[i][j][m][g] < min4d ){
                                        min4d = A[i][j][m][g];
                                        index = m;
                                    }
                            }
                                
                            
                        }
                        
                    }
                    double[] temp = A[i][j][k];
                    A[i][j][k] = A[i][j][index];
                    A[i][j][index] = temp;
                    
                }
            }
        }
    }
}