# 36. Fizz Buzz

- **LeetCode:** [#412](https://leetcode.com/problems/fizz-buzz/)
- **Difficulty:** Easy
- **Concepts:** Loops, conditions

## Java solution

```java
import java.util.*;
class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 15 == 0) result.add("FizzBuzz");
            else if (i % 3 == 0) result.add("Fizz");
            else if (i % 5 == 0) result.add("Buzz");
            else result.add(String.valueOf(i));
        }
        return result;
    }
}
```

> Submit the contents of `Solution.java` in the LeetCode editor. Linked-list problems use LeetCode's provided `ListNode` definition.
