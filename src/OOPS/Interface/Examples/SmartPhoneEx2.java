package OOPS.Interface.Examples;

public class SmartPhoneEx2 implements CameraEx2, MusicPlayerEx2 {

    @Override
    public void takePhoto() {
        System.out.println("Photo taken");
    }

    @Override
    public void playMusic() {
        System.out.println("Music is playing");
    }
    public static void main(String[] args) {
        SmartPhoneEx2 s = new SmartPhoneEx2();

        s.playMusic();
        s.takePhoto();
    }
}
