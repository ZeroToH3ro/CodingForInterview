package Progress.StackQueue;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CloneGraphDFS {
    class Node {
        public int val;
        public List<Node> neighbors;

        public Node() {
            val = 0;
            neighbors = new ArrayList<Node>();
        }

        public Node(int _val) {
            val = _val;
            neighbors = new ArrayList<Node>();
        }

        public Node(int _val, ArrayList<Node> _neighbors) {
            val = _val;
            neighbors = _neighbors;
        }
    }

    class Solution {
        HashMap<Node, Node> vis = new HashMap<Node, Node>();

        public Node dfs(Node node) {
            // if the node is null simplly return null
            if (node == null)
                return null;
            // if the node is already present in hash map, then return reference of that
            // ndoe
            if (vis.containsKey(node))
                return vis.get(node);
            // make a new node and store the value of original node
            Node newNode = new Node(node.val);
            vis.put(node, newNode);
            // traverse through neighbors of node and push back dfs of each neighbor
            for (Node edges : node.neighbors) {
                newNode.neighbors.add(dfs(edges));
            }
            return newNode;
        }

        public Node cloneGraph(Node node) {
            Node clone = dfs(node);
            return clone;
        }
    }
}
