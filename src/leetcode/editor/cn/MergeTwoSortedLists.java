package leetcode.editor.cn;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeTwoSortedLists {
 
    public static void main(String[] args) {
        Solution solution = new MergeTwoSortedLists().new Solution();
        ListNode listNode1 = solution.listToNode(Arrays.asList(1, 2, 4));
        ListNode listNode2 = solution.listToNode(Arrays.asList(1, 3, 4));
        ListNode listNode = solution.mergeTwoLists(listNode1, listNode2);
        System.out.println(solution.nodeToList(listNode).toString());
    }

    class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
    
    //leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {

    /**
     * 递归解法
     */
//    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
//        if (list1 == null) {
//            return list2;
//        }
//
//        if (list2 == null) {
//            return list1;
//        }
//
//        if (list1.val < list2.val) {
//            list1.next = mergeTwoLists(list1.next, list2);
//            return list1;
//        }else {
//            list2.next = mergeTwoLists(list1, list2.next);
//            return list2;
//        }
//    }

    /**
     * 递推解法
     * @param list1
     * @param list2
     * @return
     */
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode resultNode = new ListNode();
        ListNode currentNode = resultNode;
        while (list1 != null || list2 != null) {
            if (list1 == null) {
                currentNode.next = list2;
                break;
            }

            if (list2 == null) {
                currentNode.next = list1;
                break;
            }

            if (list1.val < list2.val) {
                currentNode.next = list1;
                list1 = list1.next;
            }else {
                currentNode.next = list2;
                list2 = list2.next;
            }
            currentNode = currentNode.next;
        }
        return resultNode.next;

    }


    public List<Integer> nodeToList(ListNode node) {
        ListNode tempNode = node;
        List<Integer> list = new ArrayList<>();
        while (tempNode != null) {
            list.add(tempNode.val);
            tempNode = tempNode.next;
        }
        return list;
    }

    public ListNode listToNode(List<Integer> list) {
        ListNode headNode = null;
        ListNode tailNode = null;
        for (int i = 0; i < list.size(); i++) {
            Integer value = list.get(i);
            if (i == 0) {
                headNode = new ListNode(value);
                tailNode = headNode;
            }else {
                ListNode node = new ListNode(value);
                tailNode.next = node;
                tailNode = node;
            }
        }
        return headNode;
    }


}
//leetcode submit region end(Prohibit modification and deletion)

}