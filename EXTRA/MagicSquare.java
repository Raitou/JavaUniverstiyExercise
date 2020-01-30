/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MagicSquareMP4;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.*;

/**
 *
 * @author 
 */

//Class MagicSquare inherits from Interface ActionListener and Class JFrame - inheritance
public class MagicSquare extends JFrame implements ActionListener {   
    
    //Constructor - set your members/attributes 
    public MagicSquare(int x, int y, int width, int height){
        magicSquare = new int[x][y];
        this.x = x;
        this.y = y;
        magicSquareVal = x*(x*x+1)/2;
        Dimension d = new Dimension(width, height);
        this.setNumFields(x, y);
        this.initiateFields();
        super.setVisible(true);
        super.setMinimumSize(d);
    }
    
    //Constructor Overloading 
    public MagicSquare(){
        this(3, 3, 100, 100);
    }
    
    //Encapsulation
    private final List<JTextField> textFields = new ArrayList<>();
    private final JButton buttonCheck = new JButton("CHECK");
    private final JButton buttonClear = new JButton("CLEAR");
    private final JButton buttonExit = new JButton("EXIT");
	
    //private final JLabel labelMessage = new JLabel("<html><center> Nothing to calculate yet... </center></html>");
    
    //Private Methods
    private void setNumFields(int x, int y){
        setLayout(new GridLayout(x+1, y+1, 2, 2));
        for(int i = x; 0 < i; i--){
            for(int j = y; 0 < j; j--){
                JTextField jTextField = new JTextField();
                textFields.add(jTextField);
            }
        }
    }
	
    private void MessageBox(String message, String titleBar, int messageType){
        JOptionPane.showMessageDialog(null, message, titleBar, messageType);
    }

    private void initiateFields(){    
        textFields.forEach((i) -> {
            add(i);
            i.addActionListener(this);
        });
        
        add(buttonCheck);
        add(buttonClear);
        add(buttonExit);
        buttonCheck.addActionListener(this);
        buttonClear.addActionListener(this);
        buttonExit.addActionListener(this);
        //add(labelMessage);
        super.pack();
    }
    
    private boolean isInteger(JTextField obj){
        try{
            Integer.parseInt(obj.getText());
        }catch(NumberFormatException | NullPointerException e){
            MessageBox(e.toString(), "Error Exception!", JOptionPane.ERROR_MESSAGE);
            //System.out.println(e);
            return false;
        }
        return true;
    }
    
    //Supposedly to be another setter/mutator other than constructor
    public void setNumFields(int x){
        //Nothing to do here yet :/
    }
    
    private void disableTextFields(){
        textFields.forEach((i) -> {
            i.setEditable(false);
        });
    }
    
    private void enableTextFields(){
        textFields.forEach((i) -> {
            i.setEditable(true);
        });
    }
	
    private boolean insertValuesToLogicClass(){
        int indexX = 0;
        int indexY = 0;
        for (JTextField i : textFields) {
            if(i.getText().isEmpty()){
                MessageBox("A/The textfield/s is/are empty!", "Error!", JOptionPane.ERROR_MESSAGE);
                //labelMessage.setText("<html><center> Invalid Input! or a/the Textfield/s is/are empty! </center></html>");
                return false;
            } else {
                if(this.isInteger(i)){
                    setValues(indexX, indexY, Integer.parseInt(i.getText()));
                    if(y-1 > indexY){
                        indexY++;
                        continue;
                    } else{
                        indexY = 0;
                    }
                    if(x > indexX){
                        indexX++;
                    }
                }else{
                    //labelMessage.setText("<html><center> Invalid Input! or a/the Textfield/s is/are empty! </center></html>");
                    return false;
                }
            }
        }
        //System.out.println(getMagicSqaureVal());
        return true;
    }

    //Polymorphism Overriding
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == buttonCheck){
            if(!this.insertValuesToLogicClass()){
                return;
            }
            this.disableTextFields();
            if(isDuplicate()){
                MessageBox("Duplicate Values Found!", "Error!", JOptionPane.ERROR_MESSAGE);
            } else if(is1To9()){
                if(isMagicSquare()){
                    MessageBox("Magic Square!", "Congrats!", JOptionPane.INFORMATION_MESSAGE);
                    //labelMessage.setText("<html><center> Magic Square! </center></html>");
                } else {
                    MessageBox("Not a Magic Square!", "Error!", JOptionPane.WARNING_MESSAGE);
                    //labelMessage.setText("<html><center> Not a Magic Square! </center></html>");
                }
                
            } else {
                MessageBox("Range is only from 1-9!", "Warning!", JOptionPane.WARNING_MESSAGE);
            }
            this.enableTextFields();
        }
        if(e.getSource() == buttonClear){
            textFields.forEach((i) -> {
                i.setText("");
            });
            return;
        }
        if(e.getSource() == buttonExit){
            int response = JOptionPane.showConfirmDialog(
                    rootPane, 
                    "Do you want to exit the Magic Square Program? ", 
                    "???", 
                    JOptionPane.OK_CANCEL_OPTION, 
                    JOptionPane.QUESTION_MESSAGE
                );
            //System.out.println(response);
            if(response == JOptionPane.OK_OPTION){
               this.dispose();
            }
        }
    }
    
	
	
    //Logic.java
    private static int magicSquareVal;
    private static int x;
    private static int y;
    
    private final int magicSquare[][];
    
    
    //For dynamic purposes
    private void setValues(int indexX, int indexY, int value){
        magicSquare[indexX][indexY] = value;
    }
    
    
    //Checkerrr!!
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
    
    private int getMagicSqaureVal(){
        return magicSquareVal;
    }
    
    private boolean isMagicSquare(){
        if(!checkDiagonal()){
            return false;
        }
        if(!checkRows()){
            return false;
        }
        
        return checkColumn();
    }
    
    private boolean isDuplicate(){
        for(int i = 0; x > i; i++){
                for(int j = 0; y > j; j++){
                        for(int ii = 0; x > ii; ii++){
                                for(int ij = j+1; y > ij; ij++){
                                        if(magicSquare[i][j]==magicSquare[ii][ij]){
                                            //System.out.println(magicSquare[i][j] + " " + magicSquare[ii][ij]);
                                            return true;
                                        }
                                }
                        }	
                }

        }
        return false;
    }
    
    
    private boolean is1To9(){
        int i = 0;
        int j = 0;
        for(; x > i; i++){
            for(j = 0; y > j; j++){
                if((magicSquare[i][j] < 1) || (magicSquare[i][j] > 9)){
                    return false;
                }
            }
        }
        return true;
    }
}

