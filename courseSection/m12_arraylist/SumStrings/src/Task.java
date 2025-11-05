import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task {
    public static void main(String[] args) {
        System.out.println("getSum([\"123\", \"34\", \"513\"]) -> " + getSum(new ArrayList<>(Arrays.asList("123", "34", "513"))));
        System.out.println("getSum([\"4913\", \"1248\"]) -> " + getSum(new ArrayList<>(Arrays.asList("4913", "1248"))));
        System.out.println("getSum([\"00110101\", \"12452\", \"3111\"]) -> " + getSum(new ArrayList<>(Arrays.asList("00110101", "12452", "3111"))));

    }

    public static ArrayList<Integer> getSum(ArrayList<String> digits) {

        //Write your solution here
        ArrayList<Integer> sums = new ArrayList<>();

        for (String strNum : digits) {
            int currentSum = 0;
            for (int i = 0; i < strNum.length(); i++) {
                // Витягуємо символ (цифру)
                char digitChar = strNum.charAt(i);

                // Перетворюємо символ на його числове значення
                // (Або використовуємо Character.getNumericValue(digitChar)
                // або віднімаємо ASCII-код '0')
                int digit = digitChar - '0';

                currentSum += digit;
            }
            sums.add(currentSum);
        }

        return sums;
    }

}