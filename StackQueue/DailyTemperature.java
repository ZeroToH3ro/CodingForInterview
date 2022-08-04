package Progress.StackQueue;

import java.util.Stack;

public class DailyTemperature {
    public static int[] dailyTemperatures(int[] temperatures) {
        int size = temperatures.length;
        int []ans = new int[size];
        Stack<Integer>stack = new Stack<Integer>();

        for(int i=0; i< temperatures.length; i++) {
            while(!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]){
                ans[stack.peek()] = i-stack.pop();
            }
            stack.push(i);
        }

        return ans; 
    }
    public static void main(String[] args) {
        int []temperatures = {73,74,75,71,69,72,76,73};
        for (int i : dailyTemperatures(temperatures)) {
            System.out.print(i+ "\t");
        }
        System.out.println();
    }
}
