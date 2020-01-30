import java.util.Collections;
import java.util.Hashtable;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.Vector;

public class LabExer9 {
    public static void main(String args[]){
        Scanner cin = new Scanner(System.in);
        Vector vectorPets = new Vector(5);
        TreeSet treePets = new TreeSet();
        Hashtable<String, String> hashPets = new Hashtable<>(5);
        String selectedOperation = "";
        while(!selectedOperation.equals("D")){
            System.out.println("A. Vector");
            System.out.println("B. TreeSet");
            System.out.println("C. HashTable");
            System.out.println("D. Exit\n");
            System.out.print("Select desired operation: ");
            selectedOperation = cin.next();
            if(selectedOperation.equalsIgnoreCase("A")) {
                System.out.println("\nPlease enter five pet names(separated by space):");
                for(int i = 0; i < vectorPets.capacity(); i++)
                    vectorPets.add(cin.next());

                Collections.sort(vectorPets);
                System.out.println("\nThe Name of the vectorPets are:");
                System.out.println(vectorPets);
            }
            else if(selectedOperation.equalsIgnoreCase("B")) {
                System.out.println("\nPlease enter five pet names(separated by space):");
                for(int i = 0; i < 5; i++)
                    treePets.add(cin.next());

                System.out.println("\nThe Name of the vectorPets are:");
                System.out.println(treePets);
            }
            else if(selectedOperation.equalsIgnoreCase("C")){
                System.out.println("\nPlease input the following details of your pet:");
                for(int i = 0; i < 5; i++) {
                    System.out.print(petKeys(i) + ": ");
                    hashPets.put(petKeys(i), cin.next());
                }
                System.out.println("\n These are the inputted details of your pet:");
                System.out.println(hashPets);
            }
            else
                if(!selectedOperation.equalsIgnoreCase("D"))
                System.out.println("\nPlease input characters (A - D) only! Try again.\n");

            System.out.println("\n");
        }
    }

    static String petKeys(int i){
        if(i == 0)
            return "PetType";
        else if(i == 1)
            return "PetName";
        else if(i == 2)
            return "PetColor";
        else if (i == 3)
            return "PetAge";
        else
            return "PetSize";
    }
}