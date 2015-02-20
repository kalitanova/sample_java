import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

/**
 * Created by user1 on 20.02.15.
 */

public class Lab2 {
    public static void main(String[] args) {
        System.out.println("Study Java");
        try {
            PrintStream print = new PrintStream(new
                    FileOutputStream("kz/FileTest.java"));
            System.setOut(print);
            System.out.println("Study well");
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
