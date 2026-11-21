# 48. Reverse Linked List

- **LeetCode:** [#206](https://leetcode.com/problems/reverse-linked-list/)
- **Difficulty:** Easy
- **Concepts:** Linked list, pointers

## Java solution

```java
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null, curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
```

> Submit the contents of `Solution.java` in the LeetCode editor. Linked-list problems use LeetCode's provided `ListNode` definition.
