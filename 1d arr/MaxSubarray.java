// 53. Maximum Subarray

// Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

// A subarray is a contiguous part of an array.

 

// Example 1:

// Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
// Output: 6
// Explanation: [4,-1,2,1] has the largest sum = 6.
// Example 2:

// Input: nums = [1]
// Output: 1
// Example 3:

// Input: nums = [5,4,-1,7,8]
// Output: 23

public class MaxSubarray {
   
        public static int maxSubArray(int[] nums) {
            int min = 0;
            int maxSum = Integer.MIN_VALUE;
            int sum = 0;
            for (int i : nums) {
                sum += i;
                if (maxSum == Integer.MIN_VALUE)
                    maxSum = sum;
                else
                    maxSum = Math.max(sum - min, maxSum);
                if (sum < min) {
                    min = sum;
                }
            }
            return maxSum;

        }
    

    public static void main(String[] args) {
        int [] nums =new int[]{-2,1,-3,4,-1,2,1,-5,4};
        int ans=maxSubArray(nums);
        System.out.println(ans);

    }

}
