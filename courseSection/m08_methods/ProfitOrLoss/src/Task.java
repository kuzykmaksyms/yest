public class Task {
    public static void main(String[] args) {

        System.out.println(profit(1, 10));

    }

    public static String profit(int buyPrice, int sellPrice){

        //Write your solution here
        if (sellPrice > buyPrice) {
            return "profit";
        } else if (sellPrice < buyPrice) {
            return "loss";
        } else {
            return "no loss";
        }
    }

}