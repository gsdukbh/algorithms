## 有效的字母异位词

##### 思路：

将字符串重新排序。

```java
 if (s.length() != t.length()) {
            return false;
        }
        char[] str = s.toCharArray();
        char[] tr = t.toCharArray();
        Arrays.sort(str);
        Arrays.sort(tr);
       return Arrays.equals(tr, str);
}
```



利用数组记录重复的字符，仅限小写字母。

```java
 public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }
        for (int i = 0; i < count.length; i++) {
            if (count[i] != 0) {
                return false;
            }
        }
        return true;
    }
```

