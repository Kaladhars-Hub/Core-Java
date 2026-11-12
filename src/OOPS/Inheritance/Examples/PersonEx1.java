package OOPS.Inheritance.Examples;

 public class PersonEx1 {

    String name;

    void showName() {
        System.out.println(name);
    }
}


class Employee extends PersonEx1 {

    int salary;

    void showSalary() {
        System.out.println(salary);
    }


    public static void main(String[] args) {

        Employee e1 = new Employee();
        e1.name = "John";      // inherited from PersonEx1
        e1.salary = 5000;     // Employee's own variable

        e1.showName();        // inherited method
        e1.showSalary();      // Employee's own method

    }
}


/*

PersonEx1
   ↓
name
showName()
   ↓ inherited by
Employee
   ↓
salary
showSalary()

Therefore e1 has access to:
e1.name
e1.salary
e1.showName()
e1.showSalary()
 */