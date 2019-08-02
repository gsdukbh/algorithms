package leetcode;

import java.util.Stack;

public class MyQueue {
    private Stack<Integer> a;
    /*入*/
    private Stack<Integer> b;
    /*出*/
    private int front ;
    /** Initialize your data structure here. */
        public MyQueue() {
            a=new Stack<>();
            b=new Stack<>();
        }

        /** Push element x to the back of queue. */
        public void push(int x) {
            if (a.empty()){
                front =x;
            }
            a.push(x);
        }

        /** Removes the element from in front of queue and returns that element. */
        public int pop() {
            if (b.isEmpty()){
                while (!a.isEmpty()){
                    b.push(a.pop());
                }
            }
           return b.pop();
        }

        /** Get the front element. */
        public int peek() {
            if (!b.isEmpty()){
                return b.peek();
            }
            return front;
        }

        /** Returns whether the queue is empty. */
        public boolean empty() {
                return a.isEmpty() && b.isEmpty();
        }



}
