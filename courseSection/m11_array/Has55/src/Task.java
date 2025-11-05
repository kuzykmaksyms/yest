
public class Task {
    public static void main(String[] args) {
        System.out.println(has55(new int[]{1, 5, 5, 1, 1}));

    }

    public static boolean has55(int[] nums) {

        //Write your solution here
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 5 && nums[i + 1] == 5) {
                return true;
            }
        }
        return false;
    }
}