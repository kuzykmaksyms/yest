public class Task {
    public static void main(String[] args) {

        //Write your solution here
        // 1. Оголошення та ініціалізація змінних
        String firstName = "John";
        String lastName = "Smith";
        String company = "amazon"; // Використовуємо 'amazon' в нижньому регістрі, як у прикладі

// 2. Створення email-адреси
        String email = firstName + "." + lastName + "@" + company + ".com";

// 3. Друк результату
        System.out.println("email = " + email);
    }
}