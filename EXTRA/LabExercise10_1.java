
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class LabExercise10_1 {
    public static void main(String args[]) throws IOException {
        Scanner cin = new Scanner(System.in);
        String source = new String();
        String result = new String();
        System.out.print("Please indicate the file name of the source: ");
        source = cin.nextLine() + ".txt";
        System.out.print("Please indicate the file name of the destination: ");
        result = cin.nextLine() + ".txt";

        readWrite(source, result);
    }

    public static void readWrite(String sourceFile, String resultFile) throws IOException {
        String resultString = new String();
        FileWriter fw = null;
        try{
            if(Files.exists(Paths.get(sourceFile))) {
                fw = new FileWriter(resultFile);
            }
            else
                throw new IOException();

            String sourceString = new String(Files.readAllBytes(Paths.get(sourceFile))).trim();

            for(char sourceChar : sourceString.toCharArray()){
                if(sourceChar == ' ')
                    resultString += "_";
                else
                    resultString += sourceChar;
            }
            fw.write(resultString);
            System.out.println("\nMessage read from the File(" + sourceFile +"): " + sourceString);
            System.out.println("Message Written to the File(" + resultFile +"): " + resultString);
            System.out.println("Program will now close.");
        }
        catch(IOException e){

            System.out.println("\nERROR! Source file is not found.");
            System.out.println("Program will now close.");
        }
        finally{
            fw.close();
        }
    }

}

