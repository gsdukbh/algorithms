## 重新安排行程

给定一个机票的字符串二维数组 [from, to]，子数组中的两个成员分别表示飞机出发和降落的机场地点，对该行程进行重新规划排序。所有这些机票都属于一个从 JFK（肯尼迪国际机场）出发的先生，所以该行程必须从 JFK 开始。



这个问题和 [七桥问题]([https://zh.wikipedia.org/wiki/%E6%9F%AF%E5%B0%BC%E6%96%AF%E5%A0%A1%E4%B8%83%E6%A1%A5%E9%97%AE%E9%A2%98](https://zh.wikipedia.org/wiki/柯尼斯堡七桥问题)) 相同，看能不能一次性的走完机场。

```java
public List<String> findItinerary(List<List<String>> tickets) {
        List<String> res = new ArrayList<>();
        Map<String, PriorityQueue<String>> map = new HashMap<>(16);
//        邻接表
        for (List<String> list :
                tickets) {
            String dep = list.get(0), destination = list.get(1);
            if (!map.containsKey(dep)) {
                map.put(dep, new PriorityQueue<>());
            }
            map.get(dep).offer(destination);
        }
        dfs(map, res, "JFK");
    // 逆序反转
        Collections.reverse(res);
        return res;
    }

    private void dfs(Map<String, PriorityQueue<String>> map, List<String> res, String dep) {
        while (map.containsKey(dep) && map.get(dep).size() > 0) {
            String tem = map.get(dep).poll();
            dfs(map, res, tem);
        }
        res.add(dep);
    }
```



