// Kaylynn Johnson
// 04/10/2015
// CSE 2 hw11 CSE2Linear
// The purpose of this program is for the user to input 15 students grade in ascending order (check for
//      errors).  Have the user enter a grade that they would like to serch for, and do a binary search
//      to find it.  THen, scramble the array and then ask the user to enter a grade, and this time,
//      do a linear search for the grade.  Utilize methods for each task for a cleaner program.

import java.util.Random;
import java.util.Scanner;

public class CSE2Linear{
    //main method required for all java programs
    public static void main(String[] args){
        Scanner scan = new Scanner( System.in );
        Random random = new Random();
        int[] grades = new int[15];
        grades = selectSort(scan);
        //Print ordered array of grades
        System.out.println("The grades, sorted, are: ");
        for( int i = 0; i < grades.length; i++ ){
            System.out.print(grades[i] + " ");
        }
        System.out.println();
        int search1 = 0;
        System.out.print("Enter a grade to search for: ");
        search1 = scan.nextInt();
        binarySearch(grades, search1);
        grades = scramble(grades, random);
        //Print scrambled array of grades
        System.out.println("The grades, scrambled, are: ");
        for( int i = 0; i < grades.length; i++ ){
            System.out.print(grades[i] + " ");
        }
        System.out.println();
        int search2 = 0;
        System.out.print("Enter a grade to search for: ");
        search2 = scan.nextInt();
        linearSearch(grades, search2);
    }
    
    
    //method for creating the array of grades in ascending order
    public static int[] selectSort(Scanner scan){
        int[] grades = new int[15];
        System.out.println("Enter 15 ints for the final grades in CSE2:");
        for( int i = 0; i < grades.length; i++ ){
            while( !scan.hasNextInt() ){
                System.out.print("The grade must be an int. Try again:");
                scan.next();
            }
            grades[i] = scan.nextInt();
            while( grades[i] < 0 || grades[i] > 100 ){
                System.out.print("The grade is out of range or must be bigger than the last. Try again: ");
                grades[i] = scan.nextInt();
            }
            if( i != 0 ){
                while( grades[i] <= grades[i - 1] ){
                    System.out.print("Grade must be bigger than the last. Try again: ");
                    grades[i] = scan.nextInt();
                    if(grades[i-1]==100){
                        System.out.println("Ran out of grades to input that were bigger than the last. Exiting.");
                        System.exit(1);
                    }
                }
            }
        }
        return grades;
    }
    //method for finding a grade using a binary search
    public static void binarySearch(int[] grades, int search){
        int indexCheck = (int)grades.length/2 - 1;
        boolean found = true;
        int iterate = 0;
        int max = 14;
        int min = 0;
        while(found){
            if(grades[indexCheck] == search){
                System.out.println("The number " + search + " was found in " + iterate + " iterations.");
                found = false;
            }
            else if(grades[indexCheck + 1 ] > search && grades[indexCheck - 1 ] < search){
                System.out.println(search + " was not found in the list with " + iterate + " iterations.");
                found = false;
            }
            else{
                if (grades[indexCheck] > search){
                    indexCheck = indexCheck - (int)((indexCheck-min) / 2) - 1;
                    max = indexCheck;
                }
                else if (grades[indexCheck] < search){
                    indexCheck = indexCheck + (int)((max-indexCheck) / 2) + 1;
                    min = indexCheck;
                }
            }
            iterate++;
        }
    }
    
    //method for scrambling the array of grades
    public static int[] scramble( int[] grades, Random random ){
        
        for( int i = 0; i < grades.length; i++ ){
            //find a random member to swap with
            int target = (int)(grades.length*Math.random());
            //Swap values
            int temp = grades[target];
            grades[target] = grades[i];
            grades[i] = temp;
        }
        
        return grades;
    }
    
    //method for finding a grade using a linear search
    public static void linearSearch( int[] grades, int search ){
        int j = 0;
        boolean found = false;
        for( j = 0; j < grades.length; j++ ){
            if( grades[j] == search ){
                found = true;
                break;
            }
        }
        if(found){
            System.out.println("The number " + search + " was found in " + j + " iterations.");
        }
        else{
            System.out.println("The number " + search + " was not found.");
        }
    }
    
}