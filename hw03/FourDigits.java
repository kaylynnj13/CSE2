// Kaylynn Johnson
// 02/06/15
// CSE2 hw03 Four Digits
// This program will take an input in the form of a doule from the user
//      and then print out the first four digits to the right of the decimal point

import java.util.Scanner;            //import the Scanner class

public class FourDigits{
    //required main method
    public static void main(String[] args){
        
    Scanner myScanner;          //declare the instance of the Scanner class
    myScanner = new Scanner( System.in );       //call the scanner constructor
    //prompt the user to input a double
    System.out.print("Enter a double and I will display the four digits" +
        " to the right of the decimal point: ");
    double x = myScanner.nextDouble();
    
    //extract the first four digits after the decimal
    int firstDigit=(int)(x*10)%10;
    int secondDigit=(int)(x*100)%10;
    int thirdDigit=(int)(x*1000)%10;
    int fourthDigit=(int)(x*10000)%10;
    
    
    System.out.println("The four digits are "+firstDigit+secondDigit+thirdDigit+fourthDigit);
    
    } //end main method
} //end class