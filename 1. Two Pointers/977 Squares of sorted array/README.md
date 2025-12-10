# 1. Problem Metadata

- LeetCode ID: 977. Squares of a Sorted Array
- Difficulty: Easy
- Pattern: Two Pointers
--- 
# 2. Problem Statement :
Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.

# 3. Examples:
## 3.1 Example 1
- Input: nums = [-4,-1,0,3,10]
- Output: [0,1,9,16,100]
- Explanation: After squaring, the array becomes [16,1,0,9,100].
After sorting, it becomes [0,1,9,16,100].
    
## 3.2 Example 2
- Input: nums = [0]
- Output: [0]
 
# 4. Constraints:
- Input: nums = [-7,-3,2,3,11]
- Output: [4,9,9,49,121]
 
---

# 5. Key Observations
- Compare ```nums[left]² vs nums[right]²``` and Take the larger square and fill result array from the end backwards
- Move the pointer that contributed the larger value
- Only traverse the array once with two pointers meeting in the middle
- When ```leftSq == rightSq```, either value works (they're equal) so using ```else``` instead ```else if```