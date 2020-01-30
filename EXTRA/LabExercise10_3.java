
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class LabExercise10_3 {
    public static void main(String args[]) throws IOException {
        Scanner input = new Scanner(System.in);

        String sourcePath = new String();
        String resultPath = new String();

        int shiftSize = 0;

        System.out.print("Please indicate the file name of the source: ");
        sourcePath = input.nextLine() + ".txt";

        System.out.print("Please indicate the file name of the destination: ");
        resultPath = input.nextLine() + ".txt";

        System.out.print("Please indicate preferred shift size: ");
        shiftSize = input.nextInt();

        readWrite(sourcePath, resultPath, shiftSize);
    }

    public static void readWrite(String sourceFile, String resultFile, int shiftSize) throws IOException {
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
                    sourceChar += shiftSize;
                    resultString += (sourceChar);
            }
            fw.write(resultString);
            System.out.println("\nMessage read from the file(" + sourceFile +"): " + sourceString);
            System.out.println("Message encrypted to the file(" + resultFile +"): " + resultString);
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

