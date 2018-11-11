public class ThrowKeyword {
    static void checkAge(int age){
        if(age < 18) {
            throw new ArithmeticException("Access denied - You must be at least 18 years old.");
        } else{
            System.out.println("Access granted - you are old enough!");
        }
    }

    public static void main(String[] args) {
        checkAge(17);                          //set age to 17 which is below 18
    }

}
