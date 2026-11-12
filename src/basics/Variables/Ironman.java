package basics.Variables;

public class Ironman {

    // 1. Instance Variable (Belongs to the object - needs 'new')
    public String suitModel = "Mark 85";

    // 2. Class Variable (Static - shared across everything, no object needed)
    public static String heroName = "Tony Stark";

    // 4. Parameter (Receives incoming values into the method)
    public static void launchMissiles(int missileCount) {
        System.out.println("Launching " + missileCount + " missiles!");
    }

    public static void main(String[] args) {

        // 3. Local Variable (Temporary, visible only inside main)
        int pincode;         // DECLARATION (Creating the empty container)
        pincode = 500085;    // INITIALIZATION (Putting content into the container)

        System.out.println("Pincode: " + pincode);

        pincode = 500095;    // REASSIGNMENT (Replacing old content with new content)
        System.out.println("Updated Pincode: " + pincode);

        // Accessing Static Variable directly
        System.out.println("Hero: " + heroName);

        // Accessing Instance Variable via Object Instantiation
        Ironman tony = new Ironman();
        System.out.println("Suit: " + tony.suitModel);

        // Calling method and passing value to Parameter
        launchMissiles(100);
    }
}