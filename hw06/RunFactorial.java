// Kaylynn Johnson
// 02/26/2015
// hw06 Run Factorial
// The purpose of this program is to use a while loop to print the factorial
//      of a number between 9 and 16 (inclusively)

import java.util.Scanner;

public class RunFactorial{
    //main method required for every java program
    public static void main(String[] args){
        Scanner scan = new Scanner( System.in );
        //Inititalize boolean and integers
        int num = 0;
        int count = 0;
        int factorial = 1;
        System.out.print("Please enter an integers that is between 9 and 16: ");
        //Make sure number is an integer
        while( !scan.hasNextInt() ){
            System.out.println("Invalid input. Enter again: ");
            scan.next();
        }
        num = scan.nextInt();
        //Make sure number is between 9 and 16
        while( num < 9 || num > 16 ){
            System.out.println("Invalid input. Enter again: ");
            num = scan.nextInt();
        }
        System.out.println("Input accepted: ");
        //Calculate factorial by decreasing count (equal to input number)
        count = num;
        while( count > 0 ){
            factorial = factorial * count;
            count--;
        }
        //Print the factorial
        System.out.println( num + "! = " + factorial );
        
    }
}