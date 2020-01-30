/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LabExer7;

/**
 *
 * @author raito
 */
public class Time implements Comparison {
    
    private long m_lTime;
    
    public Time(int hour, int minutes, int seconds){
        this.m_lTime = seconds;
        this.m_lTime += (minutes*60);
        this.m_lTime += (hour*3600);
    }
    
    public Time(int minutes, int seconds){
        this.m_lTime = seconds;
        this.m_lTime += (minutes*60);
    }
    
    public Time(int seconds){
        this.m_lTime = seconds;
    }
    
    @Override
    public boolean isLess(Time obj) {
        return this.m_lTime > obj.m_lTime;
    }

    @Override
    public boolean isEqual(Time obj) {
        return this.m_lTime == obj.m_lTime;
    }

    @Override
    public boolean isGreater(Time obj) {
        return this.m_lTime < obj.m_lTime;
    }

}
