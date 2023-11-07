package homework_week9.programme_1_calculate;
/**
 * Write a “main” method into the main class. It has a scanner that takes
 * user input. Also write the logic that it ask user to “Enter first Number:”,
 * “Enter second Number:” “Please enter one of symbol +,-,*, /:” if user
 * enter + symbol result like “Addition of 5 and 10 is: 15” and respective for
 * other symbols.
 * 5. With the result it’s also print one more message “Would you like to do
 * more calculation Please enter “Y” or “N” :” (Hint use while loop if user
 * enter Y program asking the user to enter First Number, and if user enter
 * N programme should terminate)
 */

import java.util.Scanner;

public class Main extends Calculator {
    // Declare a main method
    public static void main(String[] args) {
        char result;
        //Scanner declaration for reading input form console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first Number");
        int a = scanner.nextInt();
        System.out.println("Enter second Number");
        int b = scanner.nextInt();
        System.out.println("Please enter one of symbol +.-,*,/:");
        char symbol = scanner.next().charAt(0);
        // Create a object and calling instance method in to main method.
        Calculator obj = new Calculator();
        obj.calculateResult(a, b, symbol);

        System.out.println("Would you like to do more calculation Please enter Y or N:");
        result = scanner.next().charAt(0);

        // while loop
        while (result == 'Y' || result == 'y')

            // closing the scanner object
            scanner.close();
    }
}
