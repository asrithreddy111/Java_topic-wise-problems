# 25. Kids With the Greatest Number of Candies

- **LeetCode:** [#1431](https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/)
- **Difficulty:** Easy
- **Concepts:** Arrays, conditions

## Java solution

```java
import java.util.*;
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = candies[0];
        for (int c : candies) max = Math.max(max, c);
        List<Boolean> result = new ArrayList<>();
        for (int c : candies) result.add(c + extraCandies >= max);
        return result;
    }
}
```

> Submit the contents of `Solution.java` in the LeetCode editor. Linked-list problems use LeetCode's provided `ListNode` definition.
