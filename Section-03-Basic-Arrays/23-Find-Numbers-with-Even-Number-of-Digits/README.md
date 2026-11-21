# 23. Find Numbers with Even Number of Digits

- **LeetCode:** [#1295](https://leetcode.com/problems/find-numbers-with-even-number-of-digits/)
- **Difficulty:** Easy
- **Concepts:** Arrays, digit counting

## Java solution

```java
class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            int digits = 0;
            while (num > 0) {
                digits++;
                num /= 10;
            }
            if (digits % 2 == 0) count++;
        }
        return count;
    }
}
```

> Submit the contents of `Solution.java` in the LeetCode editor. Linked-list problems use LeetCode's provided `ListNode` definition.
