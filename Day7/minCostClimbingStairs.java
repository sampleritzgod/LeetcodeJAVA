package Leetcode.Day7;

public class minCostClimbingStairs {
    public static void main(String[] args) {
        int[] arr = {10,15,20};
        int ans = minCostClimbingStair(arr);
        System.out.println(ans);
    }
    static int minCostClimbingStair(int[] cost){
        int a = cost[0];
        int b = cost[1];
        for(int i = 2; i<= cost.length -1 ; i++){
            int current = cost[i] + Math.min(a, b);
            a = b;
            b = current;
        }
        return Math.min(a, b);
    }
}
