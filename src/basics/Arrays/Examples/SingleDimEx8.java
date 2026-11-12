package basics.Arrays.Examples;

public class SingleDimEx8 {

    public static void main(String[] args) {

        int[] numbers = {12, 7, 4, 15, 20, 9, 6};

        int count = 0;

        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] % 2 == 0) {
                count = count + 1;
            }
        }
        System.out.println(count);
    }
}


/*

### ARRAY-08 — Count Even Numbers in an Array

Array:
{12, 7, 4, 15, 20, 9, 6}

Logic:
1. Create a count variable to keep track of how many even numbers are found.
2. Start count at 0 because we have not found any even numbers yet.
3. Use a for loop to check every element in the array.
4. Check whether the current array element is even.
5. If it is even, increase count by 1.
6. Print count after the loop.

Even numbers:
12, 4, 20, 6

Total even numbers = 4

Output:
4


Mistake I explained

You initially wrote:

count = numbers[i];

The problem was that count is supposed to store how many even numbers we found, not the actual even number.

For example:

12 is even → count = 12  ❌
4 is even  → count = 4   ❌
20 is even → count = 20  ❌
6 is even  → count = 6   ❌

So the value was being replaced each time.

The correct thinking is:

count starts at 0

12 is even → count becomes 1
4 is even  → count becomes 2
20 is even → count becomes 3
6 is even  → count becomes 4

Therefore:

count = count + 1;
Important distinction

You just practiced two different patterns:

Sum values:

sum = sum + numbers[i];

→ sum stores the total of the values.

Count matching values:

count = count + 1;

→ count stores how many values matched.

This distinction is important for your future Java problems.

 */
