package leetcode;

import java.util.*;

/**
 * @author : Lee JiaWei
 * @version V1.0
 * @Project: leetcode
 * @Date : 2020/8/27 11:20
 */
public class FindItinerary {

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

    public List<String> findItinerary1(List<List<String>> tickets) {
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
        String temp = "JFK";
        while (map.containsKey(temp) && map.get(temp).size() > 0) {
            res.add(temp);
            temp = map.get(temp).poll();
        }
        res.add(temp);
        return res;
    }
}
