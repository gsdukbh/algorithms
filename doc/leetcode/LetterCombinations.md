## 九键英文输入法

##### 思路：回溯

回溯遍历，

```java
public static List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        if (digits.length() == 0) {
            return res;
        }
        Map<Character, String> map = Map.of(
                '2', "abc",
                '3', "def",
                '4', "ghi",
                '5', "jkl",
                '6', "mno",
                '7', "pqrs",
                '8', "tuv",
                '9', "wxyz"
        );
        backtrack(map, digits, res, new StringBuffer(), 0);
        return res;
    }

    private static void backtrack(Map<Character, String> map, String d, List<String> res, StringBuffer buffer, int index) {
        if (index == d.length()) {
            res.add(buffer.toString());
        } else {
            for (int i = 0; i < map.get(d.charAt(index)).length(); i++) {
                buffer.append(map.get(d.charAt(index)).charAt(i));
                backtrack(map, d, res, buffer, index + 1);
                buffer.deleteCharAt(index);
            }
        }
    }
```



