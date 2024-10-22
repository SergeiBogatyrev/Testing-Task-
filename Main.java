import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        long maxNumber = 1;
        long number = 1;
        long number1 = 0;
        int maxSum = 1;
        int sum = 0;
        while (number != 0) {
            System.out.println("Введите целое число от " + Long.MIN_VALUE + " до " + Long.MAX_VALUE);
            Scanner s = new Scanner(System.in);
            try {
                number = s.nextLong();
            } catch (InputMismatchException e) {
                System.out.println("Вы ввели не число или число за границей допустимых значений от " + Long.MIN_VALUE + " до " + Long.MAX_VALUE);
            }
            if (number < 0){
                number1 = number * -1;
                sum = 0;
                while (number1 > 0) {
                    sum += number1 % 10;
                    number1 /= 10;
                }
            }
            else {
                number1 = number;
                sum = 0;
                while (number1 > 0) {
                    sum += number1 % 10;
                    number1 /= 10;
                }
            }
            if (sum > maxSum) {
                maxSum = sum;
                maxNumber = number;
            }
        }
        System.out.println("Максимальная сумма цифр числа " + maxSum + "; число " + maxNumber);
    }
}