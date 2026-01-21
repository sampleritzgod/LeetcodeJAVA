package Leetcode.Day8;

interface MountainArray {
    int get(int index);
    int length();
}

class MountainArrayImpl implements MountainArray {
    int[] arr;

    MountainArrayImpl(int[] arr) {
        this.arr = arr;
    }

    public int get(int index) {
        return arr[index];
    }

    public int length() {
        return arr.length;
    }
}

public class SearchInMountainArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 34, 5, 3, 1};
        MountainArray mountainArr = new MountainArrayImpl(arr);

        Solution sol = new Solution();
        int ans = sol.findInMountainArray(5, mountainArr);
        System.out.println(ans);
    }
}

class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int n = mountainArr.length();
        int peak = findPeak(mountainArr, n);

        int left = binarySearch(mountainArr, target, 0, peak, true);
        if (left != -1) return left;

        return binarySearch(mountainArr, target, peak + 1, n - 1, false);
    }

    int findPeak(MountainArray mountainArr, int n) {
        int start = 0, end = n - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (mountainArr.get(mid) > mountainArr.get(mid + 1)) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    int binarySearch(MountainArray mountainArr, int target,
                     int start, int end, boolean isAsc) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int val = mountainArr.get(mid);

            if (val == target) return mid;

            if (isAsc) {
                if (target < val) end = mid - 1;
                else start = mid + 1;
            } else {
                if (target < val) start = mid + 1;
                else end = mid - 1;
            }
        }
        return -1;
    }
}
