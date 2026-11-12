package basics.Arrays.Examples;

public class SingleDimEx14 {

    public static void main(String[] args) {

        int found = -1;

        int[] numbers = {7, 13, 22, 18, 35, 40, 50};

        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] % 5 == 0) {
                found = numbers[i];
                break;
            }
        }
        System.out.println(found);
    }
}





/*

### ARRAY-14 — Find the First Number Divisible by 5

Given:

```java
int[] numbers = {7, 13, 22, 18, 35, 40, 50};
```

### Goal

Find the **first number divisible by 5**.

Expected output:

```text
35
```


For this problem, you want to **store the first number you find**, not its index.

 So initialize a variable like this:

```
int foundNumber = -1;
```

 ### Why `foundNumber = -1`?

 Because initially **we haven't found anything**.

 When the loop reaches `35`:

```
35 % 5 == 0
```

 is true, so:

```
foundNumber = numbers[i];
```

 stores:

```
foundNumber = 35
```

 Then `break` stops the loop because we only want the **first** number divisible by 5.

 Output:

```
35
```

 ### Remember the difference

 - **Find the position/index** → `int index = -1`
- **Find the actual number** → `int foundNumber = -1`
- **Count how many** → `int count = 0`

 */