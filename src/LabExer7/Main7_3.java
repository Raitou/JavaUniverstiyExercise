/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LabExer7;

/**
 *
 * @author raito
 */
public class Main7_3 {
    public static void main(String...args){
        Arithmetic operator = new Arithmetic();
        System.out.println(operator.add(1, 3));
        System.out.println(operator.add(1, 3, 4, 5));
        System.out.println(operator.multiply(2, 3, 4));
        System.out.println(operator.multiply(1, 1));
        System.out.println(operator.substract(3, 1));
        System.out.println(operator.divide(5, 2));
    }
}
