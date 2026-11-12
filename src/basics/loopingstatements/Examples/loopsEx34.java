package basics.loopingstatements.Examples;

public class loopsEx34 {

    public static void main(String[] args) {

        int smallest = 2;

        for(int i = 1; i <= 25; i++) {

            if(i % 2 == 0 && i < smallest) {
                smallest = i;
            }
        }
        System.out.println(smallest);
    }
}


/*

### LOOP-34 — Find the smallest even number

Find the **smallest even number from 1 to 25** using a `for` loop.

Expected output:

```text
2
```

This is a little more useful than the previous problem because now you need to:

1. Go through the numbers **1 to 25**.
2. Identify which numbers are **even**.
3. Keep track of the **smallest even number found so far**.
4. Finally print that smallest even number.


 ### Problem

 Find the smallest even number from `1` to `25` using a `for` loop.

 Expected output:

```
2
```

 ### Approach

 Start with:

```
int smallest = 2;
```

 Since `2` is the first and smallest even number in the range `1–25`, it is a valid starting value.

 Then use a `for` loop to check every number from `1` to `25`:

```
if (i % 2 == 0 && i < smallest) {
    smallest = i;
}
```

 This condition checks two things:

 - `i % 2 == 0` → checks whether `i` is even.
- `i < smallest` → checks whether the current number is smaller than the stored smallest value.

 If both are true, `smallest` is updated.

 ### Important Points

 - `% 2 == 0` is used to check whether a number is even.
- For finding the **largest**, we use `i > largest`.
- For finding the **smallest**, we use `i < smallest`.
- `smallest = 0` is not suitable here because `0` is smaller than every positive number in the range.
- `smallest = 1` also doesn't work with this comparison because `1` is already smaller than every number from `2` to `25`.
- `smallest = 2` works because `2` is a valid even number and is already the smallest even number in this range.
- `break` is not required. The loop can run through the entire range.
- The general pattern is:

```
Largest:
if condition AND current > largest
    update largest

Smallest:
if condition AND current < smallest
    update smallest
```

 ### Key Learning

 The important idea is not just getting the answer `2`. The goal is understanding how a **tracking variable** such as `smallest` or `largest` can be used to keep the best value found so far.

 This should work well as a small README/notes entry in your GitHub practice repository.
 */