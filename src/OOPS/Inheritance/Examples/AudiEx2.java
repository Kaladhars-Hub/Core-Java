package OOPS.Inheritance.Examples;

public class AudiEx2 {

    String brand;
    void showBrand() {
        System.out.println(brand);
    }
}
class bmw extends AudiEx2 {

    String model;
    void showModel() {
        System.out.println(model);
    }
}
class Tesla extends bmw {

    int batteryPercentage;
    void showBatteryPercentage() {
        System.out.println(batteryPercentage);
    }
    public static void main(String[] args) {

        Tesla t1 = new Tesla();

        t1.brand = "Tesla";
        t1.model = "Model 3";
        t1.batteryPercentage = 90;

        t1.showBrand();
        t1.showModel();
        t1.showBatteryPercentage();

    }
}
