package Lambdas;

public class Calclink {

 /*

    public static void main(String[] args) {

        Calc c = new Calc() {
            @Override
            public int cal(int a, int b) {
                return a - b;
            }
        };
        System.out.println(c.cal(20, 30));
    }

  */

    public static void main(String[] args) {

        Calc c = (int a, int b) -> {
            return a - b;
        };
        System.out.println(c.cal(30, 20));
    }
}
