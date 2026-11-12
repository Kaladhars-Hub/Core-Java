package OOPS.Interface.InterfacePart2;

public class Main {

    public static void main(String[] args) {

        Car c = new Car() {
            public void drive() {
                System.out.println("Driving...");
            }
        };
        c.drive();
    }
}

//This is anonymous class cause we are not writing explicitly named class instead we just use some name for the class.