// 20. Valid Parentheses (LeetCode: https://leetcode.com/problems/valid-parentheses/) On 24-05-2026
import java.util.Stack;

class Solution {
    public boolean isValid(String str) {
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);

            if (curr == '(' || curr == '[' || curr == '{') {
                s.push(curr);
            } else if (curr == ')' || curr == ']' || curr == '}') {

                if (s.isEmpty()) {
                    return false;
                }

                char top = s.pop();

                if ((curr == ')' && top != '(') ||
                    (curr == ']' && top != '[') ||
                    (curr == '}' && top != '{')) {
                    return false;
                }
            }
        }

        return s.isEmpty();
    }

    public static void main(String[] args) {
        Solution obj = new Solution();

        String str1 = "()";
        String str2 = "()[]{}";
        String str3 = "(]";
        String str4 = "([)]";
        String str5 = "{[]}";

        System.out.println(obj.isValid(str1)); // true
        System.out.println(obj.isValid(str2)); // true
        System.out.println(obj.isValid(str3)); // false
        System.out.println(obj.isValid(str4)); // false
        System.out.println(obj.isValid(str5)); // true
    }
}