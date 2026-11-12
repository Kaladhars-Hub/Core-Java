package basics.StaticAndNonStatic.Examples;

public class LaptopEx3 {

    static {
        System.out.println("Laptop class loaded");
    }

        LaptopEx3() {
            System.out.println("Laptop object created");
        }

        public static void main(String[] args) {

        LaptopEx3 l1 = new LaptopEx3();
        LaptopEx3 l2 = new LaptopEx3();
        LaptopEx3 l3 = new LaptopEx3();

        }
    }





/*

LaptopEx3 class loads
        ↓
static block runs once
        ↓
main() starts
        ↓
l1 = new LaptopEx3() → constructor runs
        ↓
l2 = new LaptopEx3() → constructor runs
        ↓
l3 = new LaptopEx3() → constructor runs


Notice the constructor has:
- same name as the class: LaptopEx3
- no return type
- automatically runs with every new LaptopEx3()

 */