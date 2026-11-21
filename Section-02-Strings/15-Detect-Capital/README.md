# 15. Detect Capital

- **LeetCode:** [#520](https://leetcode.com/problems/detect-capital/)
- **Difficulty:** Easy
- **Concepts:** Characters, conditions

## Java solution

```java
class Solution {
    public boolean detectCapitalUse(String word) {
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if (Character.isUpperCase(word.charAt(i))) count++;
        }
        return count == word.length() || count == 0 ||
               (count == 1 && Character.isUpperCase(word.charAt(0)));
    }
}
```

> Submit the contents of `Solution.java` in the LeetCode editor. Linked-list problems use LeetCode's provided `ListNode` definition.
