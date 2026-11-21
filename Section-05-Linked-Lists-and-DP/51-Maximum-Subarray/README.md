# 51. Maximum Subarray

- **LeetCode:** [#53](https://leetcode.com/problems/maximum-subarray/)
- **Difficulty:** Easy
- **Concepts:** Kadane's algorithm

## Java solution

```java
class Solution {
    public int maxSubArray(int[] nums) {
        int currentSum = nums[0], maxSum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }
}
```

> Submit the contents of `Solution.java` in the LeetCode editor. Linked-list problems use LeetCode's provided `ListNode` definition.
