package OOPS.Abstract.Examples;

public class DeveloperEx2 extends EmployeeEx2{

    DeveloperEx2(int newSalary) {
        super(newSalary);
    }
    @Override
    void work() {
        System.out.println("Developer writes code");
    }
    public static void main(String[] args) {
        DeveloperEx2 d = new DeveloperEx2(500);

        d.showSalary();
        d.work();
    }
}

/*

`EmployeeEx2` is an abstract parent class. It contains a normal variable `salary`, a constructor to initialize the salary, a normal method `showSalary()`, and an abstract method `work()`.

`DeveloperEx2` extends `EmployeeEx2`. Its constructor receives `newSalary` and uses `super(newSalary)` to send that value to the parent constructor. The parent constructor then stores the value in `salary`.

The `work()` method was left unimplemented in the abstract parent class, so `DeveloperEx2` provides its own implementation.

When we create:

`DeveloperEx2 d = new DeveloperEx2(500);`

the value `500` first goes to the `DeveloperEx2` constructor. `super(newSalary)` sends it to the `EmployeeEx2` constructor, which stores it in `salary`.

Then:

`d.showSalary()` → uses the already implemented parent method and prints `500`.

`d.work()` → uses the implementation provided by `DeveloperEx2` and prints `Developer writes code`.

**What we achieved:** We used an abstract class to keep common data and common behavior in the parent while forcing the child class to provide its own implementation for behavior that can differ between child classes.

 */


/*
FLOW:

new DeveloperEx2(500)
        ↓
DeveloperEx2 constructor
        ↓
super(500)
        ↓
EmployeeEx2 constructor
        ↓
salary = 500

 */