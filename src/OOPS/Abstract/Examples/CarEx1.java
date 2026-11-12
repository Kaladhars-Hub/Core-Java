package OOPS.Abstract.Examples;

class CarEx1 extends VehicleEx1{
    @Override
    public void start() {
        System.out.println("Car started");
    }
    public static void main(String[] args) {
        CarEx1 c = new CarEx1();

        c.start();
        c.stop();
    }
}
