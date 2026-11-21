# 33. Move Zeroes

- **LeetCode:** [#283](https://leetcode.com/problems/move-zeroes/)
- **Difficulty:** Easy
- **Concepts:** Arrays, two pointers

## Java solution

```java
class Solution {
    public void moveZeroes(int[] nums) {
        int pos = 0;
        for (int num : nums) {
            if (num != 0) nums[pos++] = num;
        }
        while (pos < nums.length) nums[pos++] = 0;
    }
}
```

> Submit the contents of `Solution.java` in the LeetCode editor. Linked-list problems use LeetCode's provided `ListNode` definition.
