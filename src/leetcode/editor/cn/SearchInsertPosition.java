package leetcode.editor.cn;
public class SearchInsertPosition {
 
    public static void main(String[] args) {
        Solution solution = new SearchInsertPosition().new Solution();
        System.out.println(solution.searchInsert(new int[]{1,3,5,6}, 5));
    }
    
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {


    public int searchInsert(int[] nums, int target) {
        return searchInsert(nums, target, 0, nums.length - 1);
    }

        /**
         * 递归解法
         * @param nums
         * @param target
         * @param left
         * @param right
         * @return
         */
//    private int searchInsert(int[] nums, int target, int left, int right) {
//        // 越界 返回特殊值
//        if (right < left) {
//            return -1;
//        }
//
//        int currentIndex = (left + right) / 2;
//        if (nums[currentIndex] == target) {
//            return currentIndex;
//        }
//
//        int result = 0;
//        if (nums[currentIndex] < target) {
//            result = searchInsert(nums, target, currentIndex + 1, right);
//            if (result == -1) {
//                result = currentIndex + 1;
//            }
//        }else {
//            result = searchInsert(nums, target, left, currentIndex - 1);
//            if (result == -1) {
//                result = currentIndex;
//            }
//        }
//        return result;
//    }

        /**
         * 递推解法
         * @param nums
         * @param target
         * @param left
         * @param right
         * @return
         */
        private int searchInsert(int[] nums, int target, int left, int right) {
            int current = 0;
            int num;
            while (left <= right) {
                current = (left + right) / 2;
                num = nums[current];
                if (num == target) {
                    return current;
                }

                if (num < target) {
                    left = current + 1;
                }else {
                    right = current - 1;
                }
            }
            return nums[current] < target ? current + 1 : current;
        }

}
//leetcode submit region end(Prohibit modification and deletion)

}