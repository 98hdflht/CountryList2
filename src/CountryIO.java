import java.io.*;
import java.util.ArrayList;
//import java.util.List;

public class CountryIO {
    private static final String FILE_NAME = "countries.txt";

    // Get the list of countries from the file
    public ArrayList<String> getCountries() {
        ArrayList<String> countries = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                countries.add(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println(FILE_NAME + " not found. Creating a new file.");
            saveCountries(countries);
        } catch (IOException e) {
            System.out.println("Error reading from " + FILE_NAME);
            e.printStackTrace();
        }
        return countries;
    }

    // Save the list of countries to the file
    public boolean saveCountries(ArrayList<String> countries) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (String country : countries) {
                writer.write(country);
                writer.newLine();
            }
            return true;
        } catch (IOException e) {
            System.out.println("Error writing to " + FILE_NAME);
            e.printStackTrace();
            return false;
        }
    }
}
