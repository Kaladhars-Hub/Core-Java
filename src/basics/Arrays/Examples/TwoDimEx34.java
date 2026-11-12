package basics.Arrays.Examples;

public class TwoDimEx34 {
    public static void main(String[] args) {

        int[][] array1 = {
                {1, 2, 1},
                {9, 7, 2},
                {7, 6, 4}
        };

        int[][] array2 = {
                {2, 6, 8, 8},
                {0, 1, 3, 9, 7},
                {7, 2, 0},
                {8, 3}
        };

        // Stores common values
        int[] result = new int[9];

        // Points to the next empty position in result
        int nextResultIndex = 0;

        // Go through every value in array1
        for (int i = 0; i < array1.length; i++) {

            for (int j = 0; j < array1[i].length; j++) {

                // Store the current value from array1
                int currentValue = array1[i][j];

                // Assume current is not found in array2
                boolean currentValuefoundInArray2 = false;

                // Search the whole array2
                for (int k = 0; k < array2.length; k++) {

                    for (int l = 0; l < array2[k].length; l++) {

                        if (currentValue == array2[k][l]) {
                            currentValuefoundInArray2 = true;
                        }
                    }
                }

                // Continue only if current exists in array2
                if (currentValuefoundInArray2) {

                    // Assume we have not stored it before
                    boolean alreadyStoredInResult = false;

                    // Check only the filled part of result
                    for (int r = 0; r < nextResultIndex; r++) {

                        if (result[r] == currentValue) {
                            alreadyStoredInResult = true;
                        }
                    }

                    // Store only if it is not already in result
                    if (!alreadyStoredInResult) {

                        result[nextResultIndex] = currentValue;

                        nextResultIndex++;
                    }
                }
            }
        }

        // Print only the common values that were stored
        for (int i = 0; i < nextResultIndex; i++) {
            System.out.print(result[i] + " ");
        }
    }
}

/*
ARRAY-34 — Find Common Elements Between Two Arrays


--------------------------------------------------
GOAL
--------------------------------------------------

We have two arrays.

array1 is a normal 2D array.

array2 is a jagged 2D array.

We want to find the values that are present
in BOTH arrays.

We also want to make sure that the same common
value is stored only once in the result.

Example common values:

1
2
6
7
9


==================================================
BIG PICTURE OF THIS PROBLEM
==================================================

The complete flow is:

Take one value from array1

↓

Store that value in currentValue

↓

Search the whole array2

↓

Did we find the same value in array2?

↓

YES

↓

Before storing it,
check whether we already stored it in result

↓

Already stored?

YES → skip it

NO → store it in result

↓

Move nextResultIndex to the next empty position


==================================================
STEP 1 — THE TWO ARRAYS
==================================================

array1:

1 2 1
9 7 2
7 6 4


array2:

2 6 8 8
0 1 3 9 7
7 2 0
8 3


array2 is jagged because its rows have
different numbers of columns.

For example:

row 0 → 4 values
row 1 → 5 values
row 2 → 3 values
row 3 → 2 values


That is why we use:

array2[k].length

for its column loop.


==================================================
STEP 2 — CREATE RESULT ARRAY
==================================================

int[] result = new int[9];

This is a 1D array.

Its job is:

Store the common values that we find.


Why size 9?

Because array1 contains:

3 rows × 3 columns = 9 values

So at maximum, we may need space for 9 values.


Initially result looks like:

[0, 0, 0, 0, 0, 0, 0, 0, 0]


==================================================
STEP 3 — nextResultIndex
==================================================

int nextResultIndex = 0;

This variable tells Java:

"Where is the next empty position in result?"


At the beginning:

nextResultIndex = 0


So the first value we store goes into:

result[0]


After storing one value:

nextResultIndex++;

Now:

nextResultIndex = 1


So the next common value goes into:

result[1]


Example:

result[0] = 1
result[1] = 2
result[2] = 7


At this point:

nextResultIndex = 3


Important:

The FILLED indexes are:

0, 1, 2


But:

nextResultIndex = 3


Why?

Because index 3 is the NEXT EMPTY position.


Remember:

last filled index
=
nextResultIndex - 1


next empty index
=
nextResultIndex


==================================================
STEP 4 — FIRST TWO LOOPS
==================================================

for(int i = 0; i < array1.length; i++) {

    for(int j = 0; j < array1[i].length; j++) {

The first two loops go through every value
inside array1.


i → row

j → column


So Java goes through:

array1[0][0]
array1[0][1]
array1[0][2]

array1[1][0]
array1[1][1]
array1[1][2]

array1[2][0]
array1[2][1]
array1[2][2]


These loops do NOT compare anything by themselves.

Their job is only:

Go through the positions one by one.


==================================================
STEP 5 — STORE SELECTED VALUE
==================================================

int currentValue = array1[i][j];

This means:

"Take the value currently selected from array1
and store it in currentValue."


Example:

if:

i = 1
j = 0


then:

array1[1][0] = 9


So:

currentValue = 9


Now Java knows:

"9 is the value I am currently searching for
inside array2."


==================================================
STEP 6 — ASSUME IT IS NOT FOUND
==================================================

boolean currentValueFoundInArray2 = false;

Read this as:

"For now, assume that currentValue
has NOT been found in array2."


Example:

currentValue = 9


Before searching:

currentValueFoundInArray2 = false


==================================================
STEP 7 — SEARCH THE WHOLE array2
==================================================

for(int k = 0; k < array2.length; k++) {

    for(int l = 0; l < array2[k].length; l++) {

k → row of array2

l → column inside that row


These loops go through every value in array2.


Again:

The loops only MOVE through array2.

The comparison happens in the if condition.


==================================================
STEP 8 — COMPARE currentValue WITH array2
==================================================

if(currentValue == array2[k][l]) {

    currentValueFoundInArray2 = true;
}


Read this as:

"If the selected value from array1
is equal to the value currently being checked
inside array2..."

then:

currentValueFoundInArray2 = true;


Example:

currentValue = 9


Java may check:

9 == 2 → false
9 == 6 → false
9 == 8 → false
...

9 == 9 → true


Now:

currentValueFoundInArray2 = true


This means:

"The selected value exists in BOTH arrays."


That is what we mean when we say:

currentValue is common.


==================================================
STEP 9 — CONTINUE ONLY IF IT WAS FOUND
==================================================

if(currentValueFoundInArray2) {

Read this as:

"If the selected value from array1
was found somewhere inside array2..."


Now we know it is common.


But we STILL do not store it immediately.


Why?

Because the same value may have already been
stored earlier.


==================================================
STEP 10 — ASSUME IT WAS NOT STORED BEFORE
==================================================

boolean alreadyStoredInResult = false;

Read this as:

"For now, assume that this common value
has NOT already been stored in result."


Example:

currentValue = 7


result may already contain:

1, 2, 7


We now need to check that.


==================================================
STEP 11 — CHECK FILLED PART OF result
==================================================

for(int r = 0; r < nextResultIndex; r++) {

This loop checks only the positions in result
that have actually been filled.


Example:

result:

index 0 → 1
index 1 → 2
index 2 → 7


nextResultIndex = 3


So:

r becomes:

0
1
2


It does NOT check index 3 because:

r < nextResultIndex


and index 3 is still the next empty position.


==================================================
STEP 12 — CHECK FOR DUPLICATE
==================================================

if(result[r] == currentValue) {

    alreadyStoredInResult = true;
}


Suppose:

currentValue = 7


Java checks:

result[0] == 7

1 == 7 → false


result[1] == 7

2 == 7 → false


result[2] == 7

7 == 7 → true


So:

alreadyStoredInResult = true


Now Java knows:

"7 is common,
but I already stored 7 earlier."


So we should NOT store another 7.


==================================================
STEP 13 — STORE ONLY IF NOT ALREADY STORED
==================================================

if(!alreadyStoredInResult) {

The ! means:

NOT


So:

if(!alreadyStoredInResult)

means:

"If this value has NOT already been stored..."


Example:

alreadyStoredInResult = false


Then:

!false

becomes:

true


So Java enters the if block.


==================================================
STEP 14 — STORE THE COMMON VALUE
==================================================

result[nextResultIndex] = currentValue;

Read this as:

"Store the common value in the next empty position
inside result."


Example:

currentValue = 6

nextResultIndex = 3


Then:

result[3] = 6;


Now result may look like:

1, 2, 7, 6


==================================================
STEP 15 — MOVE TO NEXT EMPTY POSITION
==================================================

nextResultIndex++;

This means:

nextResultIndex = nextResultIndex + 1;


If:

nextResultIndex = 3


after:

nextResultIndex++


it becomes:

4


So the next common value will be stored in:

result[4]


==================================================
IMPORTANT DUPLICATE EXAMPLE
==================================================

Suppose array1 contains:

1, 2, 1


The first time currentValue becomes:

1


Java searches array2.

1 exists there.

result does not contain 1 yet.

So Java stores:

result[0] = 1


Later array1 gives another:

currentValue = 1


Java searches array2 again.

1 still exists there.


But now result already contains:

result[0] = 1


So:

alreadyStoredInResult = true


Java skips storing another 1.


That is how we avoid duplicates.


==================================================
STEP 16 — PRINT THE RESULT
==================================================

for(int i = 0; i < nextResultIndex; i++) {

    System.out.print(result[i] + " ");
}


Why do we use:

i < nextResultIndex

instead of:

i < result.length?


Because result may have unused positions.


Example:

result may internally look like:

[1, 2, 9, 7, 6, 0, 0, 0, 0]


But only the first 5 positions contain
our actual common values.


So:

nextResultIndex = 5


The print loop checks:

result[0]
result[1]
result[2]
result[3]
result[4]


and stops before the unused zeros.


==================================================
VERY IMPORTANT — WHY FOUR LOOPS?
==================================================

We are NOT using four loops simply because
array2 is jagged.


We use four loops because:

For EACH value in array1

we must search ALL values in array2.


First pair:

i and j

→ select every value from array1


Second pair:

k and l

→ search every value in array2


Even if both arrays were normal 3 x 3 arrays,
we would still need this searching idea.


The jagged part only changes:

array2[k].length


because different rows have different sizes.


==================================================
VARIABLE JOBS
==================================================

i
→ row of array1


j
→ column of array1


currentValue
→ selected value from array1


k
→ row of array2


l
→ column of array2


currentValueFoundInArray2
→ tells us whether currentValue exists in array2


result
→ stores the common values


alreadyStoredInResult
→ tells us whether the common value
  was already saved earlier


nextResultIndex
→ tells us the next empty position in result


r
→ checks the already-filled part of result


==================================================
FINAL SIMPLE FLOW
==================================================

Choose one value from array1

↓

Store it in currentValue

↓

Assume:

currentValueFoundInArray2 = false

↓

Go through every row and column of array2

↓

Use if condition to compare:

currentValue == array2[k][l]

↓

If match found:

currentValueFoundInArray2 = true

↓

If found in array2:

assume:

alreadyStoredInResult = false

↓

Check the filled part of result

↓

If same value already exists:

alreadyStoredInResult = true

↓

If NOT already stored:

result[nextResultIndex] = currentValue

↓

nextResultIndex++

↓

Finally print only the filled part of result


==================================================
MAIN IDEA TO REMEMBER
==================================================

1. Pick a value from array1.

2. Search for it in array2.

3. If it is found in array2,
   it is a common value.

4. Before saving it,
   check whether we already saved it earlier.

5. Save it only once.

6. nextResultIndex always points to
   the NEXT EMPTY position in result.
*/
