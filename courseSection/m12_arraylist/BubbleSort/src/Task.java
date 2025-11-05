import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task {
    public static void main(String[] args) {
        System.out.println(sort(new ArrayList<>(List.of(2, 1, 2, 4, 3))));
        System.out.println(sort(new ArrayList<>(List.of(5, 25, 6, 2, -5, 37, -3))));
    }

    public static ArrayList<Integer> sort(ArrayList<Integer> nums) {

        //Write your solution here
        int n = nums.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                // Порівнюємо сусідні елементи
                if (nums.get(j) > nums.get(j + 1)) {
                    // Міняємо місцями (swap)
                    int temp = nums.get(j);
                    nums.set(j, nums.get(j + 1));
                    nums.set(j + 1, temp);
                }
            }
        }
        return nums;
    }

}