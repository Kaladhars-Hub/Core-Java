package Lambdas;

public class Welcomelink {

/*
    public static void main(String[] args) {

        Welcome w = new Welcome() {
            @Override
            public void display() {
                System.out.println("Welcome to Java 8");
            }
        };
        w.display();
    }
    */

    public static void main(String[] args) {

        Welcome w = () -> System.out.println("Welcome to Java 8");
        w.display();
    }
}
