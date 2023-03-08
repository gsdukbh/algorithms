package top.werls.leetcode;


import org.junit.Test;

/**
 * @author : Lee JiaWei
 * @version V1.0
 * @Project: leetcode
 * @Date : 2020/8/28 16:05
 */
class MinStackTest {


    @Test
    void push() {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.top());
        System.out.println(minStack.getMin());
    }

    @Test
    void pop() {

    }

    @Test
    void top() {

    }

    @Test
    void getMin() {

    }
}