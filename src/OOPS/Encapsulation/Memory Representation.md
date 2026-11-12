Step 1:
SwissBank bank = new SwissBank();

Object:
+----------------+
| balance = 0    |   // default value for int
+----------------+

        │
        ▼

bank.setBalance(100);

Setter receives:
balance = 100

        │
        ▼

Validation:
100 >= 0 ✔

        │
        ▼

this.balance = balance;

Object:
+----------------+
| balance = 100  |
+----------------+

        │
        ▼

bank.getBalance()

        │
        ▼

Returns 100

        │
        ▼

Prints:
100