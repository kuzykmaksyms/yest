public class Task {
    public static void main(String[] args) {

        int n = 5;

        // ----Do not change below lines. needed for testing---
        n = args.length > 0 ? Integer.parseInt(args[0]) : n;
        //--------------------------------

        //Write your solution here
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        System.out.println(factorial);
    }
}