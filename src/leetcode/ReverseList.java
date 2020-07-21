package leetcode;

/**
 * @author : Lee JiaWei
 * @Date : 2020/7/20
 */
public class ReverseList {
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

    public ListNode reverseListDG(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode pre = reverseListDG(head.next);
        head.next.next = head;// 反向
        head.next = null;// 头为空
        return pre;
    }

}