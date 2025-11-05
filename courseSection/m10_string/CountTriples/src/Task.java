
public class Task {
    public static void main(String[] args) {
        System.out.println(countTriples("abcXXXabc"));
        System.out.println(countTriples("xxxabyyyycd"));
        System.out.println(countTriples("java"));
    }

    public static int countTriples(String str){

        int tripleCount = 0;

        //Write your solution here
        for (int i = 0; i < str.length() - 2; i++) {
            char c = str.charAt(i);
            if (c == str.charAt(i + 1) && c == str.charAt(i + 2)) {
                tripleCount++;
            }
        }
        return tripleCount;
    }
}