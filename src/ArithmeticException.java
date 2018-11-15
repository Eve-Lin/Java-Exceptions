public class ArithmeticException {
    public static void main(String[] args) {
        int num1, num2;

        try{
            num1 = 0;
            num2 = 62/num1;
            System.out.println(num2);
            System.out.println("Hey, I m at the end of a try block");
        }catch(java.lang.ArithmeticException e){
            System.out.println("You should not divide a number by zero.");  // will execute only if there is an arithmetic exception
        }catch (Exception e){
            System.out.println("Exception occured"); //this is a generic exception handler
        }
        System.out.println("I am out of try-catch blocks in Java for this case");
    }
}
