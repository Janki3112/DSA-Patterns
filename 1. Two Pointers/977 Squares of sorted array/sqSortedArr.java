class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int l = 0, r = n - 1, pos = n - 1; // pos is pointer to end, fills result array from end
        int[] res = new int[n];

        while (l <= r) {
            int leftSq = nums[l] * nums[l]; 
            int rightSq = nums[r] * nums[r];

            if (leftSq > rightSq) {
                res[pos--] = leftSq;
                l++;
            } else {
                res[pos--] = rightSq;
                r--;
            }
        }
        return res;
    }
}