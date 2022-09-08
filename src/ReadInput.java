import java.io.*;

public class ReadInput {

    public static void main(String[] args) {
        try {
            InputStream is= new FileInputStream("a.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        //File f= new File("hello.txt");
    }
}
