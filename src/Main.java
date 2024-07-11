// Quincy Yarbrough
// 7-10-2024
// Program to manage a list of countries saved to a .txt file

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // set the array list to the countries already populated from file
        ArrayList<String> countries = CountryIO.getCountries();

        int choice;
        // the command menu choices
        System.out.println("Country List Manager");
        do {
            UI.displayMenu();
            choice = Console.getInt("Enter menu number: ");
            switch (choice) {
                case 1:
                    UI.listCountries(countries);
                    break;
                case 2:
                    UI.addCountry(countries);
                    break;
                case 3:
                    UI.deleteCountry(countries);
                    break;
                case 4:
                    System.out.println("Goodbye.");
                    break;
                default:
                    System.out.println("Error! Invalid selection please enter 1, 2, 3, or 4. Try again.");
            }
        } while (choice != 4);
    }
}
