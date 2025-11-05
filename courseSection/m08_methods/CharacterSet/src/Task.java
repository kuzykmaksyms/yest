public class Task {
    public static void main(String[] args) {

        System.out.println(getCharacterSet('7', 'P'));
        System.out.println(getCharacterSet("uppercase"));

    }

    public static String getCharacterSet(char start, char end){

        //Write your solution here
        String result = "";
        for (char c = start; c <= end; c++) {
            result += c;
        }
        return result;
    }

    public static String getCharacterSet(String group){

        //Write your solution here
        switch (group) {
            case "uppercase":
                return "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
            case "lowercase":
                return "abcdefghijklmnopqrstuvwxyz";
            case "digit":
                return "0123456789";
            case "special":
                return "!\"#$%&'()*+,-.";
            default:
                return "Invalid group";
        }
    }

}