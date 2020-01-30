/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 
 */
public class Lab12GC extends Thread {
    @Override
    public void run(){
        System.gc();
        System.runFinalization();
    }
}
