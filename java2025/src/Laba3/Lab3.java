package Laba3;

import java.util.Locale;
import java.util.Scanner;

public class Lab3 {

    // ============================ Задача 2 ============================
    // Обчислити суму ряду:
    // S = Σ ln(i) * cos(cuberoot(1 / i²)), i = 1..k, (2 < k ≤ 25)
    public static double task2(int k) {
        double sum = 0.0;
        for (int i = 1; i <= k; i++) {
            double term = Math.log(i) * Math.cos(Math.cbrt(1.0 / (i * i)));
            sum += term;
        }
        return sum;
    }

    // ============================ Задача 9 ============================
    // Обчислити функцію:
    // x(t, n) = Σ (t / i), i = 1..n
    // (1 ≤ t ≤ 3.5, 1 ≤ n ≤ 4.6)
    public static double task9(double t, double n) {
        int nInt = (int) Math.floor(n);
        double sum = 0.0;
        for (int i = 1; i <= nInt; i++) {
            sum += t / i;
        }
        return sum;
    }

    // ============================ Задача 11 ============================
    // Обчислити нескінченну суму:
    // S = Σ (1 / i²) з точністю ε > 0
    // Ряд обривається, коли наступний доданок < ε
    public static Result task11(double eps) {
        double sum = 0.0;
        int i = 1;
        int used = 0;
        while (true) {
            double term = 1.0 / (i * i);
            if (Math.abs(term) < eps) break;
            sum += term;
            used++;
            i++;
        }

        // Відоме аналітичне значення суми (π² / 6)
        double ref = Math.pow(Math.PI, 2) / 6.0;
        return new Result(sum, used, ref);
    }

    // Клас-результат для зберігання значення, кількості елементів і теоретичного значення
    public static class Result {
        public final double value;
        public final int termsUsed;
        public final double reference;

        public Result(double value, int termsUsed, double reference) {
            this.value = value;
            this.termsUsed = termsUsed;
            this.reference = reference;
        }
    }

    // ============================ Перевірки ============================

    // Перевірка параметрів для задачі 2
    public static String validateTask2(int k) {
        if (k <= 2 || k > 25)
            return "k має бути в межах (2; 25].";
        return null;
    }

    // Перевірка параметрів для задачі 9
    public static String validateTask9(double t, double n) {
        if (t < 1 || t > 3.5)
            return "t має бути в межах [1; 3.5].";
        if (n < 1 || n > 4.6)
            return "n має бути в межах [1; 4.6].";
        return null;
    }

    // Перевірка параметрів для задачі 11
    public static String validateTask11(double eps) {
        if (eps <= 0)
            return "ε має бути > 0.";
        return null;
    }

    public static String warningTask11(double eps) {
        if (eps >= 1)
            return "Увага: ε занадто велике — ряд одразу зупиниться після першого члена.";
        return null;
    }

    // ============================ Головний метод ============================

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // ---------- Задача 2 ----------
        System.out.println("=== Задача 2 ===");
        System.out.print("Введіть k (2 < k ≤ 25): ");
        int k = sc.nextInt();
        String e2 = validateTask2(k);
        if (e2 != null) {
            System.out.println("Помилка: " + e2);
        } else {
            double res2 = task2(k);
            System.out.printf("Результат S = %.10f%n%n", res2);
        }

        // ---------- Задача 9 ----------
        System.out.println("=== Задача 9 ===");
        System.out.print("Введіть t (1 ≤ t ≤ 3.5): ");
        double t = sc.nextDouble();
        System.out.print("Введіть n (1 ≤ n ≤ 4.6): ");
        double n = sc.nextDouble();
        String e9 = validateTask9(t, n);
        if (e9 != null) {
            System.out.println("Помилка: " + e9);
        } else {
            double res9 = task9(t, n);
            System.out.printf("x(t, n) = %.10f%n%n", res9);
        }

        // ---------- Задача 11 ----------
        System.out.println("=== Задача 11 ===");
        System.out.print("Введіть ε (>0): ");
        double eps = sc.nextDouble();
        String e11 = validateTask11(eps);
        if (e11 != null) {
            System.out.println("Помилка: " + e11);
        } else {
            String warn = warningTask11(eps);
            if (warn != null) System.out.println(warn);
            Result r = task11(eps);
            System.out.printf("Сума ряду = %.12f%n", r.value);
            System.out.printf("Кількість доданків: %d%n", r.termsUsed);
            System.out.printf("Теоретичне значення (π² / 6) = %.12f%n", r.reference);
            System.out.printf("Похибка = %.12f%n", Math.abs(r.reference - r.value));
        }

        sc.close();
    }
}
