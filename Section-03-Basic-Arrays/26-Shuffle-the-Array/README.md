# 26. Shuffle the Array

- **LeetCode:** [#1470](https://leetcode.com/problems/shuffle-the-array/)
- **Difficulty:** Easy
- **Concepts:** Array indexing

## Java solution

```java
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[2 * n];
        for (int i = 0; i < n; i++) {
            result[2 * i] = nums[i];
            result[2 * i + 1] = nums[i + n];
        }
        return result;
    }
}
```

> Submit the contents of `Solution.java` in the LeetCode editor. Linked-list problems use LeetCode's provided `ListNode` definition.
