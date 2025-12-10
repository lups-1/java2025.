package Laba4;
import java.util.Scanner;

public class Lab4 {
    public static void main(String[] args) {

        System.out.println("=== Task12 ===");
        Task12.runTest();

        System.out.println("\n=== Task42 ===");
        Task42.runTest();

        System.out.println("\n=== Task65 ===");
        Task65.runTest();
    }
}

// ==================== Task 12 ====================
class Task12 {

    public static int maxAbs(int[] arr) {
        if (arr == null) throw new NullPointerException();
        if (arr.length == 0) throw new IllegalArgumentException();

        int max = Math.abs(arr[0]);
        for (int x : arr) {
            if (Math.abs(x) > max) {
                max = Math.abs(x);
            }
        }
        return max;
    }

    public static void runTest() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введіть елементи масиву через пробіл (Task12):");
        String line = sc.nextLine();

        String[] parts = line.trim().split(" ");
        int[] arr = new int[parts.length];

        for (int i = 0; i < parts.length; i++)
            arr[i] = Integer.parseInt(parts[i]);

        System.out.println("Максимальний за модулем елемент: " + maxAbs(arr));
    }
}

// ==================== Task 42 ====================
class Task42 {

    public static double avgIndex3(int[] arr) {
        if (arr == null) throw new NullPointerException();
        if (arr.length == 0) throw new IllegalArgumentException();

        int sum = 0;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i % 3 == 0) {
                sum += arr[i];
                count++;
            }
        }

        return (double) sum / count;
    }

    public static void runTest() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введіть елементи масиву через пробіл (Task42):");
        String line = sc.nextLine();

        String[] parts = line.trim().split(" ");
        int[] arr = new int[parts.length];

        for (int i = 0; i < parts.length; i++)
            arr[i] = Integer.parseInt(parts[i]);

        System.out.println("Середнє арифметичне елементів з індексами кратними 3: " + avgIndex3(arr));
    }
}

// ==================== Task 65 ====================
class Task65 {

    public static int[] reverse(int[] arr) {
        if (arr == null) throw new NullPointerException();

        int[] r = new int[arr.length];
        int i = 0;

        for (int x : arr) { // for-each — вимога
            r[arr.length - 1 - i] = x;
            i++;
        }
        return r;
    }

    public static void runTest() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введіть елементи масиву через пробіл (Task65):");
        String line = sc.nextLine();

        String[] parts = line.trim().split(" ");
        int[] arr = new int[parts.length];

        for (int i = 0; i < parts.length; i++)
            arr[i] = Integer.parseInt(parts[i]);

        int[] r = reverse(arr);

        System.out.print("Новий масив у зворотному порядку: ");
        for (int x : r) System.out.print(x + " ");
        System.out.println();
    }
}
