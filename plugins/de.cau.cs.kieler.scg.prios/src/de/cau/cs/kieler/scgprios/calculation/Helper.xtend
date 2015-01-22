/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2014 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.scgprios.calculation

import java.util.List
import java.util.LinkedList
import de.cau.cs.kieler.scg.Node
import de.cau.cs.kieler.scg.Entry
import de.cau.cs.kieler.scg.Exit
import de.cau.cs.kieler.scg.Assignment
import de.cau.cs.kieler.scg.Depth
import de.cau.cs.kieler.scg.Join
import de.cau.cs.kieler.scg.Conditional
import de.cau.cs.kieler.scg.Fork
import de.cau.cs.kieler.scg.SCGraph

/**
 * @author cbu
 *
 */
class Helper {

    // Collect Nodes in a List
    def LinkedList<Node> NodesToList(SCGraph depSCG) {
        System.out.println("starting NodesToList")
        var nodeList = new LinkedList<Node>
        System.out.println("NodesToList: init 1")
        var depSCGNodes = depSCG.nodes
        System.out.println("NodesToList: All initialized")
        for (node : depSCGNodes){
            nodeList.add(node)
        }
        System.out.println("NodesToList: All Nodes in List")
        nodeList
    }
   

//    // Collect all Nodes of type Depth
//    def List<Node> GetDepthNodes(List<Node> nodeList) {
//        var depthList = new LinkedList<Node>
//        for (node : nodeList) {
//            if (node instanceof Depth) {
//                depthList.add(node)
//            }
//        }
//        depthList
//    }

//    // Collect all dependency edges
//    def List<Tuple<Node, Node>> DependencyEdgesToList(List<Node> nodeList) {
//        var depList = new LinkedList<Tuple<Node, Node>>
//        for (node : nodeList) {
//            var depLink = node.dependencies
//            if (depLink != null) {
//                for (dep : depLink) {
//                    var depNode = dep.target
//                    var tuple = new Tuple(node, depNode)
//                    depList.add(tuple)
//                }
//            }
//        }
//        depList
//    }

//    // Collect all ControlFlow Edges
//    def List<Tuple<Node, Node>> ControlFlowEdgesToList(List<Node> nodeList) {
//        var controlFlowList = new LinkedList<Tuple<Node, Node>>
//        for (node : nodeList) {
//            var children = getChildrenOfNode(node)
//            if (!children.empty) {
//                for (child : children) {
//                    var tuple = new Tuple(node, child)
//                    controlFlowList.addLast(tuple)
//                }
//            }
//        }
//        controlFlowList
//    }

    // Collect all children of node
    def List<Node> getChildrenOfNode(Node node) {
        //System.out.println("starting getChildrenOfNode")
        var childNodes = new LinkedList<Node>
        if (node instanceof Entry) {
            var nextLink = (node as Entry).next
            if (nextLink != null) {
                var nextNode = nextLink.target
                childNodes.addLast(nextNode)
            }
        } else if (node instanceof Exit) {
            var nextLink = (node as Exit).next
            if (nextLink != null) {
                var nextNode = nextLink.target
                childNodes.addLast(nextNode)
            }
        } else if (node instanceof Assignment) {
            var nextLink = (node as Assignment).next
            if (nextLink != null) {
                var nextNode = nextLink.target
                childNodes.addLast(nextNode)
            }
        } else if (node instanceof Depth) {
            var nextLink = (node as Depth).next
            if (nextLink != null) {
                var nextNode = nextLink.target
                childNodes.addLast(nextNode)
            }
        } else if (node instanceof Join) {
            var nextLink = (node as Join).next
            if (nextLink != null) {
                var nextNode = nextLink.target
                childNodes.addLast(nextNode)
            }
        } else if (node instanceof Conditional) {
            var thenLink = (node as Conditional).then
            if (thenLink != null) {
                var nextNode = thenLink.target
                childNodes.addLast(nextNode)
            }
            var elseLink = (node as Conditional).^else
            if (elseLink != null) {
                var nextNode = elseLink.target
                childNodes.addLast(nextNode)
            }
        } else if (node instanceof Fork) {
            var nextLinks = (node as Fork).next
            if (!nextLinks.empty) {
                for (nextLink : nextLinks) {
                    var nextNode = nextLink.target
                    childNodes.addLast(nextNode)
                }
            }
        }
//        var depLink = node.dependencies
//        if (depLink != null) {
//            for (dep : depLink) {
//                var depNode = dep.target
//                childNodes.addLast(depNode)
//            }
//        }
        childNodes

    }
    
    def LinkedList<Node> getDependencyNodes(Node node){
        //System.out.println("starting getDependencyNodes")
        var depNodes = new LinkedList<Node>
        var depLink = node.dependencies
        if (!depLink.empty) {
            for (dep : depLink) {
                if (dep.concurrent && !dep.confluent){
                    System.out.println("getDependencyNodes: FOUND DEPENDENCYYYYYYYYYYYYYYYYYYYY")
                    var depNode = dep.target
                    depNodes.addLast(depNode)
                } 
            }
        }
        depNodes
    }
    
    def LinkedList<Node> getDependenciesFromSCC(LinkedList<Node> scc){
        System.out.println("starting getDependenciesFromSCC")
        var depNodes = new LinkedList<Node> 
        for (node : scc){
            depNodes.addAll(getDependencyNodes(node))
        }
        var cleanDepNodes = removeDoubleElements(depNodes) 
        for (s : scc){
            cleanDepNodes.remove(s)
        }
        cleanDepNodes
    }
    
    // All nodes should only appear once
    def LinkedList<Node> removeDoubleElements(LinkedList<Node> list) {
        System.out.println("starting removeDoubleElements")
        //System.out.println("removeDoubleElements list "+list.empty)
        var newList = new LinkedList<Node>
        for (node : list) {
            //System.out.println("removeDoubleElements loop")
            if (!newList.contains(node)) {
                newList.addLast(node)
            }
        }
        //System.out.println("removeDoubleElements finished")
        newList

    }

    // calculate min value
    def int min(int a, int b) {
        if (a < b) {
            a
        } else {
            b
        }
    }
    
    def int max(int a, int b){
        if (a < b){
            b
        } else {
            a
        }
    }
    
    

}
