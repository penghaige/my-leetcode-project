package leetcode.editor.cn;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
 
    public static void main(String[] args) {
        Solution solution = new RomanToInteger().new Solution();
        System.out.println(solution.romanToInt("LVIII"));
    }
    
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {

        private Map<Character, Integer> romanIntegerMap = new HashMap<Character, Integer>(){{
           put('I', 1);
           put('V', 5);
           put('X', 10);
           put('L', 50);
           put('C', 100);
           put('D', 500);
           put('M', 1000);
        }};


        public int romanToInt(String s) {
            char[] chars = s.toCharArray();
            int result = 0;
            for (int i = 0; i < chars.length; i++) {
                char current = chars[i];
                Integer currentInteger = romanIntegerMap.get(current);
                if (i != chars.length - 1) {
                    char next = chars[i+1];
                    Integer nextInteger = romanIntegerMap.get(next);
                    if (currentInteger >= nextInteger) {
                        result += currentInteger;
                    }else {
                        result = result - currentInteger + nextInteger;
                        i++;
                    }
                }else {
                    result += currentInteger;
                }
            }
            return result;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}