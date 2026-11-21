# 37. Palindrome Number

- **LeetCode:** [#9](https://leetcode.com/problems/palindrome-number/)
- **Difficulty:** Easy
- **Concepts:** Numbers, loops

## Java solution

```java
class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        int original = x;
        long reverse = 0;
        while (x > 0) {
            reverse = reverse * 10 + x % 10;
            x /= 10;
        }
        return original == reverse;
    }
}
```

> Submit the contents of `Solution.java` in the LeetCode editor. Linked-list problems use LeetCode's provided `ListNode` definition.
