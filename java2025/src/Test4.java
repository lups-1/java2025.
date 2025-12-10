import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        int randomInt = (int) (Math.random() * 100);
        System.out.print("Enter your random number: " + randomInt);

    }

    static void main2() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number: ");
        String number = scan.nextLine();
    }


}
