package Leetcode.Day4;

public class Mountainarray {
    public static void main(String[] args) {
        int[] arr = {1,10,55,2};
        int ans = MoountainArr(arr);
        System.out.println(ans);
    }
    static  int MoountainArr(int[] arr){
        int start = 0;
        int end  = arr.length - 1;
        while(start < end){
            int mid = start + (end - start) / 2 ;
            if(arr[mid] > arr[mid + 1]){
                end = mid;
            }else{
                start = mid + 1;
            }
        }
        return start;
    }
}
