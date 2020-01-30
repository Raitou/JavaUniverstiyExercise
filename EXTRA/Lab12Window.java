
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
public class Lab12Window extends JFrame{
    private static JLabel labelBanner = new JLabel("  ", JLabel.CENTER);
    
    public Lab12Window(){
        super.setTitle("Banner");
        super.setSize(300, 150);
        super.add(labelBanner);
        super.setVisible(true);
        super.setLocationRelativeTo(null);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Thread tr = new Thread(new Runnable(
        ) {
            @Override
            public void run() {
                while(true){
                    rotate();
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException ex) {
                        System.out.println(ex.getLocalizedMessage());
                    }
                }
                
            }
        });
        
        tr.start();
    }
    
    public void rotate(){
        String sr = labelBanner.getText();
        sr = sr.substring(1, sr.length()) + sr.substring(0, 1);
        //System.out.println(sr);
        labelBanner.setText(sr);
    }
}
