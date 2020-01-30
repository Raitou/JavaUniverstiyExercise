/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sandbox;

/**
 *
 * @author 
 */
public class test {
    public static void main(String...args){
        int twoDArray[][] = new int[2][2];
        twoDArray[0][0] = 0;
        twoDArray[0][1] = 1;
        twoDArray[1][0] = 2;
        twoDArray[1][1] = 3;
        
        for(int i = 0; 2 > i; i++){
            for(int j = 0; 2 > j; j++){
                System.out.println(twoDArray[i][j]);
            }            
        }
        
        
    }
}
