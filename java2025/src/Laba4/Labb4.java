package lab4;
import java.util.Scanner;

public class Labb4 {
    public static int calculateDifference(int[] array) {
        if (array == null) {
            throw new NullPointerException("Масив не може бути null");
        }
        if (array.length < 2) {
            throw new IllegalArgumentException(
                    "Масив повинен містити принаймні 2 елементи, а має лише " + array.length
            );
        }
        int max = array[0];
        for (int element : array) {
            if (element > max) {
                max = element;
            }
        }
        int secondElement = array[1];

        return max - secondElement;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Введіть розмір масиву (мінімум 2): ");
            int size = scanner.nextInt();

            if (size < 2) {
                System.out.println("Помилка: Розмір масиву має бути не менше 2!");
                return;
            }

            int[] array = new int[size];

            System.out.println("Введіть " + size + " елементів масиву:");
            for (int i = 0; i < size; i++) {
                System.out.print("Елемент " + (i + 1) + ": ");
                array[i] = scanner.nextInt();
            }

            System.out.println("\nВведений масив: " + arrayToString(array));

            int difference = calculateDifference(array);

            int max = array[0];
            for (int element : array) {
                if (element > max) {
                    max = element;
                }
            }

            System.out.println("Максимальний елемент: " + max);
            System.out.println("Другий елемент (індекс 1): " + array[1]);
            System.out.println("Різниця: " + difference);

        } catch (IllegalArgumentException | NullPointerException e) {
            System.out.println("Помилка: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Помилка введення: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    private static String arrayToString(int[] array) {
        if (array == null) return "null";
        if (array.length == 0) return "[]";

        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
            if (i < array.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}