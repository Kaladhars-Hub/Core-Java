package OOPS.Polymorphism.Examples;

public class CatEx1 extends AnimalEx1 {

        @Override
        void sound() {
            System.out.println("Cat meows");
        }
        public static void main(String[] args) {
            AnimalEx1 a = new CatEx1();
            a.sound();

            a = new DogEx1();
            a.sound();
        }
    }
