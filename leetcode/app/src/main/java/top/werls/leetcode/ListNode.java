package top.werls.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * list node
 *
 * @author : Lee JiaWei
 * @Date : 2020/7/20
 */
public class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }

    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode res = new ListNode(0);
        res.next = head;
        ListNode p = res;
        ListNode q = res;
        for (int i = 0; i < n + 1; i++) {
            p = p.next;
        }
        while (p != null) {
            p = p.next;
            q = q.next;
        }
        q.next = q.next.next;
        return res.next;
    }

    public boolean isPalindrome(ListNode head) {
        List<Integer> list = new ArrayList<>();
        int length = 0;
        while (head != null) {
            length++;
            list.add(head.val);
            head = head.next;
        }
        int i = 0, j = length - 1;
        while (i < length || j > 0) {
            if (list.get(i).equals(list.get(j))) {
                i++;
                j--;
            } else {
                return false;
            }
        }
        return true;
    }

    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        while (cur != null) {
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }

    public ListNode reverseListDfs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode pre = reverseListDfs(head.next);
        head.next.next = head;
        head.next = null;
        return pre;
    }

    /**
     * 是否为环  is it a cycle list  node
     *
     * @param head ListNode
     * @return boolean
     */
    public boolean hasCycle(ListNode head) {
        Set<ListNode> set = new HashSet<>();
        while (head != null) {

            if (set.contains(head)) {
                return true;
            } else {
              set.add(head);
            }
            head = head.next;
        }
        return false;
    }
    public boolean hasCycleQuick(ListNode head) {

        if (head == null || head.next == null) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while (slow != fast) {
            if (fast == null || fast.next == null) {
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;

    }
    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }
}