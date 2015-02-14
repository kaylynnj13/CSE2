// Kaylynn Johnson
// CSE2 2/13/2015
// hw04 Banking
// This program will give the user a random bank account of value between 1,000 and 5,000.
//      They will input whether they would like to deposity, withdraw, or view their balance
//      The computer will perform the task and print the remaining balance at the end.

import java.util.Scanner;

public class Banking{
    //main method reuired for all java programs
    public static void main(String[] args){
        Scanner myScanner;
        myScanner = new Scanner( System.in );
        //Initiate variables
        double finalAccount;
        double account = (double)(1000 + Math.random()*((5000-1000) + 1));        //create random number between 1000-9999
      
        //Ask user what they would like to do with the account
        System.out.print("Press 1 if you would like to deposit money, 2 if you would " +
            " like to withdraw money or 3 if you would like to view your bank account: ");
        int choice = myScanner.nextInt();
        //Evaluate the choice of the consumer, and take action
        switch( choice ){
            case 1:     //user would like to deposit money
                System.out.printf("How much would you like to deposit? $");
                double deposit = myScanner.nextDouble();
                if(deposit > 0){
                    finalAccount = deposit + account;
                    System.out.printf("Your initial account balance is $%6.2f.\n", account);
                    System.out.printf("Your account balance after the deposit is $%6.2f.\n", finalAccount);
                }
                else{//check if deposit is zero or less
                    System.out.println("You can only deposit a positive number.");
                    return;
                }
                break;
            case 2:     //user would like to withdraw money
                System.out.printf("How much would you like to withdraw? $");
                double withdraw = myScanner.nextDouble();
                if(withdraw <= account){
                    finalAccount = account - withdraw;
                    System.out.printf("Your initial account balance is $%6.2f.\n", account);
                    System.out.printf("Your acount balance after the wihdrawal is $%6.2f.\n", finalAccount);
                }
                else{//check if deposit is zero or less
                    System.out.printf("Your current account balance is $%6.2f.\n", account);
                    System.out.println("You can only withdraw an amount that is less than the current total "+
                    "amount in your account.");
                    return;
                }
                break;
            case 3:     //user would like to view their balance
                System.out.printf("Your current account balance is $%6.2f.\n", account);
                break;
            default:    //check for invalid input
                System.out.println("Invalid input. Must enter either 1 for deposit, 2 "+
                    "for withdraw, or 3 to view the balance.");
                break;
        }//end switch
                    
                
        
    }//end main method
}//end class