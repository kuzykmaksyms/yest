public class Task {
    public static void main(String[] args) {

        int coins = 467;
        // ----Do not change below lines. needed for testing---
        coins = args.length > 0 ? Integer.parseInt(args[0]) : coins;
        // -------------------------------------

        System.out.println("coins = " + coins);

        //Add your solution here
        int dollars = coins / 100;
        int remainder = coins % 100;

        int quarters = remainder / 25;
        remainder = remainder % 25;

        int dimes = remainder / 10;
        remainder = remainder % 10;

        int nickels = remainder / 5;
        int cents = remainder % 5;

        System.out.println("dollars = " + dollars);
        System.out.println("quarters = " + quarters);
        System.out.println("dimes = " + dimes);
        System.out.println("nickels = " + nickels);
        System.out.println("cents = " + cents);    }
}