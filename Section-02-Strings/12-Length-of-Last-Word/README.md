# 12. Length of Last Word

- **LeetCode:** [#58](https://leetcode.com/problems/length-of-last-word/)
- **Difficulty:** Easy
- **Concepts:** String traversal

## Java solution

```java
class Solution {
    public int lengthOfLastWord(String s) {
        int i = s.length() - 1;
        while (i >= 0 && s.charAt(i) == ' ') i--;
        int count = 0;
        while (i >= 0 && s.charAt(i) != ' ') {
            count++;
            i--;
        }
        return count;
    }
}
```

> Submit the contents of `Solution.java` in the LeetCode editor. Linked-list problems use LeetCode's provided `ListNode` definition.
