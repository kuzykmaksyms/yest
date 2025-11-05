public class Task {
    public static void main(String[] args) {

        int inhabitants = 6;

        // ----Do not change below lines. needed for testing---
        inhabitants = args.length > 0 ? Integer.parseInt(args[0]) : inhabitants;
        //--------------------------------

        //Write your solution here
        int day = 0;
        while (inhabitants > 0) {
            System.out.println("Day " + day + " [" + inhabitants + "]");
            inhabitants = inhabitants / 2;
            day++;
        }
        System.out.println("---- EXTINCT ----");
    }
}