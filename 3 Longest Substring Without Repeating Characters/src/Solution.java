import java.util.Arrays;

/**
 * @Author: Qianyi
 * @Date: Created in 15:23 2017/11/23
 * @Description:
 Given a string, find the length of the longest substring without repeating characters.
 Examples:
 Given "abcabcbb", the answer is "abc", which the length is 3.
 Given "bbbbb", the answer is "b", with the length of 1.
 Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int res = 0;
        int left = -1;
        int[] m = new int[256];
        Arrays.fill(m, -1);
        for (int i = 0; i < s.length(); ++i) {
            left = Math.max(left, m[s.charAt(i)]);
            m[s.charAt(i)] = i;
            res = Math.max(res, i - left);
        }
        return res;
    }
}