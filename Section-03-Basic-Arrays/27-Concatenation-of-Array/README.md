# 27. Concatenation of Array

- **LeetCode:** [#1929](https://leetcode.com/problems/concatenation-of-array/)
- **Difficulty:** Easy
- **Concepts:** Arrays

## Java solution

```java
class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2 * n];
        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];
            ans[i + n] = nums[i];
        }
        return ans;
    }
}
```

> Submit the contents of `Solution.java` in the LeetCode editor. Linked-list problems use LeetCode's provided `ListNode` definition.
