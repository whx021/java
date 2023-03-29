/**
 * 2.居民电费阶梯式计价器
 * 为鼓励居民节约用电，电力公司采取按用电量阶梯式计价的办法，居民应交电费y（元）与月用电量x（度）相关：当x不超过100度时，按0.3元/度计费； 当x不超过200度时，按0.4元/度计费；当x不超过300度时，按0.5元/度计费；当x超过300度时，按0.8元/度计费。请编写程序实现电费的计算。
 */
import java.util.Scanner;
public class Homework_2 {
    public static void Solution_1(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        double y;
        y = (x <= 100) ? 0.3 * x : (x <= 200) ? 0.4 * x : (x <= 300) ? 0.5 * x : 0.8 * x;
        System.out.println(y);
    }
}
