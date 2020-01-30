/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MagicSquare;

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
public class UserInterface extends Logic implements ActionListener {    
    public UserInterface(int x, int y, int width, int height){
        super(x, y);
        Dimension d = new Dimension(width, height);
        this.setNumFields(x, y);
        this.initiateFields();
        super.setVisible(true);
        super.setMinimumSize(d);
    }
    
    public UserInterface(){
        this(3, 3, 100, 100);
    }
    
    private final List<JTextField> textFields = new ArrayList<>();
    private final JButton buttonCheck = new JButton("Check!");
    private final JLabel labelMessage = new JLabel("<html><center> Nothing to calculate yet... </center></html>");
    
    private void setNumFields(int x, int y){
        setLayout(new GridLayout(x+1, y+1, 2, 2));
        for(int i = x; 0 < i; i--){
            for(int j = y; 0 < j; j--){
                JTextField jTextField = new JTextField();
                textFields.add(jTextField);
            }
        }
    }
    
    private void initiateFields(){    
        textFields.forEach((i) -> {
            add(i);
            i.addActionListener(this);
        });
        
        add(buttonCheck);
        buttonCheck.addActionListener(this);
        add(labelMessage);
        super.pack();
    }
    
    private boolean isInteger(JTextField obj){
        try{
            Integer.parseInt(obj.getText());
        }catch(NumberFormatException | NullPointerException e){
            System.out.println(e);
            return false;
        }
        return true;
    }
    
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
                labelMessage.setText("<html><center> Invalid Input! or a/the Textfield/s is/are empty! </center></html>");
                return false;
            } else {
                if(this.isInteger(i)){
                    super.setValues(indexX, indexY, Integer.parseInt(i.getText()));
                    if(Logic.y-1 > indexY){
                        indexY++;
                        continue;
                    } else{
                        indexY = 0;
                    }
                    if(Logic.x > indexX){
                        indexX++;
                    }
                }else{
                    labelMessage.setText("<html><center> Invalid Input! or a/the Textfield/s is/are empty! </center></html>");
                    return false;
                }
            }
        }
        System.out.println(super.getMagicSqaureVal());
        return true;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == buttonCheck){
            if(!this.insertValuesToLogicClass()){
                return;
            }
            this.disableTextFields();
            if(isMagicSquare()){
                labelMessage.setText("<html><center> Magic Square! </center></html>");
            } else {
                labelMessage.setText("<html><center> Not a Magic Square! </center></html>");
            }
            this.enableTextFields();
        }
    }
    
    
    
}
