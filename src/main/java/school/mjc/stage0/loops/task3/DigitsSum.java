package school.mjc.stage0.loops.task3;

public class DigitsSum {

    public static void main(String[] args) {
        DigitsSum ds = new DigitsSum();
        ds.printDigitsSum(12345); // Prints the sum of digits of the number 12345
    }

    public void printDigitsSum(int number) {
        int sum = 0;

        while (number > 0) {
            int digit = number % 10; // Get the last digit of the number
            sum += digit; // Add the digit to the sum
            number /= 10; // Remove the last digit from the number
        }

        System.out.println(sum);
    }
}