package top.werls.data.algortihm.chapter.one;

import java.util.*;

/**
 * @author : Lee JiaWei
 * @version V1.0
 * @Project: data
 * @Date : 2020/7/23 17:32
 */
public class StringTools {
    /**
     * 判断是否含有回文
     *
     * @param str String
     * @return boolean
     */
    public static boolean isPalindrome(String str) {

        int length = str.length();
        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static String fileExtensionName(String file) {
        return file.substring(file.indexOf(".") + 1);
    }

    public static String fileBaseName(String file) {
        return file.substring(0, file.indexOf("."));
    }

    public boolean isSorted(String[] strings) {
        for (int i = 1; i < strings.length; i++) {
            if (strings[i - 1].compareTo(strings[i]) > 0) {
                return false;
            }
        }
        return true;
    }


    public static String infixRe(String str) {
        char[] temp = str.toCharArray();
        Stack<String> ops = new Stack<>();
        Stack<String> value = new Stack<>();
        for (char c : temp) {
            if (c >= '0' && c <= '9') {
                value.push(String.valueOf(c));
            } else if (isOperate(c)) {
                ops.push(String.valueOf(c));
            } else {
                String num2 = value.pop();
                String num1 = value.pop();
                String ope = ops.pop();
                value.push("(" + num1 + ope + num2 + ")");
            }
        }
        return value.pop();
    }

    public static String toPostfix(String string) {
        char[] temp = string.toCharArray();
        Stack<String> ops = new Stack<>();
        Queue<String> value = new ArrayDeque<>();
        for (char c : temp) {
            if (c >= '0' && c <= '9') {
                value.add(String.valueOf(c));
            } else if (isOperate(c)) {
                System.out.println(c);
//                是否为运算符
                if (!ops.isEmpty()) {
                    if (priority(c) > priority(ops.peek().charAt(0))) {
                        ops.push(String.valueOf(c));
                    } else {
//                    低优先级 出栈
                        System.out.println(ops.peek());
                        value.add(ops.pop());
                    }
                }else {
                    ops.push(String.valueOf(c));
                }
            } else if (c == '(') {
                ops.push(String.valueOf(c));
            } else if (c == ')') {
                while (ops.peek().charAt(0) != '(') {
                    System.out.println(ops.peek());
                    value.add(ops.pop());
                }
//                出 '('
                ops.pop();
            }
        }
        while (!ops.isEmpty()) {
            System.out.println(ops.peek());
            value.add(ops.pop());
        }
        StringBuilder res = new StringBuilder();
        while (!value.isEmpty()) {
            res.append(value.poll());
        }
        return res.toString();
    }

    private static boolean isOperate(char c) {
        Map<Character, Integer> symbol = new HashMap<>(4);
        symbol.put('+', 1);
        symbol.put('-', 1);
        symbol.put('/', 2);
        symbol.put('*', 2);
        return symbol.containsKey(c);
    }

    private static int priority(char c) {
        Map<Character, Integer> symbol = new HashMap<>(4);
        symbol.put('+', 1);
        symbol.put('-', 1);
        symbol.put('/', 2);
        symbol.put('*', 2);
        return symbol.get(c);
    }
}
