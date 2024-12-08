import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args){
                Scanner scanner = new Scanner(System.in);

                // Display options to the user
                System.out.println("Here is a Temperature Converter");
                System.out.println("Select option");
                System.out.println("1. Converting from Celsius to Fahrenheit");
                System.out.println("2. Converting from Fahrenheit to Celsius");

                // Validate user choice
                int choice = 0;
                while (true) {
                    System.out.print("Enter your choice (1 or 2): ");
                    if (scanner.hasNextInt()) {
                        choice = scanner.nextInt();
                        if (choice == 1 || choice == 2) {
                            break; //Accepted choice
                        } else {
                            System.out.println("Invalid input. Please enter 1 or 2.");
                        }
                    } else {
                        System.out.println("Invalid input. Please enter a number.");
                        scanner.next(); // Unacceptable input
                    }
                }

                // Get temperature value from the user
                double temperature = 0;
                while (true) {
                    System.out.print("Enter the temperature value: ");
                    if (scanner.hasNextDouble()) {
                        temperature = scanner.nextDouble();
                        break; // Valid temperature
                    } else {
                        System.out.println("Invalid input. Please enter a numeric value.");
                        scanner.next(); // Clear invalid input
                    }
                }

                // Converting User's choice
                if (choice == 1) {
                    // Converting from Celsius to Fahrenheit
                    double fahrenheit = (temperature * 9 / 5) + 32;
                    System.out.printf("%.2f Celsius is %.2f Fahrenheit.%n", temperature, fahrenheit);
                } else if (choice == 2) {
                    // Converting from Fahrenheit to Celsius
                    double celsius = (temperature - 32) * 5 / 9;
                    System.out.printf("%.2f Fahrenheit is %.2f Celsius.%n", temperature, celsius);
                }

                // Close the scanner
                scanner.close();
            }

}
