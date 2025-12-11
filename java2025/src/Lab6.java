public class Lab6 {

    // ========================= ЗАВДАННЯ 6 =========================
    public static int octStringToInt(String s) {
        if (s == null)
            throw new NullPointerException("String is null");

        if (!s.matches("[0-7]+"))
            throw new IllegalArgumentException("Invalid octal string");

        return Integer.parseInt(s, 8);
    }

    // ========================= ЗАВДАННЯ 8 =========================
    public static int countNumbers(String sentence) {
        if (sentence == null)
            throw new NullPointerException("Sentence is null");

        String[] parts = sentence.split("\s+");
        int count = 0;

        for (String p : parts) {
            if (p.matches("\d+")) count++;
        }
        return count;
    }

    // ========================= MAIN =========================
    public static void main(String[] args) {

        System.out.println("===== Завдання 6 — octStringToInt =====");
        System.out.println(octStringToInt("777"));  // 511
        System.out.println(octStringToInt("10"));   // 8

        try {
            System.out.println(octStringToInt("89")); // помилка
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

        System.out.println("\n===== Завдання 8 — countNumbers =====");
        String text = "The user wrote 3 comments and 12 messages 4 months ago";
        System.out.println(countNumbers(text)); // 3
        System.out.println(countNumbers("1 22 abc 333")); // 3
        System.out.println(countNumbers("No numbers here")); // 0

        try {
            System.out.println(countNumbers(null)); // помилка
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}
