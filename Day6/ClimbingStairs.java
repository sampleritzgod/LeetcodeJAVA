package Leetcode.Day6;

public class ClimbingStairs {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(Climbstair(n));
    }
    static int Climbstair(int n){
        if(n == 0) return  0;
        if(n == 1) return  1;
        int a = 1;
        int b = 2;
        for(int i = 3; i<=n; i++){
            int c = a + b ;
            a = b;
            b = c;
        }
        return  b;
    }
}
