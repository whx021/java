import java.util.*;
public class Example1_5 {
    public static void main(String[] args) {
        int choice = Integer.parseInt(args[0]);
        Process p = new Process();
        switch(choice) {
        case 1:
            System.out.println("\n1. 求1000以内的完全数");
            p.isPerfectNum();
            break;
        case 2: 
            System.out.println("\n2. 求16/8和16*8效率最高的算法");
            p.shiftOperator();
            break;
        case 3:
            System.out.println("\n3. 输出字母表");
            p.showLetters();
            break;
        case 4:
            System.out.println("\n4. 生成并输出10个50~100之间的随机数");
            p.showRandom();
            break;
        case 5:
            System.out.println("\n5. 测试运算符优先级");
            p.testPrecedence();
            break;
        case 6:
            System.out.println("\n6. 测试逻辑运算符与位运算符");
            p.testLogic();
            break;
        case 7:
            System.out.println("\n7. 测试利用异或运算符进行加密解密");
            p.coding();
            break;
        case 8:
            System.out.println("\n8. 测试用增强for循环个Lambda表达式来输出数组元素");
            p.testLambda();
            break;
        }
    }
}

class Process {
    void isPerfectNum() {
        System.out.println("1000以内的完全数有 : ");
        int i = 1;
        while (i < 1000) {
            int y = 0;
            for (int j = 1; j < i; ++j) {
                if (i % j == 0) {
                    y += j;
                }
            }
            if (y == i) {
                System.out.print(i + "\t");
            }
            ++i;
        }
        System.out.println();
    }

    void shiftOperator() {
        int lintNumber = 16;
        System.out.println("16 / 8 = " + (lintNumber >> 3));
        System.out.println("16 * 8 = " + (lintNumber << 3));
    }

    void  showLetters() {
        for (char start = 'a'; start <= 'z'; ++start) {
            System.out.print(start + " ");
        }
        System.out.println();
    }

    void showRandom() {
        int n = 0;
        do {
            int x = (int)(Math.random() * (100 - 50 + 1) + 50);
            System.out.print(x + " ");
            ++n;
        } while (n < 10);
        System.out.println();
    }

    void testLogic() {
        int x, y = 10;
        if (((x = 0) == 1) && ((y = 20) == 20)) {
            System.out.println("现在y的值是: " + y);
        } else {
            System.out.println("现在y的值是: " + y);
        }
        int a, b = 10;
        if (((a = 0) == 0) | ((b = 20) == 20)) {
            System.out.println("现在b的值是: " + b);
        } 
    }

    void testPrecedence() {
        int a = 1, c = 6;
        System.out.println("a = 1, c = 6, (-++a+c) = " + (-++a+c) + " a = " + a);
        
        int e;
        float f;
        double d, d1;
        e = 5 / 2;
        f = 5 / 2;
        d = 5 / 2;
        d1 = 5 / 2.0;
        System.out.println("int e = 5 / 2 = " + e);
        System.out.println("float f = 5 / 2 = " + f);
        System.out.println("double d = 5 / 2 = " + d + " double d1 = 5 / 2.0 = " + d1);
        
        int i = 4;
        System.out.println("i = 4, c * -i = " + (c * -i));

        int m = 2, n = 3, x = 4, y = 5;
        System.out.println("int m = 2, n = 3, x = 4, y = 5, n < m ? x : y = " + (n < m ? x : y));
    }

    void coding() {
        char j1 = '丁';
        char ch1 = '吴';
        char s = '9';
        j1 = (char)(j1 ^ s);
        ch1 = (char)(ch1 ^ s);
        System.out.println("密文是 : " + j1 + ch1);
        j1 = (char)(j1 ^ s);
        ch1 = (char)(ch1 ^ s);
        System.out.println("原文是 : " + j1 + ch1);
        System.out.println("汉字'丁'在unicode码中的顺序位置是 : " + (int)ch1);
    }
    
    void testLambda() {
        String[] str = {"星期一", "星期二", "星期三", "星期四", "星期五"};
        List<String> weekday = Arrays.asList(str);
        System.out.println("\n用增强for循环 : ");
        for (String s : weekday) {
            System.out.print(s + " | ");
        }
        System.out.println("\n\nuse lambda expression : (x) -> System.out.print(x)");
        weekday.forEach((x) -> System.out.print(x + ";"));
        System.out.println("\n\nuse lambda expression : System.out::println");
        weekday.forEach(System.out::println);
    }
}