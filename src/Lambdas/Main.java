package Lambdas;

public class Main {

    public static void main(String[] args) {

        Flight f = () ->  System.out.println("Driving Air India");
        f.drive();
    }
}
