
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


public class RomanToArabic {
    public static void main(String args[]){
        Scanner cin = new Scanner(System.in);
        String strRoman;
        int intNumber = 0;
        System.out.println("Arabic Numbers to Roman Numeral Converter");
        System.out.print("Enter the Roman numeral: ");
        
        
        try{
            strRoman = cin.nextLine();
            for(int i=0; i< strRoman.length(); i++){
                if(strRoman.charAt(i) == 'M'){
                    intNumber += 1000;
                    continue;
                }
                
                if(strRoman.charAt(i) == 'C'){
                    if(i != strRoman.length()-1)
                        switch(strRoman.charAt(i+1)){
                            case 'M':
                                intNumber += 900;
                                i++;
                                continue;
                            case 'D':
                                intNumber += 400;
                                i++;
                                continue;
                        }
                    intNumber += 100;
                    continue;
                }
                
                if(strRoman.charAt(i) == 'D'){
                    intNumber += 500;
                    continue;
                }
                
                if(strRoman.charAt(i) == 'X'){
                    if(i != strRoman.length()-1)
                        switch(strRoman.charAt(i+1)){
                            case 'C':
                                intNumber += 90;
                                i++;
                                continue;
                            case 'L':
                                intNumber += 40;
                                i++;
                                continue;
                        }
                    intNumber += 10;
                    continue;
                }
                
                if(strRoman.charAt(i) == 'L'){
                    intNumber += 50;
                    continue;
                }

                if(strRoman.charAt(i) == 'I'){
                    if(i != strRoman.length()-1)
                        switch(strRoman.charAt(i+1)){
                            case 'X':
                                intNumber += 9;
                                i++;
                                continue;
                            case 'V':
                                intNumber += 4;
                                i++;
                                continue;
                        }
                    intNumber += 1;
                    continue;
                }                    

                if(strRoman.charAt(i) == 'V'){
                    intNumber += 5;
                }
                
            }
            
            assert intNumber > 0 && intNumber < 4000 : "Out of Range";
        }
        catch(AssertionError e){
            System.out.println("Input must be I-MMMCMXCIX");
            return;
        }
        catch(InputMismatchException e){
            System.out.println("Input must a valid roman numeral");
            return;
        }

        
        System.out.println(intNumber);
        
        
    }
}
