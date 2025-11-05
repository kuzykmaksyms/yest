
public class Task {
    public static void main(String[] args) {
        System.out.println(reverseSentence("Java is fun"));
        System.out.println(reverseSentence("Hello! How are you?"));
    }

    public static String reverseSentence(String sentence){

        //Write your solution here
        String[] words = sentence.split(" ");
        String reversed = "";

        for (int i = words.length - 1; i >= 0; i--) {
            reversed += words[i];
            if (i > 0) {
                reversed += " ";
            }
        }
        return reversed;
    }

}