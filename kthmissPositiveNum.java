package Leetcode;

public class kthmissPositiveNum {
    public static void main(String[] args) {
        int[] arr = {2,3,4,7,11};
        int ans = KthPositive(arr, 5);
        System.out.println(ans);
    }
    static int KthPositive(int[] arr, int k){
        int crt = 1;
        int miss = 0;
        int i = 0;
        while(miss < k){
            if(i < arr.length && arr[i] == crt){
                i++;
            }else{
                miss++;
            }
            if(miss == k){
                return crt;
            }
            crt++;
        }
        return crt;
    }
}

