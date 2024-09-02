import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = 0, number2 = 0;
        boolean input = false;

        while (!input) {
            try {
                System.out.println("Введите целое число: ");
                number1 = scanner.nextInt();
                input = true;
            } catch (InputMismatchException e) {
                System.out.println("Ошибка! Введено целое число или строка.");
                scanner.next();
            }
        }

        input = false;

        while (!input) {
            try {
                System.out.println("Введите целое число: ");
                number2 = scanner.nextInt();
                input = true;
            } catch (InputMismatchException e) {
                System.out.println("Ошибка! Введено целое число или строка.");
                scanner.next();
            }
        }

        try {
            int sum = number1 / number2;
            System.out.println("Результат деления: " + sum);
        } catch (ArithmeticException e) {
            System.out.println("Ошибка! Деление на ноль невозможно.");
        }
        scanner.close();
    }
}
