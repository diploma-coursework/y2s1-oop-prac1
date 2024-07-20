import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        // get 8-digit input
        System.out.print("Enter an 8-digit number: ");
        final String strDigits = scanner.nextLine();

        // first step
        int firstStepSum = 0;
        for (int i = 1; i < 8; i += 2) {
                firstStepSum += Character.getNumericValue(strDigits.charAt(i));
        }

        // second step
        int secondStepSum = 0;
        for (int i = 0; i < 7; i += 2) {
            int doubledCurrentDigit = Character.getNumericValue(strDigits.charAt(i)) * 2;
            secondStepSum += doubledCurrentDigit / 10 + doubledCurrentDigit % 10;
        }

        // sum 2 steps to get check digit
        final int checkDigit = firstStepSum + secondStepSum;

        // display result
        if (checkDigit % 10 == 0) System.out.println("The number is valid.");
        else System.out.println("The number is invalid.");
    }
}
