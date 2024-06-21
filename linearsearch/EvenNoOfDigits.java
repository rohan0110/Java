package rohan.linearsearch;

public class EvenNoOfDigits {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        int count = findNumber(nums);
        System.out.println(count);
    }
    static int findNumber(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int digits = countdigits(nums[i]);
            boolean ans = isEven(digits);
            if (ans) {
                count++;
            }
        }
        return count;
    }
    static boolean isEven(int n) {
        return n % 2 == 0;
    }
    static int countdigits(int n) {
        int count = 0;
        while (n > 0) {
            n = n / 10;
            count ++;
        }
        return count;
    }
}
