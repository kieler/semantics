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
package de.cau.cs.kieler.scgprios.extensions

import java.util.LinkedList
import de.cau.cs.kieler.scg.Node
import de.cau.cs.kieler.scg.Entry
import de.cau.cs.kieler.scg.Exit
import de.cau.cs.kieler.scg.Assignment
import de.cau.cs.kieler.scg.Depth
import de.cau.cs.kieler.scg.Join
import de.cau.cs.kieler.scg.Conditional
import de.cau.cs.kieler.scg.Fork
import de.cau.cs.kieler.scg.Surface
import java.util.HashMap

/**
 * This class provides some useful methods for navigation on the SCG, some list operations and 
 * a min an max function
 * 
 * @author cbu
 *
 */
class CommonExtension {

    /////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////// NAVIGATION ///////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////////////////// 

    /**
     * Returns all children of a node, except from those nodes, which are
     * Surface nodes, as a pause statement is not considered as edge in
     * this case
     * 
     * @param node
     *          node in question
     * @return 
     *          list of child nodes  (except from depth nodes)
     */
    def LinkedList<Node> getInstantChildrenOfNode(Node node) {
        
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
        childNodes

    }
    
    /**
     * Returns all children of a node (including depth nodes).
     * This function is used to navigate on an SCG
     * 
     * @param node
     *          node in question
     * @return 
     *          list of child nodes  (including depth nodes)
     */
    def LinkedList<Node> getAllChildrenOfNode(Node node) {
        var childNodes = new LinkedList<Node>
        if (node instanceof Surface){
            var nextLink = (node as Surface).depth
            childNodes.addLast(nextLink)
        } else {
            childNodes = getInstantChildrenOfNode(node)
        }
        childNodes

    }
    
    /**
     * Returns all dependency nodes of a node
     * 
     * @param node
     *          node in question
     * @return
     *          list of dependency nodes
     */
    def LinkedList<Node> getDependencyNodes(Node node){
        
        var depNodes = new LinkedList<Node>
        var depLink = node.dependencies
        if (!depLink.empty) {
            for (dep : depLink) {
                if (dep.concurrent && !dep.confluent){
                    var depNode = dep.target
                    depNodes.addLast(depNode)
                } 
            }
        }
        depNodes
    }
    
    ///////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////// MAX AND MIN METHODS ////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////////////////////
    
    /**
     * Returns the minimum of two integers
     * @param a
     *          first value to compare
     * @param b
     *          second value to compare
     * @return
     *          lower value
     */
    def int min(int a, int b) {
        if (a < b) {
            a
        } else {
            b
        }
    }
    
    /**
     * Returns the maximum of two integers
     * @param a
     *          first value to compare
     * @param b
     *          second value to compare
     * @return
     *          higher value
     */
    def int max(int a, int b){
        if (a < b){
            b
        } else {
            a
        }
    }
    
    ////////////////////////////////////////////////////////////////////////////////////////////
    //////////////////////////////////// LIST OPERATIONS ///////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////

    
    /**
     * Returns a list, in which each element appears only once
     * 
     * @param list
     *          list which may contain elements more than once
     * @return
     *          list in which each element appears only once
     */
    def LinkedList<Node> removeMultipleElements(LinkedList<Node> list) {
        var newList = new LinkedList<Node>
        for (node : list) {
            if (!newList.contains(node)) {
                newList.addLast(node)
            }
        }
        newList

    }  
    
    /**
     * Sorts the list of entry nodes: the entry node, which should come first after the fork should be
     * the first node in the list, and the entry node, whose exit node performs a join should be  the
     * last node in the list.
     * Warning: The first child is determined first. Therefore it is possible, that the last child has
     * NOT the smallest exit node priority, if one node fulfills both criteria
     * 
     * @param entrynodes
     *          list of entry nodes in question
     * @param nodePriorities
     *          nodes and their priorities
     * @return 
     *          sorted list of entry nodes
     */
    def LinkedList<Node> sortEntryNodes(LinkedList<Node> entrynodes, HashMap<Node, Integer> nodePriorities){
        var firstEntry = findFirstEntry(entrynodes, nodePriorities)
        entrynodes.remove(firstEntry)
        var lowestExit = findLowestExit(entrynodes, nodePriorities)
        entrynodes.remove(lowestExit) 
        entrynodes.addFirst(firstEntry)
        entrynodes.addLast(lowestExit)
        entrynodes
         
    }
    
    /**
     * Find the entry node, whose exit node should perform the join. 
     * The exit node, which performs the join is the exit node with the lowest node priority
     * If there is more than one exit node, which has the lowest node priority, the exit node,
     * whose entry node has the lowest node priority is chosen.
     * 
     * @param entrynodes
     *          list of entry nodes in question
     * @param nodePriorities
     *          nodes and their priorities
     * @return 
     *          entry node which should perform the join
     */
    private def Node findLowestExit(LinkedList<Node> entrynodes, HashMap<Node, Integer> nodePriorities){
        var lowestExit = entrynodes.head
        for (e : entrynodes){
            if (nodePriorities.get((e as Entry).exit) < nodePriorities.get((lowestExit as Entry).exit)){
                lowestExit = e
            } else if (nodePriorities.get((e as Entry).exit) == nodePriorities.get((lowestExit as Entry).exit)){
                if (nodePriorities.get(e) < nodePriorities.get(lowestExit)){
                    lowestExit = e
                }
            }
        }
        lowestExit
    }
    
    /**
     * Find the entry node, which should come first after the fork and should therefore inherit the
     * tsID of its parent. This is the entry node with the highest node priority.
     * If there is more than one entry node with the highest priority, the entry node, whose exit node
     * has the highest priority is chosen.
     * 
     * @param entrynodes
     *          list of entry nodes in question
     * @param nodePriorities
     *          nodes and their priorities
     * @return 
     *          entry node which should inherit the tsID of the parent
     */
    private def Node findFirstEntry(LinkedList<Node> entrynodes, HashMap<Node, Integer> nodePriorities){
        var firstEntry = entrynodes.head
        for (e : entrynodes){
            if (nodePriorities.get(firstEntry) < nodePriorities.get(e)){
                firstEntry = e
            } else if (nodePriorities.get(e) == nodePriorities.get(firstEntry)){
                if (nodePriorities.get((e as Entry).exit) > nodePriorities.get((firstEntry as Entry).exit)){
                    firstEntry = e
                }
            }
        }
        firstEntry
    }
}
