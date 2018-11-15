public class NestedExceptions {
    public static void main(String[] args) {

        try{
            try{
                try{
                    int arr[] = {1,2,3,4};
                    System.out.println(arr[10]);
                }catch(java.lang.ArithmeticException e){
                    System.out.println("Arithmetic Exception");
                    System.out.println("handled in try block 3");
                }
            }catch (java.lang.ArithmeticException e){
                    System.out.println("Arithmetic Exception");
                    System.out.println("handled in try block 2");
                }
            }catch(java.lang.ArithmeticException e3){
                System.out.println("Arithmetic exception");
                System.out.println("handled in  main try-block");
            }catch(ArrayIndexOutOfBoundsException e4){
                System.out.println("Arithmetic exception");
                System.out.println("handled in  main try-block");
            }
            catch (Exception e5){
                System.out.println("Exception");
                System.out.println("handled in main try-block");
            }
        }
    }
