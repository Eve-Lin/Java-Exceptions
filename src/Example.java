import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Example {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = null;


        try{
            fis = new FileInputStream("myfile.txt");
        }catch(FileNotFoundException fnfe){
            System.out.println("File is not present at the moment");

        }
        int k;
        try{
            while(( k = fis.read() ) != -1)
            {
                System.out.print((char)k);
            }
            fis.close();
        }catch(IOException ioe){
            System.out.println("I/O error occurred: "+ioe);
        }


    }
}
