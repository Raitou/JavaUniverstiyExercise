/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MagicSquareMP4;

import javax.swing.*;

/**
 *
 * @author 
 */

//Trash o/ it is here for its purpose for only initiating my UserInterface Class
public class Test {
    public static void main(String...args){
        MagicSquare ui = new MagicSquare(3, 3, 200, 200);
        ui.setTitle("Magic Square");
        ui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
