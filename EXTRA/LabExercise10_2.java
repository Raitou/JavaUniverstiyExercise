
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class LabExercise10_2 {
    public static void main(String args[]) throws IOException, ClassNotFoundException {
        Scanner input = new Scanner(System.in);
        Integer number = null;
        IntegerStream stream = new IntegerStream();

        try {
            System.out.print("Please determine the integer that you want to insert: ");
            number = input.nextInt();
            stream.writeObject(number);
            System.out.println(stream.readObject());
        }
        catch(IOException | InputMismatchException | ClassNotFoundException e){
            System.out.println(e.getMessage());
        }

    }

}
