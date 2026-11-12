package Lambdas;

public class greetlink {


    /*

    public static void main(String[] args) {

    Greeter g = new Greeter() {
    public void greet(String name) {
        System.out.println("Good morning " + name);
    }
  }
};
     */
    public static void main(String[] args) {

        Greeting gt = name -> System.out.println("Good morning " + name);
        gt.greet("Mr");
    }
}

//Example of how lambdas can be used with Single parameters.