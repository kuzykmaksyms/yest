import java.util.Arrays;

public class Task {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(shortestWords("olive, fish, pursuit, old, warning, python, java, coffee, cat, ray")));
        System.out.println(Arrays.toString(shortestWords("spare, decrease, morning, article, chaos, orbit, acceptance, lodge, tournament, trade")));
    }

    public static String[] shortestWords(String str){

        //Write your solution here
        String[] words = str.split("[ ,]+");
        int minLength = words[0].length();
        int count = 0;

// 1. Знаходимо мінімальну довжину слова
        for (String word : words) {
            if (word.length() < minLength) {
                minLength = word.length();
            }
        }

// 2. Підраховуємо, скільки слів мають цю мінімальну довжину
        for (String word : words) {
            if (word.length() == minLength) {
                count++;
            }
        }

// 3. Створюємо новий масив і заповнюємо його
        String[] shortest = new String[count];
        int index = 0;
        for (String word : words) {
            if (word.length() == minLength) {
                shortest[index] = word;
                index++;
            }
        }

        return shortest;
    }

}