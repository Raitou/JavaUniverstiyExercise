
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 
 */
public class Calculator extends JFrame implements ActionListener{
    
    JLabel label1;
    JLabel label2;
    JLabel label3;
    
    JTextField text1;
    JTextField text2;
    JTextField text3;
    
    JButton buttonAdd;
    JButton buttonSub;
    JButton buttonMul;
    JButton buttonDiv;
    JButton buttonClear;
    JButton buttonExit;
    
    public Calculator(){
        super("My first GUI Java Program");
        
        setLayout(new GridLayout(6,2));
        
        label1 = new JLabel("First Value: ");
        label2 = new JLabel("Second Value: ");
        label3 = new JLabel("Result Value: ");
        
        text1 = new JTextField();
        text2 = new JTextField();
        text3 = new JTextField();
        
        buttonAdd = new JButton(" + ");
        buttonSub = new JButton(" - ");
        buttonMul = new JButton(" * ");
        buttonDiv = new JButton(" / ");
        buttonClear = new JButton("Clear");
        buttonExit = new JButton("Exit");
        
        add(label1); add(text1);
        add(label2); add(text2);
        add(label3); add(text3);
        add(buttonAdd); add(buttonSub);
        add(buttonMul); add(buttonDiv);
        add(buttonClear); add(buttonExit);
        
        buttonAdd.addActionListener(this);
        buttonSub.addActionListener(this);
        buttonMul.addActionListener(this);
        buttonDiv.addActionListener(this);
        buttonClear.addActionListener(this);
        buttonExit.addActionListener(this);
        
        text3.setEditable(false);
    }
    
    private void clearItems(){
        text1.setText("");
        text2.setText("");
        text3.setText(""); 
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == buttonExit){
            int response = JOptionPane.showConfirmDialog(
                    rootPane, 
                    "Do you want to exit the program? ", 
                    "Just asking", 
                    JOptionPane.OK_CANCEL_OPTION, 
                    JOptionPane.QUESTION_MESSAGE
                );
            System.out.println(response);
            if(response == JOptionPane.OK_OPTION){
               this.dispose();
            }
            
        } else {
            if(e.getSource() == buttonClear){
                clearItems();
                return;
           }
            
            int value1 = 0;
            int value2 = 0;
            try{
                value1 = Integer.parseInt(text1.getText());
                if(value1 == 0){
                    throw new FirstValueIsZeroException();
                }
                value2 = Integer.parseInt(text2.getText());
                
            }
            catch(FirstValueIsZeroException | NumberFormatException ex){
                JOptionPane.showMessageDialog(rootPane, ex.getLocalizedMessage(), ex.getClass().toString(), 0);
                clearItems();
                return;
            }
           
           int result = 0;
           if(e.getSource() == buttonAdd){
                result = value1 + value2;
                text3.setText(""+result);
           }else if(e.getSource() == buttonSub){
                result = value1 - value2;
                text3.setText(""+result);  
           }else if(e.getSource() == buttonMul){
                result = value1 * value2;
                text3.setText(""+result);
           }else if(e.getSource() == buttonDiv){
               try{
                result = value1 / value2;
               } catch (ArithmeticException ex){
                   JOptionPane.showMessageDialog(rootPane, ex.getLocalizedMessage(), ex.getClass().toString(), 0);
                   clearItems();
                   return;
               }
               text3.setText(""+result);
           } 
           
           
        }
    }
}
