# 44. Majority Element

- **LeetCode:** [#169](https://leetcode.com/problems/majority-element/)
- **Difficulty:** Easy
- **Concepts:** Arrays, Boyer-Moore voting

## Java solution

```java
class Solution {
    public int majorityElement(int[] nums) {
        int candidate = 0, count = 0;
        for (int num : nums) {
            if (count == 0) candidate = num;
            if (num == candidate) count++;
            else count--;
        }
        return candidate;
    }
}
```

> Submit the contents of `Solution.java` in the LeetCode editor. Linked-list problems use LeetCode's provided `ListNode` definition.
