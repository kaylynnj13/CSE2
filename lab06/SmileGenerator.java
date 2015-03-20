// Kaylynn Johnson
// 02/27/2015
// lab 06 Smile Generator
// The purpose of this program is to utilize for, while, and do while loops to print
//      a random number of smily faces.

public class SmileGenerator{
    //main method required for every java program
    public static void main(String[] args){
    // Make a string of a samily face
    String smile = ":) ";
    //Use a for loop to print 5 smiles
    for (int x = 1; x <= 5; x++){
        System.out.print(smile);
    }
    System.out.println("");
    int y = 1;
    //Use a while loop to print 5 smiles
    while( y <= 5 ){
        System.out.print(smile);
        y++;
    }
    System.out.println("");
    int z = 1;
    //Use a do while loop to print 5 smiles
    do{
        System.out.print(smile);
        z++;
    } while(z <= 5);
    System.out.println("");
    
    // Generate random number of smiles
    int numSmiles = (int)( 1 + Math.random()*100);
    System.out.println("Print out " + numSmiles + " smiles: ");
    for(int n = 1; n <= numSmiles; n++){
        System.out.print(smile);
    }
    System.out.println("");
    System.out.println("Print out smiles with a break with every 30 smiles: ");
    //Break a line after every 30 smiles
    for( int n = 1; n<= numSmiles; n++ ){
        System.out.print(smile);
        if( n % 30 == 0 ){
            System.out.println("");
        }
    }
    //Print a triangle of smiles
    System.out.println("");
    System.out.println("Print a triangle of smiles: ");
    String triangle = ":) ";
    for( int x = 0; x <= 4; x++){
        System.out.println(triangle);
        triangle = triangle + smile;
    }
    
        
    }//end main method
}//end class