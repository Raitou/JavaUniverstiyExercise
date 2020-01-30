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

public class BMICalculator {
    //Main Driver
    public static void main(String...args){
        System.out.println("Please Input Weight in Kilograms: ");
        Scanner cin = new Scanner(System.in); //Input User's Weight as kg
        double weight = cin.nextDouble(); //use double for precision
        System.out.println("Please Input Height in Centimeters: ");
        double height = cin.nextDouble()/100; //Input User's Height and automatically calculate to Meters 
        double bmi = weight/(height*height); //Formula BMI
        //Ternary Nested Operator
        String result = bmi < 18.5 
                ? "Underweight" :
                    bmi >= 18.5 && bmi <= 24.9 
                    ? "Healthy" :
                        bmi >= 25.0 && bmi <= 29.9
                        ? "Overweight" : "Obese";
        //Output Information
        System.out.println("BODY MASS INDEX");
        System.out.printf("Weight (in kg): %.2f kg\n", weight);
        System.out.printf("Height (in cm): %.2f cm\n",  height*100);
        System.out.println("Weight Status: " + result);
    }
}
