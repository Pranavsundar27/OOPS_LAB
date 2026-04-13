import java.io.*;

public class FileHandling {
    public static void main(String[] args) {
        try {
            // Writing to file
            FileWriter fw = new FileWriter("test.txt");
            fw.write("Hello Java File Handling");
            fw.close();

            // Reading from file
            FileReader fr = new FileReader("test.txt");
            int ch;

            while((ch = fr.read()) != -1) {
                System.out.print((char) ch);
            }
            fr.close();

        } catch(IOException e) {
            System.out.println("Error: " + e);
        }
    }
}