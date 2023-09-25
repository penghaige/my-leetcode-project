package leetcode.editor.cn;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
 
    public static void main(String[] args) {
        Solution solution = new TwoSum().new Solution();
        int[] result = solution.twoSum(new int[]{2, 7, 11, 15}, 9);
        System.out.println(result[0] + "\t" + result[1]);
    }
    
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Short> indexNumMap = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int anotherNum = target - num;
            if (indexNumMap.containsKey(anotherNum)) {
                return new int[]{indexNumMap.get(anotherNum), i};
            }else {
                indexNumMap.put(num, (short)i);
            }
        }
        return new int[0];
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}