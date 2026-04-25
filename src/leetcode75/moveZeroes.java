package leetcode75;

public class moveZeroes {

    public void move(int[] nums) {

        int index = 0;

        // moving forward non-zero values
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[index] = nums[i];
                index++;
            }
        }

        // filling remaining with zeros
        while (index < nums.length) {
            nums[index] = 0;
            index++;
        }
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 0, 3};

        moveZeroes obj = new moveZeroes();
        obj.move(nums);

        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}