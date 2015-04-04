// Kaylynn Johnson
// 04/03/2015
// CSE2 hw10 Elimination
// The purpose of this program is to utlize methods and arrays to 
//      generate a random list of arrays and create a new array that 
//      deletes an element of the previous array

import java.util.Scanner;

public class Elimination{
  public static void main(String [] arg){
	Scanner scan=new Scanner(System.in);
    int num[]=new int[15];
    int newArray1[];
    int newArray2[];
    int index,target;
	String answer="";
	do{
  	    System.out.println("Random input 15 ints [0-9]");
  	    num = randomInput();
  	    String out = "The original array is:";
  	    out += listArray(num);
    	System.out.println(out);
 
  	    System.out.print("Enter the index ");
  	    index = scan.nextInt();
  	    newArray1 = delete(num,index);
  	    String out1="The output array is ";
  	    out1+=listArray(newArray1); //return a string of the form "{2, 3, -9}"  
  	    System.out.println(out1);
 
        System.out.print("Enter the target value ");
  	    target = scan.nextInt();
  	    newArray2 = remove(num,target);
  	    String out2="The output array is ";
  	    out2+=listArray(newArray2); //return a string of the form "{2, 3, -9}"  
  	    System.out.println(out2);
  	 
  	    System.out.print("Go again? Enter 'y' or 'Y', anything else to quit-");
  	    answer=scan.next();
	}while(answer.equals("Y") || answer.equals("y"));
  }
 
  public static String listArray(int num[]){
	String out="{";
	for(int j=0;j<num.length;j++){
  	    if(j>0){
    	    out+=", ";
      	}
  	    out+=num[j];
	}
	out+="} ";
	return out;
  }
  
  //method to create an array of 15 random numbers
  public static int[] randomInput(){
      int[] randomArray = new int[15];
      //make a 15 element arrays with random numbers between 0-9
      for( int i = 0; i < 15; i++ ){
          randomArray[i] = (int)(Math.random()*10);
      }
      return randomArray;
  }
  
  public static int[] delete( int[] num, int index ){
      int[] newArray = new int[14];
      int count = 0;
      //make sure index is valid
      if( index < 0 || index > (num.length - 1 )){
          System.out.println("The index is not valid.");
      }
      //if valid, skip index value when creating new copy of array
      else{
          System.out.println("Index " + index + " element has been removed.");
          for( int j = 0; j < num.length - 1; j++ ){
                  
                if( j == index ){
                    count++;
                }
                newArray[j] = num[j+count];
              
          }
      }
      //return array back to main method
      return newArray;
      
  }
  
  public static int[] remove( int[] num, int target ){
      //count how many integers of value target are in array
      int numTarget = 0;
      for( int k = 0; k < num.length; k++){
          if( num[k] == target ){
              numTarget++;
          }
      }
      int[] newArray = new int[15 - numTarget];
      int count = 0;
      //skip any values of target in array to "remove" them
      for( int j = 0; j < num.length - numTarget; j++){
              
        while( num[j + count] == target ){
            System.out.println("Element " + j + " has been found.");
            //if target equals element in array, increase count to "skip"
            count++;
        }
            newArray[j] = num[j + count];
        }
      //return new array back to main method
      return newArray;
  }
      
  }
  
  

