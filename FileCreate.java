import java.io.File;
import java.io.IOException;
public class FileCreate {
      public static void main(String args[]) throws IOException{
        File file=new File("newFile2.txt");
        try{
            boolean value =file.createNewFile();
            if(value){
                System.out.println("THe new file is created");
            }
            else{
                System.out.println("THe  file is alredy exist"); 
            }
        }
        catch(NullPointerException e){
         e.getStackTrace();
        }
      }
}
