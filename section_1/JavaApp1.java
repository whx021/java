import java.util.Scanner;
public class JavaApp1 {
    public static void main(String args []) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入你的名字 : ");
        String name = input.nextLine();
        System.out.println("请输入你编写过的Java程序数量 : ");
        int num = input.nextInt();
        System.out.println(name + ", 欢迎你! 已编写过" + num + "个程序啦!");
        input.close();
    }
}
