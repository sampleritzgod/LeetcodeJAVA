package Leetcode.Day5;

public class ValidPerfectSquare {
    public static void main(String[] args) {
        int in = 16;
        System.out.println(PerfectSquare(in));
    }
    static boolean PerfectSquare(int in){
        long start = 1;
        long end = in;
        while(start <= end){
            long mid = start + (end -start) / 2 ;
            if(mid * mid == in){
                return  true;
            }else if(mid * mid < in){
                start = mid + 1;
            }else if(mid * mid > in){
                end = mid - 1;
            }
        }
        return  false;
    }
}
