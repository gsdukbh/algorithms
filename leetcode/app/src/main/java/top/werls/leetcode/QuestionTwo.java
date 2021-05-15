package top.werls.leetcode;

public class QuestionTwo {
    /**
     * 给出两个非空的链表用来表示两个非负的整数。其中它们各自的位数是按照逆序的方式存储的，并且它们的每个节点只能存储 一位 数字。
     *
     * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
     *
     * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
     */
    // Definition for singly-linked list.
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public static void main(String[] args) {
        ListNode node, node1, s;
        node = new ListNode(3);
        node.next = new ListNode(4);
        node.next.next = new ListNode(2);
        node1 = new ListNode(4);
        node1.next = new ListNode(6);
        node1.next.next = new ListNode(5);
        s = addTwoNumbers(node, node1);
        while (s != null) {
            System.out.println(s.val);
            s = s.next;
        }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode sumNode = new ListNode(0);
        ListNode p = l1, q = l2, s = sumNode;
        int carry = 0;
        while (p != null | q != null) {
            int x, y;
            if (p != null)
                x = p.val;
            else
                x = 0;
            if (q != null)
                y = q.val;
            else
                y = 0;
            int sum = x + y + carry;
            carry = sum / 10;
            s.next = new ListNode(sum % 10);
            s = s.next;
            if (p != null)
                p = p.next;
            if (q != null)
                q = q.next;
        }
        if (carry > 0) {
            s.next = new ListNode(carry);
        }
        return sumNode.next;
    }
}
