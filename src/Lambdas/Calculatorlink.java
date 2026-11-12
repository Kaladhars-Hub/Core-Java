package Lambdas;

public class Calculatorlink {

    public static void main(String[] args) {

        Calculator cr = (a, b) ->  System.out.println(a + b);
        cr.add(10, 30);
    }
}

//Example of how lambdas can be used with two parameters.