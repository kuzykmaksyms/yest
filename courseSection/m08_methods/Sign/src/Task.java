public class Task {
    public static void main(String[] args) {

        sign(5);

    }

    public static void sign(int n){
        //Write your solution here
        if (n > 0) {
            System.out.println("positive");
        } else if (n < 0) {
            System.out.println("negative");
        } else {
            System.out.println("zero");
        }
    }

}