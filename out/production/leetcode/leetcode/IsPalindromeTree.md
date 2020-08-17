## 回文链表

判读一个链表的值是否是回文串。

```txt
输入: 1->2->2->1
输出: true
```

##### 思路：暴力法，双指针

```java
public boolean isPalindrome(ListNode head) {
        List<Integer> list=new ArrayList<>();
        int length = 0;
        while (head != null) {
            length++;
            list.add(head.val);
            head = head.next;
        }
        int i = 0, j = length - 1;
        while (i <length || j > 0) {
            if (list.get(i).equals(list.get(j))) {
                i++;
                j--;
            } else {
                return false;
            }
        }
        return true;
   }
```

`List` 操作花费了太多的时间。

思路：2 ，快慢指针，找出mid。

```java
 public boolean isPalindrome(ListNode head) {
      if(head == null || head.next == null) {
            return true;
        }
        ListNode slow = head, fast = head;
        ListNode pre = head, prepre = null;
        while(fast != null && fast.next != null) {
            pre = slow;
            slow = slow.next;
            fast = fast.next.next;
            pre.next = prepre;
            prepre = pre;
        }
        if(fast != null) {
            slow = slow.next;
        }
        while(pre != null && slow != null) {
            if(pre.val != slow.val) {
                return false;
            }
            pre = pre.next;
            slow = slow.next;
        }
        return true;
    }
```

