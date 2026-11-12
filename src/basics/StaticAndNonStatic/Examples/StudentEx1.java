package basics.StaticAndNonStatic.Examples;

public class StudentEx1 {

    static String place = "ABC College";

    String name;


    static void showPlace() {
        System.out.println(place);
    }

    void studentName() {
        System.out.println(name);
    }

    public static void main(String[] args) {

        StudentEx1 s1 = new StudentEx1();
        StudentEx1 s2 = new StudentEx1();
        s1.name = "Ironman";
        s2.name = "SPIDERMAN";

        showPlace();

        s1.studentName();
        s2.studentName();
    }
}
