# 11. Reverse String

- **LeetCode:** [#344](https://leetcode.com/problems/reverse-string/)
- **Difficulty:** Easy
- **Concepts:** Character arrays, two pointers

## Java solution

```java
class Solution {
    public void reverseString(char[] s) {
        int left = 0, right = s.length - 1;
        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }
}
```

> Submit the contents of `Solution.java` in the LeetCode editor. Linked-list problems use LeetCode's provided `ListNode` definition.
