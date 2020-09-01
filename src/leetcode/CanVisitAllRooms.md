## 钥匙和房间



##### 思路：深度遍历，

深度遍历，链表，根据题意遍历。

```java
boolean[] via;
    int next;

    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        via = new boolean[rooms.size()];
        next = 0;
        dfs(rooms, next);
        return next == rooms.size();
    }

    private void dfs(List<List<Integer>> rooms, int n) {
        via[n] = true;
        next++;
        for (int i : rooms.get(n)) {
            if (!via[i]) {
                dfs(rooms, i);
            }
        }
    }
```



广度遍历。

```java
public boolean canVisitAllRooms1(List<List<Integer>> rooms) {
        int next = 0;
        boolean[] via = new boolean[rooms.size()];
        Queue<Integer> queue = new LinkedList<>();
        via[0] = true;
        queue.offer(0);
        while (!queue.isEmpty()) {
            int tem = queue.poll();
            next++;
            for (int n : rooms.get(tem)) {
                if (!via[n]) {
                    via[n] = true;
                    queue.offer(n);
                }
            }
        }
        return next == rooms.size();
    }
```

