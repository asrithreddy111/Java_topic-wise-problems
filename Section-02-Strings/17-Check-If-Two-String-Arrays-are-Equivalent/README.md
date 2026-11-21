# 17. Check If Two String Arrays are Equivalent

- **LeetCode:** [#1662](https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/)
- **Difficulty:** Easy
- **Concepts:** Strings, StringBuilder

## Java solution

```java
class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder a = new StringBuilder();
        StringBuilder b = new StringBuilder();
        for (String s : word1) a.append(s);
        for (String s : word2) b.append(s);
        return a.toString().equals(b.toString());
    }
}
```

> Submit the contents of `Solution.java` in the LeetCode editor. Linked-list problems use LeetCode's provided `ListNode` definition.
