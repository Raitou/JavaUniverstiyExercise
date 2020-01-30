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
public class AddressBookEntry {
    private String m_strName;
    private String m_strAddress;
    private int m_iPhoneNo;
    private String m_strEmail;
    
    public AddressBookEntry(String strName, String strAddress, int iPhoneNo, String strEmail){
        this.m_strName = strName;
        this.m_strAddress = strAddress;
        this.m_iPhoneNo = iPhoneNo;
        this.m_strEmail = strEmail;
    }
    
    public AddressBookEntry(){
        //nothing to do here :3
    }
    
    public void setEntry(String strName, String strAddress, int iPhoneNo, String strEmail){
        this.m_strName = strName;
        this.m_strAddress = strAddress;
        this.m_iPhoneNo = iPhoneNo;
        this.m_strEmail = strEmail;
    }
    
    public String retData(int type){
        switch(type){
            case 0: return this.m_strName;
            case 1: return this.m_strAddress;
            case 2: return Integer.toString(this.m_iPhoneNo);
            case 3: return this.m_strEmail;
        }
        return "";
    }
}
