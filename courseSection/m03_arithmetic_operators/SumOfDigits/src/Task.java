public class Task {
    public static void main(String[] args) {
        int number = 123;

        // ----Do not change below lines. needed for testing---
        number = args.length > 0 ? Integer.parseInt(args[0]) : number;
        // ----------------------------------------------

        //Write your solution here
        int digit1 = number / 100;
        int digit2 = (number / 10) % 10;
        int digit3 = number % 10;

        int sum = digit1 + digit2 + digit3;

        System.out.println("Sum of the digits: " + sum);
    }
}