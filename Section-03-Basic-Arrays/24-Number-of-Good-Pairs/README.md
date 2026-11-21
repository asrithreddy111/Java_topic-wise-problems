# 24. Number of Good Pairs

- **LeetCode:** [#1512](https://leetcode.com/problems/number-of-good-pairs/)
- **Difficulty:** Easy
- **Concepts:** Arrays, nested loops

## Java solution

```java
class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) count++;
            }
        }
        return count;
    }
}
```

> Submit the contents of `Solution.java` in the LeetCode editor. Linked-list problems use LeetCode's provided `ListNode` definition.
