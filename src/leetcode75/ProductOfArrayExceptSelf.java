package leetcode75;

public class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {

        int n = nums.length;
        int[] result = new int[n];

        // Step 1: Left products
        result[0] = 1;
        for (int i = 1; i < n; i++) {
            result[i] = result[i - 1] * nums[i - 1];
        }

        // Step 2: Right products
        int right = 1;
        for (int i = n - 1; i >= 0; i--) {
            result[i] = result[i] * right;
            right = right * nums[i];
        }

        return result;
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4};

        ProductOfArrayExceptSelf obj = new ProductOfArrayExceptSelf();
        int[] result = obj.productExceptSelf(nums);

        // Print output
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
