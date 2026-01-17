package Leetcode.Day4;

public class PeakElement {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10,12,14,16,2,1,0};
        int target = 2;
        System.out.println(findPeakElement(arr));
    }
    static int findPeakElement(int[] arr) {
        int start = 0;
        int end = arr.length -1 ;
        while(start < end){
            int mid = start + (end - start) / 2 ;
            if(arr[mid] > arr[mid + 1]){
                // you are dec part of array
                end = mid;
            }else{
                // you are aec part of array
                start = mid + 1 ;
            }
        }
        return start ;
    }
}
