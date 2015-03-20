// Kaylynn Johnson
// 03/19/2015
// CSE002 hw08
// THe purpose of this program is write a game that utilizes methods and overloading
//       methods and making sure the user has good input

//import Scanner class

import java.util.Scanner;

public class HW08{
    //all methods must be inside the class
    //maind method required for all java programs
    public static void main(String[] args) {
        char option;
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to MG's adventure world. Now your journey begins. Good luck!");
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        String input = getInput(scan, "Cc");
        System.out.println("You are in a dead valley.");
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        input = getInput(scan, "Cc");
        System.out.println("You walked and walked and walked and you saw a cave!");
        cave();
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        input = getInput(scan, "Cc");
        System.out.println("You entered a cave!");
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        input = getInput(scan, "Cc");
        System.out.println("Unfortunately, you ran into a GIANT!");
        giant();
        System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'E' to Escape, ANYTHING else is to YIELD");
        input = getInput(scan, "AaEe", 10);
        System.out.println("Congratulations! You SURVIVED! Get your REWARD!");
        System.out.println("There are three 3 tressure box in front of you! Enter the box number you want to open!");
        box();
        input = getInput(scan);
        System.out.println("Hero! Have a good day!");
    }
    
    //method for the giant
    public static void giant(){
        System.out.println("                                 ---------                    ");
        System.out.println("                                |  /    \\|                   ");
        System.out.println("                      ZZZZZH    |    O    |    HZZZZZ             ");
        System.out.println("                           H     -----------   H              ");
        System.out.println("                      ZZZZZHHHHHHHHHHHHHHHHHHHHHZZZZZ                   ");
        System.out.println("                           H    HHHHHHHHHHH    H                      ");
        System.out.println("                      ZZZZZH    HHHHHHHHHHH    HZZZZZ               ");
        System.out.println("                                HHHHHHHHHHH                   ");
        System.out.println("                                HHH     HHH                   ");
        System.out.println("                               HHH       HHH                   ");
    }
    
    //method for the cave
    public static void cave() {
        System.out.println("                              *****   * * * * * * * *        ");
        System.out.println("                         ***         ***                      ");
        System.out.println("                      ***               ***                   ");
        System.out.println("                 |    ***               ***                   ");
        System.out.println("                 |    ***               ***                   ");
        System.out.println("             O __|__  ***               ***                   ");
        System.out.println("           ******l    ***               ***                   ");
        System.out.println("            * *       ***               ***                   ");
        System.out.println("           *   *      ********************* * * * * * *       ");
    }
    
    //method for the box
    public static void box(){
       System.out.println("                      *********************     *********************    *********************             ");
        System.out.println("                     ***               ***     ***               ***    ***               ***              ");
        System.out.println("                     ***       1       ***     ***       2       ***    ***       3       ***              ");
        System.out.println("                     ***               ***     ***               ***    ***               ***              ");
        System.out.println("                     *********************     *********************    *********************               "); 
    }
    
    //method to continue or exit the program
    public static String getInput( Scanner scan, String string ){
        String input = scan.nextLine();
        if( !string.contains(input) ){
            System.out.println("Yea right LOSER!");
            System.exit(0);
        }

        return input;
    }
    
    //User can either attack or escape
    public static String getInput( Scanner scan, String string, int trial ){
        string = scan.nextLine();
        double attack;
        int escape;
        int hit = 0;
        //First input before it wenters the while loop
            if( string.equals("a") || string.equals("A") ){
                //Generate a random number to see if the attack was a hit
                attack = Math.random();
                if( attack <= 0.5 ){
                    System.out.println("Oops! You missed!");
                }
                else{
                    System.out.println("Critical hit!");
                    hit++;
                }
            }
            //If the user enters e or E to escape
            else if( string.equals("e") || string.equals("E") ){
                //Generate a random number between 1 and 10 to see if the escape was successful
                escape = (int)( Math.random()*10 + 1 );
                if( escape == 10 ){
                    System.out.println("You successfully escaped!");
                    return string;
                }
                else{
                    System.out.println("Escape failed.");
                }
            }
            //If user enters anything other than A, a E, or e, the game is over
            else{
                System.out.println("Executed by the GIANT! Game Over!");
                System.exit(0);
            }
        while( hit < 10 ){
            //Prompt user to either attack or escape
            System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'E' to Escape, ANYTHING else is to YIELD");
            string = scan.nextLine();
            //Generate a random number 
            if( string.equals("a") || string.equals("A") ){
                //Generate a random number to see if the attack was a hit
                attack = Math.random();
                if( attack <= 0.5 ){
                    System.out.println("Oops! You missed!");
                }
                else{
                    System.out.println("Critical hit!");
                    hit++;
                }
            }
            //If the user enters e or E to escape
            else if( string.equals("e") || string.equals("E") ){
                //Generate a random number between 1 and 10 to see if the escape was successful
                escape = (int)( Math.random()*10 + 1 );
                if( escape == 10 ){
                    System.out.println("You successfully escaped!");
                    return string;
                }
                else{
                    System.out.println("Escape failed.");
                }
            }
            //If user enters anything other than A, a E, or e, the game is over
            else{
                System.out.println("Executed by the GIANT! Game Over!");
                System.exit(0);
            }
        }
        return string;
    }
    
    //User opens a treasury box
    public static String getInput( Scanner scan ){
        int treasure = scan.nextInt();
        switch( treasure ){
            case 1:
                System.out.println("You received 1 million dollars!");
                break;
            case 2:
                System.out.println("You received a Tesla car!");
                break;
            case 3:
                System.out.println("You received a pound of chocolate!");
                break;
            default:
                System.out.println("A Wrong Number! You get nothing! Better restart the game LOL");
                
        }
        return " ";
    }
}
    
    
    
