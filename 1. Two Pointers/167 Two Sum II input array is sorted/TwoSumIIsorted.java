class Solution {
    public int[] twoSum(int[] nums, int target) {
        int l = 0;  // left pointer - start at beginning
        int r = nums.length - 1; // right pointer - start at end of array
        int[] res = new int[2]; // stores result indices (two-pointer technique)

        // continues until the left pointer crosses the right pointer
        while (l < r) {   
            int sum = nums[l] + nums[r]; // calculates sum of values at the two pointers

            // Checks if the sum matches the required target
            if (sum == target) {
                res[0] = l + 1;  // 1-based index
                res[1] = r + 1;
                return res;
            } 
            else if (sum < target) {
                l++; // Move the left pointer to the right to increase the sum.
            } 
            else {
                r--; // Move the right pointer to the left to decrease the sum.
            }
        }
        return res;
    }
}