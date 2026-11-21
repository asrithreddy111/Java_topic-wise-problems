# 32. Remove Element

- **LeetCode:** [#27](https://leetcode.com/problems/remove-element/)
- **Difficulty:** Easy
- **Concepts:** Arrays, two pointers

## Java solution

```java
class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) nums[k++] = nums[i];
        }
        return k;
    }
}
```

> Submit the contents of `Solution.java` in the LeetCode editor. Linked-list problems use LeetCode's provided `ListNode` definition.
