## 机器能否返回原点

##### 思路： 模拟过程

```java
 public boolean judgeCircle(String moves) {
        int x = 0, y = 0;
        for (char i : moves.toCharArray()) {
            switch (i) {
                case 'U':
                    x++;
                    break;
                case 'D':
                    x--;
                    break;
                case 'L':
                    y++;
                    break;
                case 'R':
                    y--;
                    break;
                default:
                    break;
            }
        }
        return x == 0 && y == 0;
    }
```



简化，减少判断次数。

```java
 public boolean judgeCircle(String moves) {
        int[] count = new int[26];
        for (char i : moves.toCharArray()) {
            count[i - 'A']++;
        }
        return count['L' - 'A'] == count['R' - 'A'] && count['U' - 'A'] == count['D' - 'A'];
    }
```

