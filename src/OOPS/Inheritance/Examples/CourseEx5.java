package OOPS.Inheritance.Examples;

public class CourseEx5 {

    String courseName;

    CourseEx5(String name) {
        courseName = name;
    }
    void showCourseName() {
        System.out.println(courseName);
    }
}
class JavaCourseEx5 extends CourseEx5 {

    JavaCourseEx5(String name) {
    super(name);
    }
    public static void main(String[] args) {

        JavaCourseEx5 j = new JavaCourseEx5("Core Java");

        j.showCourseName();
    }
}
