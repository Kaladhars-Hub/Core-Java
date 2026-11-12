package basics.ExceptionHandling.Examples;

public class ExceptionEx3 {

    public static void main(String[] args) {

        int age = 16;

        try{
            if(age < 18) {
                throw new IllegalArgumentException("Age must be at least 18");
            }
        }
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Program completed");
    }
}

/*
FLOW:-

age = 16
   ↓
Check age < 18
   ↓
true
   ↓
YOU explicitly throw IllegalArgumentException
   ↓
catch receives it
   ↓
getMessage() gets "Age must be at least 18"
   ↓
Print message
   ↓
Program completed

 */