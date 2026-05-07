package leetcode75;

import java.util.HashMap;
import java.util.Stack;

public class nextGreaterElement {

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        HashMap<Integer, Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();

        // Build next greater mapping
        for (int num : nums2) {

            while (!stack.isEmpty() && num > stack.peek()) {
                map.put(stack.pop(), num);
            }

            stack.push(num);
        }

        // Result array
        int[] result = new int[nums1.length];

        for (int i = 0; i < nums1.length; i++) {
            result[i] = map.getOrDefault(nums1[i], -1);
        }

        return result;
    }

    public static void main(String[] args) {

        int[] nums1 = {4, 1, 2};
        int[] nums2 = {1, 3, 4, 2};

        nextGreaterElement obj = new nextGreaterElement();
        int[] result = obj.nextGreaterElement(nums1, nums2);

        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
