package leetcode75;

public class maxSubarray {

    public static void main(String[] args) {

        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};

        maxSubarray obj = new maxSubarray();
        int result = obj.maxSubArray(nums);
        System.out.println("MaxSum : " + result);

    }
    public int maxSubArray(int[] nums) {

        int currentSum = 0;
        int maxSum = nums[0];

        for (int num : nums){
            currentSum += num;

            if (currentSum > maxSum){
                maxSum = currentSum;
            }
            if (currentSum < 0){
                currentSum = 0;
            }
        }
        return maxSum;

    }
}
