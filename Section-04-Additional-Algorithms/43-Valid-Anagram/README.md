# 43. Valid Anagram

- **LeetCode:** [#242](https://leetcode.com/problems/valid-anagram/)
- **Difficulty:** Easy
- **Concepts:** Strings, frequency counting

## Java solution

```java
class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }
        for (int value : count) if (value != 0) return false;
        return true;
    }
}
```

> Submit the contents of `Solution.java` in the LeetCode editor. Linked-list problems use LeetCode's provided `ListNode` definition.
