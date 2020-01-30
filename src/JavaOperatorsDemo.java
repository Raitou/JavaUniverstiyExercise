/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 
 */
public class JavaOperatorsDemo {
    public static void main(String args[]){
        int grade = 100;
        System.out.println("Unary Operators");
        System.out.println(+grade);
        System.out.println(-grade);
        System.out.println(grade++);
        System.out.println(++grade);
        System.out.println(grade--);
        System.out.println(--grade);
        
        System.out.println("Binary Operators");
        System.out.println(10+2);
        System.out.println(10-2);
        System.out.println(10*2);
        System.out.println(10/2);
        System.out.println(10%2);
        
        System.out.println("Relational Operators");
        System.out.println(grade>70);
        System.out.println(grade<70);
        System.out.println(grade>=70);
        System.out.println(grade<=70);
        System.out.println(grade==70);
        System.out.println(grade!=70);
        
        System.out.println("Logical Operators");
        System.out.println(grade>=70 && grade<=100);
        System.out.println(grade<0 || grade>100);
        System.out.println(!(grade>=70 && grade<=100));
        
        System.out.println("Shift Operators");
        System.out.println(16<<5);
        System.out.println(64>>4);
        
        System.out.println("Bitwise Operators");
        System.out.println(10&4);
        System.out.println(10|4);
        System.out.println(10^6);
        System.out.println(~3);
        
        System.out.println("Assignment Operator");
        System.out.println(grade=70);
        
        System.out.println("Contatenator Operators");
        System.out.println("5"+5);
        System.out.println(+5);
        System.out.println(5+5);
        
        System.out.println("Ternary Operator");
        System.out.println(grade>=70?"Passed":"Failed");
    }
}
