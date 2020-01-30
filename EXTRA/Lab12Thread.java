

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 
 */
public class Lab12Thread extends Thread{
    public Lab12Thread(){
        System.out.println("This is a message 2");
    }
    
    @Override
    public void finalize(){
        System.out.println("Shut Down Message");
    
    }
    
    @Override
    public void run(){
        System.out.println("This is a message");
        try {
            Thread.sleep(100);
        } catch (InterruptedException ex) {
            System.out.println(ex.getLocalizedMessage());
        }
    }
}
