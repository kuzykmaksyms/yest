public class Task {
    public static void main(String[] args) {

        System.out.println(waterTax(55));

    }

    public static double waterTax(int units){

        //Write your solution here
        if (units > 150) {
            return (units * 0.90) + 100;
        } else if (units > 100) {
            return (units * 0.90) + 50;
        } else if (units > 50) {
            return units * 0.90;
        } else {
            return units * 0.60;
        }
    }


}