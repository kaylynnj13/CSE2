// Kaylynn Johnson
// 1/30/15
// CSE2 lab02
// The Cycolmeter program records the time (s) and number of rotations in the front wheel
// For two trips, it prints the # min, # counts, distance (miles) and distance of the two trips combined
//

public class Cyclometer {
    //main method required for every Java program
    public static void main(String[] args) {
        
        int secsTrip1=480;                // length of time(s) for trip 1
        int secsTrip2=3220;               // length of time(s) for trip 2
        int countsTrip1=1561;             // number of wheel rotations for trip 1
        int countsTrip2=9037;             // number of wheel rotations for trip 2
        double wheelDiameter=27.0,        // diameter of the front bicycle wheel
               PI=3.1459,                 // the number pi
               feetPerMile=5280,          // the number of feet per mile
               inchesPerFoot=12,          // the number of inches per foot
               secondsPerMinute=60;      // the number of seconds per minute
        double distanceTrip1, distanceTrip2, totalDistance;  
        //double variables that the calculated distances will be assigned to
        
        System.out.println("Trip 1 took "+(secsTrip1/secondsPerMinute)+" minutes and had "
            +countsTrip1+" counts.");
        System.out.println("Trip 2 took "+(secsTrip2/secondsPerMinute)+" minutes and had "
            +countsTrip2+ " counts.");
        
        //Calculate the distance of the trip in miles by multiplying the number of counts
        //by the circumference of the wheel (D*pi) - must convert inches to miles
        
        distanceTrip1=countsTrip1*wheelDiameter*PI;  //distance in inches
        distanceTrip1 /=inchesPerFoot*feetPerMile;   //converts inches to feet to miles
        distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
            //calculates the distance in trip 2 and converts inches to feet to miles
        totalDistance = distanceTrip1+distanceTrip2; //total distance of the two trips
        
        //Print out the calculated output data
        
        System.out.println("Trip 1 was "+distanceTrip1+ " miles");
        System.out.println("Trip 2 was "+distanceTrip2+ " miles");
        System.out.println("The total distance was "+totalDistance+ " miles");
    }  //end of main method
}