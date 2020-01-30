
import java.io.*;

public class IntegerStream {
    FileOutputStream ofstream;
    ObjectOutputStream oostream;

    FileInputStream fis;
    ObjectInputStream ois;

    IntegerStream(){
        ofstream = null;
        oostream = null;

        fis = null;
        ois = null;
    }
    public void writeObject(Integer number) throws IOException {
        ofstream = new FileOutputStream("IStream.db");
        oostream = new ObjectOutputStream(ofstream);
        oostream.writeObject(number);

        oostream.close();
        ofstream.close();
    }

    public Integer readObject() throws IOException, ClassNotFoundException {
        fis = new FileInputStream("IStream.db");
        ois = new ObjectInputStream(fis);
        Integer result = (Integer) ois.readObject();
        ois.close();
        fis.close();

        return  result;
    }
}
