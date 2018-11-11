public class TryCatch {
    public static void main(String[] args) {
        try {                                  //code you want to test
            int [] myNumbers = new int[5];
            System.out.println(myNumbers[10]);
        } catch (Exception e) {                        //code to be executed if an error occurs
            System.out.println("Something went wrong.");
        }finally {
            System.out.println("Finally Statement");        //code to be executed after the try...catch statement regardless of the result
        }
    }
}
