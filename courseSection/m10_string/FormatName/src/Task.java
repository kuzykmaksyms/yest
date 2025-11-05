
public class Task {
    public static void main(String[] args) {
        System.out.println(fixFormat("CADEN ARROYO"));
        System.out.println(fixFormat("jaX wOLF"));
    }

    public static String fixFormat(String name) {

        //Write your solution here
        name = name.toLowerCase();
        String firstName = name.substring(0, 1).toUpperCase() + name.substring(1, name.indexOf(" "));
        String lastName = name.substring(name.indexOf(" ") + 1, name.indexOf(" ") + 2).toUpperCase() + name.substring(name.indexOf(" ") + 2);
        return firstName + " " + lastName;
    }

}