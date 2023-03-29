/**
 * 1.两个3位数之间的所有素数之和。
 * 对任意给定的两个正整数n和m，100<n<m<1000,  计算这两个数之间所有素数之和，包含n、m自身。
 */
import java.util.Scanner;
public class Homework_1 {
    public static void Solution_1(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int sum = 0;
        boolean isPrime = true;
        if (n > 100 && n < m && m < 1000) {
            for (int i = n; i <= m; ++i) {
                isPrime = true;
                if (i % 2 == 0) {
                    isPrime = false;
                }
                for (int j = 3; j <= Math.sqrt(i); j += 2) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime == true) {
                    sum += i;
                }
            }
            System.out.println(sum);
        }
    }
}
