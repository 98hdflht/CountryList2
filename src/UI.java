// Quincy Yarbrough
// 7-10-2024
// Program to manage a list of countries saved to a .txt file

import java.util.ArrayList;
import java.util.Collections;

public class UI {
// display menu
    public static void displayMenu() {
        System.out.println("COMMAND MENU");
        System.out.println("1 - List countries");
        System.out.println("2 - Add a country");
        System.out.println("3 - Remove a country");
        System.out.println("4 - Exit");
    }
// show the countries in the list
    public static void listCountries(ArrayList<String> countries) {
        if (countries.isEmpty()) {
            System.out.println("No countries in the list.");
        } else {
            Collections.sort(countries);
            for (String country : countries) {
                System.out.println(country);
            }
        }
    }
// add a country to the list
    public static void addCountry(ArrayList<String> countries) {
        String country = Console.getString("Enter country to add: ");
        if (countries.contains(country)) {
            System.out.println("This country is already in the list.");
        } else {
            countries.add(country);
            if (CountryIO.saveCountries(countries)) {
                System.out.println("This country has been saved.");
            } else {
                System.out.println("Error saving the country.");
            }
        }
    }
// delete country from the list
    public static void deleteCountry(ArrayList<String> countries) {
        String country = Console.getString("Enter country to remove: ");
        countries.remove(country);
        if (CountryIO.saveCountries(countries)) {
            System.out.println("This country has been removed.");
        } else {
            System.out.println("Error removing the country.");
        }
    }

}
