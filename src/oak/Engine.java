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
public interface Engine {
    //int engineType;
    int engineModel = 1;
    public final static int FUEL_TYPE = 10;
    
    //void turbo();
    public abstract void filter();
    //void nitro();
}
