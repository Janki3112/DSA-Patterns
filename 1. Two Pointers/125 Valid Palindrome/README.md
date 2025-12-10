# 1. Problem Metadata

LeetCode ID: 125. Valid Palindrome
Difficulty: Easy
Pattern: Two Pointers
--- 
# 2. Problem Statement :
A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.
 
# 3. Examples:
## 3.1 Example 1
Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.

## 3.2 Example 2
Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.

## 3.3 Example 3
 Input: s = " "
Output: true
Explanation: s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome.

# 4. Constraints:
1 <= s.length <= 2 * 105
s consists only of printable ASCII characters.

---

# 5. Key Observations
- Ignore case while comparing characters
- Skip all non-alphanumeric characters
- Use two pointers from start and end
- Empty string is a valid palindrome