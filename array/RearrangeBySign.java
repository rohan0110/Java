package rohan.array;

import java.sql.Array;

public class RearrangeBySign {
    public static void main(String[] args) {
        int[] nums = {3,1,-2,-5,2,-4};
        int[] ans = rearrangeArray(nums);
        System.out.println("The array after rearrangement is: ");
        for (int i=0;i< nums.length;i++){
            System.out.print(ans[i]+" ");
        }

    }
    static int[] rearrangeArray(int[] nums){
        int posindex=0 ,negindex=1;
        int[] ans = new int[nums.length];
        for (int i=0;i< nums.length;i++){
            if (nums[i]<0){
                ans[negindex]=nums[i];
                negindex+=2;
            }else {
                ans[posindex]= nums[i];
                posindex+=2;
            }
        }
        return ans;
    }
}
