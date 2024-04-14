package HomeWorks.hw_10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {


        boolean isInt = false;

        while (!isInt) {
            try {
                System.out.println("Task 2:: Умножение на 2\n" +
                        "Введите цифру  :: ");
                Scanner scanner2 = new Scanner(System.in);
                int num3 = scanner2.nextInt();
                System.out.println(num3 * 2);
                isInt= true;
            } catch (InputMismatchException e) {
                System.out.println("Необходимо ввести корректные данные :: " + e.getMessage());
            } finally {
                System.out.println("Вы великолепны!");
            }
        }
    }
}
