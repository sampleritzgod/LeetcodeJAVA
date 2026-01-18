package Leetcode.Day6;

public class Fibnonacci {
    public static void main(String[] args) {
        int fib_num = 6;
        System.out.println(Fib(fib_num));
    }
    static int Fib(int n){
        if(n==0) return 0;
        if(n==1) return  1;
        int a = 0;
        int b = 1;
        for(int i =2; i<=n; i++){
            int c = a + b ;
            a = b;
            b = c;
        }
        return  b;
    }
}
