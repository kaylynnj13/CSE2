// Kaylynn Johnson
// 02/06/2015
// CSE2 hw03 Bicycle
// This program is similar to lab02. It will prompt the user to input the number
//      of counts on the cyclometer and the number of seconds in which the counts
//      occured.  THe program will compute and print the distance travel and average
//      miles per hour.

import java.util.Scanner;           //Import the Scanner class

public class Bicycle{
    // main method required for every java program
    public static void main(String[] args){
        
        Scanner myScanner;          //declare the instance of the Scanner class
        myScanner = new Scanner( System.in );       //call the scanner constructor
        //Ask for input (# counts and # seconds during which the counts occured)
        //Assign to variables
        
        System.out.print("Enter the number of seconds: ");
        int numSeconds = myScanner.nextInt();
        System.out.print("Enter the number of counts: ");
        int numCounts = myScanner.nextInt();
        
        
        int wheelDiameter = 27;         //Diameter of the wheel is 27 inches
        double PI=3.1459,               // the number pi
            feetPerMile=5280,           // the number of feet per mile
            inchesPerFoot=12,           // the number of inches per foot
            secondsPerMinute=60,        // the number of seconds per minute
            minutesPerHour=60;          // the number of minutes per hour
        double numMinutes,              //time in minutes
            totalDistance,              //total distance of the trip
            averageMPH;                 //average speed in MPH
            
        //compute the time in minutes, total distance, and average speed (MPH)
        
        numMinutes=numSeconds/secondsPerMinute;     // convert seconds to minutes
        totalDistance=numCounts*wheelDiameter*PI;   // distance in inches
        totalDistance/=inchesPerFoot*feetPerMile;   // converts inches to feet to miles
        totalDistance*=100; totalDistance=(int)totalDistance; totalDistance/=100.0;     //display two digits after decimal
        averageMPH=totalDistance/(numMinutes/minutesPerHour);     //average miles per hour
        averageMPH*=100; averageMPH=(int)averageMPH; averageMPH/=100.0;     //display two digits after decimal
        
        //print the results
        System.out.println("The distance was "+totalDistance+" miles and took "
            +numMinutes+" minutes");
        System.out.println("The average mph was "+averageMPH);
        
        
        
        
    } //end main method
}  //end class