# 40. Missing Number

- **LeetCode:** [#268](https://leetcode.com/problems/missing-number/)
- **Difficulty:** Easy
- **Concepts:** Arrays, mathematics

## Java solution

```java
class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int expected = n * (n + 1) / 2;
        int actual = 0;
        for (int num : nums) actual += num;
        return expected - actual;
    }
}
```

> Submit the contents of `Solution.java` in the LeetCode editor. Linked-list problems use LeetCode's provided `ListNode` definition.
