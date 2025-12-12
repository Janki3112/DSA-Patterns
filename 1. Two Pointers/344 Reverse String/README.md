# 1. Problem Metadata

- LeetCode ID: 344. Reverse String
- Difficulty: Easy
- Pattern: Two Pointers

--- 
# 2. Problem Statement :
Write a function that reverses a string. The input string is given as an array of characters s.

You must do this by modifying the input array in-place with O(1) extra memory.

# 3. Examples:
## 3.1 Example 1
- Input: s = ["h","e","l","l","o"]
- Output: ["o","l","l","e","h"]
    
## 3.2 Example 2
- Input: s = ["H","a","n","n","a","h"]
- Output: ["h","a","n","n","a","H"]
 
# 4. Constraints:
- 1 <= s.length <= 105
- s[i] is a printable ascii character.
---

# 5. Key Observations
- Left pointer starts at index 0, right pointer at last index.
- Swap elements until l < r is false.
