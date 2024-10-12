import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a > b) {
            System.out.println("a > b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a = b");
        }

        int sum = a + b;
        int difference = a - b;
        int product = a * b;

        if (b != 0) {
            double quotient = (double) a / b;
            System.out.println("Деление (a / b) = " + quotient);
        } else {
            System.out.println("Деление на ноль невозможно.");
        }

        System.out.println("Сумма (a + b) = " + sum);
        System.out.println("Разность (a - b) = " + difference);
        System.out.println("Произведение (a * b) = " + product);

        scanner.close();
    }
}
