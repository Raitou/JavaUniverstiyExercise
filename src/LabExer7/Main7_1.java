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
public class Main7_1 {
    public static void main(String...args){
        Time firstTime = new Time(6, 30, 33);
        Time secondTime = new Time(12, 30, 33);
        System.out.println(firstTime.isEqual(firstTime)); //returns true
        System.out.println(secondTime.isGreater(firstTime)); //returns false
        System.out.println(firstTime.isLess(secondTime)); //returns false
    }
}
