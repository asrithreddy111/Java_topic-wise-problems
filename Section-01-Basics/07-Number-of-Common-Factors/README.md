# 7. Number of Common Factors

- **LeetCode:** [#2427](https://leetcode.com/problems/number-of-common-factors/)
- **Difficulty:** Easy
- **Concepts:** Loops, modulus

## Java solution

```java
class Solution {
    public int commonFactors(int a, int b) {
        int count = 0;
        for (int i = 1; i <= Math.min(a, b); i++) {
            if (a % i == 0 && b % i == 0) count++;
        }
        return count;
    }
}
```

> Submit the contents of `Solution.java` in the LeetCode editor. Linked-list problems use LeetCode's provided `ListNode` definition.
