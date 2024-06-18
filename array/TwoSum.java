package rohan.array;

import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of rohan.array");
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter element "+(i+1));
            nums[i] = sc.nextInt();
        }
        System.out.println("Enter the target");
        int target = sc.nextInt();
        int[] indices =  twoSum( nums,target);
        if(indices == null){
            System.out.println("No two sum solution");
        }else {
            System.out.println("The indices are : "+indices[0]+" "+indices[1]);
        }

    }
    static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }
}
