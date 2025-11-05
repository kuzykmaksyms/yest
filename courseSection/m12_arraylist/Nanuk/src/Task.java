import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task {
    public static void main(String[] args) {
        System.out.println("nanuk([\"1\",\"2\",\"3\",\"5\"],0,5) -> " + hunt(new ArrayList<>(Arrays.asList("1","2","3","5")), 0, 5));
        System.out.println("nanuk([\"1\",\"nanuk\",\"3\",\"5\"],0,5) -> " + hunt(new ArrayList<>(Arrays.asList("1","nanuk","3","5")), 0, 5));
        System.out.println("nanuk([\"1\",\"3\"],0,5) -> " + hunt(new ArrayList<>(Arrays.asList("1","3")), 0, 5));
        System.out.println("nanuk([\"1\",\"10\",\"3\",\"nanuk\"],2,7) -> " + hunt(new ArrayList<>(Arrays.asList("1","10","3","nanuk")), 2, 7));
        System.out.println("nanuk([\"1\",\"10\",\"3\",\"nanuk\",\"nanuk\"],2,7) -> " + hunt(new ArrayList<>(Arrays.asList("1","10","3","nanuk","nanuk")), 2, 7));
        System.out.println("nanuk([\"1\",\"10\",\"3\",\"nanuk\",\"nanuk\",\"nanuk\"],2,7) -> " + hunt(new ArrayList<>(Arrays.asList("1","10","3","nanuk","nanuk","nanuk")), 2, 7));

    }

    public static boolean hunt(ArrayList<String> result, int wayStones, int boast) {

        //Write your solution here
        int totalCatches = 0;
        int nanukCount = 0;

        for (String item : result) {
            if (item.equals("nanuk")) {
                nanukCount++;
            } else {
                try {
                    totalCatches += Integer.parseInt(item);
                } catch (NumberFormatException e) {
                    // Ігноруємо елементи, які не є числом або "nanuk"
                }
            }
        }

// 1. Успішна умова 1: Перевірка на зіткнення з nanuk без wayStone
// Кожен wayStone може уникнути одного nanuk.
        if (nanukCount > wayStones) {
            return false; // Зустріли забагато nanuk, wayStones не вистачило
        }

// 2. Успішна умова 2: Перевірка на boast (здобич >= boast)
        if (totalCatches >= boast) {
            return true; // wayStones вистачило, і здобич більша за boast
        } else {
            return false; // wayStones вистачило, але здобичі менше за boast
        }
    }

}