/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LabExer7;

import java.util.*;

/**
 *
 * @author Raitou
 */

public class Main7_2 {
    public static void main(String...args){
        String name;
        String gender;
        int age;
        
        //Teacher
        double salary;
        
        //Student
        double grade;
        
        List<Student> studentArr = new ArrayList<>();
        //List<Teacher> teacherArr = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        
        System.out.println("---Input 2 Students---");
        for(int i = 1; 2 >= i; i++){            
            System.out.print("Student " + i + ": ");
            name = input.next();
            System.out.print("Gender: ");
            gender = input.next();
            System.out.print("Age: ");
            age = input.nextInt();
            System.out.print("Grade: ");
            grade = input.nextDouble();
            Student student = new Student(name, gender, age, grade);
            studentArr.add(student);
        }
        
        System.out.println("---Input 1 Teacher---");
        System.out.println("Teacher: ");
        name = input.next();
        System.out.println("Gender: ");
        gender = input.next();
        System.out.println("Age: ");
        age = input.nextInt();
        System.out.println("Salary: ");
        salary = input.nextDouble();
        Teacher teacher = new Teacher(name, gender, age, salary);
        input.close();
        
        System.out.println("--Printing Student Info--");
        int counter = 1;
        for(Student i: studentArr){
            System.out.println("Student No." + counter);
            i.printInfo();
            counter++;
        }
        //counter = 0;
        
        System.out.println("--Printing Teacher Info--");
        teacher.printInfo();
        
    }
}
