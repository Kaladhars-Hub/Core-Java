/*
=========================================
Flow of Encapsulation
=========================================

1. Program execution starts from the main() method.

2. An object of SwissBank is created.
   SwissBank bank = new SwissBank();

3. The setter method is called.
   bank.setBalance(100);

4. The value '100' is passed as an argument to the setter.
   setBalance(100)

5. The setter receives the value in its parameter.
   public void setBalance(int balance)

6. Validation is performed.
   if (balance >= 0)

7. If the value is valid, it is stored in the private instance variable.
   this.balance = balance;

    - 'this.balance' -> instance variable
    - 'balance'      -> method parameter

8. The getter method is called.
   bank.getBalance();

9. The getter returns the value of the private variable.
   return balance;

10. The returned value is printed.
    System.out.println(bank.getBalance());

Output:
100
=========================================
*/