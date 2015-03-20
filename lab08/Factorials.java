// Kaylynn Johnson
// 03/20/2015
// CSE002 lab 08
// This program utilizes methods and method caling to calculated the super facotrial of a number

//import scanner class
import java.util.Scanner;

public class Factorials{
    //all methods must be inside the class
    //method for calculating the factorial
    public static int factorial( int input ){
        //initiliaze factorial integer
        int fact = 1;
        //calculate the factorial of the input
        for( int i = input; i > 0; i--){
            fact *= i;
        }
        //return result to main method
        return fact;
    }
    
    //method for printing the numbers that were passed in as inputs
    public static void print( int input, int sum ){
        System.out.println("The super factorial of " + input + " is " + sum);
    }
    
    //main method required for all java programs
    public static void main(String[] args){
        Scanner scan = new Scanner( System.in );
        System.out.print("Enter a number and I will compute its super factorial: ");
        int sup = scan.nextInt();
        int sum = 0;
        
        //calculate the super factorial by adding all the factorial from 1 to sup
        for( int i = 1; i <= sup; i++ ){
            sum += factorial(i);
        }
        
        print(sup,sum);
        
    }
}