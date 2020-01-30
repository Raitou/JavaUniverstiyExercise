/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oak;

/**
 *
 * @author 
 */
public class SportsCar extends Vehicle implements Engine, SoundsSystem{
    public static void main(String...args){
        SportsCar bmw = new SportsCar();
        bmw.start();
    }
    
    public void filter(){
        
    }
    
    @Override
    public void setSound(int sound){
        
    }
    
    @Override
    public void start(){
        System.out.println("Start()");
    }
    
    public void start(int key){
        System.out.println("Start(int key)");
    }
    
    protected int start(String key){
        System.out.println("Start(string key)");
        return 0;
    }
    
    public void run(){
    }
}
