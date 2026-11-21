import java.util.*;
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> common = new HashSet<>();
        for (int num : nums1) set1.add(num);
        for (int num : nums2) if (set1.contains(num)) common.add(num);
        int[] result = new int[common.size()];
        int i = 0;
        for (int num : common) result[i++] = num;
        return result;
    }
}
