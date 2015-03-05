// Kaylynn Johnson
// 03/06/2015
// CSE2 lab07 zigzag
// The purpose of this program is to use while loops and if statements to
//      incrementally output zigzags of stars

import java.util.Scanner;

public class zigzag{
    //main method required for all java programs
    public static void main(String[] args){
        Scanner scan = new Scanner( System.in );
        
        while(true){
            //Set nStars to -1 in order to enter the loop and prompt the user
            int nStars = -1;
            while( nStars < 3 || nStars > 33 ){
                //Promt user
                System.out.print("Enter a value between 3 and 33, inclusive: ");
                //Check if input is an integer
                while( !scan.hasNextInt() ){
                    //User has bad input and must try again
                    System.out.print("Invalid input. Try again: ");
                    scan.next();        //throw away bac input
                
                }
                //assign nStars to input
                nStars = scan.nextInt();
            
            }
            //Print zigzag of nStars
            //top line of stars
            for(int x = 1; x <= nStars; x++ ){
                System.out.print("*");
            }
            //Go to new line
            System.out.println("");
            for(int x = 1; x <= (nStars-2); x++){
                    for(int y = 1; y<x; y++){
                        System.out.print(" ");      //print space before star
                    }
                    System.out.println(" *");       //extra space to account for top line
            }
            //bottom line of stars
            for(int x = 1; x <= nStars; x++ ){
                System.out.print("*");
            }
            System.out.println("");
            //Ask user if they would like to go again, or else quit.
            System.out.print("Enter y or Y to go again: ");
            String again = scan.next();
            
            if( !(again.equals("y")) && !(again.equals("Y")) ){
                break;
            }
        
        } 
        
    }
        
}