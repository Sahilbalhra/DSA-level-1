// 350 Intersection of Two Arrays leet code

// Example 1:

// Input: nums1 = [1,2,2,1], nums2 = [2,2]
// Output: [2,2]
// Example 2:

// Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
// Output: [4,9]
// Explanation: [9,4] is also accepted.

import java.util.*;

public class IntersectionofTwoArrays {
    public static Scanner scn = new Scanner(System.in);

    public static void input(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
    }

    public static void output(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        int[] map1 = new int[1001];
        List<Integer> list = new ArrayList<>();
        for (int num : nums1) {
            map1[num]++;
        }
        for (int num : nums2) {
            if (map1[num] != 0) {
                map1[num]--;
                list.add(num);
            }
        }
        int[] result = new int[list.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = list.get(i);
        }
        return result;

    }

    public static void main(String[] args) {
        int n = scn.nextInt();
        int[] arr = new int[n];
        input(arr);
        int m = scn.nextInt();
        int[] arr2 = new int[m];
        input(arr2);
        output(intersect(arr, arr2));

    }

}
