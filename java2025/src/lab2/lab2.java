package lab2;

public class lab2 {
    public static void main(String[] args) {

        // ---------- Завдання 2 ----------
        double a = 2.34, b = 2.75, c = -2.23, d = -1.653;
        double y2 = Math.pow(Math.E, a + 3 * (Math.log(Math.abs(c)) / Math.log(2))) * Math.atan(b);
        System.out.printf("Завдання 2 (a=%.2f, b=%.2f, c=%.2f, d=%.3f): %.10f%n", a, b, c, d, y2);

        // ---------- Завдання 12 ----------
        a = -1.478; b = 9.8; c = 0.8; d = 2.24;
        double y12 = 6 * Math.sin(b) * Math.log(Math.abs(Math.pow(a, 3))) * Math.sqrt(Math.pow(c, 4) + Math.exp(-d));
        System.out.printf("Завдання 12 (a=%.3f, b=%.1f, c=%.1f, d=%.2f): %.10f%n", a, b, c, d, y12);

        // ---------- Завдання 22 ----------
        a = 1.25; b = 3.04; c = 0.75; d = 2.312;
        double y22 = Math.sin(c) / (Math.sqrt(Math.abs(Math.acos(1 / b))) + 3 * Math.asin(1 / d));
        System.out.printf("Завдання 22 (a=%.2f, b=%.2f, c=%.2f, d=%.3f): %.10f%n", a, b, c, d, y22);
    }
}