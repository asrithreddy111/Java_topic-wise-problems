# 35. Maximum Number of Words Found in Sentences

- **LeetCode:** [#2114](https://leetcode.com/problems/maximum-number-of-words-found-in-sentences/)
- **Difficulty:** Easy
- **Concepts:** Arrays, strings

## Java solution

```java
class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxWords = 0;
        for (String sentence : sentences) {
            int words = sentence.split(" ").length;
            maxWords = Math.max(maxWords, words);
        }
        return maxWords;
    }
}
```

> Submit the contents of `Solution.java` in the LeetCode editor. Linked-list problems use LeetCode's provided `ListNode` definition.
