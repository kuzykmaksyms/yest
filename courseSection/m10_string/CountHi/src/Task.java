
public class Task {
    public static void main(String[] args) {
        System.out.println(countHi("abc hi how"));
        System.out.println(countHi("hihi bye"));
    }

    public static int countHi(String str) {

        //Write your solution here
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.substring(i, i + 2).equals("hi")) {
                count++;
            }
        }
        return count;
    }

}