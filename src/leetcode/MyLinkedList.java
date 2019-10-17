package leetcode;

import java.nio.channels.NonWritableChannelException;

public class MyLinkedList {
    public  class ListNode{
        int val;
        ListNode next;
        ListNode(int x){val=x; }
    }
    private ListNode head;
    private int size;
    /** Initialize your data structure here. */
    public MyLinkedList() {
        size=0;
        head =new ListNode(-1);
    }

    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        if (index >=this.size || index <0){
            return -1;
        }
        ListNode temp = this.head;
        for (int i =0;i<index;i++){
            temp=temp.next;
        }
        return  temp.val;
    }

    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        ListNode temp = new ListNode(val);
        temp.next = this.head;
        this.head=temp;
        size++;
    }

    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        if (size == 0){
            head=new ListNode(val);
        }
        else {
            ListNode temp=head;
            while (temp.next != null){
                temp = temp.next;
            }
            temp.next = new ListNode(val);
        }
        size++;

    }

    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
       if (index<this.size || index> 0){
           ListNode node = new ListNode(val);
           ListNode temp = head;
           for (int i=0;i<index;i++){
               temp = temp.next;
           }
           node.next=temp.next;
           temp.next=node;
           size++;
       }
    }

    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        if (index<=this.size || index >0){
            ListNode temp = head;
            for (int i=0;i<index;i++){
                temp = temp.next;
            }
            temp.next=temp.next.next;
        }
    }
}
