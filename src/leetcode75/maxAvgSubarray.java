package leetcode75;

public class maxAvgSubarray {

    public static void main(String[] args) {

        int[] nums = {1,12,-5,-6,50,3};
        int k = 4;
        maxAvgSubarray obj = new maxAvgSubarray();
        double result = obj.findMaxAverage(nums, k);
        System.out.println(result);
    }

    public double findMaxAverage(int[] nums, int k) {

        int sum = 0;

        // Step 1: First Window
        for(int i = 0; i < k; i++){
            sum += nums[i];
        }
        int maxSum = sum;
        // Step 2: Slide Window
        for(int i = k; i < nums.length; i++){
            sum = sum + nums[i] - nums[i - k];
            maxSum = Math.max(maxSum, sum);
        }

        // Step 3: return average
        return (double) maxSum/k;
    }
}
