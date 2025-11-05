
public class Task {
    public static void main(String[] args) {
        System.out.println(countLetters("aaabbcccc"));
        System.out.println(countLetters("appleeess"));
    }

    public static String countLetters(String str){

        String result = "";
        //Write your solution here
        for (int i = 0; i < str.length(); i++) {
            char eachChar = str.charAt(i);

            if (result.contains("" + eachChar)) {
                continue;
            }

            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == eachChar) {
                    count++;
                }
            }
            result += "" + count + eachChar;
        }
        return result;
    }
}