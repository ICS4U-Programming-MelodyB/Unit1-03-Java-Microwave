import java.util.Scanner;

/**
* This program receives the meal from the user.
* It also gets the number of items and it
* calculates how long they should heat it up.
*
* @author Melody  Berhane
* @version 1.0
*
* @since   2023-02-22
*/


public final class Microwave {


    /**
     * This is a private constructor used to satisfy the
     * style checker.
     *
     * @exception IllegalStateException Utility class.
     * @see IllegalStateException
     */
    private Microwave() {
        throw new IllegalStateException("Utility class");
    }


    /**
     * This is the main method.
     *
     * @param args Unused.
     */
    public static void main(String[] args) {
        // declare constants
        final String FOOD_ONE = "pizza";
        final String FOOD_TWO = "sub";
        final String FOOD_THREE = "soup";
        final float AVE_PIZ_TIME = 45;
        final float AVE_SUB_TIME = 60;
        final float AVE_SOUP_TIME = 105;
        final float HALF_TIME = 1f / 2f;
        final String ERROR_MESSAGE = "Sorry but you can "
            + "only select 0,1,2 or 3";

        // initialize number of food items
        String numOfItems = "";
        int numOfItemsInt = 0;
        float time = 0f;
        String userFood = "";

        // Create a new scanner constant
        final Scanner scanner = new Scanner(System.in);

        // Gets food type from user
        System.out.println("Are you heating sub, pizza, or soup?: ");
        userFood = scanner.nextLine();

        if (userFood.equals(FOOD_ONE)) {
            // Gets number of food being heated
            System.out.println("How many pizza(s) are you cooking?(max:3): ");
            numOfItems = scanner.nextLine();

            // Detects string input.
            try {
                // Convert string to integer
                numOfItemsInt = Integer.parseInt(numOfItems);

                if (numOfItemsInt == 0) {
                    // Calculates time
                    time = 0;
                    System.out.println("The total cook time is: " + time + "s");
                } else if (numOfItemsInt == 1) {
                    // Calculates time
                    time = AVE_PIZ_TIME;
                    System.out.println("The total cook time is: " + time + "s");
                } else if (numOfItemsInt == 2) {
                    // Calculates time
                    time = (AVE_PIZ_TIME * HALF_TIME) + AVE_PIZ_TIME;
                    System.out.println("The total cook time is: " + time + "s");
                } else if (numOfItemsInt == 3) {
                    // Calculates time
                    time = AVE_PIZ_TIME + AVE_PIZ_TIME;
                    System.out.println("The total cook time is: " + time + "s");
                } else {
                    System.out.println(ERROR_MESSAGE);
                }
            } catch (NumberFormatException error) {
                // Displays error to user.
                System.out.print("Please enter valid input."
                    + error.getMessage());
            }
        } else if (userFood.equals(FOOD_TWO)) {
            // Gets number of food being heated
            System.out.println("How many sub(s) are you cooking?(max:3): ");
            numOfItems = scanner.nextLine();

            // Detects string input.
            try {
                // Convert string to Integer
                numOfItemsInt = Integer.parseInt(numOfItems);

                if (numOfItemsInt == 0) {
                    // Calculates time
                    time = 0;
                    System.out.println("The total cook time is: " + time + "s");
                } else if (numOfItemsInt == 1) {
                    // Calculates Time
                    time = AVE_SUB_TIME;
                    System.out.println("The total cook time is: " + time + "s");
                } else if (numOfItemsInt == 2) {
                    // Calculates Time
                    time = (AVE_SUB_TIME * HALF_TIME) + AVE_SUB_TIME;
                    System.out.println("The total cook time is: " + time + "s");
                } else if (numOfItemsInt == 3) {
                    // Calculates Time
                    time = AVE_SUB_TIME + AVE_SUB_TIME;
                    System.out.println("The total cook time is: " + time + "s");
                } else {
                    System.out.println(ERROR_MESSAGE);
                }
            } catch (NumberFormatException error) {
                // Displays error to user.
                System.out.print("Please enter valid input."
                    + error.getMessage());
            }
        } else if (userFood.equals(FOOD_THREE)) {
            // Gets number of food being heated
            System.out.println("How many soup(s) are you cooking?(max:3): ");
            numOfItems = scanner.nextLine();

            // Detects string input.
            try {
                // Convert string to Integer
                numOfItemsInt = Integer.parseInt(numOfItems);

                if (numOfItemsInt == 0) {
                    // Calculates Time
                    time = 0;
                    System.out.println("The total cook time is: " + time + "s");
                } else if (numOfItemsInt == 1) {
                    // Calculates Time
                    time = AVE_SOUP_TIME;
                    System.out.println("The total cook time is: " + time + "s");
                } else if (numOfItemsInt == 2) {
                    // Calculates Time
                    time = (AVE_SOUP_TIME * HALF_TIME) + AVE_SOUP_TIME;
                    System.out.println("The total cook time is: " + time + "s");
                } else if (numOfItemsInt == 3) {
                    // Calculates Time
                    time = AVE_SOUP_TIME + AVE_SOUP_TIME;
                    System.out.println("The total cook time is: " + time + "s");
                } else {
                    System.out.println(ERROR_MESSAGE);
                }
            } catch (NumberFormatException error) {
                // Displays error to user.
                System.out.print("Please enter valid input."
                    + error.getMessage());
            }
        } else {
            System.out.println("Sorry but '" + userFood
                + "' is not one of the options.");
        }
        // Closes scanner
        scanner.close();
    }
}
