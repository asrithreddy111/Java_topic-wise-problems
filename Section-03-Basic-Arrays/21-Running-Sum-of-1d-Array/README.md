# 21. Running Sum of 1d Array

- **LeetCode:** [#1480](https://leetcode.com/problems/running-sum-of-1d-array/)
- **Difficulty:** Easy
- **Concepts:** Arrays, loops

## Java solution

```java
class Solution {
    public int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) nums[i] += nums[i - 1];
        return nums;
    }
}
```

> Submit the contents of `Solution.java` in the LeetCode editor. Linked-list problems use LeetCode's provided `ListNode` definition.
