/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int push = 0;
        ListNode rslt = null;
        ListNode prv = null;

        while (l1 != null || l2 != null || push > 0) {
            int cv = push;
            if (l1 != null) {
                cv += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                cv += l2.val;
                l2 = l2.next;
            }

            push = cv / 10;
            ListNode cur = new ListNode(cv - push * 10);

            if (prv != null) {
                prv.next = cur;
            } else {
                rslt = cur;
            }
            prv = cur;
        }

        return rslt;
    }
}