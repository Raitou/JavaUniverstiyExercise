/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 
 */

import java.util.Scanner;

public class BMR {
    public static void main(String...args){
        Scanner input = new Scanner(System.in);
        int weight, age, option;
        double bmr = 0, dblGender = 0, lfm = 0;
        String strGender;
        
        final double m10to14 = 1;
        final double m15to20 = 0.95;
        final double m21to28 = 0.9;
        final double m28beyond = 0.85;
        
        final double f10to18 = 1;
        final double f19to28 = 0.95;
        final double f29to38 = 0.9;
        final double f39beyond = 0.85;
        
        final double veryLight = 1.3;
        final double light = 1.55;
        final double moderate = 1.65;
        final double heavy = 1.8;
        final double veryHeavy = 2;
        
        System.out.println("BASAL METABOLIC RATE");
        
        do{
        System.out.print("Weight (in kg): ");
        weight = input.nextInt();
        }while(!(weight > 0));
        do{
            System.out.print("Age: ");
            age = input.nextInt();
        }while(age < 10);
        
        do{
            System.out.print("Gender: ");
            strGender = input.next();
        }while(!(strGender.equalsIgnoreCase("male") || strGender.equalsIgnoreCase("female")));
        
        if(strGender.equalsIgnoreCase("male")) {
            dblGender = 1.0;
            if((age >= 10)&& (age <= 14)){
                lfm = m10to14;
            }
            else if((age >= 15) && (age <= 20)){
                lfm = m15to20;
            }
            else if((age >= 21) && (age <= 28)){
                lfm = m21to28;
            } else{
                lfm = m28beyond;
            }
            
        }
        if(strGender.equalsIgnoreCase("female")){
            dblGender = 0.9;
            if((age >= 10)&& (age <= 18)){
                lfm = f10to18;
            }
            else if((age >= 19) && (age <= 28)){
                lfm = f19to28;
            }
            else if((age >= 29) && (age <= 38)){
                lfm = f29to38;
            } else{
                lfm = f39beyond;
            }
        }
        
        do{
            System.out.println("Activity Level: ");
            System.out.println("[1] Very Ligth");
            System.out.println("[2] Light");
            System.out.println("[3] Moderate");
            System.out.println("[4] Heavy");
            System.out.println("[5] Very Heavy");


            System.out.print("Option: ");
            option = input.nextInt();
        }while(!(option >= 1 && option <= 5));
        
        switch(option){
            case 1:
                bmr = weight * dblGender * 24 * lfm * veryLight;
                break;
            case 2:
                bmr = weight * dblGender * 24 * lfm * light;
                break;
            case 3:
                bmr = weight * dblGender * 24 * lfm * moderate;
                break;
            case 4:
                bmr = weight * dblGender * 24 * lfm * heavy;
                break;
            case 5:
                bmr = weight * dblGender * 24 * lfm * veryHeavy;
                break;       
        }
        System.out.printf("BMR Value: %.2f", bmr);
    }
}
