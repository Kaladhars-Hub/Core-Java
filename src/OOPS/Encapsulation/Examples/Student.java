package OOPS.Encapsulation.Examples;

public class Student {

        private int marks = 90;

        public int getMarks() {
            return marks;
    }
    public void setMarks(int newMarks) {
        marks = newMarks;
    }
    public static void main(String[] args) {
        Student s = new Student();

        System.out.println(s.getMarks());
        s.setMarks(95);
        System.out.println(s.getMarks());
    }
}

/*
## Encapsulation — Getter and Setter

### What is Encapsulation?

Encapsulation means keeping data private and providing controlled access to that data through methods.

Here:

```java
private int marks = 90;
```

`marks` is private, so it cannot be directly accessed from another class.

---

### Getter

```java
public int getMarks() {
    return marks;
}
```

A getter is used to **read/get the value** of a private variable.

- `public` → the method can be called from outside the class.
- `int` → the method returns an integer.
- `getMarks()` → name of the getter.
- `return marks` → returns the current value stored in `marks`.

Think:

```text
marks → getMarks() → outside
         READ
```

---

### Setter

```java
public void setMarks(int newMarks) {
    marks = newMarks;
}
```

A setter is used to **change/set the value** of a private variable.

- `public` → the method can be called from outside the class.
- `void` → the method does not return a value.
- `int newMarks` → receives the new integer value.
- `marks = newMarks` → stores the received value in the private variable.

For example:

```java
s.setMarks(95);
```

Value flow:

```text
95
 ↓
newMarks = 95
 ↓
marks = newMarks
 ↓
marks becomes 95
```

---

### Main Method Flow

First:

```java
StudentEx1 s = new StudentEx1();
```

creates a `StudentEx1` object.

At this point:

```text
marks = 90
```

Then:

```java
System.out.println(s.getMarks());
```

calls the getter.

```text
getMarks()
    ↓
return marks
    ↓
returns 90
    ↓
prints 90
```

Next:

```java
s.setMarks(95);
```

calls the setter.

```text
95
 ↓
newMarks receives 95
 ↓
marks = newMarks
 ↓
marks changes from 90 to 95
```

Finally:

```java
System.out.println(s.getMarks());
```

calls the getter again.

This time `marks` contains `95`, so it prints:

```text
95
```

### Output

```text
90
95
```

### Easy Way to Remember

```text
Getter → GET / READ the private value

Setter → SET / CHANGE the private value
```

Getter:

```text
private variable ─────→ outside
                 READ
```

Setter:

```text
outside ─────→ private variable
        CHANGE
```

The important idea is that outside code does not directly access the private variable. It uses the methods provided by the class.
 */