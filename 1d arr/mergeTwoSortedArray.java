// 88. Merge Sorted Array
// Example 1:

// Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
// Output: [1,2,2,3,5,6]
// Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
// The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
// Example 2:

// Input: nums1 = [1], m = 1, nums2 = [], n = 0
// Output: [1]
// Explanation: The arrays we are merging are [1] and [].
// The result of the merge is [1].
// Example 3:

// Input: nums1 = [0], m = 0, nums2 = [1], n = 1
// Output: [1]
// Explanation: The arrays we are merging are [] and [1].
// The result of the merge is [1].
// Note that because m = 0, there are no elements in nums1. The 0 is only there to ensure the merge result can fit in nums1.

// class Solution {
//     public void merge(int[] nums1, int m, int[] nums2, int n) {
//         int[] temp = new int[m + n];
//         int count1 = 0;
//         int count2 = 0;
//         int x = 0;
//         while (count2 < n && x < m + n) {
//             if (nums1[count1] <= nums2[count2] && count1 < m) {
//                 temp[x++] = nums1[count1++];
//             } else {
//                 temp[x++] = nums2[count2++];
//             }
//         }
//         while (count1 < m){
//             temp[x++] = nums1[count1++];
//         }
//         System.arraycopy(temp, 0, nums1, 0, m + n);
//     }
// }