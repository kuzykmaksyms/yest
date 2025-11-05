public class Task {
    public static void main(String[] args) {

        String version = "1.5";

        // ----Do not change below lines. needed for testing---
        version = args.length > 0 ? args[0] : version;
        //--------------------------------

        //Write your solution here
        switch (version) {
            case "1.5":
                System.out.println("Cupcake");
                break;
            case "1.6":
                System.out.println("Donut");
                break;
            case "2.1":
                System.out.println("Eclair");
                break;
            case "2.2":
                System.out.println("Froyo");
                break;
            case "2.3":
                System.out.println("Gingerbread");
                break;
            case "3.1":
                System.out.println("Honeycomb");
                break;
            case "4.0":
                System.out.println("Ice Cream Sandwich");
                break;
            case "4.1":
                System.out.println("Jelly Bean");
                break;
            case "4.4":
                System.out.println("KitKat");
                break;
            case "5.0":
                System.out.println("Lollipop");
                break;
            case "8.0":
                System.out.println("Oreo");
                break;
            case "9.0":
                System.out.println("Pie");
                break;
            default:
                System.out.println("Not a valid version");
                break;
        }
    }
}