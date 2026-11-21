# 18. Goal Parser Interpretation

- **LeetCode:** [#1678](https://leetcode.com/problems/goal-parser-interpretation/)
- **Difficulty:** Easy
- **Concepts:** String replacement

## Java solution

```java
class Solution {
    public String interpret(String command) {
        return command.replace("()", "o").replace("(al)", "al");
    }
}
```

> Submit the contents of `Solution.java` in the LeetCode editor. Linked-list problems use LeetCode's provided `ListNode` definition.
