package leetcode.editor.cn;
public class LongestCommonPrefix {
 
    public static void main(String[] args) {
        Solution solution = new LongestCommonPrefix().new Solution();
        System.out.println(solution.longestCommonPrefix(new String[]{"flower","flow","flight"}));
    }
    
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String longestCommonPrefix(String[] strs) {
        String result = "";
        for (int i = 0; i < strs.length; i++) {
            // 默认第一个是前缀
            if (i == 0) {
                result = strs[0];
                continue;
            }

            char[] chars = strs[i].toCharArray();
            // 空字符串
            if (chars.length == 0) {
                result = "";
            }

            for (int j = 0; j < chars.length; j++) {
                char current = chars[j];
                int length = result.length();
                if (j < length) {
                    // 未超过之前的前缀才需要匹配
                    char currentIndexResultChar = result.charAt(j);
                    if (current != currentIndexResultChar) {
                        result = result.substring(0, j);
                        break;
                    }

                    // 当前字符串是result的子集
                    if (j == chars.length - 1) {
                        result = strs[i];
                    }

                }else {
                    break;
                }
            }
        }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}