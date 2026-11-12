package basics.loopingstatements.Examples;

public class loopsEx28 {

    public static void main(String[] args) {

        int largest = 1 ;

        for(int i = 1; i <= 10; i++) {
            if(i > largest) {
                largest = i;
            }
        }
         System.out.println(largest);
    }
}


/*
## 🔁 LOOP-28 — Find the Largest Number

Write a Java program using a `for` loop to find the **largest number from 1 to 10**.

Expected output:

```text
10
```

But there's an important difference from our previous problems:

We aren't simply printing numbers, counting them, or adding them together. The loop needs to **keep track of the largest value it has encountered so far**.

 */
