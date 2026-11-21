# 46. Squares of a Sorted Array

- **LeetCode:** [#977](https://leetcode.com/problems/squares-of-a-sorted-array/)
- **Difficulty:** Easy
- **Concepts:** Two pointers

## Java solution

```java
class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int left = 0, right = n - 1, pos = n - 1;
        while (left <= right) {
            int a = nums[left] * nums[left];
            int b = nums[right] * nums[right];
            if (a > b) {
                result[pos--] = a;
                left++;
            } else {
                result[pos--] = b;
                right--;
            }
        }
        return result;
    }
}
```

> Submit the contents of `Solution.java` in the LeetCode editor. Linked-list problems use LeetCode's provided `ListNode` definition.
