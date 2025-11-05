public class Task {

    public static void main(String[] args) {
        // Виклики з умови (вже були у вашому main)
        System.out.println(isPalindrome("racecar"));
        System.out.println(isPalindrome("anna"));
        System.out.println(isPalindrome(1001));
    }

    // 1. Метод для String
    public static boolean isPalindrome(String str) {
        String reversedStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversedStr += str.charAt(i);
        }

        return str.equals(reversedStr);
    }

    // 2. Метод для int
    public static boolean isPalindrome(int num) {
        if (num < 0) {
            return false; // Від’ємні числа не паліндроми
        }

        int reversed = 0;
        int original = num; // Зберігаємо оригінальне число для порівняння

        while (num > 0) {
            int lastDigit = num % 10;
            reversed = (reversed * 10) + lastDigit;
            num /= 10;
        }

        return original == reversed;
    }
}