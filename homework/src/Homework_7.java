/**
 * 7.学习小组结伴
 * 为了促进互帮互相，决定成立学习小组。小组结伴的规则是这样的：先将学号按升序排列，排在最前的一个人和排在最后的那个人结成同伴，排在第2个的与排在倒数第2个的结成同伴......依次类推，2个一组成同伴。
 */
import java.util.Scanner;
public class Homework_7 {
    public static void Solution_1(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            int[] nums = new int[n];
            if (n >= 2 && n <= 50) {
                if (n % 2 != 0) {
                    System.out.println("odd number");
                } else {
                    for (int i = 0; i < nums.length; ++i) {
                        int num = scanner.nextInt();
                        nums[i] = num;
                    }
//                Arrays.sort(nums);  //sort排序
                    int t;
                    for (int i = 0; i < nums.length - 1; ++i) {
                        for (int j = 0; j < nums.length - i - 1; ++j) {
                            if (nums[j] > nums[j+1]){
                                t = nums[j];
                                nums[j] = nums[j+1];
                                nums[j+1] = t;
                            }
                        }
                    }
                    int[][] peiDui = new int[n/2][2];
                    int max = n-1;
                    for (int i = 0; i < peiDui.length; ++i) {
                        peiDui[i][0] = nums[i];
                        peiDui[i][1] = nums[max];
                        max--;
                    }
                    for (int i = 0; i < peiDui.length; ++i) {
                        System.out.print(peiDui[i][0]+" "+peiDui[i][1]);
                        System.out.println();
                    }
                    break;
                }
            } else {
                break;
            }
        }
    }
}
