package school.mjc.stage0.loops.task3;

public class DigitsSum {

    public void printDigitsSum(int number) {
        // Convert the number to a string
        String numStr = Integer.toString(number);

        // Initialize a variable to store the sum
        int sum = 0;

        // Iterate through the characters of the string
        for (int i = 0; i < numStr.length(); i++) {
            // Get the character at the current position
            char digitChar = numStr.charAt(i);

            // Convert the character to an integer by subtracting '0'
            int digit = digitChar - '0';

            // Add the digit to the sum
            sum += digit;
        }

        // Print the sum
        System.out.println(sum);
    }
}