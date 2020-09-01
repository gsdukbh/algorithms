package leetcode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author : Lee JiaWei
 * @version V1.0
 * @Project: leetcode
 * @Date : 2020/8/31 10:50
 */
public class CanVisitAllRooms {
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


}
