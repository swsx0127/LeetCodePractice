import org.junit.Test;

import java.awt.print.PrinterGraphics;

public class SolutionTest {

    private Solution sl = new Solution();

    @Test
    public void DemoTest() {
        int[] n1 = {5};
        ListNode l1 = getTestData(n1);

        int[] n2 = {5};
        ListNode l2 = getTestData(n2);

        PrintList(sl.addTwoNumbers(l1, l2));
    }



    private ListNode getTestData(int[] numbersInReverseOrder) {
        ListNode rtn = null;
        ListNode prv = null;
        for (int n : numbersInReverseOrder) {
            ListNode cur = new ListNode(n);

            if (prv != null) {
                prv.next = cur;
            }
            else {
                rtn = cur;
            }
            prv = cur;

        }
        return rtn;
    }

    private void PrintList(ListNode ln) {
        while (ln != null) {
            System.out.print(ln.val + "->");
            ln = ln.next;
        }
    }


}
