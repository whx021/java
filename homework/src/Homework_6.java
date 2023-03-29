/**
 * 6.24小时制与12小时制的时间换算
 * 编写一个程序，要求用户输入24小时制的时间，然后输出显示12小时制的时间。
 */
import java.util.Scanner;
public class Homework_6 {
    public static void Solution_1(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String time24 = scanner.nextLine();
        String[] split = time24.split(":");
        int h = Integer.parseInt(split[0]);
        if (h > 0 && h < 12) {
            System.out.println(time24.concat(" AM"));
        } else if (h == 24) {
            split[0] = Integer.toString(h -= 12);
            System.out.println(split[0]+":"+split[1]+" AM");
        } else if (h > 12 && h < 24) {
            split[0] = Integer.toString(h -= 12);
            if (h < 10) {
                System.out.println("0".concat(split[0]+":"+split[1]+" PM"));
                return;
            }
            System.out.println(split[0]+":"+split[1]+" PM");
        } else if (h == 12) {
            System.out.println(split[0]+":"+split[1]+" PM");
        }
    }
}
