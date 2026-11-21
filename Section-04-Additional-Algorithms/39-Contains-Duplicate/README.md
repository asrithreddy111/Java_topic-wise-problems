# 39. Contains Duplicate

- **LeetCode:** [#217](https://leetcode.com/problems/contains-duplicate/)
- **Difficulty:** Easy
- **Concepts:** HashSet

## Java solution

```java
import java.util.*;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.add(num)) return true;
        }
        return false;
    }
}
```

> Submit the contents of `Solution.java` in the LeetCode editor. Linked-list problems use LeetCode's provided `ListNode` definition.
