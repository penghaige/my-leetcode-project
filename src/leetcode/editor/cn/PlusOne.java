package leetcode.editor.cn;
public class PlusOne {
 
    public static void main(String[] args) {
        Solution solution = new PlusOne().new Solution();
        System.out.println(solution.plusOne(new int[]{9}));
    }
    
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] plusOne(int[] digits) {
        boolean isAllNine = true;
        int length = digits.length;
        for (int i = 0; i < length; i++) {
            if (digits[i] != 9) {
                isAllNine = false;
                break;
            }
        }
        int[] result = isAllNine ? new int[length + 1] : new int[length];
        for (int i = 0; i < result.length; i++) {
            if (isAllNine) {
                if (i > 0) {
                    result[i] = digits[i - 1];
                }
            }else {
                result[i] = digits[i];
            }
        }

        boolean isNeedChange = true;
        for (int j = result.length - 1; j >= 0; j--) {
            int digit = result[j];
            if (isNeedChange) {
                result[j] = (digit + 1) % 10;
                if (result[j] != 0) {
                    isNeedChange = false;
                }
            }else {
                break;
            }
        }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}