package OOPS.Encapsulation.Examples;

public class StudentEx2 {

    private int marks = 80;

    public int getMarks() {
        return marks;
    }
    public void setMarks(int newMarks) {

        if(newMarks >= 0 && newMarks <= 100) {
            marks = newMarks;
        }
    }
    public static void main(String[] args) {

        StudentEx2 s = new StudentEx2();

        System.out.println(s.getMarks());

        s.setMarks(95);

        System.out.println(s.getMarks());

        s.setMarks(150);

        System.out.println(s.getMarks());

    }
}
