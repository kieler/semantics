/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2017 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.scg.processors.codegen.prio.java

import de.cau.cs.kieler.scg.Node
import de.cau.cs.kieler.scg.Entry
import de.cau.cs.kieler.scg.Join
import de.cau.cs.kieler.scg.Depth
import java.util.LinkedList
import com.google.inject.Inject
import de.cau.cs.kieler.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.scg.processors.priority.PriorityAuxiliaryData
import de.cau.cs.kieler.annotations.IntAnnotation
import de.cau.cs.kieler.scg.Fork
import de.cau.cs.kieler.scg.extensions.SCGThreadExtensions
import java.util.ArrayList
import java.util.Set
import de.cau.cs.kieler.scg.Exit
import de.cau.cs.kieler.scg.ControlFlow
import java.util.List
import de.cau.cs.kieler.scg.impl.EntryImpl
import de.cau.cs.kieler.scg.Assignment
import de.cau.cs.kieler.scg.Conditional
import de.cau.cs.kieler.scg.Surface
import org.eclipse.xtend.lib.annotations.Accessors
import de.cau.cs.kieler.scg.extensions.SCGCoreExtensions
import de.cau.cs.kieler.annotations.AnnotationsFactory
import de.cau.cs.kieler.scg.processors.codegen.prio.c.CPrioCodeGeneratorLogicModule
import de.cau.cs.kieler.scg.processors.codegen.c.CCodeSerializeHRExtensions

/**
 * Java Prio Code Generator Logic Module
 * Migrated from SJTransformation
 * 
 * Handles the creation of the tick logic function.
 * 
 * @author ssm
 * @kieler.design 2019-06-09 proposed 
 * @kieler.rating 2019-06-09 proposed yellow 
 * 
 */
class JavaPrioCodeGeneratorLogicModule extends CPrioCodeGeneratorLogicModule {

    @Inject extension AnnotationsExtensions
    @Inject extension SCGCoreExtensions   
    @Inject extension SCGThreadExtensions
    @Accessors @Inject JavaPrioCodeSerializeHRExtensions javaSerializer 
    extension AnnotationsFactory = AnnotationsFactory.eINSTANCE

    static val BREAK = "if (true) break;\n\n";
    
    var forkSb = new StringBuilder
    var threadPriorities = <Node, ArrayList<Integer>> newHashMap
    var labeledNodes = <Node, String> newHashMap
    var regionNames = <String> newHashSet
    var labelNr = 0
    val labelCounter = <String, Integer> newHashMap
    var Set<Integer> globalJoinPrios
    var labeledProxy = <Node, Boolean> newHashMap
    var proxyStateHandled = <Node> newHashSet
    
    @Accessors var JavaPrioCodeGeneratorStructModule struct
    @Accessors var JavaPrioCodeGeneratorModule module    
    
    override configure() {
        struct = (parent as JavaPrioCodeGeneratorModule).struct as JavaPrioCodeGeneratorStructModule
        module = parent as JavaPrioCodeGeneratorModule
    }
    
    override generateInit() {
        threadPriorities.clear
        labeledNodes.clear
        regionNames.clear
        labelNr = 0
        
        incIndentation
        incIndentation
        incIndentation
        incIndentation
    }
    
    override generate() {
        val nodes = <Node> newLinkedList
        val visited = <Node> newHashSet   
        val previousNodes = <Node> newLinkedList
        val head = scg.nodes.filter(Entry).head
        nodes.add(head)
        labeledNodes.put(head, module.programName + "Entry")
        
        while(!nodes.empty) {
            val node = nodes.pop

            switch (node) {
                PushNode: { previousNodes.push(node.nodeToPush) }
                PopNode: { previousNodes.pop }
                IncIndentationNode: { incIndentation }
                DecIndentationNode: { decIndentation }
                CodeNode: { code.append(node.getCode) }
                CaseNode: { 
                    if (node.node === null || !labeledProxy.containsKey(node.node) || labeledProxy.get(node.node) == false) {
                        if (labeledProxy.containsKey(node.node)) labeledProxy.put(node.node, true)
                        addCase(node.caze)
                    }
                }
                GatherPriosNode: { node.gather(this) }
                JoinPrioNode: { globalJoinPrios = node.joinPrioSet }
                default: {
                    val newNodes = node.processNode(previousNodes, visited)
                    newNodes.reverse.forEach[ nodes.push(it) ]                                        
                }
            }    
            
            visited += node
        }
    }
    
    override generateDone() {
        val finalCode = new StringBuilder

        finalCode.append(forkSb)
        finalCode.append(code)
        
        finalCode.setNewCodeStringBuilder
    }
        
        
    override List<Node> processNode(Node node, LinkedList<Node> previousNodes, Set<Node> visited) {
        serializer.valuedObjectPrefix = "";
        
        if (proxyStateHandled.contains(node)) {
            return emptyList
        }
        
        if(!previousNodes.empty && !(node instanceof Depth)) {
            val prev = previousNodes.peek()
            val prevPrio = prev.getAnnotation(PriorityAuxiliaryData.OPTIMIZED_NODE_PRIORITIES_ANNOTATION) as IntAnnotation
            val prio = node.getAnnotation(PriorityAuxiliaryData.OPTIMIZED_NODE_PRIORITIES_ANNOTATION) as IntAnnotation
            if(!(prev instanceof Fork) && (!(prev instanceof Surface)) && prevPrio.value != prio.value) {
                var newLabel = "_L_" + labelNr++
                code.appendInd("prioB(" + prio.value + ", State." + newLabel +  ");\n")
                code.appendInd(BREAK)
                addCase(newLabel)
                val entry = node.threadEntry
                if(entry.hasAnnotation("exitPrio")) {
                    val minThreadExitPrio = (entry.getAnnotation("exitPrio") as IntAnnotation).value
                    if(prevPrio.value > minThreadExitPrio && prio.value < minThreadExitPrio) {
                        threadPriorities.get(entry).add(prevPrio.value)     
                    }                    
                }
            }
            if(prev instanceof Entry) {
                labeledNodes.put(node, labeledNodes.get(prev))
            }
        }
        
        if(visited.contains(node) && labeledNodes.containsKey(node)) {
            code.appendInd("gotoB(State." + labeledNodes.get(node) + ");\n")
            code.appendInd(BREAK)
            return emptyList
        } else {
            if (!(node instanceof Join)) {
                if(!labeledNodes.containsKey(node)) {
                    // If a node has multiple incoming control flows, create a goto label
                    val incomingControlFlows = node.incomingLinks.filter(ControlFlow).toList
                    if(incomingControlFlows.size > 1) {
                        val newLabel = "_L_" + labelNr++
                        labeledNodes.put(node, newLabel)
                        addCase(newLabel)
                    }                
                } else if (labeledProxy.containsKey(node) && labeledProxy.get(node) == false) {
                   labeledProxy.put(node, true)
                   proxyStateHandled.add(node)
                   addCase(labeledNodes.get(node))
                }
            }
        }
        visited += node
        
        val result = <Node> newLinkedList
        result += new PushNode(node)

        result += switch(node) {
            Assignment: { transformNode(node, javaSerializer) }
            Conditional: { transformNode(node, javaSerializer) }
            Fork: { transformNode(node, javaSerializer) }
            Join: { transformNode(node, javaSerializer) }
            Entry: { transformNode(node, javaSerializer) }
            Exit: { transformNode(node, javaSerializer) }
            Surface: { transformNode(node, javaSerializer) }
            Depth: { transformNode(node, javaSerializer) }
        }
        
        result += new PopNode
        return result        
    }       
    
    override List<Node> transformNode(Assignment assignment, extension CCodeSerializeHRExtensions serializer) {
        val ret = super.transformNode(assignment, serializer)
        return ret
    }
    
    override List<Node> transformNode(Conditional conditional, extension CCodeSerializeHRExtensions serializer) {
        val result = <Node> newLinkedList
        var addIf = false
        var addElse = false
        var ifLabel = ""
        var elseLabel = ""
        
        code.appendInd("if(" + conditional.condition.serializeHR + "){\n")
        
        // If the priority is raised in then branch, insert use prio-statement instead of goto.
        // This fixed the behavior of abro-vars
        val prio = (conditional.getAnnotation(PriorityAuxiliaryData.OPTIMIZED_NODE_PRIORITIES_ANNOTATION)
                                                                                as IntAnnotation).value
        val targetPrio = (conditional.then.target.asNode.getAnnotation(PriorityAuxiliaryData.OPTIMIZED_NODE_PRIORITIES_ANNOTATION)
                                                                                as IntAnnotation).value
        val jump = if (targetPrio != prio) {
           "  prioB(" + targetPrio + ", "
        } else {
           "  gotoB("
        }
        
        if(labeledNodes.containsKey(conditional.then.target)) {
            code.appendInd(jump + "State." + labeledNodes.get(conditional.then.target) + ");\n")
        } else {
            // Create goto and label
            ifLabel = "_L_" + labelNr++
            code.appendInd(jump + "State." + ifLabel + ");\n")
            val targetNode = conditional.then.target.asNode
            labeledNodes.put(targetNode, ifLabel)  
//            if (targetNode instanceof Exit) {
                labeledProxy.put(targetNode, false)
//            }  
    
            addIf = true
        }
        
        code.appendInd("} else {\n");
        
        if(labeledNodes.containsKey(conditional.^else.target)) {
            code.appendInd("  gotoB(State." + labeledNodes.get(conditional.^else.target) + ");\n")    
        } else {
            // Create goto and label
            elseLabel = "_L_" + labelNr++
            code.appendInd("  gotoB(State." + elseLabel + ");\n")
            val targetNode = conditional.^else.target.asNode
            labeledNodes.put(targetNode, elseLabel)
//            if (targetNode instanceof Exit) {
                labeledProxy.put(targetNode, false)
//            }  
    
            addElse = true            
        }
        code.appendInd("}\n")
        code.appendInd(BREAK)
        
        if (addIf) {
            result += new CaseNode(ifLabel, conditional.then.target.asNode)
            result += conditional.then.target.asNode
        }
        if (addElse) {
            result += new CaseNode(elseLabel, conditional.^else.target.asNode)
            result += conditional.^else.target.asNode
        }
        
        
        return result        
    }

    override List<Node> transformNode(Entry entry, extension CCodeSerializeHRExtensions serializer) {
        val prio = (entry.getAnnotation(PriorityAuxiliaryData.OPTIMIZED_NODE_PRIORITIES_ANNOTATION) 
                                                                                as IntAnnotation).value
        struct.maxPriority = Math.max(prio, struct.maxPriority)
        
        var threadPrios = new ArrayList<Integer>
        if(!entry.incomingLinks.empty && entry.hasAnnotation("exitPrio")) {
            val exitPrio = (entry.getAnnotation("exitPrio") as IntAnnotation).value
            if(prio < exitPrio) {
                threadPrios.add(prio)
            }
        }
        threadPriorities.put(entry, threadPrios)
        
        return <Node> newLinkedList => [ add(entry.next.target.asNode) ]
    }

    protected def List<Node> transformNode(Exit exit, extension JavaPrioCodeSerializeHRExtensions serializer) {
        // Only do something if the exit is the final node of the program. Otherwise
        // the fork/join does this
        if(exit.next !== null) {
            threadPriorities.get(exit.entry).add((exit.getAnnotation("optPrioIDs") as IntAnnotation).value)
            threadPriorities.get(exit.next.target.asNode.threadEntry).addAll(threadPriorities.get(exit.threadEntry))
        }
        
        if(!exit.entry.hasAnnotation("joinThread")) {
            code.appendInd("termB();\n")
            code.appendInd(BREAK)            
        } else {
            // Go to join
            if(exit.next !== null) {
                val join = exit.next.target
                var newLabel = ""
                if(labeledNodes.containsKey(join)) {
                    newLabel = labeledNodes.get(join)
                } else {
                    newLabel = "_L_" + labelNr++
                    labeledNodes.put(exit.next.target.asNode, newLabel)                
                }
                
                code.appendInd("gotoB(State." + newLabel + ");\n")
                code.appendInd(BREAK)
            }
        }        
        return emptyList
    }
    
    protected def List<Node> transformNode(Surface sur, extension JavaPrioCodeSerializeHRExtensions serializer) {
        // If the priority is raised after the pause, insert a prio-statement and a pause.
        val prio = (sur.getAnnotation(PriorityAuxiliaryData.OPTIMIZED_NODE_PRIORITIES_ANNOTATION)
                                                                                as IntAnnotation).value
        val depPrio = (sur.depth.getAnnotation(PriorityAuxiliaryData.OPTIMIZED_NODE_PRIORITIES_ANNOTATION)
                                                                                as IntAnnotation).value
        
        if(prio != depPrio) {
            val newLabel = "_L_" + labelNr++
            code.appendInd("prioB(" + depPrio + ", State." + newLabel + ");\n")
            code.appendInd("if (true) break;\n\n")
            addCase(newLabel)
        }
        if(sur.threadEntry.hasAnnotation("exitPrio")) {
            if(prio > (sur.threadEntry.getAnnotation("exitPrio") as IntAnnotation).value) {
                threadPriorities.get(sur.threadEntry).add(prio)
            }            
        }
        
        val newLabel = "_L_" + labelNr++
        code.appendInd("pauseB(State." + newLabel + ");\n")
        labeledNodes.put(sur.depth, newLabel)
        code.appendInd(BREAK)
        
        return <Node> newLinkedList => [
            add(new PushNode(sur))
            add(sur.depth)
            add(new PopNode)
        ]
    }
    
    protected def List<Node> transformNode(Depth dep, extension JavaPrioCodeSerializeHRExtensions serializer) {
        val prio = (dep.getAnnotation(PriorityAuxiliaryData.OPTIMIZED_NODE_PRIORITIES_ANNOTATION) as IntAnnotation).value
        struct.maxPriority = Math.max(prio, struct.maxPriority)

        addCase(labeledNodes.get(dep))
        
        return <Node> newLinkedList => [ add(dep.next.target.asNode) ]
    }




    protected def List<Node> transformNode(Fork fork, extension JavaPrioCodeSerializeHRExtensions serializer) {

        // Find Thread with highest entry priority and lowest exit priority
        val children = fork.next.map[ target ].filter(Node).toList
        var childSB = <Node> newLinkedList
        val sortedChildrenByEntry = (children.sortBy[n | ((n as Entry).getAnnotation(PriorityAuxiliaryData.
                                                        OPTIMIZED_NODE_PRIORITIES_ANNOTATION) as IntAnnotation)
                                                        .value]).reverse

        val Node forkThread = sortedChildrenByEntry.head
        val sortedChildrenByExit  = (children.sortBy[n | (((n as Entry).exit).getAnnotation
                                                (PriorityAuxiliaryData.OPTIMIZED_NODE_PRIORITIES_ANNOTATION) 
                                                as IntAnnotation).value])

        val Node joinThread = sortedChildrenByExit.head
        val minPrio = ((joinThread as Entry).exit.getAnnotation(PriorityAuxiliaryData.
                                OPTIMIZED_NODE_PRIORITIES_ANNOTATION) as IntAnnotation).value
        var joinPrioSet = <Integer> newHashSet
        var threadInfo = <Pair<String, Integer>> newLinkedList
        
        var forkSB = <Node> newLinkedList
        var joinSB = <Node> newLinkedList
        var forkLabel = getNewRegionName(forkThread)
        var joinLabel = ""
        if (forkThread.equals(joinThread)) {
            joinLabel = forkLabel
        } else {
            joinLabel = joinThread.newRegionName
        }
        
        // Joining thread must not have a term-statement
        joinThread.annotations += createStringAnnotation => [
                    name  = "joinThread"
        ]
        
        // Translate all children that have neither the highest entry nor the lowest exit priority
        for(child : sortedChildrenByExit.tail) {
            if(!child.equals(forkThread)) {
                child.annotations += createIntAnnotation => [
                    name = "exitPrio"
                    value = minPrio
                ]
                childSB += child.transformThread(threadInfo, joinPrioSet)                
            }
        }
        
        // Translate thread with lowest exit priority but don't add its exit priority to the list of joining priorities
        joinSB += new CaseNode(joinLabel, fork.join)
        labeledNodes.put(joinThread, joinLabel)
//        labeledProxy.put(joinThread, false)
        joinSB += joinThread
        childSB.addAll(joinSB)
        
        // As long as the thread with the highest entry priority and lowest exit priority are not the same, also 
        // translate this thread.
        if(!forkThread.equals(joinThread)) {
            forkThread.annotations += createIntAnnotation => [
                    name = "exitPrio"
                    value = minPrio
            ]
            forkSB += new CaseNode(forkLabel, forkThread)
            labeledProxy.put(forkThread, false)
            labeledNodes.put(forkThread, forkLabel)
            forkSB += forkThread
            childSB.addAll(0, forkSB)

            val joinThreadPrio = (joinThread.getAnnotation(PriorityAuxiliaryData.OPTIMIZED_NODE_PRIORITIES_ANNOTATION)
                                                            as IntAnnotation).value
            threadInfo.add(new Pair(joinLabel, joinThreadPrio))
            childSB += new GatherPriosNode(joinPrioSet, forkThread)
        } 
        
        // Create the fork
        for(thread : threadInfo) {
            code.appendInd("fork(State." + thread.key + ", " + thread.value + ");\n")
        }
        code.appendInd("gotoB(State." + forkLabel + ");\n")
        code.appendInd(BREAK)

        childSB += new JoinPrioNode(joinPrioSet)
        childSB += fork.join
        
        return childSB
    }

    protected def List<Node> transformNode(Join join, extension JavaPrioCodeSerializeHRExtensions serializer) {
        val joinPrios = globalJoinPrios
        
        // Create new labels for new states
        var newLabel = ""
        if(labeledNodes.containsKey(join)) {
            newLabel = labeledNodes.get(join)
        } else {
            newLabel  = "_L_" + labelNr++            
            
            // Go to the new join-"state"
            code.appendInd("gotoB(State." + newLabel + ");\n")
            code.appendInd(BREAK)
        }
        val nextLabel = "_L_" + labelNr++
        
        // Create the join-"state"
        addCase(newLabel)
        code.appendInd("if(")
        code.append("!join(" + joinPrios.head + ")")
        for(prio : joinPrios.tail) {
            code.append(" || !join(" + prio + ")")
        }
        code.append(") {\n")
        incIndentation
        code.appendInd("pauseB(State." + newLabel + ");\n")
        code.appendInd(BREAK)
        decIndentation
        code.appendInd("}\n\n")
        
        // Create the following state
        addCase(nextLabel)
        return <Node> newLinkedList => [
            add(new PushNode(join)) 
            add(join.next.target.asNode)
            add(new PopNode())
        ]        
    }

    
    





    protected def void addCase(String newLabel) {
        decIndentation
        code.appendInd("case " + newLabel + ":\n")
        incIndentation
        struct.states.add(newLabel)
    }
    
    private def String getNewRegionName(Node node) {
        var newLabel = node.getStringAnnotationValue("regionName").replaceAll(" ", "")
        if(newLabel == "") {
            newLabel = "_L_" + labelNr++
            return newLabel
        }
        if(labelCounter.containsKey(newLabel)) {
            val forkNr = labelCounter.get(newLabel)
            labelCounter.replace(newLabel, forkNr + 1)
            newLabel += "_" + forkNr
        } else {
            labelCounter.put(newLabel, 1)
        }
        return newLabel
    }
    
    private def List<Node> transformThread(Node node, LinkedList<Pair<String, Integer>> threadInfo,
                                            Set<Integer> exitPrios) {
        val newLabel = node.getNewRegionName
        var prio = (node.getAnnotation(PriorityAuxiliaryData.OPTIMIZED_NODE_PRIORITIES_ANNOTATION) 
                                                                                as IntAnnotation).value
        
        threadInfo.add(new Pair(newLabel, prio))
        labeledNodes.put(node, newLabel)
        return <Node> newLinkedList => [
            add(new CaseNode(newLabel, node))
            add(node)
            add(new GatherPriosNode(exitPrios, node))
        ]
    }    
    
    
    
    
    
    
    
    

 
    static class PushNode extends EntryImpl {
        public var Node nodeToPush
         
        new(Node node) {
            this.nodeToPush = node    
        }
    }
 
    static class PopNode extends EntryImpl {
    }
    
    static class IncIndentationNode extends EntryImpl {
    }
    
    static class DecIndentationNode extends EntryImpl {
    }
    
    static class CodeNode extends EntryImpl {
        public var String code
        
        new(String code) {
            this.code = code
        }
        
        def getCode() {
            return code
        }    
    }
    
    static class CaseNode extends EntryImpl {
        public var String caze
        public var Node node
        
        new(String caze, Node node) {
            this.caze = caze
            this.node = node
        }
    }
    
    static class GatherPriosNode extends EntryImpl {
        public var Set<Integer> joinPrioSet
        public var Node node
        
        new (Set<Integer> set, Node node) {
            this.joinPrioSet = set
            this.node = node
        }

        def gather(extension JavaPrioCodeGeneratorLogicModule module) {
            joinPrioSet.addAll(threadPriorities.get(node))            
        }        
    }
    
    static class JoinPrioNode extends EntryImpl {
        public var Set<Integer> joinPrioSet
        
        new(Set<Integer> jps) {
            this.joinPrioSet = jps   
        }
    }
    
}
