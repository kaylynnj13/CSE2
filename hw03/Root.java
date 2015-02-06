// Kaylynn Johnson
// 02/06/15
// CSE2 hw03 Root
// The Root program will have the user enter a double and then print out an estimate
//      of the cube root of the value and also the value of the number when cubed

import java.util.Scanner;           //import the Scanner class

public class Root{
    //required main method
    public static void main(String[] args){
        
    Scanner myScanner;          //declare the instance of the Scanner class
    myScanner = new Scanner( System.in );       //call the scanner constructor
    //promt the user to input a value (double) that will cube rooted:
    System.out.print("Enter a double, and I will print its cube root: ");
    double number = myScanner.nextDouble();
    //guess the square root
    double guess = number/3;
    //Improve the estimate (first time)
    guess = (2*guess*guess*guess+number)/(3*guess*guess);
    //Improve estimate for the second time:
    guess = (2*guess*guess*guess+number)/(3*guess*guess);
    //Improve estimate for the third time:
    guess = (2*guess*guess*guess+number)/(3*guess*guess);
    //Improve estimate for the fourth time:
    guess = (2*guess*guess*guess+number)/(3*guess*guess);
    //Improve estimate for the fifth time:
    guess = (2*guess*guess*guess+number)/(3*guess*guess);
    
    double guessCubed = guess*guess*guess;   //calculate the guess cubed
    
    //display the estimate
    System.out.println("The cube root is "+guess+":");
    System.out.println(guess+"*"+guess+"*"+guess+"=");
    System.out.println(guessCubed);
        
    } // end main method
}   //end class
