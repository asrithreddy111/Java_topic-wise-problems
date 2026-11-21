# 6. Number of Steps to Reduce a Number to Zero

- **LeetCode:** [#1342](https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/)
- **Difficulty:** Easy
- **Concepts:** Loops, conditions

## Java solution

```java
class Solution {
    public int numberOfSteps(int num) {
        int steps = 0;
        while (num > 0) {
            if (num % 2 == 0) num /= 2;
            else num--;
            steps++;
        }
        return steps;
    }
}
```

> Submit the contents of `Solution.java` in the LeetCode editor. Linked-list problems use LeetCode's provided `ListNode` definition.
