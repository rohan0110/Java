package rohan.array;

public class MIssingNumber {
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,5};
        int missingnum = missingNumber(nums);
        System.out.println("The Missing Number is: "+missingnum);

    }
    static int missingNumber(int[] nums){
        int N = nums.length;
        int s1 = (N*(N+1))/2;
        int s2 =0;
        for(int i=0;i<N;i++){
            s2= s2+nums[i];
        }
        int missingnum= s1-s2;
        return missingnum;
    }
}
