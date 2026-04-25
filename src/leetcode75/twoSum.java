package leetcode75;

public class twoSum {

    public static void main(String[] args) {
        int[] nums = {2,7,11,15,1,8};
        int target = 9;
        twoSum Solution = new twoSum();
        int[] result = Solution.twoSum(nums,target);

        System.out.println("Answer: [" + result[0] + ", " + result[1] + "]");

    }

    public int[] twoSum(int[]nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }

}