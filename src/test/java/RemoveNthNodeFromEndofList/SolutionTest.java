package RemoveNthNodeFromEndofList;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class SolutionTest {

    public ListNode configureCorrectListNode() {
        ListNode head = new ListNode(1);
        ListNode previous = head;
        for (int i = 2; i < 6; i++) {
            ListNode node = new ListNode(i);
            previous.next = node;
            previous = node;
        }
        return head;
    }

    public ListNode configureExpectedForCorrectList() {
        ListNode head = new ListNode(1);
        ListNode previous = head;
        for (int i = 2; i < 6; i++) {
            if (i == 4) {
                continue;
            }
            ListNode node = new ListNode(i);
            previous.next = node;
            previous = node;
        }
        return head;
    }

    @Test
    public void givenCorrectListNodeThenRemoveNode() {
        ListNode head = configureCorrectListNode();
        int n = 2;
        Solution solution = new Solution();
        ListNode result = solution.removeNthFromEnd(head, n);
        assertEquals(result, configureExpectedForCorrectList());
    }

    @Test
    public void givenUniqNodeThenNull() {
        ListNode head = new ListNode(1);
        int n = 1;
        Solution solution = new Solution();
        ListNode result = solution.removeNthFromEnd(head, n);
        assertNull(result);
    }

    @Test
    public void givenDoubleNodeThenUniqNode() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        int n = 1;
        Solution solution = new Solution();
        ListNode result = solution.removeNthFromEnd(head, n);
        assertEquals(result, new ListNode(1));
    }

}