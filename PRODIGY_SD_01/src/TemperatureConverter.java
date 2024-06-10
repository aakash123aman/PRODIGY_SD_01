import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for temperature and unit
        System.out.print("Enter temperature value: ");
        double temperature = scanner.nextDouble();
        System.out.print("Enter unit of measurement (C, F, or K): ");
        String unit = scanner.next().toUpperCase();

        // Convert temperature to other units
        double convertedCelsius =  0;
        double convertedFahrenheit = 0;
        double convertedKelvin = 0;

        switch (unit) {
            case "C":
                convertedCelsius = temperature;
                convertedFahrenheit = celsiusToFahrenheit(temperature);
                convertedKelvin = celsiusToKelvin(temperature);
                break;
            case "F":
                convertedFahrenheit = temperature;
                convertedCelsius = fahrenheitToCelsius(temperature);
                convertedKelvin = celsiusToKelvin(convertedCelsius);
                break;
            case "K":
                convertedKelvin = temperature;
                convertedCelsius = kelvinToCelsius(temperature);
                convertedFahrenheit = celsiusToFahrenheit(convertedCelsius);
                break;
            default:
                System.out.println("Invalid unit of measurement!");
                return;
        }

        // Display converted temperatures
        System.out.println("Temperature in Celsius: " + convertedCelsius + "°C");
        System.out.println("Temperature in Fahrenheit: " + convertedFahrenheit + "°F");
        System.out.println("Temperature in Kelvin: " + convertedKelvin + "K");

        scanner.close();
    }

    // Conversion methods
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    public static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }
}