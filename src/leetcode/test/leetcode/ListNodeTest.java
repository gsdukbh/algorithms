package leetcode;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author : Lee JiaWei
 * @version V1.0
 * @Project: leetcode
 * @Date : 2020/8/17 16:01
 */
class ListNodeTest {

    @Test
    void deleteNode() {
        ListNode listNode = new ListNode(0);
        listNode.next = new ListNode(1);
        listNode.next.next = new ListNode(2);
        listNode.deleteNode(listNode.next);
        System.out.println(listNode.toString());
    }

    @Test
    void removeNthFromEnd() {
        ListNode listNode = new ListNode(0);
        listNode.next = new ListNode(1);
        listNode.next.next = new ListNode(2);
        listNode.removeNthFromEnd(listNode, 2);
        System.out.println(listNode.toString());
    }

    @Test
    void testToString() {
        ListNode listNode = new ListNode(0);
        listNode.next = new ListNode(1);
        listNode.next.next = new ListNode(2);
        System.out.println(listNode.toString());
    }

    @Test
    void isPalindrome() {
        ListNode listNode = new ListNode(-129);
        ListNode listNode1 = new ListNode(3);
        listNode.next = new ListNode(1);
        listNode1.next = listNode.next;
        listNode.next.next = new ListNode(-129);
        listNode.next.next.next = listNode1;
//        System.out.println(listNode.isPalindrome(listNode));
        System.out.println(listNode);

    }
}