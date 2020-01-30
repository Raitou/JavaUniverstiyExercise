/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 
 */
public class FirstValueIsZeroException extends Exception{
    @Override
    public String getLocalizedMessage(){
        return this.getMessage();
    }
    @Override
    public String getMessage(){
        return "The first value can't be zero!";
    }
}
