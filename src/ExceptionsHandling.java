import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionsHandling {
    public static void main(String[] args) throws IOException
    {
      FileInputStream fis = null;
      try{
          fis = new FileInputStream("B:/myfile.txt");
      }catch(FileNotFoundException fnfe){
          System.out.println("The specified file is not present at the given moment");
      }
      int k;
     try{
         while((k = fis.read()) != -1){
             System.out.println((char) k);
         }
         fis.close();
     }catch(IOException ioe){
         System.out.println("I/O error occurred: "+ioe);
     }

    }
}
