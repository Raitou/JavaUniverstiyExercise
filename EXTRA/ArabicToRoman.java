
import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 
 */


public class ArabicToRoman {
    public static void main(String args[]){
        Scanner cin = new Scanner(System.in);
        int intArabic;
        System.out.println("Arabic Numbers to Roman Numeral Converter");
        System.out.print("Enter the arabic number: ");
        try{
            intArabic = cin.nextInt();
        }
        catch(InputMismatchException e){
            System.out.println("Input must be an integer");
            return;
        }
        String romanNum = "";
        int repeat;
        if(intArabic >= 1000){
            repeat = intArabic / 1000;
            for(int i = 0; i < repeat; i++){
                romanNum += "M";
            }
            
            intArabic %= 1000;
        }
        
        if(intArabic >= 100){
            repeat = intArabic/100;
            if(repeat < 4){
                for(int i=0;i<repeat;i++){
                    romanNum += "C";
                }
            }
            else if(repeat == 4){
                romanNum += "CD";
            }
            else if(repeat < 9){
                repeat -= 5;
                romanNum += "D";
                for(int i=0;i<repeat;i++){
                    romanNum += "C";
                }
            }
            else{
                romanNum += "CM";
            }
            intArabic %= 100;
        }
        
        if(intArabic >= 10){
            repeat = intArabic/10;
            if(repeat < 4){
                for(int i=0;i<repeat;i++){
                    romanNum += "X";
                }
            }
            else if(repeat == 4){
                romanNum += "XL";
            }
            else if(repeat < 9){
                repeat -= 5;
                romanNum += "L";
                for(int i=0;i<repeat;i++){
                    romanNum += "X";
                }
            }
            else{
                romanNum += "XC";
            }
            intArabic %= 10;            
        }
        
        if(intArabic >= 1){
            repeat = intArabic;
            if(repeat < 4){
                for(int i=0;i<repeat;i++){
                    romanNum += "I";
                }
            }
            else if(repeat == 4){
                romanNum += "IV";
            }
            else if(repeat < 9){
                repeat -= 5;
                romanNum += "V";
                for(int i=0;i<repeat;i++){
                    romanNum += "I";
                }
            }
            else{
                romanNum += "IX";
            }
            intArabic %= 1;            
        }
        
        System.out.println(romanNum);
        
    }
}
