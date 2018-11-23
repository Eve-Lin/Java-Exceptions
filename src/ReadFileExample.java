import java.io.*;

public class ReadFileExample {

    public static void readFile(String fileName){

        try{
            //Excptions could be thrown below

            FileInputStream fis = new FileInputStream(fileName);
            BufferedReader in = new BufferedReader(new InputStreamReader(fis));
            String tmp = null;
            while((tmp = in.readLine()) !=null) {
                System.out.println(tmp);
            }
            in.close();
            fis.close();
        } catch ( FileNotFoundException e){
            //Exception handler for FileNotFoundException
            //We just inform the client that there is no such file
            System.out.println("The file \"" + fileName + "\" does not exist! Unable to read it.");
        } catch (IOException e){
            e.printStackTrace(); //if an error occurs during the reading of the file, we'll gwt the full stack trace
        }
    }

    public static void main(String[] args) {
        readFile("/home/evelin/Downloads/10. Regular-Expressions-Regex-Lab.docx");
    }
}
