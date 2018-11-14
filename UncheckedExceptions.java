public class UncheckedExceptions {

    public static void main(String[] args) {
        int numbers[] = {1,2,3,4};

        try{

            System.out.println(numbers[7]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Element not found. The array has four elements!");
        }
    }


}

