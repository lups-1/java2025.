package Lab5;
public class lab5 {

    // ---------------------------------------------
    // 1. Insertion Sort (по спаданню)
    // ---------------------------------------------
    public static void insertionSortDescending(short[] arr) {
        for (int i = 1; i < arr.length; i++) {
            short key = arr[i];
            int j = i - 1;

            // Розміщення елементів більших за key ЛІВОРУЧ
            while (j >= 0 && arr[j] < key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    // ---------------------------------------------
    // 2. Bubble Sort (по спаданню)
    // ---------------------------------------------
    public static void bubbleSortDescending(short[] arr) {
        boolean swapped;
        for (int i = 0; i < arr.length - 1; i++) {
            swapped = false;

            for (int j = 0; j < arr.length - 1 - i; j++) {
                // міняємо, якщо ПРАВИЙ більший за ЛІВИЙ (для спаданню)
                if (arr[j] < arr[j + 1]) {
                    short temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            if (!swapped) break; // масив уже відсортований
        }
    }

    // ---------------------------------------------
    // Допоміжний метод для виведення масиву
    // ---------------------------------------------
    public static void printArray(short[] arr) {
        for (short x : arr) System.out.print(x + " ");
        System.out.println();
    }

    // ---------------------------------------------
    // Головний метод
    // ---------------------------------------------
    public static void main(String[] args) {

        short[] array1 = {12, -4, 7, 0, 28, 5, -9};
        short[] array2 = array1.clone();

        System.out.println("Початковий масив:");
        printArray(array1);

        // Insertion Sort (спадання)
        insertionSortDescending(array1);
        System.out.println("\nСортування включенням (Insertion Sort, спадання):");
        printArray(array1);

        // Bubble Sort (спадання)
        bubbleSortDescending(array2);
        System.out.println("\nСортування бульбашкою (Bubble Sort, спадання):");
        printArray(array2);
    }
}
