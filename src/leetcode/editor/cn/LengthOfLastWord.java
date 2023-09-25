package leetcode.editor.cn;
public class LengthOfLastWord {
 
    public static void main(String[] args) {
        Solution solution = new LengthOfLastWord().new Solution();
        System.out.println(solution.lengthOfLastWord("fly me to the moon"));
    }
    
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int lengthOfLastWord(String s) {
        char[] chars = s.toCharArray();
        int left = 0, right  = 0, i = chars.length  - 1;
        while ((left == 0 || right == 0) && i >= 0) {
            if (chars[i] == ' ') {
                if (right != 0) {
                    left = i + 1;
                    break;
                }
                i--;
                continue;
            }
            if (right == 0) {
                right = i + 1;
            }
            i--;
        }
        return right - left;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}