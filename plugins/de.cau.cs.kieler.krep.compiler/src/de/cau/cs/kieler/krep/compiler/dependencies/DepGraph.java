/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2009 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.krep.compiler.dependencies;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.Collections;

import de.cau.cs.kieler.krep.compiler.helper.Debug;

/**
 * @author ctr dependency graph of the dataflow program
 */
public class DepGraph {
    private final Map<String, Node> nodes = new HashMap<String, Node>();

    private HashMap<String, Integer> core = new HashMap<String, Integer>();

    private HashMap<String, DepGraph> subGraphs = new HashMap<String, DepGraph>();

    private int maxPrio = 0;

    /**
     * generate dependency graph for the program.
     * 
     * @param eqs
     *            equations of the program
     */
    public DepGraph(final HashMap<String, LinkedList<String>> eqs) {
        int edges = 0;
        for (final Entry<String, LinkedList<String>> e : eqs.entrySet()) {
            addNode(e.getKey());
            final Node target = nodes.get(e.getKey());
            for (final String v : e.getValue()) {
                addNode(v);
                final Node source = nodes.get(v);
                source.addOut(new Edge(target, 0));// v.getDelay()));
                target.addIn(new Edge(source, 0));// v.getDelay()));
                edges++;
            }
        }
    }

    /**
     * add a new dependency from s to t.
     * 
     * @param s
     *            source of the dependency
     * @param t
     *            target of the dependency
     */
    public void add(final String s, final String t) {
        addNode(s);
        addNode(t);
        final Node source = nodes.get(s);
        final Node target = nodes.get(t);
        source.addOut(new Edge(target, 0));
        target.addIn(new Edge(source, 0));
    }

    /**
     * @return sorted list of the variables, that respects all dependencies
     */
    public List<String> sort() {
        return sort(new HashSet<String>(nodes.keySet()));
    }

    private void addNode(final String n) {
        if (nodes.get(n) == null) {
            nodes.put(n, new Node(n));
            core.put(n, 0);
        }
    }

    private List<String> sortFrom(final String n, final Set<String> toVisit) {
        final ArrayList<String> res = new ArrayList<String>();
        toVisit.remove(n);
        final Node node = nodes.get(n);
        for (final Edge e : node.getOut()) {
            if (e.getDelay() == 0 && toVisit.contains(e.getNode().getName())) {
                res.addAll(sortFrom(e.getNode().getName(), toVisit));
            }
        }
        res.add(n);
        return res;
    }

    private List<String> sort(final Set<String> toVisit) {
        final ArrayList<String> res = new ArrayList<String>();
        while (!toVisit.isEmpty()) {
            final String n = toVisit.iterator().next();
            res.addAll(sortFrom(n, toVisit));
        }
        Collections.reverse(res);
        return res;
    }

    /**
     * Cluster all nodes, cluster 0 are inputs, cluster n are outputs.
     * 
     * @param n
     *            number of clusters
     */
    public void split(final int n) {
        core.clear();
        Set<String> toVisit = new HashSet<String>(nodes.keySet());
        for (Node node : nodes.values()) {
            if (node.isInput()) {
                core.put(node.getName(), 0);
                toVisit.remove(node.getName());
            }
            // if (node.isOutput()) {
            // core.put(node.getName(), n);
            // toVisit.remove(node.getName());
            // }
        }
        // n--;

        int k = (int) (Math.ceil((double) toVisit.size() / (n)));
        List<String> sorted = sort(toVisit);
        for (int i = 0; i < n - 1; i++) {
            for (String s : sorted.subList(k * i, k * (i + 1))) {
                core.put(nodes.get(s).getName(), i);
            }
        }
        for (String s : sorted.subList(k * (n - 1), sorted.size())) {
            core.put(nodes.get(s).getName(), n - 1);
        }

        for (String s : sorted) {
            Debug.medium(s + " -> " + core.get(s));
        }

    }

    /**
     * @param printHeader print initialization code?
     * @return description of the dependency graph in the dot-format
     */
    public String toDot(final boolean printHeader) {
        final String[] colors = { "BLACK", "RED", "BLUE", "GREEN", "YELLOW" };
        String res = "";
        if (printHeader) {
            res = "digraph G {\n";
            res += "graph[rankdir=LR]\n\n";
        }
        for (final Node n : nodes.values()) {
            res += n.getName() + "[ color = " + colors[core.get(n.getName())] + ",  label=\""
                    + n.getName() + " (" + n.getPrio() + ")\"];\n";
            if (subGraphs.containsKey(n.getName())) {
                res += "{";
                res += subGraphs.get(n.getName()).toDot(false);
                res += "}\n";
            }
            for (final Edge e : n.getOut()) {
                res += n.getName() + " -> " + e.getNode();
                if (e.getDelay() == 1) {
                    res += "[style=\"dashed\"]";
                }
                if (e.getDelay() > 1) {
                    res += "[style=\"dotted\" taillabel=\"" + e.getDelay() + "\"]";
                }
                res += ";\n";
            }
        }
        if (printHeader) {
            res += "}\n";
        }
        return res;
    }

    /**
     * @param name of  a node
     * @return priority of that node
     */
    public int getPrio(final String name) {
        return nodes.get(name).getPrio();
    }

    /**
     * @return maximal used priority
     */
    public int getMaxPrio() {
        if (maxPrio == 0) {
            for (final Node n : nodes.values()) {
                final int p = n.getPrio();
                if (p > maxPrio) {
                    maxPrio = p;
                }
            }
        }
        return maxPrio;
    }

 

    /**
     * @param name name of the subgraph 
     * @param d a dependency graph that is added
     */
    public void addSubGraph(final String name, final DepGraph d) {
        subGraphs.put(name, d);
    }
}
