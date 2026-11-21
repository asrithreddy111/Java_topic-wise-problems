# 16. Reverse Prefix of Word

- **LeetCode:** [#2000](https://leetcode.com/problems/reverse-prefix-of-word/)
- **Difficulty:** Easy
- **Concepts:** Strings, two pointers

## Java solution

```java
class Solution {
    public String reversePrefix(String word, char ch) {
        int index = word.indexOf(ch);
        if (index == -1) return word;
        char[] arr = word.toCharArray();
        int left = 0, right = index;
        while (left < right) {
            char temp = arr[left];
            arr[left++] = arr[right];
            arr[right--] = temp;
        }
        return new String(arr);
    }
}
```

> Submit the contents of `Solution.java` in the LeetCode editor. Linked-list problems use LeetCode's provided `ListNode` definition.
