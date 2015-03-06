// Kaylynn Johnson
// 03/05/2015
// CSE2 hw07 waves
// The purpose of this program is to practice using nested loops
//      a user will input a value (1-30) for waves of this value
//      to be generated.  It will be generated 3 times: for loop,
//      while loop, and do-while loop.

import java.util.Scanner;

public class waves{
    //main method required for all java programs
    public static void main(String[] args){
        Scanner scan = new Scanner( System.in );
        System.out.print("Please enter a value between 1-30, inclusive: ");
        //Check if value is an integer
        while( !scan.hasNextInt() ){
            System.out.print("Invalid input. Try again: ");
            scan.next();
        }
        int num = scan.nextInt();
        //Check if value is between 1 and 30
        while( num < 1 || num > 30 ){
            System.out.print("Invalid input. Try again: ");
            num = scan.nextInt();
        }
        System.out.println("FOR LOOP: ");
        //Use a for loop to create wave
        for(int x = 1; x <= num; x++){
            //if number is odd, half wave starts high and goes down
            if( x % 2 != 0 ){
                for( int y = x; y >= 1; y--){
                    for( int j = y; j >= 1; j--){
                        System.out.print(x);
                    }
                    System.out.println();
                }
            }//if number is even, half wave starts low and goes high
            else{
                for( int y = 1; y <= x; y++){
                    for( int j = 1; j <= y ; j++){
                        System.out.print(x);
                    }
                    System.out.println();
                }
                
            }
        }
        //initialize while loop variables
        int w1,w2,w3,w4,w5;
        w1 = 1;
        //Use a while loop to create wave
        System.out.println();
        System.out.println("WHILE LOOP: ");
        while( w1 <= num ){
            w2 = w1;        //reset variables back to starting values
            w3 = 1;
            //if number is odd, half wave starts high and goes down
            if( w1 % 2 != 0 ){
                while( w2 >= 1 ){
                    w4 = w2;
                    while( w4 >= 1 ){
                        System.out.print(w1);
                        w4--;       //decrement w4
                    }
                    System.out.println();
                    w2--;       //decrement w2
                }
            }//if number is even, half wave starts low and goes high
            else{
                while( w3 <= w1 ){
                    w5 = 1;
                    while( w5 <= w3 ){
                        System.out.print(w1);
                        w5++;       //increment w5
                    }
                    System.out.println();
                    w3++;       //increment w3
                }
                
            }
            w1++;       //increment w1
        }
        
        int d1,d2,d3,d4,d5;
        d1 = 1;
        //Use a do-while loop to create wave
        System.out.println();
        System.out.println("DO-WHILE LOOP: ");
        do{
            d2 = d1;        //reset variables back to starting values
            d3 = 1;
            //if number is odd, half wave starts high and goes down
            if( d1 % 2 != 0 ){
                do{
                    d4 = d2;
                    do{
                        System.out.print(d1);
                        d4--;       //decrement w4
                    }while( d4 >= 1 );
                    System.out.println();
                    d2--;       //decrement w2
                }while( d2 >= 1 );
            }//if number is even, half wave starts low and goes high
            else{
                do{
                    d5 = 1;
                    do{
                        System.out.print(d1);
                        d5++;       //increment w5
                    }while( d5 <= d3 );
                    System.out.println();
                    d3++;       //increment w3
                }while( d3 <= d1 );
                
            }
            d1++;       //increment w1
        }while( d1 <= num );
    }
}