package basics.ExceptionHandling.Examples;

public class ExceptionEx2 {

    public static void main(String[] args) {

        int[] numbers = {10, 20 , 30};

        try{
            System.out.println(numbers[5]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index");
        }
        catch (Exception e) {
            System.out.println("Some other exception occurred");
        }
        System.out.println("Program completed");
    }
}
