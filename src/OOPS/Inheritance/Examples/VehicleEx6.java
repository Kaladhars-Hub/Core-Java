package OOPS.Inheritance.Examples;

public class VehicleEx6 {

    String brand;
    int year;

    VehicleEx6(String vehicleBrand, int vehicleYear) {
        brand = vehicleBrand;
        year = vehicleYear;
    }
    void showVehicleDetails() {
        System.out.println(brand);
        System.out.println(year);
    }
}
class CarEx6 extends VehicleEx6 {

CarEx6(String carBrand, int carYear) {
    super(carBrand, carYear);
}
public static void main(String[] args) {
    CarEx6 C = new CarEx6("Toyota", 2025);

    C.showVehicleDetails();
}
}
