package leetcode75;

import java.util.Stack;

public class DailyTemperatures {

    public int[] dailyTemperatures(int[] temperatures) {

        int n = temperatures.length;
        int[] result = new int[n];

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {

            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                int index = stack.pop();
                result[index] = i - index;
            }

            stack.push(i);
        }

        return result;
    }

    public static void main(String[] args) {

        int[] temps = {73,74,75,71,69,72,76,73,81,83};

        DailyTemperatures obj = new DailyTemperatures();
        int[] result = obj.dailyTemperatures(temps);

        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}