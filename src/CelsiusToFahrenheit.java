import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double temperatureC = 0;
        double temperatureF = 0;
        boolean valid = false;
        double CELSIUS_CONVERSION_FRACTION = 1.8;

        do {
            System.out.println("Enter a temperature in Celsius to be converted to Fahrenheit.");
            if (scan.hasNextDouble()) {
               temperatureC = scan.nextDouble();
               if (temperatureC >= -273.15) {
                   valid = true;
                   temperatureF = (temperatureC * CELSIUS_CONVERSION_FRACTION) + 32;
               } else {
                   System.out.println("Entered invalid temperature value: " + temperatureC + " , Try Again");
                   System.out.println();
               }
            }
            else {
                scan.nextLine();
                System.out.println("Invalid data type, Try Again");
                System.out.println();
            }
        } while (!valid);

        System.out.printf("%-2s %-1.2f", "Celsius:", temperatureC);
        System.out.printf("\n%-2s %-1.2f", "Fahrenheit:", temperatureF);
    }
}