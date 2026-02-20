package com.example.coding._2026.LeetCode;

public class Merge_Sorted_Array {
    public static void main() {
        merge(new int[]{0,0,3,0,0,0,0,0,0}, 3, new int[]{-1,1,1,1,2,3}, 6);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int num1start =  m-1;
        int num2end = n-1;
        int setnum = m+n-1;

        while (setnum >= 0) {
            if (num2end == -1) {
                break;
            }
            if (m == 0 || num1start == -1) {
                nums1[setnum] = nums2[num2end];
                setnum--;
                num2end--;
                continue;
            }
            if (n == 0) {
                break;
            }
            if (nums2[num2end] >= nums1[num1start]) {
                nums1[setnum] = nums2[num2end];
                num2end--;
                setnum --;
            } else {
                nums1[setnum] = nums1[num1start];
                num1start--;
                setnum --;
            }
        }
    }

    public static void merge2(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (j >= 0) {  // nums2가 남아있는 동안만
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }
    }
}
