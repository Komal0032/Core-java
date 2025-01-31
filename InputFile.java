
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class InputFile {
    public static void main(String[] args) {
        //creates an array of character
        char[] array = new char[100];
        try {
            //creates a reader using the FileReader
            FileReader input = new FileReader("newFile2.txt");
            //reads characters from the file
            input.read(array);
            System.out.println("Data in the file: ");
            System.out.println(array);
            input.close();
        } 
        catch (FileNotFoundException e) {
            e.printStackTrace();
        } 
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}