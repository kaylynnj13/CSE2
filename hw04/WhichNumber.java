// Kaylynn Johnson
// 2/13/2015
// CSE2 HW04 WhichNumber
// This program will ask the user to think of a numberbetween 0 and 10 and the computer
//       will ask the user questions in order to try and guess the integer

import java.util.Scanner;

public class WhichNumber{
    //main method required for every java program
    public static void main(String[] args){
        Scanner myScanner;
        myScanner = new Scanner( System.in );
        //Initialize yes and no chars:
        String y = "y", Y ="Y", n = "n", N = "N";
        
        System.out.println("Think of a number between 1 and 10 inclusive.");
        System.out.print("Is the number even? ");           //Ask if the number is even
        String even = myScanner.nextLine();
        
        if(even.equals(y) || even.equals(Y)){             //Check if the number is even
            System.out.print("Is the number divisible by 3? ");     //Ask if the number is divisible by 3
            String divisible3 = myScanner.nextLine();
            if(divisible3.equals(y) || divisible3.equals(Y)){
                //The number must be 6 if it is even and divisible by 3
                System.out.print("Is your number 6? ");
                String isNumber6 = myScanner.nextLine();
                if(isNumber6.equals(y) || isNumber6.equals(Y)){
                    System.out.println("Yay!");
                }
                else if(isNumber6.equals(n) || isNumber6.equals(N)){
                    System.out.println("You must be lying.  It has to be 6.");
                }
                else{
                     System.out.println("The answer must be either 'n', 'N','y', or 'Y.'");
                     return;         //terminate program
                }//end check if number equals 6
            }
            //If not divisble by 3, ask for more questions   
            else if(divisible3.equals(n) || divisible3.equals(N)){
                //check if number is divisible by 4
                System.out.print("Is the number divisible by 4? ");     //Ask if the number is divisible by 3
                String divisible4 = myScanner.nextLine();
                if(divisible4.equals(y) || divisible4.equals(Y)){
                    //check if number if the number is great than 1 when divided by 4
                    System.out.print("Is the number divided by 4 greater than 1? ");
                    String isNumberDivided4Great1 = myScanner.nextLine();
                    if(isNumberDivided4Great1.equals(y) || isNumberDivided4Great1.equals(Y)){
                         //The number must be 8 if the number divided by 4 (2) is greater than 1
                         System.out.print("Is your number 8? ");
                         String isNumber8 = myScanner.nextLine();
                         if(isNumber8.equals(y) || isNumber8.equals(Y)){
                            System.out.println("Yay!");
                         }
                         else if(isNumber8.equals(n) || isNumber8.equals(N)){
                            System.out.println("You must be lying.  It has to be 8.");
                         }
                         else{
                            System.out.println("The answer must be either 'n', 'N','y', or 'Y.'");
                            return;         //terminate program
                         }//end check if number equals 8
                    }
                    else if(isNumberDivided4Great1.equals(n) || isNumberDivided4Great1.equals(N)){
                         //The number must be 4 if the number divided by 4 (2) is less than 1
                         System.out.print("Is your number 4? ");
                         String isNumber4 = myScanner.nextLine();
                         if(isNumber4.equals(y) || isNumber4.equals(Y)){
                            System.out.println("Yay!");
                         }
                         else if(isNumber4.equals(n) || isNumber4.equals(N)){
                            System.out.println("You must be lying.  It has to be 4.");
                         }
                         else{
                             System.out.println("The answer must be either 'n', 'N','y', or 'Y.'");
                             return;         //terminate program
                         }//end check if number equals 4
                    }
                    else{
                        System.out.println("The answer must be either 'n', 'N','y', or 'Y.'");
                        return;         //terminate program
                    }
                //end check for if the number is 4 or 8 (not divisible by 3)
                }
                else if(divisible4.equals(n) || divisible4.equals(N)){
                    //check is number is divisible by 5
                    System.out.print("Is the number divisible by 5? ");     //Ask if the number is divisible by 3
                    String divisible5 = myScanner.nextLine();
                    if(divisible5.equals(y) || divisible5.equals(Y)){
                         //The number must be 10 if it is even and divisible by 5
                         System.out.print("Is your number 10? ");
                         String isNumber10 = myScanner.nextLine();
                         if(isNumber10.equals(y) || isNumber10.equals(Y)){
                            System.out.println("Yay!");
                         }
                         else if(isNumber10.equals(n) || isNumber10.equals(N)){
                            System.out.println("You must be lying.  It has to be 10.");
                         }
                         else{
                            System.out.println("The answer must be either 'n', 'N','y', or 'Y.'");
                            return;         //terminate program
                         }//end check if number equals 10
                    }
                    else if(divisible5.equals(n) || divisible5.equals(N)){
                         //The number must be 2 if it is even and not divisible by 5
                         System.out.print("Is your number 2? ");
                         String isNumber2 = myScanner.nextLine();
                         if(isNumber2.equals(y) || isNumber2.equals(Y)){
                            System.out.println("Yay!");
                         }
                         else if(isNumber2.equals(n) || isNumber2.equals(N)){
                            System.out.println("You must be lying.  It has to be 2.");
                         }
                         else{
                            System.out.println("The answer must be either 'n', 'N','y', or 'Y.'");
                            return;         //terminate program
                         }//end check if number equals 2
                    }
                    else{
                        System.out.println("The answer must be either 'n', 'N','y', or 'Y.'");
                        return;         //terminate program
                    }
               
                }
                else{
                    System.out.println("The answer must be either 'n', 'N','y', or 'Y.'");
                    return;         //terminate program
                }
                //End check to see if number is 10 or 2 (divisible by 5 or not)
            
            }
        }
        //End check for all even numbers
        else if(even.equals(n)||even.equals(N)){
            //Check if the number is divisible by 3
            System.out.print("Is the number divisible by 3? ");     //Ask if the number is divisible by 3
            String divisible3 = myScanner.nextLine();
            if(divisible3.equals(y) || divisible3.equals(Y)){
                //Check is the number is greater/less than 1 when divided by 3
                System.out.print("Is the number divided by 3 greater than 1? ");
                String isNumberDivided3Great1 = myScanner.nextLine();
                if(isNumberDivided3Great1.equals(y) || isNumberDivided3Great1.equals(Y)){
                    //The number must be 9 if the number divided by 4 (2) is greater than 1
                    System.out.print("Is your number 9? ");
                    String isNumber9 = myScanner.nextLine();
                    if(isNumber9.equals(y) || isNumber9.equals(Y)){
                        System.out.println("Yay!");
                    }
                    else if(isNumber9.equals(n) || isNumber9.equals(N)){
                        System.out.println("You must be lying.  It has to be 9.");
                    }
                    else{
                        System.out.println("The answer must be either 'n', 'N','y', or 'Y.'");
                        return;         //terminate program
                    }
                }//end check if number equals 9
                else if(isNumberDivided3Great1.equals(n) || isNumberDivided3Great1.equals(N)){
                    //The number must be 3 if the number divided by 4 (2) is less than 1
                    System.out.print("Is your number 3? ");
                    String isNumber3 = myScanner.nextLine();
                    if(isNumber3.equals(y) || isNumber3.equals(Y)){
                        System.out.println("Yay!");
                    }
                    else if(isNumber3.equals(n) || isNumber3.equals(N)){
                        System.out.println("You must be lying.  It has to be 3.");
                    }
                    else{
                        System.out.println("The answer must be either 'n', 'N','y', or 'Y.'");
                        return;         //terminate program
                    }
                }//end check if number equals 3
                else{
                    System.out.println("The answer must be either 'n', 'N','y', or 'Y.'");
                    return;         //terminate program
                }
            
            }//end if number is divisible by 3
            else if(divisible3.equals(n) || divisible3.equals(N)){
                //Check if the number is greater than 6
                System.out.print("Is the number greater than 6? ");
                String isNumberGreat6 = myScanner.nextLine();
                if(isNumberGreat6.equals(y) || isNumberGreat6.equals(Y)){
                    //The number must be 7 if it is odd, not divisible by 3, and greater than 6
                    System.out.print("Is your number 7? ");
                    String isNumber7 = myScanner.nextLine();
                    if(isNumber7.equals(y) || isNumber7.equals(Y)){
                        System.out.println("Yay!");
                    }
                    else if(isNumber7.equals(n) || isNumber7.equals(N)){
                        System.out.println("You must be lying.  It has to be 7.");
                    }
                    else{
                        System.out.println("The answer must be either 'n', 'N','y', or 'Y.'");
                        return;         //terminate program
                    }
                }//end check if number equals 7
                else if(isNumberGreat6.equals(n) || isNumberGreat6.equals(N)){
                    //Check to see whether tha number is less than 3
                    System.out.print("Is the number less than 3? ");
                    String isNumberLess3 = myScanner.nextLine();
                    if(isNumberLess3.equals(y) || isNumberLess3.equals(Y)){
                        //The number must be 1 if it is odd, not divisible by 3, and less than 6 and 3
                        System.out.print("Is your number 1? ");
                        String isNumber1 = myScanner.nextLine();
                        if(isNumber1.equals(y) || isNumber1.equals(Y)){
                            System.out.println("Yay!");
                        }
                        else if(isNumber1.equals(n) || isNumber1.equals(N)){
                            System.out.println("You must be lying.  It has to be 1.");
                        }
                        else{
                            System.out.println("The answer must be either 'n', 'N','y', or 'Y.'");
                            return;         //terminate program
                        }
                    }//end check for number equals 1
                    else if(isNumberLess3.equals(n) || isNumberLess3.equals(N)){
                        //The number must be 5 if it is odd, not divisible by 3, less than 6, and greater than 3
                        System.out.print("Is your number 5? ");
                        String isNumber5 = myScanner.nextLine();
                        if(isNumber5.equals(y) || isNumber5.equals(Y)){
                            System.out.println("Yay!");
                        }
                        else if(isNumber5.equals(n) || isNumber5.equals(N)){
                            System.out.println("You must be lying.  It has to be 5.");
                        }
                        else{
                            System.out.println("The answer must be either 'n', 'N','y', or 'Y.'");
                            return;         //terminate program
                        }
                    }//end check if number equals 5
                    else{
                        System.out.println("The answer must be either 'n', 'N','y', or 'Y.'");
                        return;         //terminate program
                    }
                   
                }
                else{
                    System.out.println("The answer must be either 'n', 'N','y', or 'Y.'");
                    return;         //terminate program
                }
                
            }//end if number is not divisible by 3
        } //end if number is odd
            
            
            
        else{
            System.out.println("The answer must be either 'n', 'N','y', or 'Y.'");
            return;         //terminate program
        }
        //end check for all numbers
    } //end main method
} //end class