package basics.conditions;

public class NestedIfStatement {
    public static void main(String[] args) {

        String examStatus = "Pass";
        String round1Status = "Pass";
        String round2Status = "Pass";

        if (examStatus.equals("Pass")) {
            System.out.println("Exam cleared");

            if (round1Status.equals("Pass")) {
                System.out.println("Round 1 cleared");

                if (round2Status.equals("Pass")) {
                    System.out.println("Round 2 cleared. Go for HR round");
                } else {
                    System.out.println("Failed in Round 2");
                }

            } else {
                System.out.println("Failed in Round 1");
            }

        } else {
            System.out.println("Failed in Exam");
        }
    }
}