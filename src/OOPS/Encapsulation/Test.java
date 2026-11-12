package OOPS.Encapsulation;

public class Test {

    public static void main(String[] args) {
        SwissBank s = new SwissBank();

        s.setBalance(100);
        System.out.println(s.getBalance());

        s.setBalance(-50);
        System.out.println(s.getBalance());
    }
}


//The balance remains 100 because the setter prevents an invalid value from being stored.