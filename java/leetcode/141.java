/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null){
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        //注意这里while的限定 fast。next也必须不是null
        while(slow!=null && fast!= null && fast.next!= null ){
            if (slow == fast){
                return true;
            }

            slow = slow.next;
            fast = fast.next.next;


        }
        return false;
    }
}






//灵感来自奥数题 操场上有两个人跑圈 一个快的 一个慢 快的最终一定会追上慢的
//https://leetcode.com/problems/linked-list-cycle/
// 141. Linked List Cycle
