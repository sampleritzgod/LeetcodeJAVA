package Leetcode.Day7;

import java.util.Arrays;

public class secondLargest {
    public static void main(String[] args) {
        int[] arr = {23,4,67,5,2};
        System.out.println(Largest(arr));
    }
    static int Largest(int[] arr){
        int n = arr.length;
        int largest = arr[n-1];
        Arrays.sort(arr);
        for(int i = n-2; i >=0; i--){
            if(arr[i]!= largest){
                return arr[i];
            }
        }
        return -1;
    }
}
