package lab2;

import java.util.Scanner;

public class Test {
    static void main() {
        Scanner scanner= new Scanner(System.in);
         System.out.println("ведіть кут у радіанах:");
         double x = scanner.nextDouble();
         double result=Math.sin(x*Math.PI/180);
         System.out.println("sin("+ x + ") = " + result);
    }
}
