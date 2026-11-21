# 42. Best Time to Buy and Sell Stock

- **LeetCode:** [#121](https://leetcode.com/problems/best-time-to-buy-and-sell-stock/)
- **Difficulty:** Easy
- **Concepts:** Arrays, minimum tracking

## Java solution

```java
class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int price : prices) {
            minPrice = Math.min(minPrice, price);
            maxProfit = Math.max(maxProfit, price - minPrice);
        }
        return maxProfit;
    }
}
```

> Submit the contents of `Solution.java` in the LeetCode editor. Linked-list problems use LeetCode's provided `ListNode` definition.
