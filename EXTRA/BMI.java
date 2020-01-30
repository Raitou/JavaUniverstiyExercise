/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *BMI = weight*height^2
 * @author 
 */

import java.util.Scanner; //For input

public class BMI {
    //Main Driver
    public static void main(String...args){
        System.out.println("BODY MASS INDEX");
        System.out.println("Weight (in kg): "); //Prompt User to input weight
        Scanner cin = new Scanner(System.in); //Call scanner as cin
        double weight = cin.nextDouble(); //Input User's Weight
        System.out.println("Height (in cm): "); //Prompt user to input height
        double height = cin.nextDouble()/100; //Input User's Height and automatically calculate to Meters 
        double bmi = weight/(height*height); //Formula BMI
        //Ternary Nested Operator
        String result = bmi < 18.5 
                ? "Underweight" : //pass to result var
                    bmi >= 18.5 && bmi <= 24.9 
                    ? "Healthy" : //pass to result var
                        bmi >= 25.0 && bmi <= 29.9
                        ? "Overweight" : "Obese"; //pass to result var
        //Output Information
        System.out.printf("BMI Value: %.2f\n", bmi);
        System.out.println("Weight Status: " + result);
    }
}
