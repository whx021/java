/**
 * 3.华氏温度与摄氏温度的换算
 * 用Java语言编写一个将华氏温度转换成摄氏温度的程序，转换的公式是：
 *     °C = (°F -32)*5/9
 * 其中C表示摄氏温度，F表示华氏温度。
 * 程序的输入是一个整数，表示华氏温度。输出对应的摄氏温度，也是一个整数。
 */
import java.util.Scanner;
public class Homework_3 {
    public static void Solution_1(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int F = scanner.nextInt();
        int C = (F - 32) * 5 / 9;
        System.out.println(C);
    }
}
