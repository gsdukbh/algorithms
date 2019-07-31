package leetcode;

public class Twenty_one {
    /**
     * 合并两个有序链表
     */
    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode prehead = new ListNode(-1);
        ListNode pr = prehead;
        while (l1 != null && l2 != null) {
            //遍历两个list ，依次判断两个的大小，把前指针指向小的数。
            if (l1.val <= l2.val) {
                pr.next = l1;
                l1 = l1.next;
            } else {
                pr.next = l2;
                l2 = l2.next;
            }
            pr = pr.next;
        }
        pr.next = l1 == null ? l2 : l1;
        //把最后list 合并到一起
        return prehead.next;
    }
}
