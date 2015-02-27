// Kaylynn Johnson
// 02/26/2015
// hw06 Make Symbols
// The purpose of this program is to use a do-while loop in order to generate a 
//      random number of characters (between 0-100) stars (*) if the number is even,
//      or '&' if the number is odd

public class MakeSymbols{
    //main method required for every java program
    public static void main(String[] args){
        //Generate random number between 0-100
        int num = (int)( 1 + Math.random()*100 );
        int count = 1;
        String output = "";
        System.out.println("Random number generated: " + num );
        //Loop through as many times as the random number (using count as the counter)
        do{
            //If number is even, print *
            if( num % 2 == 0 ){
                output = output + "*";
            }
            //If number is off, print &
            else{
                output = output + "&";
            }
            count++;
        }while( count <= num );
        //Print the output
        System.out.println(output);
        
        
    }//end main method
}//end class