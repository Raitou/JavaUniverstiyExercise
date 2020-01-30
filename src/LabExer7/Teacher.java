/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LabExer7;

/**
 *
 * @author Raitou
 */
public class Teacher extends Person {
    double m_dSalary;

    public Teacher(String name, String gender, int age, double salary) {
        super(name, gender, age);
        this.m_dSalary = salary;
    }
    
    public void printInfo(){
        System.out.println("Name: " + super.m_strName);
        System.out.println("Gender: " + super.m_strGender);
        System.out.println("Age: " + super.m_iAge);
        System.out.println("Grade: " + this.m_dSalary);
    }
}
