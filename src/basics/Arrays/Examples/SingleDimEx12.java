package basics.Arrays.Examples;

public class SingleDimEx12 {

    public static void main(String[] args) {

        int searchNumber = 42;
        int index = -1;

        int[] numbers = {10, 25, 7, 42, 18, 30};

        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] == searchNumber) {
                index = i;
                break;
            }
        }
        System.out.println(index);
    }
}





/*
### ARRAY-12 — Find the Index of a Number

Given:

Java

```
int[] numbers = {10, 25, 7, 42, 18, 30};
```

Find the index position of `42`.

Expected output:

```
3
```
###Explanation:

1.How the for loop works:

for (int i = 0; i < numbers.length; i++) {

Here:

int i = 0 → Start checking from index 0.

i < numbers.length → Continue while i is less than the array length.

i++ → Increase i by 1 after every iteration.

The array has 6 elements, so numbers.length is 6.

The loop therefore checks:

i = 0
i = 1
i = 2
i = 3
...

2. Compare each value with 42

Inside the loop:

if (numbers[i] == 42) {

This checks whether the value at index i is equal to 42.

The checks happen like this:

numbers[0] == 42  → 10 == 42 → false
numbers[1] == 42  → 25 == 42 → false
numbers[2] == 42  → 7  == 42 → false
numbers[3] == 42  → 42 == 42 → true

When i becomes 3, the condition is true.

3. Print the index
Then this executes:

System.out.println(i);

Since i is currently 3, Java prints:

3

4. Why use break?
break;

Once 42 is found, there is no need to continue searching. break immediately stops the loop.

####
The important part is:

index = i;

Not:

index = 42;

Because i tells us where 42 is located, while 42 is the value we're searching for.
######

 -1 is a very common and easy convention for “not found” when you are returning an index.
For an index-search problem, I recommend using -1.

Why? Because an index can normally be:

0, 1, 2, 3, ...

So -1 is outside the valid index range and naturally means “no valid index was found.”

Q & A :

What number are you searching for?
→ We are searching for 42.

Which variable will store the index?
→ Use a variable such as index.

What should the index variable start with if the number is not found?
→ Start it with -1.
-1 means the number was not found.

When numbers[i] matches the search number, what should you store?
→ Store the current index i.

Should you store the actual number or the current index i?
→ Store i, because the question asks for the position/index, not the value 42.

Where should you print the final index?
→ Print index after the loop


### Important parts

Java

```
int searchNumber = 42;
```

This is the number you want to find.

Java

```
int index = -1;
```

`-1` means:

> The number has not been found yet.

Java

```
if (numbers[i] == searchNumber) {
    index = i;
    break;
}
```

When the current array value matches `searchNumber`:

* `index = i;` stores the current index.

* `break;` stops the loop because the number was found.

For this array:

```
10 → index 0
25 → index 1
7  → index 2
42 → index 3
```

Therefore, the output is:

```
3
```

### GitHub summary

Java

```
Problem: Find the index of a number in an array.

Array:
{10, 25, 7, 42, 18, 30}

Search number:
42

Logic:
1. Store the number to search in searchNumber.
2. Create index and start it with -1.
3. -1 means the number has not been found.
4. Use a for loop to check each array element.
5. If the current element matches searchNumber,
   store the current index i in index.
6. Use break to stop searching after finding the number.
7. Print index after the loop.

Output:
3

```

        ### Important distinction

Java

```
index = i;
```

stores the position of the number.

Java

```
index = numbers[i];
        ```

would store the actual value, which is not what this problem asks for.

 */