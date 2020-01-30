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

public class Sample {
    public static void main(String args[]){
        String name;
        int age;
        Scanner input = new Scanner(System.in);
        System.out.print("Name: ");
        name = input.nextLine();
        System.out.print("Age: ");
        age = input.nextInt();
        System.out.println("Hi " + name + ". Your age is " + age + ".");
    }
}
