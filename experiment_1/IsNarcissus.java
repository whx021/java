import java.util.Scanner;
class IsNarcissus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input a three-digit integer(input '0' terminate process) : ");
        int num = input.nextInt();
        while (num != 0) {
            if (num > 100 && num < 1000) {
                int i = num / 100;
                int j = (num - i * 100) / 10;
                int k = num % 10;
                if ((Math.pow(i, 3) + Math.pow(j, 3) + Math.pow(k, 3)) == num) {
                    System.out.println(num + " is narcissus.");
                } else {
                    System.out.println(num + " is not narcissus.");
                }
            } else {
                System.out.println("Please input a three-digit integer again : ");
            }
            num = input.nextInt();
        }
        input.close();
    }
    
}