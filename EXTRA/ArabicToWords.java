/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 
 */

import java.util.InputMismatchException;
import java.util.Scanner;


public class ArabicToWords {
    public static void main(String args[]){
        Scanner cin = new Scanner(System.in);
        int intArabic;
        
        System.out.println("Arabic Numbers to Words Converter");
        System.out.print("Enter the arabic number: ");
        
        try{
            intArabic = cin.nextInt();
            assert intArabic > 1 && intArabic < 4000 : "Out of Range";
        }
        catch(AssertionError e){
            System.out.println("Input must be 1-3999");
            return;
        }
        catch(InputMismatchException e){
            System.out.println("Input must be an integer");
            return;
        }
        
        
        int wordCount = Integer.toString(intArabic).length();
        String wordNum = "";
        
        if(intArabic > 999){
            wordNum+=numToWord(intArabic/1000)+ " Thousand ";
            intArabic %= 1000;
        }
        
        if(intArabic > 99){
            wordNum+=numToWord(intArabic/100)+ " Hundred ";
            intArabic %= 100;
        }
        
        if(intArabic > 19){
            if(intArabic >= 90){
                wordNum+="Ninety ";
            }
            else if(intArabic >= 80){
                wordNum+="Eighty ";
            }
            else if(intArabic >= 70){
                wordNum+="Seventy ";
            }
            else if(intArabic >= 60){
                wordNum+="Sixty ";
            }
            else if(intArabic >= 50){
                wordNum+="Fifty ";
            }
            else if(intArabic >= 40){
                wordNum+="Forty ";
            }
            else if(intArabic >= 30){
                wordNum+="Thirty ";
            }
            else if(intArabic >= 20){
                wordNum+="Twenty ";
            }
            
        }
        else if(intArabic > 9){
            switch(intArabic){
                case 11:
                    wordNum+= " Eleven ";
                    break;
                case 12:
                    wordNum+= " Twelve ";
                    break;
                case 13:
                    wordNum+= " Thirteen ";
                    break;
                case 14:
                    wordNum+= " Fourteen ";
                    break;
                case 15:
                    wordNum+= " Fifteen ";
                    break;
                case 16:
                    wordNum+= " Sixteen ";
                    break;
                case 17:
                    wordNum+= " Seventeen ";
                    break;
                case 18:
                    wordNum+= " Eighteen ";
                    break;
                case 19:
                    wordNum+= " Nineteen ";
                    break;
            }
        }
        
        if(intArabic%10 != 0){
            wordNum+=numToWord(intArabic%10);
        }
        
        System.out.println(wordNum);
    }
    
    public static String numToWord(int num){
        switch(num){
            case 1:
                return "One";
            case 2:
                return "Two";
            case 3:
                return "Three";
            case 4:
                return "Four";
            case 5:
                return "Five";
            case 6:
                return "Six";
            case 7:
                return "Seven";
            case 8:
                return "Eight";
            case 9:
                return "Nine";
        }
        
        return null;
    }
}