import java.util.Scanner;


public class Test3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scan.nextLine();
        System.out.print("Enter your Surname: ");
        String surname = scan.nextLine();
        System .out.print("Enter your age: ");
        int age = scan.nextInt();
        System.out.print("Enter your city: ");
        String city = scan.next();

        System .out.printf("name: %s,Surname: %s,Age: %d,City: %s", name, surname,age, city );
    }
}






