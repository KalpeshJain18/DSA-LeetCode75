package leetcode75;

public class findPivotIndex {


    public int pivotIndex(int[] nums) {
        int total = 0;
    for(int num : nums)
    {
        total += num;
    }

    int leftSum = 0;
    for(int i = 0; i<nums.length; i++)
    {
        int rightSum = total - leftSum - nums[i];

        if (leftSum == rightSum) {
            return i;
        }
        leftSum += nums[i];
    }
    return-1;
}

    public static void main(String[] args) {

        int[] nums = {1, 7, 3, 6, 5, 6};

        findPivotIndex obj = new findPivotIndex();
        int result = obj.pivotIndex(nums);

        System.out.println("Pivot Index: " + result);
    }
}