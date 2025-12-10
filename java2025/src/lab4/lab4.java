package lab4;

import java.util.ArrayList;
import java.util.Arrays;

public class lab4 {
    public static void main(String[] args) {

        int[] arr = {5, -12, 7, 9, 25, 4, 18, -3, 10, -6, 21};

        // 1) Знайти максимальний за модулем елемент масиву
        int maxAbs = arr[0];
        for (int value : arr) {
            if (Math.abs(value) > Math.abs(maxAbs)) {
                maxAbs = value;
            }
        }
        System.out.println("Максимальний за модулем елемент: " + maxAbs);

        // 2) Середнє арифметичне елементів, індекс яких кратний 3
        int sum = 0;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i % 3 == 0) {
                sum += arr[i];
                count++;
            }
        }

        double average = (count > 0) ? (double) sum / count : 0;
        System.out.println("Середнє арифметичне елементів з індексами кратними 3: " + average);

        // 3) Новий масив — беремо всі додатні елементи
        ArrayList<Integer> filtered = new ArrayList<>();

        for (int value : arr) {
            if (value > 0) {
                filtered.add(value);
            }
        }

    }
}





