
public class Task {
    public static void main(String[] args) {
        System.out.println(reverse("hi"));
        System.out.println(reverse("java"));
    }

    public static String reverse(String str){

        //Write your solution here
        String reversedStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversedStr += str.charAt(i);
        }
        return reversedStr;
    }

}