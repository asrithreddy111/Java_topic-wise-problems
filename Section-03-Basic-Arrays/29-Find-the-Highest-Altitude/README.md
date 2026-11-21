# 29. Find the Highest Altitude

- **LeetCode:** [#1732](https://leetcode.com/problems/find-the-highest-altitude/)
- **Difficulty:** Easy
- **Concepts:** Running total

## Java solution

```java
class Solution {
    public int largestAltitude(int[] gain) {
        int altitude = 0, highest = 0;
        for (int g : gain) {
            altitude += g;
            highest = Math.max(highest, altitude);
        }
        return highest;
    }
}
```

> Submit the contents of `Solution.java` in the LeetCode editor. Linked-list problems use LeetCode's provided `ListNode` definition.
