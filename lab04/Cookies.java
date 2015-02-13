// Kaylynn Johnson
// 2/13/2015
// lab04 Cookies
//  This program will take input the user in the form of how many cookies they want,
//      how may people they are buying for, and how many cookies they want each
//      person to get.  All inputs must be valid.  Check to see if there are an even
//      distribution of cookies for each person

import java.util.Scanner;

public class Cookies{
    //main method required for every Java program
    public static void main(String[] args){
        Scanner myScanner;
        myScanner = new Scanner( System.in );    //contrsut instance of the Scanner
        
        int numPeople, numCookies, cookiesPerPerson, moreCookies;
        
        System.out.print("Input the number of people: ");
        //check whether the user inputs an int
        if(myScanner.hasNextInt()){
            numPeople = myScanner.nextInt();
            if(numPeople<=0){
                System.out.println("You can not have zero or negative people");
                return;
            }
        }
        else{
            System.out.println("You did not enter an int");
            return;         //leaves the program (terminates)
        }
        
        System.out.print("Input the number of cookies you want to buy: ");
        //check whether the user inputs an int
        if(myScanner.hasNextInt()){
            numCookies = myScanner.nextInt();
            if(numCookies<=0){
                System.out.println("You can not have zero or negative cookies");
                return;
            }
        }
        else{
            System.out.println("You did not enter an int");
            return;         //leaves the program (terminates)
        }
        
        System.out.print("How many cookies should each person get? ");
        //check whether the user inputs an int
        if(myScanner.hasNextInt()){
            cookiesPerPerson = myScanner.nextInt();
            if(cookiesPerPerson<0){
                System.out.println("You can not have negative cookies");
                return;
            }
        }
        else{
            System.out.println("You did not enter an int");
            return;         //leaves the program (terminates)
        }
        
        
        //check to see if the number of cookies
        if(numCookies/numPeople >= cookiesPerPerson){
            if(numCookies % numPeople == 0){
                System.out.println("You have enough cookies for each person and the amount"+
                     " will divide evenly");
            }
            else{
                System.out.println("You have enough cookies for each person, but they will"+
                     " not divide evenly");
            }
        }
        else{
            moreCookies = cookiesPerPerson * numPeople - numCookies;
            System.out.println("You will not have enough cookies.  You need at least " +
                moreCookies + " more.");
        }
        
        
        
        
        
    } //end of main method
} //end of class