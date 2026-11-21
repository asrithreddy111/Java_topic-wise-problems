# 13. Longest Common Prefix

- **LeetCode:** [#14](https://leetcode.com/problems/longest-common-prefix/)
- **Difficulty:** Easy
- **Concepts:** String comparison

## Java solution

```java
class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (!strs[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }
}
```

> Submit the contents of `Solution.java` in the LeetCode editor. Linked-list problems use LeetCode's provided `ListNode` definition.
