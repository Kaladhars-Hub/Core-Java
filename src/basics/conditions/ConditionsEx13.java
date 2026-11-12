package basics.conditions;

import java.util.Scanner;

public class ConditionsEx13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = sc.nextInt();

        System.out.println("Do you have a valid ticket?");
        boolean validticket = sc.nextBoolean();

        if(age >= 18 && validticket) {
            System.out.println("Allowed to watch the movie");
        }else{
            System.out.println("Not allowed to watch the movie");
        }
        sc.close();
    }
}



/*

## 🟦 A movie theatre has this rule:

> A person can watch a particular movie if they are **18 years or older AND they have a valid ticket**.

Your program should take:

1. The person's age
2. Whether they have a valid ticket (`true` / `false`)

Print:

```text
Allowed to watch the movie
```

if they meet the requirement.

Otherwise:

```text
Not allowed to watch the movie
```


###What two conditions must be true for the person to be allowed?**


 */