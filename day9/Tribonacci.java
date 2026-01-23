package Leetcode.day9;

public class Tribonacci {
    public static void main(String[] args) {
        int trib = 25;
        int ans = Tribo(trib);
        System.out.println(ans);
    }
    static int Tribo(int n){
        if(n == 0) return 0;
        if(n == 1 || n == 2) return 1;
        int a = 0;
        int b = 1;
        int c = 1;
        for(int i = 3; i <=n; i++){
            int d = a + b + c ;
            a = b;
            b = c ;
            c = d;
        }
        return c;
    }

}
