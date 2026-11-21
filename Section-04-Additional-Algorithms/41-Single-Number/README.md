# 41. Single Number

- **LeetCode:** [#136](https://leetcode.com/problems/single-number/)
- **Difficulty:** Easy
- **Concepts:** Bitwise XOR

## Java solution

```java
class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) result ^= num;
        return result;
    }
}
```

> Submit the contents of `Solution.java` in the LeetCode editor. Linked-list problems use LeetCode's provided `ListNode` definition.
