// Kaylynn Johnson
// 02/20/15
// CSE2 lab 05 Space Exploration
// The purpose of this program is to output a timeline of the space exploration advances from 2000-2010
// It will use a random number generator to select a year in that decade and output all events in the timeline
// that have occurred from 2000 up until the year that has been randomly selected. If the year does not have an event,
// output is N/A

public class SpaceExploration{
    //start main metho required for all java programs
    public static void main(String[] args){
        
        int randomYear = (int)(Math.random()*11)+2000;     //Randomly generate a year within the decade
      
        System.out.println("Here is a timeline of space exploration events from " + randomYear + " to 2000:");
        
        switch( randomYear ){ //Print out events for given year. Start with last year to fall into the next one
            case 2010:
                System.out.println("2010: SpaceX successfully sends spacecraft to orbit and back");
            case 2009:
                System.out.println("2009: N/A");
            case 2008:
                System.out.println("2008: Kepler launched to study deep space");
            case 2007:
                System.out.println("2007: N/A");
            case 2006:
                System.out.println("2006: Spacecraft returns with collections from a comet");
            case 2005:
                System.out.println("2005: Spacecraft collies with comet");
            case 2004:
                System.out.println("2004: N/A");
            case 2003:
                System.out.println("2003: Largest infrared telescope released");
            case 2002:
                System.out.println("2002: N/A");
            case 2001:
                System.out.println("2001: First spacecraft lands on asteroid");
            case 2000:
                System.out.println("2000: First spacecraft orbits an asteroid");
                break;
            default:        //In case of anything else
                System.out.println("Number generator messed up.");
                return;
        }
            
        
    }//End class
}//End main method