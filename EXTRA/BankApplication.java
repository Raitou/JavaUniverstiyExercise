
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author raito
 */
public class BankApplication {
    public static void main(String...args){
        Scanner input = new Scanner(System.in);
        double accountBal = 0, accountBalFinal = 0;
        final double interestRate = 0.05; //Constant uwu
        String option = "";
        
        //A while loop if want to redo calculation
        while(true){
            System.out.println("Bank Interest Calculator ( Rate : 5 % )");
            System.out.print("Enter Balance: ");

            accountBal = accountBalFinal = input.nextInt(); //Input and assign

            //10 Years
            int switcher = 0; //Switcher for switch statement saving multiple use of sout and assignment
            System.out.println("In span of 10 Years");
            while(true){
                //This switches the operation used
                switch(switcher){
                    case 0:
                        //Compounded Yearly 
                        for(int i = 0; 10 > i; i++){
                            accountBalFinal += accountBalFinal * interestRate;
                        }
                        switcher++; //serve as swithcer of operations
                        System.out.print("Yearly Rate: ");
                        break;
                    case 1:
                        //Compunded Monthly
                        for(int i = 0; 120 > i; i++){
                            accountBalFinal += accountBalFinal * (interestRate/12);
                        }
                        switcher++;
                        System.out.print("Monthly Rate: ");
                        break;
                    case 2:
                        //Compunded Daily
                        for(int i = 0; 3650 > i; i++){
                            accountBalFinal += accountBalFinal * (interestRate/365);

                        }
                        switcher++;
                        System.out.print("Daily Rate: ");
                        break;     
                }
                System.out.printf("%.2f\n",accountBalFinal); //Output the Balance
                accountBalFinal = accountBal; //Every end of operation from switch assign initial value

                //Case 3 is invalid so break loop
                if(switcher == 3){
                    break;
                }
            }
            //Question
            while(true){
                System.out.print("Do you want to do another calculation ( Y / N ): ");
                option = input.next();
                //Input Checker
                if(option.equalsIgnoreCase("Y") || option.equalsIgnoreCase("N")){
                    break;
                } else {
                    System.out.println("Wrong Input! Please press Y or N");
                }
            }
            //If no break else repeat
            if(option.equalsIgnoreCase("N")){
                break;
            }
        }
        
        
        
        
        
        
        
        
        
    }
    
    
}
