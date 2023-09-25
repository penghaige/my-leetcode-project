package leetcode.editor.cn;
public class RemoveElement {
 
    public static void main(String[] args) {
        Solution solution = new RemoveElement().new Solution();
        System.out.println(solution.removeElement(new int[]{1}, 1));
    }
    
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int removeElement(int[] nums, int val) {
        int p = 0;
        int q = nums.length - 1;
        while (p <= q) {
            while (p <= q && nums[p] != val) {
                p++;
            }
            while (p <= q && nums[q] == val) {
                q--;
            }
            if (p < q) {
                int temp = nums[p];
                nums[p] = nums[q];
                nums[q] = temp;
            }
        }
        return p;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}