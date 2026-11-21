# 28. Build Array from Permutation

- **LeetCode:** [#1920](https://leetcode.com/problems/build-array-from-permutation/)
- **Difficulty:** Easy
- **Concepts:** Arrays, indexing

## Java solution

```java
class Solution {
    public int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) ans[i] = nums[nums[i]];
        return ans;
    }
}
```

> Submit the contents of `Solution.java` in the LeetCode editor. Linked-list problems use LeetCode's provided `ListNode` definition.
