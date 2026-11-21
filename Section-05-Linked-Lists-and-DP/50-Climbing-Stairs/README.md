# 50. Climbing Stairs

- **LeetCode:** [#70](https://leetcode.com/problems/climbing-stairs/)
- **Difficulty:** Easy
- **Concepts:** Dynamic programming

## Java solution

```java
class Solution {
    public int climbStairs(int n) {
        if (n <= 2) return n;
        int first = 1, second = 2;
        for (int i = 3; i <= n; i++) {
            int third = first + second;
            first = second;
            second = third;
        }
        return second;
    }
}
```

> Submit the contents of `Solution.java` in the LeetCode editor. Linked-list problems use LeetCode's provided `ListNode` definition.
