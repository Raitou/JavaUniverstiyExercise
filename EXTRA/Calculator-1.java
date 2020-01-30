
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 
 */


public class Calculator extends JFrame{
    private static final JPanel PANEL_1 = new JPanel();
    private static final JTextField PANEL_1_FIELD = new JTextField("",9);
    private static final JButton PANEL_1_BUTTON_CLR = new JButton("CLEAR");
    
    private static final JPanel PANEL_2 = new JPanel();
    private static final JButton[] PANEL_2_BUTTONS = new JButton[16];
   
    public Calculator(){
        super("My Calculator");
        setLayout(new FlowLayout());
        
        PANEL_1.setLayout(new FlowLayout());
        PANEL_1.add(PANEL_1_FIELD);
        PANEL_1.add(PANEL_1_BUTTON_CLR);
        PANEL_2.setLayout(new GridLayout(4,4));
        
        for(int i=0;i<PANEL_2_BUTTONS.length;i++){
            PANEL_2_BUTTONS[i] = new JButton();
            PANEL_2.add(PANEL_2_BUTTONS[i]);
        }
        
        PANEL_2_BUTTONS[0].setText("7");
        PANEL_2_BUTTONS[1].setText("8");
        PANEL_2_BUTTONS[2].setText("9");
        PANEL_2_BUTTONS[3].setText("+");
        PANEL_2_BUTTONS[4].setText("4");
        PANEL_2_BUTTONS[5].setText("5");
        PANEL_2_BUTTONS[6].setText("6");
        PANEL_2_BUTTONS[7].setText("-");
        PANEL_2_BUTTONS[8].setText("1");
        PANEL_2_BUTTONS[9].setText("2");
        PANEL_2_BUTTONS[10].setText("3");
        PANEL_2_BUTTONS[11].setText("*");
        PANEL_2_BUTTONS[12].setText("0");
        PANEL_2_BUTTONS[13].setText(".");
        PANEL_2_BUTTONS[14].setText("=");
        PANEL_2_BUTTONS[15].setText("/");
        
        add(PANEL_1);
        add(PANEL_2);
        
    }
    
    public static void main(String args[]){
        Calculator x = new Calculator();
        x.setVisible(true);
        x.setSize(180,200);
        x.setDefaultCloseOperation(x.EXIT_ON_CLOSE);
        
    }
}
