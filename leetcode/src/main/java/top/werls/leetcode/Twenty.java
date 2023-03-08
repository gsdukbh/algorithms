package top.werls.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Twenty {

    /**
     * 有效括号检测
     *  使用栈方法
     *  先判断是不是{[(开头的 如果是则压入栈，
     *  若出现)]}判断栈顶是否有对应括号，若有则把这个推出
     *
     */
    public static boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        Map<Character,Character> map=new HashMap<>();
        map.put(')','(');
        map.put(']','[');
        map.put('}','{');
        for (int i=0;i<s.length();i++){
            char t=s.charAt(i);

            if (stack.size() > (s.length()/2)){
                return false;
            }
            if (map.containsKey(t)){
                char top=stack.empty() ? '*' : stack.pop();
                if (top !=map.get(t)){
                    return false;
                }
            }
            else {
                stack.push(t);
            }

        }
        return stack.empty();
    }

}
