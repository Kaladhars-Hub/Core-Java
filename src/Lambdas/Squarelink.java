package Lambdas;

public class Squarelink {

/*

    public static void main(String[] args) {

        Square s = new Square() {
            @Override
            public int square(int n) {
                return n * n;
            }
        };
        System.out.println(s.square(7));

    }

 */

    public static void main(String[] args) {

        Square S = (int n) -> {
            return n * n;
        };
        System.out.println(S.square(7));
    }
}
