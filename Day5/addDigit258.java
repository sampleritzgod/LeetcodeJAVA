package Leetcode.Day5;

public class addDigit258 {
    public static void main(String[] args) {
        int in = 38;
        System.out.println(addDigit(in));
    }
    static  int addDigit(int in){
        return in == 0 ? 0:1 + (in - 1) % 9 ;
    }
    //38 --> 3 + 8 --> 11
    // 11 --> 1 + 1 --> 2
}
