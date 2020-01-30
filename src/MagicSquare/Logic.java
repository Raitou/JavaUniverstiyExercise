/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MagicSquare;

import javax.swing.JFrame;

/**
 *
 * @author 
 */
public class Logic extends JFrame {
    public Logic(int x, int y){
        magicSquare = new int[x][y];
        this.x = x;
        this.y = y;
        magicSquareVal = x*(x*x+1)/2;
    }
    
    private static int magicSquareVal;
    protected static int x;
    protected static int y;
    
    private final int magicSquare[][];
    
    protected void setValues(int indexX, int indexY, int value){
        magicSquare[indexX][indexY] = value;
    }
    
    protected void printVal(){
        for(int i = 0; x > i; i++){
            for(int j = 0; y > j; j++){
                System.out.println(magicSquare[i][j]);
            }
        }
    }
    
    private boolean checkColumn(){
        int sum = 0;
        for(int i = 0; x > i; i++){
            sum = 0;
            for(int j = 0; y > j; j++){
                sum+=magicSquare[j][i];
            }
            if(!(sum==magicSquareVal)){
                return false;
            }
        }
        
        return true;
    }
    
    private boolean checkRows(){
        int sum = 0;
        for(int i = 0;x > i; i++){
            sum = 0;
            for(int j = 0; y > j; j++){
                sum+=magicSquare[i][j];
            }
            if(!(sum==magicSquareVal)){
                return false;
            }
        }
        
        return true;
    }
    
    private boolean checkDiagonal(){
        int sum = 0;
        for(int i = 0; y > i; i++){
            sum+=magicSquare[i][i];
        }
        if(!(sum==magicSquareVal)){
            return false;
        }
        return true;
    }
    
    protected int getMagicSqaureVal(){
        return magicSquareVal;
    }
    
    protected boolean isMagicSquare(){
        if(!checkDiagonal()){
            return false;
        }
        if(!checkRows()){
            return false;
        }
        
        return checkColumn();
    }
    
    
}
