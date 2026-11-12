package basics.loopingstatements.Examples;

public class loopsEx36 {

    public static void main(String[] args) {

        for(int i = 1; i <= 100; i++) {
            if(i % 7 == 0) {
                System.out.println(i);
                break;
            }
        }
    }
}

/*

# LOOP-36 — Find the First Number Divisible by 7

 ## Problem

 Find the **first number between 1 and 100 that is divisible by 7**.

 Expected output:

```
7
```
---

 ## Understanding the Problem

 The most important thing to notice is the word:

 > **first**

 We are not being asked:

 > "How many numbers between 1 and 100 are divisible by 7?"

 We are being asked:

 > "What is the first number between 1 and 100 that is divisible by 7?"

 This changes how we approach the problem.

 In the previous counting problem, we needed a **counter** because we wanted to continue checking every number and count all the matches.

 Here, once we find the first match, **we don't care about the remaining numbers**.

 Therefore, we need:

 - A loop to search through the numbers.
- A condition to determine whether a number is divisible by 7.
- `break` to stop the loop as soon as we find the answer.

---

 # Step-by-Step Logic

 ## Step 1 — Identify the range

 The problem says:

 > Find the first number between 1 and 100.

 Therefore, the loop should start at `1` and continue until `100`.

```
for(int i = 1; i <= 100; i++)
```

 Here:

 - `i = 1` → start checking at 1.
- `i <= 100` → don't go beyond 100.
- `i++` → move to the next number after each iteration.

 The loop checks:

```
1
2
3
4
5
6
7
8
9
...
100
```

---

 ## Step 2 — Determine what makes a number valid

 A number is divisible by 7 when the remainder after dividing it by 7 is `0`.

 For example:

```
7 ÷ 7 = 1 remainder 0
14 ÷ 7 = 2 remainder 0
21 ÷ 7 = 3 remainder 0
```

 In Java, `%` gives us the remainder.

 So conceptually:

```
number % 7
```

 means:

 > "What is the remainder when this number is divided by 7?"

 If the remainder is `0`, the number is divisible by 7.

 Therefore, our condition is:

```
if(i % 7 == 0)
```

---

 # Step 3 — What happens when we find the number?

 When the loop reaches `7`:

```
i = 7
```

 The condition checks:

```
7 % 7 == 0
```

 This is true.

 Therefore, we have found the answer.

 We print:

```
System.out.println(i);
```

 Since `i` is currently `7`, the output is:

```
7
```

---

 # Step 4 — Why do we use `break`?

 This is the most important new concept in this problem.

 After finding `7`, there is no reason to continue checking:

```
8
9
10
11
12
...
100
```

 We already found the **first** number.

 So we use:

```
break;
```

 `break` immediately terminates the loop.

 The execution is essentially:

```
i = 1 → not divisible → continue
i = 2 → not divisible → continue
i = 3 → not divisible → continue
i = 4 → not divisible → continue
i = 5 → not divisible → continue
i = 6 → not divisible → continue
i = 7 → divisible → print 7 → BREAK
```

 The loop ends at this point.

---

 # Complete Flow

 The program can be understood as:

```
START
  ↓
Start i at 1
  ↓
Check if i is divisible by 7
  ↓
NO ─────────→ Increase i and check again
  ↓
YES
  ↓
Print i
  ↓
break
  ↓
STOP
```

---

 # Why We Don't Need a Counter

 A common mistake is to approach this problem like a counting problem.

 For example:

```
int find = 0;
```

 and then:

```
find = find + 1;
```

 That would answer a different question:

 > "How many numbers from 1 to 100 are divisible by 7?"

 But that's not what we need.

 We don't need to remember **how many matches** we've found.

 We only need to remember the **current number we're checking**.

 That number is already stored in:

```
i
```

 So when we find a match, we can simply do:

```
System.out.println(i);
```

---

 # How to Think About These Problems

 When you get a new loop problem, don't immediately start writing Java.

 First, identify **what the problem is asking you to do**.

 A useful approach is to ask these questions.

 ## 1\. Am I counting, searching, or processing?

 Look for keywords.

 ### Counting

 Words like:

 - "How many?"
- "Count"
- "Number of"

 Usually means you need a counter.

 Example:

 > Count numbers divisible by 7.

 Mental approach:

```
Find match → increase counter → keep going
```

---

 ### Searching

 Words like:

 - "Find"
- "First"
- "Last"
- "Until you find"
- "Search"

 Usually means you need to look for a value and potentially stop early.

 Example:

 > Find the first number divisible by 7.

 Mental approach:

```
Search → find match → use answer → stop
```

 This is our current problem.

---

 ### Processing Everything

 Sometimes the problem wants you to examine every value.

 For example:

 > Print all numbers divisible by 7 between 1 and 100.

 Mental approach:

```
Check every number → print matches → keep going
```

 Here, you would **not** use `break`.

---

 # A Useful Decision Table

 | Problem asks... | Main idea |
| --- | --- |
| How many? | Counter |
| Find the first? | Search + `break` |
| Find the last? | Search entire range |
| Print all matches? | Keep looping |
| Stop when condition occurs? | `break` |
| Skip certain values? | `continue` |

 This is a useful pattern to remember.

---

 # Difference Between `break` and `continue`

 These two keywords are easy to confuse.

 ## `break`

 Means:

 > **Stop the loop completely.**

 Example:

```
if(i % 7 == 0) {
    System.out.println(i);
    break;
}
```

 Once this happens, the loop is over.

---

 ## `continue`

 Means:

 > **Skip the current iteration and move to the next one.**

 For example:

```
if(i % 2 == 0) {
    continue;
}
```

 This does not stop the loop.

 It simply skips the current number and moves to the next number.

 Think:

```
break    → EXIT the loop
continue → SKIP this iteration
```

---

 # Tracing the Code

 Let's manually trace the important part of the program.

```
for(int i = 1; i <= 100; i++) {
    if(i % 7 == 0) {
        System.out.println(i);
        break;
    }
}
```

 ### Iteration 1

```
i = 1
1 % 7 = 1
```

 Condition is false.

 Continue.

 ### Iteration 2

```
i = 2
2 % 7 = 2
```

 False.

 Continue.

 ### Iteration 3

```
i = 3
3 % 7 = 3
```

 False.

 Continue.

 This continues until:

 ### Iteration 7

```
i = 7
7 % 7 = 0
```

 Condition is true.

 Therefore:

```
System.out.println(i);
```

 prints:

```
7
```

 Then:

```
break;
```

 terminates the loop.

---

 # General Pattern

 This problem gives us a very useful general pattern:

```
for(start; condition; update) {

    if(matchCondition) {
        System.out.println(value);
        break;
    }
}
```

 Whenever you see:

 > "Find the first \_\_\_"

 you should immediately think:

```
LOOP
  ↓
CHECK
  ↓
MATCH?
  ↓
YES → USE ANSWER → BREAK
  ↓
NO
  ↓
KEEP SEARCHING
```

---

 # Key Lesson

 The biggest lesson from LOOP-36 is not the `%` operator.

 You already learned how to check divisibility.

 The new lesson is:

 > **The wording of the problem determines the structure of your loop.**

 Compare these two problems:

 ### Problem A

 > Count all numbers divisible by 7.

 You would think:

```
counter = 0

loop through everything
    if divisible
        counter++
```

 You must check the entire range.

 ### Problem B

 > Find the first number divisible by 7.

 You should think:

```
loop through numbers
    if divisible
        print it
        stop
```

 You don't need to check the rest.

---

 # Mental Checklist for Future Loop Problems

 Before coding, ask:

 1. **What range am I checking?**
2. **What makes a number/value valid?**
3. **Am I counting or searching?**
4. **Do I need to check every value?**
5. **Should I stop when I find something?**
6. **Do I need a counter, an accumulator, or neither?**

 For LOOP-36:

```
Range       → 1 to 100
Goal        → Find first match
Match       → Divisible by 7
Action      → Print the number
After match → Stop with break
Counter?    → No
```

 */