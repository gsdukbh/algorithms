package leetcode;

public class ConvertToBase7 {
    /**
     * 十转七进制数
     */
    /*内部方法实现*/

    public static String convertToBase7(int num) {
        return Integer.toString(num,7);
    }

    public static String convertToBase7_1(int num) {
        StringBuilder temp=new StringBuilder();
        while (num>=7){

        }

        return Integer.toString(num,7);
    }

    public static void main(String[] args) {
        System.out.println(10%7);
    }
}
