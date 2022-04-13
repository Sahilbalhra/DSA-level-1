// 334. Increasing Triplet Subsequence leetcode
// Given an integer array nums, return true if there exists a triple of indices (i, j, k) such that i < j < k and nums[i] < nums[j] < nums[k]. If no such indices exists, return false.

// Example 1:
// Input: nums = [1,2,3,4,5]
// Output: true
// Explanation: Any triplet where i < j < k is valid.
// Example 2:

// Input: nums = [5,4,3,2,1]
// Output: false
// Explanation: No triplet exists.

public class IncreasingTripletSubsequence {
    public boolean increasingTriplet(int[] nums) {
        int firstSmall = Integer.MAX_VALUE;
        int secondSmall = Integer.MAX_VALUE;
        
        //greedy assign seen first smallest and second smallest
        for (int x : nums) {
            if (x <= firstSmall) {
                firstSmall = x;
            } else if (x <= secondSmall) {
                secondSmall = x;
            } else {
                return true;
            }
        }
        
        return false;
    }
    
}
