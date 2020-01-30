/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 
 */

import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String args[]){
        System.out.println("Enter Philippine peso: ");
        Scanner cin = new Scanner(System.in);
        double phDbl = cin.nextDouble();
        String usDollarStr = "US Dollar";
        String euStr = "Euro";
        String yuStr = "Yuan";
        String koStr = "Koruna";
        String krStr = "Krone";
        String shStr = "Shequel";
        String dnStr = "Dinar";
        
        double usDbl = 43.33089;
        double euDbl = usDbl/0.734719;
        double yuDbl = usDbl/6.346934;
        double koDbl = usDbl/18.77263;
        double krDbl = usDbl/5.449007;
        double shDbl = usDbl/3.726334;
        double dnDbl = usDbl/0.274588;
        
        System.out.println("\nThe Amount's Equivalent to:");
        System.out.printf(usDollarStr + " : " + "%.2f\n", phDbl/usDbl);
        System.out.printf(euStr + " : " + "%.2f\n", phDbl/euDbl);
        System.out.printf(yuStr + " : " + "%.2f\n", phDbl/yuDbl);
        System.out.printf(koStr + " : " + "%.2f\n", phDbl/koDbl);
        System.out.printf(krStr + " : " + "%.2f\n", phDbl/krDbl);
        System.out.printf(shStr + " : " + "%.2f\n", phDbl/shDbl);
        System.out.printf(dnStr + " : " + "%.2f\n", phDbl/dnDbl);
        System.out.println(1<<2);
        
        System.out.println("Suppose, 1 US Dollar is equivalent to Php. " + usDbl + "," + euDbl + " Euro," + yuDbl + " Yuan," + koDbl +" Koruna, "+ krDbl+ " Krone, " + shDbl + " Sheqel,  and " +dnDbl+ " Dinar. ");
    }
}
