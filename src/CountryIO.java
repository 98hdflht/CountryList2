// Quincy Yarbrough
// 7-10-2024
// Program to manage a list of countries saved to a .txt file

import java.io.*;
import java.util.ArrayList;

public class CountryIO {
// file for countries
    private static final String FILE_NAME = "countries.txt";
// retrieve countries from file
    public static ArrayList<String> getCountries() {
        ArrayList<String> countries = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String country;
            while ((country = reader.readLine()) != null) {
                countries.add(country);
            }
        } catch (FileNotFoundException e) {
            // File not found, create the file
            saveCountries(countries);
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }
        return countries;
    }
// save countries to file
    public static boolean saveCountries(ArrayList<String> countries) {
        try (PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(FILE_NAME)))) {
            for (String country : countries) {
                writer.println(country);
            }
            return true;
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
            return false;
        }
    }




}
