// Kaylynn Johnson
// 04/09/2015
// CSE 2 lab 11 Array Inputs
// The purpose of this program is to utilize one dimensional arrays to linearly search
//      in a for loop for the maximum and minimum values.  THen use a binary search
//      to search for a value inputted by the user

import java.util.Scanner;

public class Search{
    public static void main(String[] args){
        Scanner scan = new Scanner( System.in );
        int[] array1 = new int[50];
        int[] array2 = new int[50];
        //Fill array one with inegers between 0 and 100
        for( int j = 0; j < array1.length; j++ ){
            array1[j] = (int)(Math.random()*100);
        }
        int max1 = 0;
        int min1 = 100;
        //Linearly search for the max and min in array1
        for( int i = 0; i < array1.length; i++ ){
            if( array1[i] > max1 ){
                max1 = array1[i];
            }
            if( array1[i] < min1 ){
                min1 = array1[i];
            }
        }
        System.out.println("The maximum of array1 is " + max1);
        System.out.println("The minimum of array1 is " + min1);
        //Fill array2 with increasing integers
        array2[0] = (int)(Math.random()*100);
        for( int k = 1; k < array2.length; k++ ){
            array2[k] = (int)(Math.random()*100 + array2[k - 1]);
        }
        
        int max2= 0;
        int min2 = 5000;
        //Linearly search for the max and min in array2
        for( int i = 0; i < array2.length; i++ ){
            if( array1[i] > max2 ){
                max2 = array2[i];
            }
            if( array2[i] < min2 ){
                min2 = array2[i];
            }
        }
        System.out.println("The maximum of array2 is " + max2);
        System.out.println("The minimum of array2 is " + min2);
        //Do a binary search for a number inputted by the user
        int num = 0;
        System.out.print("Enter an int: ");
        if( !scan.hasNextInt() ){
            System.out.println("You did not enter an int");
            System.exit(1);
        }
        num = scan.nextInt();
        if( num < 0 ){
            System.out.println("You did not enter an int > 0");
            System.exit(1);
        }

        int indexCheck = array2.length/2;
        boolean found = true;
        while(found){
            if(array2[indexCheck] == num){
                System.out.println("The number" + num + " was found.");
                found = false;
            }
            else if(array2[indexCheck + 1 ] > num && array2[indexCheck - 1 ] < num){
                System.out.println("The number above the key was " + array2[indexCheck + 1 ]);
                System.out.println("The number below the key was " + array2[indexCheck - 1 ]);
                found = false;
            }
            else{
                if (array2[indexCheck / 2] > num){
                    indexCheck /= 2;
                }
                else if (array2[indexCheck/ 2] < num){
                    indexCheck += (indexCheck / 2);
                }
            }
        }
    }
}