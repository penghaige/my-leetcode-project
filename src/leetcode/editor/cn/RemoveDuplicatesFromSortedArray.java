package leetcode.editor.cn;
public class RemoveDuplicatesFromSortedArray {
 
    public static void main(String[] args) {
        Solution solution = new RemoveDuplicatesFromSortedArray().new Solution();
        System.out.println(solution.removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4}));
    }
    
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int removeDuplicates(int[] nums) {
        int q = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[q] = nums[i];
                q++;
            }
        }
        return q;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}