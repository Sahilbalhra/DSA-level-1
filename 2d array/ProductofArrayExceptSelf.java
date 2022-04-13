// 238. Product of Array Except Self leetcode
// Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

// The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

// You must write an algorithm that runs in O(n) time and without using the division operation.
// Example 1:

// Input: nums = [1,2,3,4]
// Output: [24,12,8,6]
// Example 2:

// Input: nums = [-1,1,0,-3,3]
// Output: [0,0,9,0,0]

public class ProductofArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int totalProduct = 1;
        boolean hasZero = false;
        int[] ans = new int[nums.length];
        
        for(int i : nums) {
            if(i == 0 && ! hasZero) {
                hasZero = true;
                continue;
            }
            totalProduct *= i;
        }
        
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 0) {
                if(totalProduct != 0) {
                    ans[i] = totalProduct;
                }
                else {
                    ans[i] = 0;
                }
                continue;
            }
            
            ans[i] = hasZero ? 0 : totalProduct/nums[i];
        }
        
        return ans;
     
    }
    
}
