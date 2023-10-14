package RemoveNthNodeFromEndofList;

public class Solution {

    public ListNode removeNthFromEnd(ListNode head, int n) {
//        try {
//            List<ListNode> nodes = new ArrayList<>();
//            while (head != null) {
//                ListNode node = new ListNode();
//                node.val = head.val;
//                nodes.add(node);
//                head = head.next;
//            }
//            nodes.remove(nodes.size() - n);
//            for (int i = 0; i < nodes.size() - 1; i++) {
//                nodes.get(i).next = nodes.get(i + 1);
//            }
//            return nodes.get(0);
//        } catch (Exception ex) {
//            return null;
//        }
        ListNode start = new ListNode(0);
        ListNode slow = start, fast = start;
        slow.next = head;

        for (int i = 0; i < n + 1; i++) {
            fast = fast.next;
        }

        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;
        return start.next;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode node1 = new ListNode();
        ListNode node2 = new ListNode();
        ListNode node3 = new ListNode();
        ListNode node4 = new ListNode();
        ListNode node5 = new ListNode();
        node1.val = 1;
        node2.val = 2;
        node3.val = 3;
        node4.val = 4;
        node5.val = 5;
//        node1.next = node2;
//        node2.next = node3;
//        node3.next = node4;
//        node4.next = node5;
        System.out.println(solution.removeNthFromEnd(node1, 1));
    }
}

