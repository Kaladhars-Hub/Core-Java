package OOPS.Polymorphism.Examples;

public class CalculatorEx2 {

     int multiply(int a, int b) {
         return a * b;
     }
    int multiply(int a, int b, int c) {
         return a * b * c;

    }
    public static void main(String[] args) {

         CalculatorEx2 c = new CalculatorEx2();

         System.out.println(c.multiply(5,4));
         System.out.println(c.multiply(2,3,4));
    }
}
