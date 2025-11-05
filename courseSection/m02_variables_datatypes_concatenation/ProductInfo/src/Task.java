public class Task {
    public static void main(String[] args) {

        //Write your solution here
        // 1. Оголошення та ініціалізація змінних
        String name = "Blink Video Doorbell";
        double price = 129.98;
        int numberOfReviews = 115116;
        float rating = 4.3f; // Суфікс 'f' обов'язковий для float
        boolean onSale = true;

// 2. Друк у потрібному форматі
        System.out.println("---- PRODUCT INFORMATION ----");
        System.out.println(name);
        System.out.println("$" + price);
        System.out.println(numberOfReviews + " ratings");
        System.out.println(rating + " * * * * *"); // Додаємо 5 зірок, як у прикладі
        System.out.println("onSale = " + onSale);
    }
}