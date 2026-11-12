package OOPS.AccessModifiers.Examples;

public class StudentEx1 {

    public String name = "Rahul";
    private int marks = 90;

    void showMarks() {
        System.out.println(marks);
    }
}
class TestEx1 extends StudentEx1 {

    public static void main(String[] args) {
        StudentEx1 s = new StudentEx1();

        System.out.println(s.name);
        s.showMarks();

    }
}
