package Leetcode.Day7;

public class GreatestElement {
    public static void main(String[] args) {
        int[] arr = {12,3,45};
        System.out.println(Greatest(arr));
    }
    static int Greatest(int[] arr){
        int max =Integer.MIN_VALUE;
        for(int i = 0; i< arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
