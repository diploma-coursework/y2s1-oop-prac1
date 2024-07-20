import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the distance (kilometers): ");
         final int kilometers = scanner.nextInt();
         final int meters = kilometers * 1000;
         final int centimeters = meters * 100;
         final int millimeters = centimeters * 10;

         System.out.printf("Distance in kilometers: %d kilometers\n", kilometers);
         System.out.printf("Distance in meters: %d meters\n", meters);
         System.out.printf("Distance in centimeters: %d centimeters\n", centimeters);
         System.out.printf("Distance in millimeters: %d millimeters\n", millimeters);
    }
}
