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
package de.cau.cs.kieler.scgprios.transform

import de.cau.cs.kieler.scg.Fork
import de.cau.cs.kieler.scgprios.ScgpriosFactory
import de.cau.cs.kieler.scg.Conditional
import de.cau.cs.kieler.scg.Join
import de.cau.cs.kieler.scgprios.Fork_P
import de.cau.cs.kieler.scg.Depth
import de.cau.cs.kieler.scgprios.Surface_P
import de.cau.cs.kieler.scg.Assignment
import de.cau.cs.kieler.scg.Exit
import de.cau.cs.kieler.scgprios.Entry_P
import de.cau.cs.kieler.scg.Entry
import de.cau.cs.kieler.scgprios.Node_P
import de.cau.cs.kieler.scg.Node
import de.cau.cs.kieler.scgprios.Exit_P
import de.cau.cs.kieler.scgprios.Dependency_P
import java.util.LinkedList
import java.util.List
import de.cau.cs.kieler.scg.Dependency
import de.cau.cs.kieler.scg.AbsoluteWrite_Read
import de.cau.cs.kieler.scg.AbsoluteWrite_RelativeWrite
import de.cau.cs.kieler.scg.RelativeWrite_Read
import de.cau.cs.kieler.scg.Write_Write
import de.cau.cs.kieler.scgprios.Link_P
import de.cau.cs.kieler.scgprios.ControlFlow_P
import de.cau.cs.kieler.scg.Link
import de.cau.cs.kieler.scg.ControlFlow
import de.cau.cs.kieler.scgprios.SCGraph_P
import de.cau.cs.kieler.scg.SCGraph
import java.util.HashMap

/**
 * @author cbu
 *
 */
class SCGraphToSCGraphPTransformation {
    
    // Fehler bearbeiten und Hashmap erstellen weil jetzt Knoten doppelt erstellt werden, was den
    // Graphen auflösen könnte...
    // daher hier zentrale liste einführen
    
    var nodeTable = <Node,Node_P>newHashMap
    var depTable = <Dependency,Dependency_P>newHashMap
    var cfTable = <ControlFlow,ControlFlow_P>newHashMap
    
    public def SCGraph_P transformSCGToSCG_P(SCGraph graph){
        nodeTable.clear
        depTable.clear
        var graph_p = ScgpriosFactory::eINSTANCE.createSCGraph_P
        //graph_p.nodes.addAll(translateNodes(graph.nodes))
        //graph_p.declarations.addAll(graph.declarations)
        graph_p
    }
    
    def List<Node_P> translateNodes(List<Node> nodes){
        var newNodes = new LinkedList<Node_P>()
        for(node:nodes){
            newNodes.add(translateNode(node))
        }
        newNodes
    }
    
    def List<ControlFlow_P> translateControlFlowList(List<ControlFlow> cf){
        var newCFList = new LinkedList<ControlFlow_P>
        for (c : cf){
            newCFList.add(translateControlFlow(c))
        }
        newCFList
    }
   
    
    def ControlFlow_P translateControlFlow(ControlFlow c){
        
        if (!cfTable.containsKey(c)){
            var newC = ScgpriosFactory::eINSTANCE.createControlFlow_P
            newC.target = translateNode(c.target)
            cfTable.put(c,newC)
            newC
        } else {
            var cf = cfTable.get(c)
            cf
        }
        
        
    }
    
    def List<Link_P> translateLinkList(List<Link> links){
        
        var newList = new LinkedList<Link_P> 
        for (l:links){
            newList.add(translateLink(l))
        }
        newList
    }
    
    def Link_P translateLink(Link link){
        
        if (link instanceof ControlFlow){
            var cf = translateControlFlow(link as ControlFlow)
            cf
        } else if (link instanceof Dependency){
            var dep = translateDependency(link as Dependency)
            dep
        } else {
            var newLink = ScgpriosFactory::eINSTANCE.createLink_P
            newLink.target = translateNode(link.target)
            newLink
        } 
    }
    
    def List<Dependency_P> translateDependencies(List<Dependency> depList){
        var newDepList = new LinkedList<Dependency_P> 
        for (d : depList){
            newDepList.add(translateDependency(d))
        }
        newDepList
    }
    
    def Dependency_P translateDependency(Dependency d) {

        if (!depTable.containsKey(d)) {
            if (d instanceof AbsoluteWrite_Read) {
                var dep = ScgpriosFactory::eINSTANCE.createAbsoluteWrite_Read_P
                depTable.put(d,dep)
                dep
            } else if (d instanceof AbsoluteWrite_RelativeWrite) {
                var dep = ScgpriosFactory::eINSTANCE.createAbsoluteWrite_RelativeWrite_P
                depTable.put(d,dep)
                dep
            } else if (d instanceof RelativeWrite_Read) {
                var dep = ScgpriosFactory::eINSTANCE.createRelativeWrite_Read_P
                depTable.put(d,dep)
                dep
            } else if (d instanceof Write_Write) {
                var dep = ScgpriosFactory::eINSTANCE.createWrite_Write_P
                depTable.put(d,dep)
                dep
            }
        } else {
            var dep = depTable.get(d)
            dep
        }
    }
    
    def Node_P translateNode(Node node) {

        if (!nodeTable.containsKey(node)) {
            if (node instanceof Entry) {
                var newNode = ScgpriosFactory::eINSTANCE.createEntry_P
                newNode.next = translateControlFlow((node as Entry).next)
                newNode.exit = translateNode((node as Entry).exit) as Exit_P

                newNode.incoming.addAll(translateLinkList(node.incoming) as Link_P)
                newNode.isInitial = node.isInitial
                newNode.dependencies.addAll(translateDependencies(node.dependencies))
                nodeTable.put(node,newNode)
                newNode

            } else if (node instanceof Exit) {
                var newNode = ScgpriosFactory::eINSTANCE.createExit_P
                newNode.next = translateControlFlow((node as Exit).next)
                newNode.entry = translateNode((node as Exit).entry) as Entry_P

                newNode.incoming.addAll(translateLinkList(node.incoming))
                newNode.isInitial = node.isInitial
                newNode.dependencies.addAll(translateDependencies(node.dependencies))
                nodeTable.put(node,newNode)
                newNode

            } else if (node instanceof Assignment) {
                var newNode = ScgpriosFactory::eINSTANCE.createAssignment_P
                newNode.next = translateControlFlow((node as Assignment).next)
                newNode.assignment = (node as Assignment).assignment
                newNode.valuedObject = (node as Assignment).valuedObject
                newNode.indices.addAll((node as Assignment).indices)

                newNode.incoming.addAll(translateLinkList(node.incoming))
                newNode.isInitial = node.isInitial
                newNode.dependencies.addAll(translateDependencies(node.dependencies))
                nodeTable.put(node,newNode)
                newNode

            } else if (node instanceof Depth) {
                var newNode = ScgpriosFactory::eINSTANCE.createDepth_P
                newNode.next = translateControlFlow((node as Depth).next)
                newNode.surface = translateNode((node as Depth).surface) as Surface_P

                newNode.incoming.addAll(translateLinkList(node.incoming))
                newNode.isInitial = node.isInitial
                newNode.dependencies.addAll(translateDependencies(node.dependencies))
                nodeTable.put(node,newNode)
                newNode

            } else if (node instanceof Join) {

                var newNode = ScgpriosFactory::eINSTANCE.createJoin_P
                newNode.next = translateControlFlow((node as Join).next)
                newNode.fork = translateNode((node as Join).fork) as Fork_P

                newNode.incoming.addAll(translateLinkList(node.incoming))
                newNode.isInitial = node.isInitial
                newNode.dependencies.addAll(translateDependencies(node.dependencies))
                nodeTable.put(node,newNode)
                newNode

            } else if (node instanceof Conditional) {

                var newNode = ScgpriosFactory::eINSTANCE.createConditional_P
                newNode.then = translateControlFlow((node as Conditional).then)
                newNode.^else = translateControlFlow((node as Conditional).^else)

                newNode.incoming.addAll(translateLinkList(node.incoming))
                newNode.isInitial = node.isInitial
                newNode.dependencies.addAll(translateDependencies(node.dependencies))
                nodeTable.put(node,newNode)
                newNode

            } else if (node instanceof Fork) {

                var newNode = ScgpriosFactory::eINSTANCE.createFork_P
                newNode.next.addAll(translateControlFlowList((node as Fork).next))

                newNode.incoming.addAll(translateLinkList(node.incoming))
                newNode.isInitial = node.isInitial
                newNode.dependencies.addAll(translateDependencies(node.dependencies))
                nodeTable.put(node,newNode)
                newNode
            }
        } else {
            var newNode = nodeTable.get(node)
            newNode
        }

    }
    
    
}