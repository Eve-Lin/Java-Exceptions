
/* In this program we are checking the Student age
 * if the student age > 12 or weight > 40 then our program
 * should return that the student is not eligible for registration.
 */
public class ThrowExample {

    public static void checkEligibility(int age, int weight) {
        if (age > 12 || weight > 40) {
            throw new java.lang.ArithmeticException(("Student is not eligible"));
        } else {
            System.out.println("Student entry is valid");
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to the Registration Process!");
        checkEligibility(14, 39);
        System.out.println("Have a nice day! :)");
    }
    }

