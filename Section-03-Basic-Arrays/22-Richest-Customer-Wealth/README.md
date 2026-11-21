# 22. Richest Customer Wealth

- **LeetCode:** [#1672](https://leetcode.com/problems/richest-customer-wealth/)
- **Difficulty:** Easy
- **Concepts:** 2D arrays, nested loops

## Java solution

```java
class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        for (int[] account : accounts) {
            int sum = 0;
            for (int amount : account) sum += amount;
            maxWealth = Math.max(maxWealth, sum);
        }
        return maxWealth;
    }
}
```

> Submit the contents of `Solution.java` in the LeetCode editor. Linked-list problems use LeetCode's provided `ListNode` definition.
