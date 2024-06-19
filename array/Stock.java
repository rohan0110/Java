package rohan.array;

public class Stock {
    public static void main(String[] args) {
        int[] nums = {8,7,6,5,4};
        System.out.println("Maximum profit is : "+maxProfit(nums));
    }
    static int maxProfit(int[] nums){
        int minprice = Integer.MAX_VALUE;
        int maxpro = 0;
        for (int i=0;i< nums.length;i++){
            minprice = Math.min(nums[i],minprice);
            maxpro = Math.max(maxpro,nums[i]-minprice);
        }
        return maxpro;
    }
}
