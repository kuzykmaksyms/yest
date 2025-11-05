public class Task {
    public static void main(String[] args) {

        // Write your solution here
        // 1. Оголошення та ініціалізація змінних
        String city1 = "Chicago";
        String city2 = "San Fransisco"; // Використовуємо написання "Fransisco" з помилкою, як у прикладі
        double oneWayFare = 643.5;

// 2. Оголошення 'DOLLAR' через його десятковий Unicode (36)
        char DOLLAR = 36;

// 3. Конкатенація та друк
        System.out.println("From " + city1 + " to " + city2 + " one way cost is " + DOLLAR + oneWayFare);
    }
}