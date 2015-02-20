// Kaylynn Johnson
// 02/20/15
// CSE2 hw05 To Hex
// The purpose of this program will take in three (R,G,B) input in base 10 and convert them
//      to hexdecimal 

import java.util.Scanner;

public class ToHex{
    //start main method required for every java program
    public static void main(String[] args){
        //initialize input variables
        int num1, num2, num3;
        Scanner scan = new Scanner( System.in );
        System.out.print("Please enter three numbers represented by RGB values: ");
        boolean isInt1 = scan.hasNextInt(); 
        //Check to make sure the input is an integer
        if( !isInt1 ){
            System.out.println("Input is invalid");
            return;
        }
        //Take in inputs
        num1 = scan.nextInt();
        boolean isInt2 = scan.hasNextInt(); 
        if( !isInt2 ){
            System.out.println("Input is invalid");
            return;
        }
        num2 = scan.nextInt();
        boolean isInt3 = scan.hasNextInt(); 
        if( !isInt3 ){
            System.out.println("Input is invalid");
            return;
        }
        num3 = scan.nextInt();
        //Make sure integer is between 0 and 255
        if( num1 < 0 || num1 > 255 || num2 < 0 || num2 > 255 || num3 < 0 || num3 > 255 ){
            System.out.println("Must enter values between 0-255.");
            return;
        }
        //Find hexideciaml numbers by figuring out how many times 16 can go into the number and what that remainder is
        String hex1Divide = "" + num1/16;
        String hex1Remainder = "" + num1%16;
        String hex2Divide = "" + num2/16;
        String hex2Remainder = "" + num2%16;
        String hex3Divide = "" + num3/16;
        String hex3Remainder = "" + num3%16;
        //Convert numbers over 9 into letters for each variable
        switch ( hex1Divide ){
            case "10":
                hex1Divide = "A";
                break;
            case "11":
                hex1Divide = "B";
                break;
            case "12":
                hex1Divide = "C";
                break;
            case "13":
                hex1Divide = "D";
                break;
            case "14":
                hex1Divide = "E";
                break;
            case "15":
                hex1Divide = "F";
                break;
        }
        switch ( hex2Divide ){
            case "10":
                hex2Divide = "A";
                break;
            case "11":
                hex2Divide = "B";
                break;
            case "12":
                hex2Divide = "C";
                break;
            case "13":
                hex2Divide = "D";
                break;
            case "14":
                hex2Divide = "E";
                break;
            case "15":
                hex2Divide = "F";
                break;
        }
        switch ( hex3Divide ){
            case "10":
                hex3Divide = "A";
                break;
            case "11":
                hex3Divide = "B";
                break;
            case "12":
                hex3Divide = "C";
                break;
            case "13":
                hex3Divide = "D";
                break;
            case "14":
                hex3Divide = "E";
                break;
            case "15":
                hex3Divide = "F";
                break;
        }
        switch ( hex1Remainder ){
            case "10":
                hex1Remainder = "A";
                break;
            case "11":
                hex1Remainder = "B";
                break;
            case "12":
                hex1Remainder = "C";
                break;
            case "13":
                hex1Remainder = "D";
                break;
            case "14":
                hex1Remainder = "E";
                break;
            case "15":
                hex1Remainder = "F";
                break;
        }
        switch ( hex2Remainder ){
            case "10":
                hex2Remainder = "A";
                break;
            case "11":
                hex2Remainder = "B";
                break;
            case "12":
                hex2Remainder = "C";
                break;
            case "13":
                hex2Remainder = "D";
                break;
            case "14":
                hex2Remainder = "E";
                break;
            case "15":
                hex2Remainder = "F";
                break;
        }
        switch ( hex3Remainder ){
            case "10":
                hex3Remainder = "A";
                break;
            case "11":
                hex3Remainder = "B";
                break;
            case "12":
                hex3Remainder = "C";
                break;
            case "13":
                hex3Remainder = "D";
                break;
            case "14":
                hex3Remainder = "E";
                break;
            case "15":
                hex3Remainder = "F";
                break;
        }
        //Combine all numbers/letters into a String
        String finalHex = hex1Divide + hex1Remainder + hex2Divide + hex2Remainder + hex3Divide + hex3Remainder;
        //print final answer
        System.out.println("The decimal numbers R:" + num1 + ", G:" + num2 + ", B:" + num3 +
            ", is represented in hexadecimal as: " + finalHex);
               
        
            
        
        
    }
}