
public class Task {
    public static void main(String[] args) {
        System.out.println(uniqueChars("java"));
        System.out.println(uniqueChars("mama"));
    }

    public static String uniqueChars(String str) {

        String unique = "";

        //Write your solution here
        for (int i = 0; i < str.length(); i++) {
            char eachChar = str.charAt(i);
            if (!unique.contains("" + eachChar)) {
                unique += eachChar;
            }
        }
        return unique;
    }

}