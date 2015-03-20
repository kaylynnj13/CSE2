// Kaylynn Johnson
// 02/26/2015
// hw06 Get Integers
// The purpose of this program is to take in 5 inetegers from the user. and print
//      the sum of the integers using a for loop

import java.util.Scanner;

public class GetIntegers{
    //start main method required for every java program
    public static void main(String[] args){
        Scanner scan = new Scanner( System.in );
        //Initialize numbers
        int num = 0;
        int sum = 0;
        // Ask user for 5 valid integers
        System.out.print("Please enter 5 non-negative integers: ");
        isInt = scan.NextInt();
        //Create for loop to read 5 integers
        for( int x = 1; x <= 5; x++ ){
            //Check if input is an integer
            while( !isInt ){
                System.out.println("Invalid input.  Please enter again: ");
                scan.next();
                isInt = scan.hasNextInt();
            }
            //Check if input is greater or equal to zero
            num = scan.nextInt();
            while( num < 0 ){
                System.out.println("Invalid input.  Please enter again: ");
                num = scan.nextInt();
            }
            sum = sum + num;
        }
        
        
        //Print the sum of the 5 integers
        System.out.println("Sum is " + sum);
    }
}