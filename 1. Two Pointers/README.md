
# 1. Approach
Two Pointers

# 2. Algorithm
- Initialize:
    - left = 0
    - right = numbers.length - 1

- While left < right:
    - Compute sum = numbers[left] + numbers[right]
    - If sum == target: return [left + 1, right + 1]
    - If sum < target: move left forward (left++)
    - If sum > target: move right backward (right--)

# 3. Complexity
- Time Complexity: O(n)
- Space Complexity: O(1) (no extra data structures)

# 4. Common Pitfalls

- ❌ Using a HashMap (violates constant space requirement)
- ❌ Returning 0-based indices
- ❌ Using nested loops (O(n²) – inefficient)
- ❌ Forgetting that the array is already sorted

# 5. TRICK:
```
Sorted array + target sum + constant space ⇒ Two Pointers
```