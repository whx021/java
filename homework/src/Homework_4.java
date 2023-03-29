/**
 * 4.字符出现频率统计
 * 从键盘输入一行中英文混合的文字，统计其中出现的每个英文字母的频率并依字母表顺序，依次输出统计结果，统计时忽略字母大小写的区别。
 */
import java.util.Scanner;
public class Homework_4 {
    public static void Solution_1(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine().toLowerCase();
        int[] count = new int[26];
        for (int i = 0; i < str.length(); ++i) {
            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                count[str.charAt(i) - 'a']++;
            }
        }
        for (int i = 0; i < count.length; ++i) {
            if (count[i] != 0) {
                System.out.print((char)(i + 'a') + "=" + count[i] + " ");
            }
        }
    }
}