package leetcode75;

import static java.lang.Math.max;

public class maxSubarray {

    public static void main(String[] args) {

        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};

        maxSubarray obj = new maxSubarray();
        int result = obj.maxSubArray(nums);
        System.out.println("MaxSum : " + result);

    }
    public int maxSubArray(int[] nums) {

        // Initializing Sum and Max
        int sum = 0;
        int maxi = nums[0];

        // Using for Loop
        for (int i = 0; i < nums.length; i++){

            // Step 1
            sum = sum + nums[i];

            // Step 2
            maxi = max(maxi, sum);

            // Step 3
            if(sum < 0)
                sum = 0;

        }
        return maxi;
    }
}