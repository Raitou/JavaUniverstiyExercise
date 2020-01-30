/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 
 */
public class ArrayStudentInformation {
    public static void main(String...args){
        String studentArray[][] = {
            {"Peter", "75", "77"},
            {"Clark", "78", "80"},
            {"Logan", "82", "84"}
        };
        for(int i = 0; 3 > i; i++){
            double gradeAve = 0;
            for(int j = 0; 3 > j; j++){
                System.out.println(studentArray[i][j]);
                if(j > 0){
                  gradeAve+=Double.parseDouble(studentArray[i][j]);  
                }
            }
            System.out.println("Average: " + gradeAve/2);
        }
        
        
    }
    
}
