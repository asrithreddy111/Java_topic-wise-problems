# 20. To Lower Case

- **LeetCode:** [#709](https://leetcode.com/problems/to-lower-case/)
- **Difficulty:** Easy
- **Concepts:** Strings, ASCII

## Java solution

```java
class Solution {
    public String toLowerCase(String s) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'A' && ch <= 'Z') ch = (char)(ch + 32);
            result.append(ch);
        }
        return result.toString();
    }
}
```

> Submit the contents of `Solution.java` in the LeetCode editor. Linked-list problems use LeetCode's provided `ListNode` definition.
