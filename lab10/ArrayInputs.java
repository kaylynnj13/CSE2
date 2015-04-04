// Kaylynn Johnson
// 04/03/2015
// CSE2 lab10 Array Inputs
//  The point of this program is to learn how to create arrays
//      and use them as user inputs

import java.util.Scanner;

public class ArrayInputs{
    public static void main(String[] args){
        Scanner scan = new Scanner( System.in );
        
        int size = 0;;
        int num = 0;
        System.out.print("Please enter the size of the array: ");
        
        while( !scan.hasNextInt() ){
            System.out.print("Must be an integer. Try again: ");
            scan.next();
        }
        size = scan.nextInt();
        while( size<=0 ){
            System.out.println("Size must be an integer greater than zero. Try again: ");
            size = scan.nextInt();
        }
        int[] array = new int[size];
        for(int i=0; i<size; i++){
            System.out.print("Please enter a positive interger: ");
            while( !scan.hasNextInt() ){
                System.out.print("Must be an integer. Try again: ");
                scan.next();
            }
            array[i]= scan.nextInt();
            while( array[i] < 0 ){
                System.out.println("The integer must be positive. Try again: ");
                array[i] = scan.nextInt();
            }
            
        }
        
        System.out.println("The array is: ");
        for(int j = 0; j < size; j++ ){
            System.out.println(array[j]);
        }
    }
}