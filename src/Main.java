import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static CountryIO countryIO = new CountryIO();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Country List Manager");
        System.out.println();
        displayMenu();

        while (true) {
            System.out.print("\nEnter menu number: ");
            int menuNumber = Integer.parseInt(scanner.nextLine());

            switch (menuNumber) {
                case 1:
                    listCountries();
                    break;
                case 2:
                    addCountry();
                    break;
                case 3:
                    System.out.println("Goodbye.");
                    return;
                default:
                    System.out.println("Invalid menu number.");
                    break;
            }
        }
    }

    private static void displayMenu() {
        System.out.println("COMMAND MENU");
        System.out.println("1 - List countries");
        System.out.println("2 - Add a country");
        System.out.println("3 - Exit");
    }

    private static void listCountries() {
        ArrayList<String> countries = countryIO.getCountries();
        for (String country : countries) {
            System.out.println(country);
        }
    }

    private static void addCountry() {
        System.out.print("\nEnter country: ");
        String country = scanner.nextLine();
        ArrayList<String> countries = countryIO.getCountries();
        countries.add(country);
        if (countryIO.saveCountries(countries)) {
            System.out.println("This country has been saved.");
        } else {
            System.out.println("Error saving the country.");
        }
    }
}
