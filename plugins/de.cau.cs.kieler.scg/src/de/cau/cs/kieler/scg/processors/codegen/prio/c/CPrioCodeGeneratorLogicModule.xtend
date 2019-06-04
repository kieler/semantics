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
package de.cau.cs.kieler.scg.processors.codegen.prio.c

import de.cau.cs.kieler.scg.processors.codegen.c.CCodeGeneratorLogicModule
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

/**
 * Java Code Generator Logic Module
 * 
 * Handles the creation of the tick logic function.
 * 
 * @author ssm
 * @kieler.design 2017-07-24 proposed 
 * @kieler.rating 2017-07-24 proposed yellow 
 * 
 */
class CPrioCodeGeneratorLogicModule extends CCodeGeneratorLogicModule {

    @Inject extension AnnotationsExtensions
    @Inject extension SCGCoreExtensions   
    @Inject extension SCGThreadExtensions
    @Accessors @Inject CPrioCodeSerializeHRExtensions serializer 
    extension AnnotationsFactory = AnnotationsFactory.eINSTANCE
    
    var forkSb = new StringBuilder
    var joinSbUnderWordsize = new StringBuilder
    var joinSbOverWordsize = new StringBuilder    
    var generatedForks = <Integer> newHashSet
    var generatedJoins = <Integer> newHashSet
    var threadPriorities = <Node, ArrayList<Integer>> newHashMap
    var labeledNodes = <Node, String> newHashMap
    var regionNames = <String> newHashSet
    var labelNr = 0
    var regionNr = 0
    
    override configure() {
        struct = (parent as CPrioCodeGeneratorModule).struct as CPrioCodeGeneratorStructModule
    }
    
    override generateInit() {
        threadPriorities.clear
        labeledNodes.clear
        regionNames.clear
        labelNr = 0
        regionNr = 0
    }
    
    override generate() {
        val nodes = <Node> newLinkedList
        val visited = <Node> newHashSet   
        val previousNodes = <Node> newLinkedList
        nodes.add(scg.nodes.filter(Entry).head)
        
        while(!nodes.empty) {
            val node = nodes.pop
            println(node)

            switch (node) {
                PushNode: { previousNodes.push(node.nodeToPush) }
                PopNode: { previousNodes.pop }
                CodeNode: { code.append(node.code) }
                GatherPriosNode: { node.gather(this) }
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
        if(joinSbOverWordsize.length > 0) {
            finalCode.append("#ifdef _idsetSize\n")
            finalCode.append(joinSbOverWordsize)
            finalCode.append("\n#else\n")
            finalCode.append(joinSbUnderWordsize)
            finalCode.append("#endif\n\n")            
        }        
        
        finalCode.append(code)
        
        finalCode.setNewCodeStringBuilder
    }
        
        
    private def List<Node> processNode(Node node, LinkedList<Node> previousNodes, Set<Node> visited) {
        if(node instanceof Join) {
            return emptyList
        }

        if(!previousNodes.empty && !(node instanceof Depth)) {
            val prev = previousNodes.peek()
            val prevPrio = prev.getAnnotation(PriorityAuxiliaryData.OPTIMIZED_NODE_PRIORITIES_ANNOTATION) as IntAnnotation
            val prio = node.getAnnotation(PriorityAuxiliaryData.OPTIMIZED_NODE_PRIORITIES_ANNOTATION) as IntAnnotation
            if(!(prev instanceof Fork) && prevPrio.value != prio.value) {
                code.append("prio(" + prio.value + ");\n")
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
        
        if(!(node instanceof Exit)) {
            // If the node has already been visited before, add a goto, instead of translating it again
            if(visited.contains(node) && labeledNodes.containsKey(node)) {
            // if(labeledNodes.containsKey(node)) {
                code.append("goto " + labeledNodes.get(node) + ";\n")
                return emptyList
            } else {
                if(!labeledNodes.containsKey(node)) {
                    // If a node has multiple incoming control flows, create a goto label
                    val incomingControlFlows = node.incomingLinks.filter(ControlFlow).toList
                    if(incomingControlFlows.size > 1) {
                        val newLabel = "label_" + labelNr++
                        labeledNodes.put(node, newLabel)
                        code.append(newLabel + ":\n")
                    }                
                }
            }
        }
        
        val result = <Node> newLinkedList
        result += new PushNode(node)

        result += switch(node) {
            Assignment: { transformNode(node, serializer) }
            Conditional: { transformNode(node, serializer) }
            Fork: { transformNode(node, serializer) }
            Join: { transformNode(node, serializer) }
            Entry: { transformNode(node, serializer) }
            Exit: { transformNode(node, serializer) }
            Surface: { transformNode(node, serializer) }
            Depth: { transformNode(node, serializer) }
        }
        
        result += new PopNode
        return result        
    }        
    

    protected def List<Node> transformNode(Assignment assignment, extension CPrioCodeSerializeHRExtensions serializer) {
        assignment.serializeToCode(1, struct, serializer)
        return <Node> newLinkedList => [ add(assignment.next.target.asNode) ]
    }

    protected def List<Node> transformNode(Conditional conditional, extension CPrioCodeSerializeHRExtensions serializer) {
        val result = <Node> newLinkedList
        
        code.append("if(" + conditional.condition.serializeHR + "){\n")
        result += conditional.then.target.asNode
        result += new CodeNode("} else {\n");
        result += conditional.^else.target.asNode
        result += new CodeNode("}");
        
        return result        
    }

    protected def List<Node> transformNode(Join join, extension CPrioCodeSerializeHRExtensions serializer) {
        return <Node> newLinkedList => [ add(join.next.target.asNode) ]        
    }

    protected def List<Node> transformNode(Entry entry, extension CPrioCodeSerializeHRExtensions serializer) {
        // If entry is the root node
        var threadPrios = new ArrayList<Integer>
        if (entry.hasAnnotation("optPrioIDs")) {
            var prio = (entry.getAnnotation("optPrioIDs") as IntAnnotation).value
            
            if (entry.incomingLinks.empty) {
                code.append("tickstart(" + prio + ");\n")                
            } else {
                if (entry.hasAnnotation("exitPrio")) {
                    val minThreadExitPrio = (entry.getAnnotation("exitPrio") as IntAnnotation).value 
                    if(prio < minThreadExitPrio) {
                        threadPrios.add(prio)
                    }                    
                }
            }
            threadPriorities.put(entry, threadPrios)
        }
        
        return <Node> newLinkedList => [ add(entry.next.target.asNode) ]
    }

    protected def List<Node> transformNode(Exit exit, extension CPrioCodeSerializeHRExtensions serializer) {
        // Does nothing
        // Cannot have more than one incoming edge and cannot lower the priority.
        code.append("\n")
        if(exit.next !== null) {
            val entry = exit.threadEntry
            val prio = (exit.getAnnotation("optPrioIDs") as IntAnnotation).value
            threadPriorities.get(entry).add(prio)
            threadPriorities.get(exit.next.target.asNode.threadEntry).addAll(threadPriorities.get(entry))
            return <Node> newLinkedList => [ add(exit.next.target.asNode) ] 
        }
    }
    
    protected def List<Node> transformNode(Surface sur, extension CPrioCodeSerializeHRExtensions serializer) {
        // If the priority after the pause is higher than before the pause, we must increase it 
        //   before the pause. Else the increase of the priority would happen after other threads, whose
        //   priorities might be higher at first, but lower after the increase of the priority.
        val depthPrio = sur.depth.getAnnotation("optPrioIDs") as IntAnnotation
        val prio = sur.getAnnotation("optPrioIDs") as IntAnnotation
        
        if (depthPrio.value != prio.value) {
            code.append("prio(" + depthPrio.value + ");\n")
        }
        if(sur.threadEntry.hasAnnotation("exitPrio")) {
            if(prio.value > (sur.threadEntry.getAnnotation("exitPrio") as IntAnnotation).value) {
                threadPriorities.get(sur.threadEntry).add(prio.value)
            }            
        }
        code.append("pause;\n");
        
        return <Node> newLinkedList => [
            add(new PushNode(sur.depth))
            add(sur.depth)
            add(new PopNode)
        ]
    }
    
    protected def List<Node> transformNode(Depth dep, extension CPrioCodeSerializeHRExtensions serializer) {
        return <Node> newLinkedList => [ add(dep.next.target.asNode) ]
    }




    protected def List<Node> transformNode(Fork fork, extension CPrioCodeSerializeHRExtensions serializer) {

        var labelList = <String> newArrayList
        var joinPrioList = <Integer> newArrayList
        var prioList = <Integer> newArrayList
        var joinPrioSet = <Integer> newHashSet
        var children = fork.next
        var min = Integer.MAX_VALUE
        var Node minNode
        var max = Integer.MIN_VALUE
        var Node maxNode
        var String labelHead
        
        var childNodes = <Node, String> newLinkedHashMap 
        
        // Find threads with maximal entry priority and minimal exit priority
        for(child : children) {
            val entry = child.target.asNode
            val exit = (entry as Entry).exit
            val entryPrio = (entry.getAnnotation("optPrioIDs") as IntAnnotation).value
            val exitPrio = (exit.getAnnotation("optPrioIDs") as IntAnnotation).value
            if(entryPrio > max) {
                max = entryPrio
                maxNode = entry
            }
            if(exitPrio < min) {
                min = exitPrio
                minNode = entry
            }
        }
        val minx = min
        // Translate the nodes and create labels
        for(child : children) {
            child.target.asNode.annotations += createIntAnnotation => [
                name = "exitPrio"
                value = minx
            ]
            var node = child.target.asNode
            if(!node.equals(minNode)) {
                joinPrioList.add(((node as Entry).exit.getAnnotation("optPrioIDs") as IntAnnotation).value)
                val regionName = node.getStringAnnotationValue("regionName").replaceAll(" ","")
                var String newLabel
                if(node.equals(maxNode)) {
                    if(regionName == "") {
                        labelHead = "_region_" + regionNr++
                        newLabel = labelHead
                    } else {
                        if(regionNames.contains(regionName)) {
                            val newName = "_" + regionName + "_" + regionNr++
                            labelHead = newName
                            newLabel = newName
                            regionNames.add(newName)
                        } else {
                            labelHead = regionName
                            newLabel = regionName
                            regionNames.add(regionName)
                        }
                    }
                } else {
                    prioList.add((node.getAnnotation("optPrioIDs") as IntAnnotation).value)
                    if (regionName == "") {
                        newLabel = ("_region_" + regionNr++)
                        labelList.add(newLabel)
                    } else {
                        if(regionNames.contains(regionName)) {
                            val newName = "_" + regionName + "_" + regionNr++
                            labelList.add(newName)
                            newLabel = newName
                            regionNames.add(newName)
                        } else {
                            labelList.add(regionName)
                            newLabel = regionName
                            regionNames.add(regionName)
                        }
                    }
                }
                
                childNodes.put(node, newLabel)
                labeledNodes.put(node, newLabel)
            }
        }
        // Translate minNode
        val regionName = minNode.getStringAnnotationValue("regionName").replaceAll(" ","")
        var String newLabel
        if(minNode.equals(maxNode)) {
            if(regionName == "") {
                labelHead = "_region_" + regionNr++
                newLabel = labelHead
            } else {
                if(regionNames.contains(regionName)) {
                    val newName = "_" + regionName + "_" + regionNr++
                    labelHead = newName
                    newLabel = newName
                    regionNames.add(newName)
                } else {
                    labelHead = regionName
                    newLabel = regionName
                    regionNames.add(regionName)
                }
            }
        } else {
            prioList.add((minNode.getAnnotation("optPrioIDs") as IntAnnotation).value)
            if (regionName == "") {
                newLabel = ("_region_" + regionNr++)
                labelList.add(newLabel)
            } else {
                if(regionNames.contains(regionName)) {
                    val newName = "_" + regionName + "_" + regionNr++
                    labelList.add(newName)
                    newLabel = newName
                    regionNames.add(newName)
                } else {
                    labelList.add(regionName)
                    newLabel = regionName
                    regionNames.add(regionName)
                }
            }
        }


        val result = <Node> newLinkedList

        result += new ForkNNode(children.length - 1, labelHead, labelList, prioList, this)

        for(n : childNodes.keySet) {
            val label = childNodes.get(n)
            
            result += new CodeNode(label + ":\n")
            result += n
            result += new GatherPriosNode(joinPrioSet, n)
                
            result += new CodeNode("} par {\n")
        }        

        result += new CodeNode(newLabel + ":\n")
        labeledNodes.put(minNode, newLabel)
        
        // Translate thread
        result += minNode
        
        result += new CodeNode("\n")
        result += new JoinNNode(joinPrioSet, this)
        
        // Joins all the threads together again
        result += new PushNode(fork.join)
        result += fork.join
        result += new PopNode
        
        return result
    }



    
    







 
    static class PushNode extends EntryImpl {
        public var Node nodeToPush
         
        new(Node node) {
            this.nodeToPush = node    
        }
    }
 
    static class PopNode extends EntryImpl {
    }
    
    static class CodeNode extends EntryImpl {
        public var String code
        
        new(String code) {
            this.code = code
        }    
    }
    
    static class GatherPriosNode extends EntryImpl {
        public var Set<Integer> joinPrioSet
        public var Node node
        
        new (Set<Integer> set, Node node) {
            this.joinPrioSet = set
            this.node = node
        }

        def gather(extension CPrioCodeGeneratorLogicModule module) {
            joinPrioSet.addAll(threadPriorities.get(node))            
        }        
    }
    
    static class ForkNNode extends CodeNode {
        
        new (int n, String label, ArrayList<String> labels, ArrayList<Integer> prios, extension CPrioCodeGeneratorLogicModule module) {
            super("")
            val sb = new StringBuilder
            
            sb.append("fork" + n + "(" + label + ",")
            
            var labelsAndPrios = ""
            for (var i = 0; i < n; i++) {
                labelsAndPrios += labels.get(i)
                labelsAndPrios += ", "
                labelsAndPrios += prios.get(i).toString
                if (i < n - 1) {
                    labelsAndPrios += ", "
                }
            }
            sb.append(labelsAndPrios + ") {\n")
            
            if(n > 4 && !generatedForks.contains(n)) {
                forkSb.append("#define fork" + n + "(label, ")
                var s1 = ""
                var s2 = ""
                s2 = s2.concat("  initPC(_cid, label); \\\n")
                for(var i = 0; i < n; i++) {
                    s1 = s1.concat("label" + i + ", p" + i)
                    s2 = s2.concat("  initPC(p" + i + ", label" + i + "); enable(p" + i + ");")
                    if(i != n - 1) {
                        s1 = s1.concat(", ")
                    }
                    s2 = s2.concat(" \\\n")
                }
                forkSb.append(s1 + ") \\\n")
                s2 = s2.concat("  dispatch_;\n")
                forkSb.append(s2)
                forkSb.append("\n\n")
                
                generatedForks.add(n)
            }
            
            code = sb.toString
        }
    }
    
    static class JoinNNode extends CodeNode {
         
        new (Set<Integer> prioList, extension CPrioCodeGeneratorLogicModule module) {
            super("")
            val n = prioList.size
            val sb = new StringBuilder
            
            sb.append("} join" + n + "(" + prioList.createPrioString + ");\n")

            if(n > 4 && !generatedJoins.contains(n)) {
                joinSbOverWordsize.append("#define join" + n + "(")
                joinSbUnderWordsize.append("#define join" + n + "(")
                var s1 = ""
                var underWordsizeString = ""
                var overWordsizeString = ""
                for(var i = 0; i < n; i++) {
                    s1 = s1.concat("sib" + i)
                    // s2 = s2.concat("  join1(sib" + i + "); ")
                    overWordsizeString = overWordsizeString.concat("isEnabled(sib" + i + ")")
                    underWordsizeString = underWordsizeString.concat("sib" + i)
                    if(i != n - 1) {
                        s1 = s1.concat(", ")
                       //  s2 = s2.concat("\\")
                       underWordsizeString = underWordsizeString.concat(" | ")
                       overWordsizeString  = overWordsizeString.concat(" | ")
                    }
                }
                joinSbUnderWordsize.append(s1 + ") \\\n")
                joinSbUnderWordsize.append("  _case __LABEL__: if (")
                joinSbUnderWordsize.append("isEnabledAnyOf(")
                joinSbUnderWordsize.append(underWordsizeString)
                joinSbUnderWordsize.append(")")
                joinSbUnderWordsize.append(") {\\\n")
                joinSbUnderWordsize.append("    PAUSEG_(__LABEL__); }")
                joinSbUnderWordsize.append("\n\n")
                
                joinSbOverWordsize.append(s1 + ") \\\n")
                joinSbOverWordsize.append("  _case __LABEL__: if (")
                joinSbOverWordsize.append(overWordsizeString)
                joinSbOverWordsize.append(") {\\\n")
                joinSbOverWordsize.append("    PAUSEG_(__LABEL__); }")
                joinSbOverWordsize.append("\n\n")
                
                generatedJoins.add(n)
            }
            
            code = sb.toString
        }
    
    }


    protected def createPrioString(Set<Integer> prioList) {
        
        var s = new StringBuilder()
        
        for(prio : prioList) {
            s.append(prio)
            if(!prio.equals(prioList.last)) {
                s.append(", ")
            }
        }
        
        
        return s.toString
    }
    
}