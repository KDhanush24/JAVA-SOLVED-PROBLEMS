// 88. Merge Sorted Array(Leetcode);

import java.util.*;
public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i = 0; i < n; i++) {
            nums1[m + i] = nums2[i];
        }
        Arrays.sort(nums1);
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of nums1 array: ");
        int m = sc.nextInt();

        System.out.print("Enter size of nums2 array: ");
        int n = sc.nextInt();

        int[] nums1 = new int[m + n];

        int[] nums2 = new int[n];

        
        System.out.println("Enter nums1 elements:");
        for(int i = 0; i < m; i++) {

            nums1[i] = sc.nextInt();

        }

        System.out.println("Enter nums2 elements:");
        for(int i = 0; i < n; i++) {

            nums2[i] = sc.nextInt();

        }
        MergeSortedArray obj = new MergeSortedArray();
        obj.merge(nums1, m, nums2, n);
        for(int num : nums1) {

            System.out.print(num + " ");

        }
    }
}