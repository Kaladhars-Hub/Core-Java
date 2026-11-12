package OOPS.Interface.Examples;

public class CarEx1 implements VehicleEx1 {


    @Override
    public void start() {
        System.out.println("Car Started");
    }

    @Override
    public void stop() {
        System.out.println("Car Stopped");
    }
    public static void main(String[] args) {
        CarEx1 c = new CarEx1();

        c.start();
        c.stop();
    }
}
