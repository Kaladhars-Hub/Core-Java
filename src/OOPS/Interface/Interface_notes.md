# Java Interface - Additional Notes

---

# 1. Understanding Default Methods

## Why were Default Methods introduced?

Before Java 8, interfaces could contain only abstract methods.

Example:

```java
interface Laptop {

    void copy();

    void paste();
}
```

Suppose later we decide to add a new method.

```java
void security();
```

Now every implementing class becomes incomplete.

```text
Lenovo  ❌ Error
HP       ❌ Error
Apple    ❌ Error
```

Reason:

Every class implementing the interface must implement all abstract methods.

This means if we modify the interface, all existing classes are affected.

---

## Solution - Default Method (Java 8)

Java introduced **default methods**.

Example:

```java
default void security() {
    System.out.println("Default Security");
}
```

Now every implementing class automatically gets this method.

The class does **not** need to write it again.

Example:

```java
public class HP implements Laptop {

    public void copy() { }

    public void paste() { }

    public void cut() { }

    public void keyboard() { }

    // security() is NOT written here.
}
```

Still, this works:

```java
HP hp = new HP();

hp.security();
```

Output:

```text
Default Security
```

---

## How does Java find security()?

Flow:

```text
main()

      │
      ▼

Create HP object

      │
      ▼

Call hp.security()

      │
      ▼

Does HP have security() ?

      │
     No
      │
      ▼

Check Laptop Interface

      │
      ▼

Found default security()

      │
      ▼

Execute interface's security()

      │
      ▼

Output

Default Security
```

---

## What if HP writes its own security() method?

Example:

```java
public class HP implements Laptop {

    @Override
    public void security() {
        System.out.println("HP Security");
    }

}
```

Now,

```java
HP hp = new HP();

hp.security();
```

Output:

```text
HP Security
```

Java first checks the class.

Since HP already has its own `security()` method, Java executes that method.

The default method inside the interface is ignored.

---

## Remember

Abstract Method

```java
void security();
```

Meaning:

Every implementing class **must** write its own implementation.

---

Default Method

```java
default void security() {

}
```

Meaning:

Every implementing class automatically gets this implementation.

Writing it again is optional.

---

# 2. Understanding @Override

## What is @Override?

`@Override` tells Java:

> "I am replacing a method that already exists in the parent class or interface."

Java checks whether the method already exists.

If it exists,

✔ No error.

If it doesn't exist,

❌ Compile-time error.

---

## Correct Example

Interface

```java
public interface Laptop {

    void copy();

    void paste();
}
```

Implementing Class

```java
public class Lenovo implements Laptop {

    @Override
    public void copy() {

    }

    @Override
    public void paste() {

    }

}
```

Why?

Because `copy()` and `paste()` already exist in the interface.

So we are overriding them.

---

## Incorrect Example

```java
public class Lenovo implements Laptop {

    @Override
    public void capture() {

    }

}
```

Error:

`capture()` does not exist in the interface.

Java says:

"There is nothing to override."

So IntelliJ shows a red underline.

---

## Correct Way

```java
public class Lenovo implements Laptop {

    @Override
    public void copy() {

    }

    @Override
    public void paste() {

    }

    public void capture() {

    }

}
```

Notice:

`capture()` is an extra method.

It is **not** overriding anything.

Therefore, `@Override` should NOT be used.

---

## Rule to Remember

Use `@Override` only when:

✔ The method already exists in the parent class.

OR

✔ The method already exists in the interface.

Do NOT use `@Override` for new methods created inside the class.

---

# Quick Revision

### Abstract Method

- No implementation.
- Every implementing class must implement it.

Example:

```java
void copy();
```

---

### Default Method

- Has implementation.
- Every implementing class automatically gets it.
- Overriding is optional.

Example:

```java
default void security() {

}
```

---

### Static Method

- Belongs to the interface.
- Called using the interface name.

Example:

```java
Laptop.audio();
```

---

### Private Method

- Used only inside the interface.
- Helps avoid duplicate code.

Example:

```java
private static void commonCode() {

}
```

---

### @Override

Use it only when replacing an existing method.

Correct:

```java
@Override
public void copy() {

}
```

Incorrect:

```java
@Override
public void capture() {

}
```

because `capture()` does not exist in the interface.

---

# Simple Memory Trick

Interface

↓

Creates Rules

↓

Implementing Class

↓

Writes Actual Code

↓

Default Method

↓

Already gives common implementation

↓

@Override

↓

Used only when replacing an existing method

↓

Extra Methods

↓

Allowed without @Override