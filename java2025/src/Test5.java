import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введіть свій вік: ");
        int age = scan.nextInt();


        if (age < 13) {
            System.out.println("Доступ обмежено");
        } else if (age >= 13 && age <= 17) {
            System.out.println("Частковий доступ");
        } else {
            System.out.println("Повний доступ");


        }

    }
}