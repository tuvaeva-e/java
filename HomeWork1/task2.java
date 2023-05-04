//Вывести все простые числа от 1 до 1000

package HomeWork1;

public class task2 {
    public static boolean isPrime(int number) {
        double s = Math.sqrt(number);
        for (int i = 2; i <= s; i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        for (int i = 2; i < 1000; i++) {
            if (isPrime(i))
                System.out.println(i);
        }
    }
    
}
