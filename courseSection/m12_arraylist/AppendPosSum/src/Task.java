import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(List.of(4,-6,3,-8,0,4,3));
        System.out.println(appendPosSum(list));
    }

    public static ArrayList<Integer> appendPosSum(ArrayList<Integer> list) {

        ArrayList<Integer> result = new ArrayList<>();
        int sum = 0;

        // Iterate over the original list to filter positive numbers and calculate their sum
        for (int num : list) {
            if (num > 0) {
                result.add(num);
                sum += num;
            }
        }

        // Append the sum of positive numbers at the end of the list
        result.add(sum);
        return result;

    }

}