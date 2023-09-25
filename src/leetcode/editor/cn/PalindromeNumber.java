package leetcode.editor.cn;
public class PalindromeNumber {
 
    public static void main(String[] args) {
        Solution solution = new PalindromeNumber().new Solution();
        System.out.println(solution.isPalindrome(121));
    }
    
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isPalindrome(int x) {
        if (x >= 0) {
            int y = 0;
            int i = x;
            do {
                y = y * 10 + i % 10;
                i /= 10;
            } while (i != 0);
            return x == y;
        }else {
            return false;
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}