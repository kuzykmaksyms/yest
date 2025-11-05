import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task {
    public static void main(String[] args) {
        ArrayList<Double> list = new ArrayList<>(List.of(300000.0, 200000.0, 250000.0, 250000.0));
        System.out.println(calculateSales(list));

        list = new ArrayList<>(List.of(300000.0, 200000.0, 250000.0, 1000000.0, 15000000.0));
        System.out.println(calculateSales(list));

        list = new ArrayList<>(List.of(3000000.0, 5000.0, 250000.0, 1000000.0, 3500000.0));
        System.out.println(calculateSales(list));

    }

    public static boolean calculateSales(ArrayList<Double> sales) {

        //Write your solution here
        double totalSales = 0;

// Перевіряємо індивідуальну мету і рахуємо загальну суму
        for (double sale : sales) {
            if (sale < 30000.0) {
                return false; // Умова 2 не виконана: філія заробила менше 30,000
            }
            totalSales += sale;
        }

// Перевіряємо загальну мету
        if (totalSales >= 5000000.0) {
            return true;
        } else {
            return false; // Умова 1 не виконана: загальна сума менша за 5,000,000
        }
    }

}