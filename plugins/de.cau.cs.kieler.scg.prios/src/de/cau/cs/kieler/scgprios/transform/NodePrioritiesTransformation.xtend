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

import de.cau.cs.kieler.kico.Transformation
import org.eclipse.emf.ecore.EObject
import de.cau.cs.kieler.kico.KielerCompilerContext
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scgprios.priorities.CalcNodePrios
import de.cau.cs.kieler.scgprios.priorities.SCC


/**
 * @author cbu
 *
 */
class NodePrioritiesTransformation extends Transformation{
    
    override transform(EObject eObject, KielerCompilerContext context) {
        //var scgraph_P = transformSCGToSCG_P(eObject as SCGraph)
        return transformSCGDEPToSCGNODEPRIO(eObject as SCGraph)
    }
    
    public def SCGraph transformSCGDEPToSCGNODEPRIO(SCGraph graph) {
        var nodes = graph.nodes
        var sccCalc = new SCC
        var sccs = sccCalc.findSCC(nodes)
        var calcNodePrios = new CalcNodePrios 
        var results = calcNodePrios.calculateNodePriorities(sccs, nodes)
        for (n : nodes){
            n.nodePriority = results.get(n)
        }
        graph
    }
    
    ///////////////////////////////////////////////////////////////////////////
    
//    private var nodeTable = <Node,Node_P>newHashMap
//    private var depTable = <Dependency,Dependency_P>newHashMap
//    private var cfTable = <ControlFlow,ControlFlow_P>newHashMap
//    
//    public def SCGraph_P transformSCGToSCG_P(SCGraph graph){
//        nodeTable.clear
//        depTable.clear
//        cfTable.clear
//        var graph_p = ScgpriosFactory::eINSTANCE.createSCGraph_P
//        graph_p.declarations.addAll(graph.declarations)
//        graph_p.nodes.addAll(translateNodes(graph.nodes))
//        graph_p
//    }
//    
//    private def EList<Node_P> translateNodes(List<Node> nodes){
//        var newNodes = new BasicEList<Node_P>()
//        for(node:nodes){
//            newNodes.add(translateNode(node))
//        }
//        newNodes
//    }
//    
//    private def EList<ControlFlow_P> translateControlFlowList(List<ControlFlow> cf){
//        var newCFList = new BasicEList<ControlFlow_P>
//        for (c : cf){
//            newCFList.add(translateControlFlow(c))
//        }
//        newCFList
//    }
//   
//    
//    private def ControlFlow_P translateControlFlow(ControlFlow c) {
//        if (c == null) {
//            return null
//        } else {
//            if (!cfTable.containsKey(c)) {
//                var newC = ScgpriosFactory::eINSTANCE.createControlFlow_P
//                cfTable.put(c, newC)
//                newC.target = translateNode(c.target)
//                newC
//            } else {
//                var cf = cfTable.get(c)
//                cf
//            }
//        }
//
//    }
//    
//    private def EList<Link_P> translateLinkList(List<Link> links){
//        var newList = new BasicEList<Link_P> 
//        for (l:links){
//            newList.add(translateLink(l))
//        }
//        newList
//    }
//    
//    private def Link_P translateLink(Link link) {
//
//        if (link == null) {
//            return null
//        } else {
//            if (link instanceof ControlFlow) {
//                var cf = translateControlFlow(link as ControlFlow)
//                cf
//            } else if (link instanceof Dependency) {
//                var dep = translateDependency(link as Dependency)
//                dep
//            } else {
//                var newLink = ScgpriosFactory::eINSTANCE.createLink_P
//                newLink.target = translateNode(link.target)
//                newLink
//            }
//        }
//
//    }
//    
//    private def EList<Dependency_P> translateDependencies(List<Dependency> depList){
//        var newDepList = new BasicEList<Dependency_P> 
//        for (d : depList){
//            newDepList.add(translateDependency(d))
//        }
//        newDepList
//    }
//    
//    private def Dependency_P translateDependency(Dependency d) {
//        
//        if (d == null){
//            return null
//        } else {
//            if (!depTable.containsKey(d)) {
//            if (d instanceof AbsoluteWrite_Read) {
//                    var dep = ScgpriosFactory::eINSTANCE.createAbsoluteWrite_Read_P
//                    depTable.put(d, dep)
//                    dep.concurrent = d.concurrent
//                    dep.confluent = d.confluent
//                    dep
//                } else if (d instanceof AbsoluteWrite_RelativeWrite) {
//                    var dep = ScgpriosFactory::eINSTANCE.createAbsoluteWrite_RelativeWrite_P
//                    depTable.put(d, dep)
//                    dep.concurrent = d.concurrent
//                    dep.confluent = d.confluent
//                    dep
//                } else if (d instanceof RelativeWrite_Read) {
//                    var dep = ScgpriosFactory::eINSTANCE.createRelativeWrite_Read_P
//                    depTable.put(d, dep)
//                    dep.concurrent = d.concurrent
//                    dep.confluent = d.confluent
//                    dep
//                } else if (d instanceof Write_Write) {
//                    var dep = ScgpriosFactory::eINSTANCE.createWrite_Write_P
//                    depTable.put(d, dep)
//                    dep.concurrent = d.concurrent
//                    dep.confluent = d.confluent
//                    dep
//                }
//            } else {
//                var dep = depTable.get(d)
//                dep
//            }
//        }
//
//    }
//    
//    private def Node_P translateNode(Node node) {
//        if (!nodeTable.containsKey(node)) {
//            if (node instanceof Entry) {
//                var newNode = ScgpriosFactory::eINSTANCE.createEntry_P
//                nodeTable.put(node,newNode)
//                newNode.next = translateControlFlow((node as Entry).next)
//                newNode.exit = translateNode((node as Entry).exit) as Exit_P
//                newNode.incoming.addAll(translateLinkList(node.incoming))
//                newNode.isInitial = node.isInitial
//                newNode.dependencies.addAll(translateDependencies(node.dependencies))
//                
//                newNode
//            } else if (node instanceof Exit) {
//                var newNode = ScgpriosFactory::eINSTANCE.createExit_P
//                nodeTable.put(node,newNode)
//                newNode.entry = translateNode((node as Exit).entry) as Entry_P
//                newNode.next = translateControlFlow((node as Exit).next)
//                newNode.incoming.addAll(translateLinkList(node.incoming))
//                newNode.isInitial = node.isInitial
//                newNode.dependencies.addAll(translateDependencies(node.dependencies))
//                newNode
//            } else if (node instanceof Assignment) {
//                var newNode = ScgpriosFactory::eINSTANCE.createAssignment_P
//                nodeTable.put(node,newNode)
//                newNode.next = translateControlFlow((node as Assignment).next)
//                newNode.assignment = (node as Assignment).assignment
//                newNode.valuedObject = (node as Assignment).valuedObject
//                newNode.indices.addAll((node as Assignment).indices)
//                newNode.incoming.addAll(translateLinkList(node.incoming))
//                newNode.isInitial = node.isInitial
//                newNode.dependencies.addAll(translateDependencies(node.dependencies))
//                newNode
//            } else if (node instanceof Depth) {
//                var newNode = ScgpriosFactory::eINSTANCE.createDepth_P
//                nodeTable.put(node,newNode)
//                newNode.surface = translateNode((node as Depth).surface) as Surface_P
//                newNode.next = translateControlFlow((node as Depth).next)
//                newNode.incoming.addAll(translateLinkList(node.incoming))
//                newNode.isInitial = node.isInitial
//                newNode.dependencies.addAll(translateDependencies(node.dependencies))
//                newNode
//            } else if (node instanceof Surface) {
//                var newNode = ScgpriosFactory::eINSTANCE.createSurface_P
//                nodeTable.put(node,newNode)
//                newNode.depth = translateNode((node as Surface).depth) as Depth_P
//                newNode.incoming.addAll(translateLinkList(node.incoming))
//                newNode.isInitial = node.isInitial
//                newNode.dependencies.addAll(translateDependencies(node.dependencies))
//                newNode         
//            } else if (node instanceof Join) {
//                var newNode = ScgpriosFactory::eINSTANCE.createJoin_P
//                nodeTable.put(node,newNode)
//                newNode.next = translateControlFlow((node as Join).next)
//                newNode.fork = translateNode((node as Join).fork) as Fork_P
//                newNode.incoming.addAll(translateLinkList(node.incoming))
//                newNode.isInitial = node.isInitial
//                newNode.dependencies.addAll(translateDependencies(node.dependencies))
//                newNode
//            } else if (node instanceof Conditional) {
//                var newNode = ScgpriosFactory::eINSTANCE.createConditional_P
//                newNode.then = translateControlFlow((node as Conditional).then)
//                newNode.^else = translateControlFlow((node as Conditional).^else)
//                newNode.incoming.addAll(translateLinkList(node.incoming))
//                newNode.isInitial = node.isInitial
//                newNode.condition = (node as Conditional).condition
//                newNode.dependencies.addAll(translateDependencies(node.dependencies))
//                nodeTable.put(node,newNode)
//                newNode
//            } else if (node instanceof Fork) {
//                var newNode = ScgpriosFactory::eINSTANCE.createFork_P
//                nodeTable.put(node,newNode)
//                newNode.join = translateNode((node as Fork).join) as Join_P
//                newNode.next.addAll(translateControlFlowList((node as Fork).next))
//                newNode.incoming.addAll(translateLinkList(node.incoming))
//                newNode.isInitial = node.isInitial
//                newNode.dependencies.addAll(translateDependencies(node.dependencies))
//                newNode
//            }
//        } else {
//            var newNode = nodeTable.get(node)
//            newNode
//        }
//
//    }
    
}