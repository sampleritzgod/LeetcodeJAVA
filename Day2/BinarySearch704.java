package Leetcode.Day2;

public class BinarySearch704 {
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 7, 8, 9, 12, 34, 56, 67, 78, 89, 90};
        int target = 56;
        int ans = BS(arr, target);
        System.out.println(ans);
    }
    static  int BS(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;
        while(start <= end){
            int mid = start + (end - start) / 2 ;
            if(target < arr[mid]){
                end = mid -1 ;
            }else if(target > arr[mid]){
                start = mid + 1;
            }else{
                return  mid;
            }
        }
        return -1;
    }
}
