import java.util.Scanner;

public class main2 {
    public static void main(String[] args) {Scanner scanner = new Scanner(System.in);

        int age = 14;
        double doubleNum1 = 12.14d, doubleNum2 = 10.44d;
        int consoleNum1, consoleNum2;
        String symbol;

        consoleNum1 = scanner.nextInt();
        symbol = scanner.next();
        consoleNum2 = scanner.nextInt();

        if (age <= 13) {
            System.out.println("Доступ обмежено");
        } else if (age <= 17) {
            System.out.println("Частковий доступ");
        } else {
            System.out.println("Повний доступ");
        }



        switch (symbol) {
            case "+" -> System.out.println(consoleNum1 + consoleNum2);
            case "-" -> System.out.println(consoleNum1 - consoleNum2);
            case "*" -> System.out.println(consoleNum1 * consoleNum2);
            case "/" -> System.out.println(consoleNum1 / consoleNum2);
        }
    }
}