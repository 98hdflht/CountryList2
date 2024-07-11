// Quincy Yarbrough
// 7-10-2024
// Program to manage a list of countries saved to a .txt file

import java.util.Scanner;

public class Console {
    private static Scanner sc = new Scanner(System.in);
// retrieve user input
    public static String getString(String prompt) {
        System.out.print(prompt);
        return sc.nextLine();
    }
// validate user choice is a number
    public static int getInt(String prompt) {
        int value = 0;
        boolean isValid = false;
        while (!isValid) {
            System.out.print(prompt);
            if (sc.hasNextInt()) {
                value = sc.nextInt();
                isValid = true;
            } else {
                System.out.println("Error! Invalid selection please enter 1, 2, 3, or 4. Try again.");
            }
            sc.nextLine(); // discard any other data entered on the line
        }
        return value;
    }


}
