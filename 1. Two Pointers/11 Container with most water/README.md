# 1. Problem Metadata

LeetCode ID: 11. Container With Most Water
Difficulty: Medium
Pattern: Two Pointers
--- 
# 2. Problem Statement :
You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).

Find two lines that together with the x-axis form a container, such that the container contains the most water.

Return the maximum amount of water a container can store.

Notice that you may not slant the container.
 
# 3. Examples:
## 3.1 Example 1
![alt text](image.png)
Input: height = [1,8,6,2,5,4,8,3,7]
Output: 49
Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.

## 3.2 Example 2
Input: height = [1,1]
Output: 1
  

# 4. Constraints:
n == height.length
2 <= n <= 105
0 <= height[i] <= 104

---

# 5. Key Observations
- Area depends on the shorter line and the distance between pointers
- Start with two pointers at both ends of the array
- Move the pointer with the smaller height to maximize area
- Brute force is inefficient; two-pointer approach works in O(n) time
