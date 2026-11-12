package Lambdas;

public class Speedlink {

    /*
    Convert this lambda back into an anonymous class
    public static void main(String[] args) {

        Speed s = () -> 120;

    }
*/
    public static void main(String[] args) {

        Speed s = new Speed() {
            @Override
            public int getSpeed() {
                return 120;
            }
        };
        System.out.println(s.getSpeed());
    }
}