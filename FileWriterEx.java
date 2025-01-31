import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {
    public static void main(String args[]){
        String data="This is the data in the output file hello this is";
        try{
            FileWriter output=new FileWriter("newFile2.txt");
            output.write(data);
            System.out.println("data is written to the file");
            output.close();
        }
        catch(IOException e){
            e.getStackTrace();
        }
    }
}
