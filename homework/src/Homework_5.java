/**
 * 5.求n个非负整数之和
 * 输入n个非负整数，输出他们的和。 1<=n<=100，而每个数则<800。对不符合要求的输入，输出提示信息: "error”。
 */
import java.util.Scanner;
public class Homework_5 {
    public static void Solution_1(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arrays = new int[n];
        int sum = 0;
        if (n >= 1 && n <= 100) {
            for (int i = 0; i < n; ++i) {
                int nums = scanner.nextInt();
                if (nums < 0 || nums >= 800) {
                    System.out.println("error");
                    return;
                } else {
                    arrays[i] = nums;
                }
            }
            for (int i = 0; i < arrays.length; ++i) {
                sum += arrays[i];
            }
            System.out.println(sum);
        } else {
            System.out.println("error");
        }
    }
}
