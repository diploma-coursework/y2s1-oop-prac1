import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name: ");
        final String name = scanner.nextLine();

        System.out.print("\nHow many subjects you have in this semester: ");
        final int numOfSubjects = scanner.nextInt();
        scanner.nextLine();

        System.out.print("\nWhat is the programme that you're currently studying? ");
        final String programmeName = scanner.nextLine();

        System.out.printf("\nWelcome %s from %s!", name, programmeName);
        System.out.printf("\nGood Luck in all %d courses you have in this semester!\n", numOfSubjects);
    }
}