# 19. Defanging an IP Address

- **LeetCode:** [#1108](https://leetcode.com/problems/defanging-an-ip-address/)
- **Difficulty:** Easy
- **Concepts:** String replacement

## Java solution

```java
class Solution {
    public String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }
}
```

> Submit the contents of `Solution.java` in the LeetCode editor. Linked-list problems use LeetCode's provided `ListNode` definition.
