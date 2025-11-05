public class Task {
    public static void main(String[] args) {

        char size  = 'S';
        char addPepperoni = 'Y';
        char extraCheese = 'Y';

        // ----Do not change below lines. needed for testing---
        size = args.length > 0 ? args[0].charAt(0) : size;
        addPepperoni = args.length > 0 ? args[1].charAt(0) : addPepperoni;
        extraCheese = args.length > 0 ? args[2].charAt(0) : extraCheese;
        //--------------------------------

        double price = 0;

        //Write your solution here
        if (size == 'S') {
            price = 13.99;
            if (addPepperoni == 'Y') {
                price += 1.50;
            }
            if (extraCheese == 'Y') {
                price += 1.25;
            }
        } else if (size == 'M') {
            price = 15.99;
            if (addPepperoni == 'Y') {
                price += 1.90;
            }
            if (extraCheese == 'Y') {
                price += 1.65;
            }
        } else if (size == 'L') {
            price = 18.79;
            if (addPepperoni == 'Y') {
                price += 2.10;
            }
            if (extraCheese == 'Y') {
                price += 2.00;
            }
        }

        System.out.println("total price: $" + price);

    }
}