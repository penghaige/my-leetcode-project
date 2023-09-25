package leetcode.editor.cn;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {
 
    public static void main(String[] args) {
        Solution solution = new ValidParentheses().new Solution();
        System.out.println(solution.isValid(")("));
    }
    
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {

    private Map<Character, Character> map = new HashMap<Character, Character>() {{
        put(')', '(');
        put(']', '[');
        put('}', '{');
    }};

    public boolean isValid(String s) {
        char[] chars = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < chars.length; i++) {
            char current = chars[i];
            if (stack.size() > 0) {
                Character top = stack.peek();
                if (map.containsKey(current) && top == map.get(current)) {
                    stack.pop();
                }else {
                    stack.push(current);
                }
            }else {
                stack.push(current);
            }
        }
        return stack.size() == 0;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}