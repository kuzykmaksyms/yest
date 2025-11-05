public class Task {
    public static void main(String[] args) {

        //Write your solution here
        // 1. Оголошуємо цілочисельні (int) змінні
        int areaCode = 303;
        int localNumber = 5552345;

// 2. Об'єднуємо їх у String змінну
        String phoneNumber = "(" + areaCode + ")-" + localNumber;

// 3. Друкуємо фінальний результат
        System.out.println("Calling number " + phoneNumber);
    }
}