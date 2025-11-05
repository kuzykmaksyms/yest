import java.util.Arrays;

public class Task {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(mergeArray(new int[]{1, 2, 3}, new int[]{4, 5})));
        System.out.println(Arrays.toString(mergeArray(new int[]{5, 25, 1}, new int[]{0, 3, 6})));
        System.out.println(Arrays.toString(mergeArray(new int[]{8}, new int[]{4, 10, 9, 2})));
    }

    public static int[] mergeArray(int[] nums1, int[] nums2){

        //Write your solution here
        int totalLength = nums1.length + nums2.length;
        int[] mergedArray = new int[totalLength];
        int maxLen = Math.max(nums1.length, nums2.length);
        int index = 0;

        for (int i = 0; i < maxLen; i++) {
            if (i < nums1.length) {
                mergedArray[index] = nums1[i];
                index++;
            }
            if (i < nums2.length) {
                mergedArray[index] = nums2[i];
                index++;
            }
        }

        return mergedArray;
    }

}