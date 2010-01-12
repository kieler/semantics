package de.cau.cs.kieler.synccharts.codegen.sc;

public class test {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Graph g = new Graph(10, true);
        g.addEdge(1, 3, 1);
        g.addEdge(4, 6, -1);
        int x = g.numberOfEdges;
        System.out.println(x);
        g.print();
    }
}
