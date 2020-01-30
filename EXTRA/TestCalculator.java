
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 
 */
public class TestCalculator {
    public static void main(String...args){
        Calculator calc = new Calculator();
        calc.setVisible(true);
        calc.setSize(200, 300);
        calc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
