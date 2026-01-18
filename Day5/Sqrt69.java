package Leetcode.Day5;

public class Sqrt69 {
    public static void main(String[] args) {
        int x = 4;
        System.out.println(sqrtFunc(x));

    }
    static int  sqrtFunc(int x){
        if(x == 0 || x == 1) return  x;
        int start = 0;
        int end =x / 2 ;
        int ans = 0;
        while(start <= end){
            int mid = start + (end - start) / 2 ;
            if(mid <= x / mid){
                ans = mid;
                start = mid + 1 ;
            }else{
                end = mid - 1 ;
            }
        }
        return  ans;
    }
}
