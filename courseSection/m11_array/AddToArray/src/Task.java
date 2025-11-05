import java.util.Arrays;

public class Task {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(addToArray(new int[]{2, 1, 2, 3, 4}, 10)));
        System.out.println(Arrays.toString(addToArray(new int[]{1, 3, 5, 7, 9}, 21)));
    }

    public static int[] addToArray(int[] nums, int newElement) {

        //Write your solution here
        int[] newArray = new int[nums.length + 1];

        for (int i = 0; i < nums.length; i++) {
            newArray[i] = nums[i];
        }

        newArray[newArray.length - 1] = newElement;

        return newArray;
    }

}