# 10. Convert Binary Number in a Linked List to Integer

- **LeetCode:** [#1290](https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/)
- **Difficulty:** Easy
- **Concepts:** Linked list, number conversion

## Java solution

```java
class Solution {
    public int getDecimalValue(ListNode head) {
        int result = 0;
        while (head != null) {
            result = result * 2 + head.val;
            head = head.next;
        }
        return result;
    }
}
```

> Submit the contents of `Solution.java` in the LeetCode editor. Linked-list problems use LeetCode's provided `ListNode` definition.
