
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 
 */


public class FindArray {
    public static void main(String args[]){
        
        System.out.println("INDEX OOB EXCEPTION");
        
        Object arr[] = new Object[4];
        arr[0] = 123;     //int element
        arr[1] = 123.45d;   // double element
        arr[2] = "ABCDefg";       // string element
        arr[3] = 'Z';         // char element
        try{
            findArray(arr, 5);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("\n\nCannot access an index that is out of bounds");
        }
        catch(NullPointerException e){
            System.out.println("\n\nCannot access an index that is null");
        }
        catch(RuntimeException e){
            System.out.println("\n\nThere is a runtime exception");
        }
        
        System.out.println("\nNULL POINTER EXCEPTION");
        arr = new Object[5];
        arr[0] = 123;     //int element
        arr[1] = 123.45d;   // double element
        arr[2] = null;       // null element
        arr[3] = 'Z';         // char element
        
        try{
            findArray(arr, 5);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("\n\nCannot access an index that is out of bounds");
        }
        catch(NullPointerException e){
            System.out.println("\n\nCannot access an index that is null");
        }
        catch(RuntimeException e){
            System.out.println("\n\nThere is a runtime exception");
        }
        
        System.out.println("\nOTHER RUNTIME EXCEPTION");
        arr = new Object[5];
        arr[0] = 123;     //int element
        arr[1] = 123.45d;   // double element
        arr[2] = "String";       // string element
        arr[3] = 'Z';         // char element
        arr[4] = new Date();
        
        try{
            findArray(arr, 5);
            throw new RuntimeException();
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("\n\nCannot access an index that is out of bounds");
        }
        catch(NullPointerException e){
            System.out.println("\n\nCannot access an index that is null");
        }
        catch(RuntimeException e){
            System.out.println("\n\nThere is a runtime exception");
        }        
    }
    
    public static void findArray(Object array[], int indexes) throws ArrayIndexOutOfBoundsException, NullPointerException, RuntimeException{
        for(int i=0;i<indexes;i++){
            System.out.print("Index "+i +":\t");
            System.out.println(array[i].toString());
        }
    }
}
