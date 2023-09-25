package leetcode.editor.cn;
public class AddBinary {
 
    public static void main(String[] args) {
        Solution solution = new AddBinary().new Solution();

    }
    
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String addBinary(String a, String b) {
        char[] charsA = a.toCharArray();
        char[] charsB = b.toCharArray();
        int len = Math.max(charsA.length, charsB.length);
        boolean[] booleansA = new boolean[len];
        boolean[] booleansB = new boolean[len];
        boolean[] booleanResult = new boolean[len + 1];
        boolean first, second;
        for (int i = 1; i <= booleansA.length && i <= charsA.length; i++) {
            booleansA[booleansA.length - i] = charsA[charsA.length - i] == '1';
        }
        for (int i = 1; i <= booleansB.length && i <= charsB.length; i++) {
            booleansB[booleansB.length - i] = charsB[charsB.length - i] == '1';
        }
        for (int i = 1; i <= booleanResult.length; i++) {
            int index = booleanResult.length - i;


        }


        return null;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}