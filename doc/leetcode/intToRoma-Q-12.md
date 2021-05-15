## 数字转罗马数字

```java

class Solution {
public String intToRoman(int num) {
        int[] ints= {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] strings= {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};;
        StringBuffer stb= new StringBuffer();
        for(int i =0;i<ints.length ;i++){
            int tem= ints[i];
            String string= strings[i];

            while ( num >= tem){
                num -=tem;
                stb.append(string);
            }
            if(num ==0){
                break;
            }
        }
        return stb.toString();

    }
}
```