//Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

package HomeWork1;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число n: ");
        int n = scanner.nextInt();
        scanner.close();

        int triangNum = 0;
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            triangNum +=i;
            fact *=i;
        }
        System.out.printf("Треугольное число: %d; факториал: %d \n", triangNum, fact);
    }
}
