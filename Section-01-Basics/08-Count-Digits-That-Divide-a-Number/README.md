# 8. Count Digits That Divide a Number

- **LeetCode:** [#2520](https://leetcode.com/problems/count-digits-that-divide-a-number/)
- **Difficulty:** Easy
- **Concepts:** Strings, loops, conditions

## Java solution

```java
class Solution {
    public int countDigits(int num) {
        String s = String.valueOf(num);
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            int digit = s.charAt(i) - '0';
            if (num % digit == 0) count++;
        }
        return count;
    }
}
```

> Submit the contents of `Solution.java` in the LeetCode editor. Linked-list problems use LeetCode's provided `ListNode` definition.
