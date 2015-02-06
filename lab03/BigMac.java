// Kaylynn Johnson
// 02/05/2015
// lab 03 - Big Mac
// The purpose of this program is to use the Scanner class by getting input from the
//      user (number of Big Macs, cost per Big Mac, and the percentage tax)
//      The program will compute and display the total cost


// Import the Scanner class
import java.util.Scanner;

public class BigMac {
    //main method required for every java program
    public static void main(String[] args){
        
        Scanner myScanner;                      //declare instance of the Scanner object
        myScanner = new Scanner( System.in );   //call the Scanner constructor
        System.out.print(
            "Enter the number of Big Macs (an integer > 0):  ");   //prompt the user for # of Big Macs
        int nBigMacs = myScanner.nextInt();     //accept the user input (integer)
        System.out.print("Enter the cost per Big Mac as" +
            " a double (in the form xx.xx): "); //promt the user for a double (cost)
        double bigMac$ = myScanner.nextDouble();    //accept user input (double)
        System.out.print(
            "Enter the percent tac as a whole number (xx): ");    //promt th user for the tax
        double taxRate = myScanner.nextDouble();    //accept user input (double)
        taxRate/=100;                           //Convert percent to decimal form
        
        //Compute total cost
        double cost$;
        int dollars,                    //whole dollar amount of cost
            dimes, pennies;             //for storing digits to the right of decimal point
        cost$ = nBigMacs*bigMac$*(1+taxRate);  //calculate total cost of big macs
        //drop the decimal fraction
        dollars=(int)cost$;
        //get dimes amount
        //(int)(6.73 * 10) % 10 -> 67 % 10 ->7
        //where the % (mod) operator returns the remainder after division
        dimes=(int)(cost$*10)%10;
        pennies=(int)(cost$*100)%10;
        //display the # big macs, cost per big mac, tax, total cost, amount of dimes and pennies
        System.out.println("The total cost of "+nBigMacs+" BigMacs, at $"+bigMac$+
            " per bigMac, with a sales tax of "+(int)(taxRate*100)+"%, is $"+dollars+
            "."+dimes+pennies);
        
    } //end of main method
} //end of class