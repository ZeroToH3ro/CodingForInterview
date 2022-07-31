package Progress.StackQueue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Graph {
    private int V;
    private LinkedList<Integer> g[];
    // declaring the arrayss to store colors and distances
    // and parents
    String[] color;
    int[] d, p;

    // Contructors
    public Graph(int v) {
        this.V = v;
        g = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            g[i] = new LinkedList<Integer>();
        }
    }

    // function to add an edge into the graph
    void addEdge(int u, int v) {
        g[u].add(v);
        g[v].add(u);
    }

    // This function does the Breadth First Search
    void BFSSingleSource(int s) {
        // The queue used for the BFS operation
        Queue<Integer> q = new LinkedList<>();

        // Pushing the root node inside the queue
        q.add(s);

        /*
         * Distance of root node is 0 & colour
         * is gray as it is visited partially now
         */
        d[s] = 0;
        color[s] = "green";

        /*
         * Loop to traverse the graph. Traversal
         * will happen traverse until the queue is
         * not empty.
         */
        while (!q.isEmpty()) {
            /*
             * Extracting the front element(node)
             * and popping it out of queue.
             */
            int u = q.poll();

            System.out.print(u + " ");

            /*
             * This loop traverses all the child nodes of u
             */
            for (int i : g[u]) {
                /*
                 * If the colour is white then the said node
                 * is not traversed.
                 */
                if (color[i] == "white") {
                    color[i] = "green";
                    d[i] = d[u] + 1;
                    p[i] = u;

                    /*
                     * Pushing the node inside queue
                     * to traverse its children.
                     */
                    q.add(i);
                }
            }

            /*
             * Now the node u is completely traversed
             * and colour is changed to black.
             */
            color[u] = "dark_green";
        }

        System.out.println();
    }

    void BFSFull(int n) {
        /*
         * Initially all nodes are not traversed.
         * Therefore, the colour is white.
         */
        color = new String[n];
        d = new int[n];
        p = new int[n];
        Arrays.fill(color, "white");
        Arrays.fill(d, 0);
        Arrays.fill(p, -1);

        // Calling BFSSingleSource() for all white
        // vertices.
        for (int i = 0; i < n; i++) {
            if (color[i] == "white")
                BFSSingleSource(i);
        }
    }

    // Driver method
    public static void main(String[] args) {
        int n = 7;
        Graph g = new Graph(n);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        g.addEdge(1, 4);
        g.addEdge(2, 5);
        g.addEdge(2, 6);

        g.BFSFull(n);
    }
}
