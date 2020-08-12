package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

/**
 * @author lee jiawei
 */
public class CloneGraph {
    public Node cloneGraph(Node node) {
        if (node == null) {
            return null;
        }
        Map<Node, Node> log = new HashMap<>();
        log.put(node, new Node(node.val, new ArrayList<>()));
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);
        while (!queue.isEmpty()) {
            Node n = queue.remove();
            for (Node node2 : n.neighbors) {
                if (!log.containsKey(node2)) {
                    log.put(node2, new Node(node2.val, new ArrayList<>()));
                    queue.add(node2);
                }
                log.get(n).neighbors.add(log.get(node2));
            }
        }
        return log.get(node);
    }

    public Node cloneGraphDFS(Node node) {
        Map<Node, Node> log = new HashMap<>();
        return dfs(node, log);
    }

    private Node dfs(Node node, Map<Node, Node> log) {
        if (node == null) {
            return node;
        }
        if (log.containsKey(node)) {
            return log.get(node);
        }
        Node node1 = new Node(node.val, new ArrayList<>());
        log.put(node, node1);
        for (Node node2 : node.neighbors) {
            node1.neighbors.add(dfs(node2, log));
        }
        return node1;
    }
}