/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LabExer6;

/**
 *
 * @author 
 */
public class Room {
    private int m_iRoomNo;
    private String m_strRoomType;
    private double m_dRoomArea;
    private boolean m_bACMachine;
    
    public void setData(int roomNo, String roomType, double roomArea, boolean acMachine){
        this.m_iRoomNo = roomNo;
        this.m_strRoomType = roomType;
        this.m_dRoomArea = roomArea;
        this.m_bACMachine = acMachine;
    }
    
    public void displayData(){
        System.out.println("Room No. " + this.m_iRoomNo);
        System.out.println("Type: " + this.m_strRoomType);
        System.out.printf("Room Area: %.2f\n", this.m_dRoomArea);
        System.out.println("AC Machine: " + this.m_bACMachine);
    }
    
}
