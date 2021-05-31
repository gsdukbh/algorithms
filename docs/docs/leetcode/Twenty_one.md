合并两个有序链表
-

将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的

* [代码](../../../leetcode/app/src/main/java/top/werls/leetcode/Twenty_one.java)

```java

public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode head = new ListNode(-1);
        ListNode pre = head;
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
        return head.next;
    }
```