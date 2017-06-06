/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright ${year} by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.scg.priorities.sj

import de.cau.cs.kieler.annotations.AnnotationsFactory
import de.cau.cs.kieler.annotations.IntAnnotation
import de.cau.cs.kieler.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.kico.KielerCompilerContext
import de.cau.cs.kieler.kico.transformation.AbstractProductionTransformation
import de.cau.cs.kieler.scg.Assignment
import de.cau.cs.kieler.scg.Conditional
import de.cau.cs.kieler.scg.ControlFlow
import de.cau.cs.kieler.scg.Depth
import de.cau.cs.kieler.scg.Entry
import de.cau.cs.kieler.scg.Exit
import de.cau.cs.kieler.scg.Fork
import de.cau.cs.kieler.scg.Join
import de.cau.cs.kieler.scg.Node
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.Surface
import de.cau.cs.kieler.scg.priorities.PriorityAuxiliaryData
import de.cau.cs.kieler.scg.transformations.c.SCG2CSerializeHRExtensions
import java.util.LinkedList
import java.util.Stack
import javax.inject.Inject

/**
 * Class to perform the transformation of an SCG to Java Code using the priority based compilation approach
 * @author lpe
 *
 */
class SJTransformation extends AbstractProductionTransformation {
    
     @Inject 
     extension AnnotationsExtensions
     @Inject 
     extension SCG2CSerializeHRExtensions
     
     extension AnnotationsFactory = AnnotationsFactory.eINSTANCE
    
    /** Memorizes the labels/case-statements to nodes if they already exist */
    private var labeledNodes = <Node, String> newHashMap
    
    /** Memorizes all possible states (case-statements) of the resulting program */
    private var states = <String> newLinkedList
    
    /** HashMap to memorize for each existing region name, how often it already existed to avoid multiple regions
     *  having the same name */
    private var regionNr = <String, Integer> newHashMap
    
    /** Memorizes for each node whether it was already visited or not */
    private var visited = <Node, Boolean> newHashMap
    
    /** Memorizes the previously visited node to check for changes in the priority */
    private var previousNode = new Stack<Node>

    
    /** Keeps track of the current indentation level */
    private var currentIndentation = ""
    
    /** Default change in indentation between two indentation levels */
    private val DEFAULT_INDENTATION = "  "
    
    /** Keeps track of the current label number for newly created labels */
    private var labelNr = 0
    
    /** Memorizes the initial state */
    private var initialState = ""
    
    /** Memorizes the starting priority */
    private var startPriority = -1
    
    /** Memorizes the maximum priority */
    private var maxPriority = -1
    
    
    override getProducedFeatureId() {
        "sclp.sjTrans"
    }
    
    override getId() {
        "sclp.sjTrans"
    }
    
    override getName() {
        "SJ"
    }
    
    override getRequiredFeatureIds() {
        return newHashSet("scg.scgPrio");
    }
    
    
    /** 
     * Transform the scg to Java Code based on the priority based compilation approach
     * 
     * @param scg
     *          The SCGraph which the code is translated from
     * @param context
     *          The KielerCompilerContext required to hand over information about node priorities
     * 
     * @return
     *          The program in the form of a String
     */
    public def Object transform(SCGraph scg, KielerCompilerContext context) {
        // Initialize Variables
        val program = new StringBuilder
        val sb = new StringBuilder
        var programName = ""
        states.clear
        visited.clear
        previousNode.clear
        labeledNodes.clear
        regionNr.clear
        labelNr = 0
        
        //Add Header
        if(!(scg.label.isNullOrEmpty)) {
            programName = scg.label
        } else {
            programName = "Program"
        }
        
        program.addImports(programName)
        
        program.appendInd("public class " + programName + " extends SJLProgramForPriorities<State> {\n")
        
        currentIndentation += DEFAULT_INDENTATION
        
        sb.addReset(scg)
        
        // Translate program
        sb.addProgram(scg, programName)
        // Add enumerations/States
        program.addStates
        // Add Variables
        program.declareVariables(scg)
        // Add Constructor
        program.addConstructor(programName)
        
        // Add program
        program.append(sb)
        currentIndentation = currentIndentation.substring(0, currentIndentation.length - 2)
        program.appendInd("}\n")
        program.toString
        
    }
    
    /** 
     *  Adds the required imports to the file
     */
    protected def void addImports(StringBuilder sb, String programName) {
        
        sb.appendInd("package model;\n\n")
        
        sb.appendInd("import model." + programName + ".State;\n")
        sb.appendInd("import static model." + programName + ".State.*;\n")
        sb.appendInd("import model.SJLProgramForPriorities;\n\n\n")
    }
    
    protected def void addReset(StringBuilder sb, SCGraph scg) {
        sb.appendInd("public void reset() {}\n\n")
    }
    
    
    /**
     * Translates the calculated states to an enumeration
     * 
     * @param sb the StringBuilder to append the state enumeration to
     */
    protected def void addStates(StringBuilder sb) {
        sb.appendInd("enum State {\n")
        currentIndentation += DEFAULT_INDENTATION
        for(state : states) {
            sb.appendInd(state)
            if(!states.last.equals(state)) {
                sb.append(",")
            }
            sb.append("\n")
        }
        currentIndentation = currentIndentation.substring(0, currentIndentation.length - 2)
        sb.appendInd("}\n")
    }
    
    /**
     *  Declares all required variables in the beginning of the program
     * 
     *  @param sb
     *              The StringBuilder the program writes the code into
     *  @param scg
     *              The SCGraph the method extracts the variables from
     * 
     */
    protected def void declareVariables(StringBuilder sb, SCGraph scg) {
        for(declaration : scg.declarations) {
            sb.appendInd("public ")
            var type = declaration.type.toString
            if(type == "bool") {
                type = "boolean"
            }
            sb.append(type)
            for(variables : declaration.valuedObjects) {
                if(!(variables.equals(declaration.valuedObjects.head))) {
                    sb.append(",")
                }
                sb.append(" ")
                sb.append(variables.name)
                for(card : variables.cardinalities) {
                    sb.append("[" + card + "]")
                } 
            }
            sb.append(";\n")
        }
        sb.append("\n")
    }
    
    /** 
     * Adds the constructor to the program
     * 
     * @param sb 
     *              The StringBuilder the constructor is added to
     * 
     * @param programName
     *              The name of the model and resulting program 
     */
    protected def void addConstructor(StringBuilder sb, String programName) {
        sb.appendInd("public " + programName + "() {\n")
        sb.appendInd("  super(" + initialState + ", " + startPriority + ", " + maxPriority + ");\n")
        sb.appendInd("}\n\n\n")
    }
    
    /**
     *  Starts the translation of the scg
     * 
     *  @param sb
     *          The StringBuilder the program writes the code into
     *  @param scg
     *          The SCGraph which the code is translated from
     * 
     */
    protected def void addProgram(StringBuilder sb, SCGraph scg, String programName) {
        sb.appendInd("@Override\n")
        sb.appendInd("protected final void tick() {\n")
        currentIndentation += DEFAULT_INDENTATION
        sb.appendInd("while(!isTickDone()) {\n")
        currentIndentation += DEFAULT_INDENTATION
        sb.appendInd("switch(state()) {\n")
        currentIndentation += DEFAULT_INDENTATION
        initialState = programName + "Entry"
        states.add(initialState)
        sb.appendInd("case " + programName + "Entry: \n")
        currentIndentation += DEFAULT_INDENTATION
        
        // Start translation of the first node
        val head = scg.nodes.filter(Entry).head
        startPriority = (head.getAnnotation(PriorityAuxiliaryData.OPTIMIZED_NODE_PRIORITIES_ANNOTATION) 
                                                                                        as IntAnnotation).value
        sb.transformNode(head)
        
        currentIndentation = currentIndentation.substring(0, currentIndentation.length - 2)
        currentIndentation = currentIndentation.substring(0, currentIndentation.length - 2)
        sb.appendInd("}\n")
        currentIndentation = currentIndentation.substring(0, currentIndentation.length - 2)
        sb.appendInd("}\n")
        currentIndentation = currentIndentation.substring(0, currentIndentation.length - 2)
        sb.appendInd("}\n")
        
    }
    
 //----------------------------------------------------------------------------------------------------------------
 //----------------------------------------NODE TRANSLATION--------------------------------------------------------   
 //----------------------------------------------------------------------------------------------------------------
 
    /**
     *  Transforms a node into corresponding Java Code
     * 
     *  @param sb
     *              The StringBuilder the code is written into
     *  @param node
     *              The node from which the code is extracted
     */
    private def void transformNode(StringBuilder sb, Node node) {
        valuedObjectPrefix = "";
        
        // If the priority of the node has changed from the previous node, add a prioB-Statement and break the 
        // current state.
        if(!previousNode.empty()) {
            val prev = previousNode.peek()
            val prevPrio = prev.getAnnotation(PriorityAuxiliaryData.OPTIMIZED_NODE_PRIORITIES_ANNOTATION) as IntAnnotation
            val prio = node.getAnnotation(PriorityAuxiliaryData.OPTIMIZED_NODE_PRIORITIES_ANNOTATION) as IntAnnotation
            if(!(prev instanceof Fork) && (!(prev instanceof Surface)) && prevPrio.value != prio.value) {
                var newLabel = "_L_" + labelNr++
                //labeledNodes.put(node, newLabel)
                sb.appendInd("prioB(" + prio.value + ", " + newLabel +  ");\n")
                sb.appendInd("break;\n\n")
                sb.addCase(newLabel)
            }
            // If the previous node was an entry node, copy its label to the new node. This reduces states for SCGs 
            // with a cycle directly after entry nodes
            if(prev instanceof Entry) {
                labeledNodes.put(node, labeledNodes.get(prev))
            }
        }

        // If the node has already been visited before, add a gotoB, instead of translating it again
        if(visited.containsKey(node) && visited.get(node) && labeledNodes.containsKey(node)) {
            sb.appendInd("gotoB(" + labeledNodes.get(node) + ");\n")
            sb.appendInd("break;\n\n")
            return
            
        } else if(!labeledNodes.containsKey(node)) {
            // If a node has multiple incoming control flows, create a gotoB label
            val incomingControlFlows = node.incoming.filter(ControlFlow).toList
            if(incomingControlFlows.size > 1) {
                val newLabel = "_L_" + labelNr++
                labeledNodes.put(node, newLabel)
                sb.appendInd("gotoB(" + newLabel + ");\n")
                sb.appendInd("break;\n\n")
                sb.addCase(newLabel)
            }                
        }

        
        
        
        previousNode.push(node)    
        visited.put(node, true)
        
        // Translate nodes
        if (node instanceof Assignment) {
            sb.transformNode(node as Assignment)
        } else if (node instanceof Conditional) {
            sb.transformNode(node as Conditional)
        } else if (node instanceof Fork) {
            sb.transformNode(node as Fork)
        } else if (node instanceof Join) {
            //sb.transformNode(node as Join)
        } else if (node instanceof Entry) {
            sb.transformNode(node as Entry)
        } else if (node instanceof Exit) {
            sb.transformNode(node as Exit)
        } else if (node instanceof Surface) {
            sb.transformNode(node as Surface)
        } else if (node instanceof Depth) {
            sb.transformNode(node as Depth)
        }
        
        previousNode.pop
        
    }
    
    /**
     *  Transforms an Assignment node into corresponding Java Code
     * 
     *  @param sb
     *              The StringBuilder the code is written into
     *  @param ass
     *              The Assignment node from which the code is extracted
     */
    private def void transformNode(StringBuilder sb, Assignment ass) {
        sb.appendInd("")
        sb.append(ass.serializeHR)
        sb.append(";\n")
        
        sb.transformNode(ass.next.target)
    }
    
    /**
     *  Transforms a Conditional node into corresponding Java Code
     * 
     *  @param sb
     *              The StringBuilder the code is written into
     *  @param ass
     *              The Assignment node from which the code is extracted
     */
    private def void transformNode(StringBuilder sb, Conditional cond) {
        var ifLabel = ""
        var ifSB = new StringBuilder
        var isIfTranslated = true
        var elseLabel = ""
        var elseSB = new StringBuilder
        var isElseTranslated = true
        // IF-Case
        sb.appendInd("if(" + cond.condition.serializeHR + "){\n")
        currentIndentation += DEFAULT_INDENTATION

        if(labeledNodes.containsKey(cond.then.target)) {

            // Goto already translated node
            sb.appendInd("gotoB(" + labeledNodes.get(cond.then.target) + ");\n")
            currentIndentation = currentIndentation.substring(0, currentIndentation.length - 2)
            sb.appendInd("} ")
            isIfTranslated = false
            
        } else {
            // Create goto and label
            ifLabel = "_L_" + labelNr++
            sb.appendInd("gotoB(" + ifLabel + ");\n")
            labeledNodes.put(cond.then.target, ifLabel)  
            currentIndentation = currentIndentation.substring(0, currentIndentation.length - 2)
            sb.appendInd("} ")
    
            // Translate if-case
            ifSB.transformNode(cond.then.target)
            
        }
        
        // ELSE-Case
        sb.append("else {\n")
        currentIndentation += DEFAULT_INDENTATION
        
        if(labeledNodes.containsKey(cond.^else.target)) {

            //Goto already translated node
            sb.appendInd("gotoB(" + labeledNodes.get(cond.^else.target) + ");\n")
            currentIndentation = currentIndentation.substring(0, currentIndentation.length - 2)
            sb.appendInd("}\n")
            isElseTranslated = false
            
        } else {
            
            // Create goto and label
            elseLabel = "_L_" + labelNr++
            sb.appendInd("gotoB(" + elseLabel + ");\n")      
            labeledNodes.put(cond.^else.target, elseLabel)  
            currentIndentation = currentIndentation.substring(0, currentIndentation.length - 2)
            sb.appendInd("}\n")
    
            //Translate else-case
            elseSB.transformNode(cond.^else.target)
        }
        // Create break
        sb.appendInd("break;\n\n")
        
        // Paste if-case
        if(isIfTranslated) {
            sb.addCase(ifLabel)
            sb.append(ifSB)
            //sb.appendInd("break;\n\n")
            
        }
        // Paste else-case
        if(isElseTranslated) {
            sb.addCase(elseLabel)
            sb.append(elseSB)
            //sb.appendInd("break;\n\n")
            
        }
    }
    
    /**
     *  Transforms a Fork node into corresponding Java Code
     * 
     *  @param sb
     *              The StringBuilder the code is written into
     *  @param ass
     *              The Assignment node from which the code is extracted
     */
    private def void transformNode(StringBuilder sb, Fork fork) {
        // Find Thread with highest entry priority and lowest exit priority
        val children = fork.next.map[n | n.target]
        var childrenStringBuilders = <StringBuilder> newLinkedList
        val sortedChildrenByEntry = (children.sortBy[n | ((n as Entry).getAnnotation(PriorityAuxiliaryData.
                                                        OPTIMIZED_NODE_PRIORITIES_ANNOTATION) as IntAnnotation)
                                                        .value]).reverse

        val Node forkThread = sortedChildrenByEntry.head
        val sortedChildrenByExit  = (children.sortBy[n | (((n as Entry).exit).getAnnotation
                                                (PriorityAuxiliaryData.OPTIMIZED_NODE_PRIORITIES_ANNOTATION) 
                                                as IntAnnotation).value])

        val Node joinThread = sortedChildrenByExit.head
        var joinPrios = <Integer> newLinkedList
        var forkPrios = <Integer> newLinkedList
        var threadNames = <String> newLinkedList
        
        var forkSB = new StringBuilder
        var joinSB = new StringBuilder
        var forkLabel = getNewRegionName(forkThread)
        var joinLabel = ""
        if(forkThread.equals(joinThread)) {
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
                var childSB = new StringBuilder
                child.transformThread(childSB, threadNames, forkPrios, joinPrios)
                childrenStringBuilders.add(childSB)                
            }
        }
        
        // Translate thread with lowest exit priority but don't add its exit priority to the list of joining priorities
        joinSB.addCase(joinLabel)
        labeledNodes.put(joinThread, joinLabel)
        joinSB.transformNode(joinThread)
        childrenStringBuilders.addFirst(joinSB)
        
        // As long as the thread with the highest entry priority and lowest exit priority are not the same, also 
        // translate this thread.
        if(!forkThread.equals(joinThread)) {
            forkSB.addCase(forkLabel)
            labeledNodes.put(forkThread, forkLabel)
            forkSB.transformNode(forkThread)
            childrenStringBuilders.add(forkSB)
            // Add its exit priority to the joining priorities
            val forkThreadExitPrio = ((forkThread as Entry).exit.getAnnotation(PriorityAuxiliaryData.
                                                    OPTIMIZED_NODE_PRIORITIES_ANNOTATION)as IntAnnotation).value
                                                    
            // Further add the entry priority and the label of the thread with the lowest exit priority to the 
            // labels and priorities to be forked
            val joinThreadPrio = (joinThread.getAnnotation(PriorityAuxiliaryData.OPTIMIZED_NODE_PRIORITIES_ANNOTATION)
                                                            as IntAnnotation).value
            forkPrios.add(joinThreadPrio)
            threadNames.add(joinLabel)
            joinPrios.add(forkThreadExitPrio)
        } 
        
        // Create the fork
        sb.appendInd("fork(new State[]{" + threadNames.listToString + "}, new int[]{" + forkPrios.toPrios + "});\n")
        sb.appendInd("gotoB(" + forkLabel + ");\n")
        sb.appendInd("break;\n\n")

        // Append all threads
        for(child : childrenStringBuilders.reverse) {
            sb.append(child)
        }
        
        // Create the join
        sb.transformNode(fork.join, joinPrios)
    }
    
    /**
     *  Transforms a Join node into corresponding Java Code
     * 
     *  @param sb
     *              The StringBuilder the code is written into
     *  @param ass
     *              The Assignment node from which the code is extracted
     */
    private def void transformNode(StringBuilder sb, Join join, LinkedList<Integer> joinPrios) {
        // Perform the join.
        // Create new labels for new states
        var newLabel = ""
        if(labeledNodes.containsKey(join)) {
            newLabel = labeledNodes.get(join)
        } else {
            newLabel  = "_L_" + labelNr++            
            
            // Go to the new join-"state"
            sb.appendInd("gotoB(" + newLabel + ");\n")
            sb.appendInd("break;\n\n")
        }
        val nextLabel = "_L_" + labelNr++
        
        // Create the join-"state"
        sb.addCase(newLabel)
        sb.appendInd("if(!join(new int[]{" + joinPrios.toPrios + "})) {\n")
        currentIndentation += DEFAULT_INDENTATION
        sb.appendInd("pauseB(" + newLabel + ");\n")
        currentIndentation = currentIndentation.substring(0, currentIndentation.length - 2)
        sb.appendInd("} else {\n")
        currentIndentation += DEFAULT_INDENTATION
        sb.appendInd("gotoB(" + nextLabel + ");\n")
        currentIndentation = currentIndentation.substring(0, currentIndentation.length - 2)
        sb.appendInd("}\n")
        sb.appendInd("break;\n\n")
        
        // Create the following state
        sb.addCase(nextLabel)
        previousNode.push(join)
        sb.transformNode(join.next.target)
        previousNode.pop
    }
    
    /**
     *  Transforms an Entry node into corresponding Java Code
     * 
     *  @param sb
     *              The StringBuilder the code is written into
     *  @param ass
     *              The Assignment node from which the code is extracted
     */
    private def void transformNode(StringBuilder sb, Entry entry) {
        val prio = (entry.getAnnotation(PriorityAuxiliaryData.OPTIMIZED_NODE_PRIORITIES_ANNOTATION) 
                                                                                as IntAnnotation).value
        maxPriority = Math.max(prio, maxPriority)
        
        sb.transformNode(entry.next.target)
    }
    
    /**
     *  Transforms an Exit node into corresponding Java Code
     * 
     *  @param sb
     *              The StringBuilder the code is written into
     *  @param ass
     *              The Assignment node from which the code is extracted
     */
    private def void transformNode(StringBuilder sb, Exit exit) {
        // Only do something if the exit is the final node of the program. Otherwise
        // the fork/join does this
        if(!exit.entry.hasAnnotation("joinThread")) {
            sb.appendInd("termB();\n")
            sb.appendInd("break;\n\n")            
        } else {
            // Go to join
            if(exit.next != null) {
                val join = exit.next.target
                var newLabel = ""
                if(labeledNodes.containsKey(join)) {
                    newLabel = labeledNodes.get(join)
                } else {
                    newLabel = "_L_" + labelNr++
                    labeledNodes.put(exit.next.target, newLabel)                
                }
                
                sb.appendInd("gotoB(" + newLabel + ");\n")
                sb.appendInd("break;\n\n")
            }
        }
    }
    
    /**
     *  Transforms a Surface node into corresponding Java Code
     * 
     *  @param sb
     *              The StringBuilder the code is written into
     *  @param ass
     *              The Assignment node from which the code is extracted
     */
    private def void transformNode(StringBuilder sb, Surface sur) {
        // If the priority is raised after the pause, insert a prio-statement and a pause.
        val prio = (sur.getAnnotation(PriorityAuxiliaryData.OPTIMIZED_NODE_PRIORITIES_ANNOTATION)
                                                                                as IntAnnotation).value
        val depPrio = (sur.depth.getAnnotation(PriorityAuxiliaryData.OPTIMIZED_NODE_PRIORITIES_ANNOTATION)
                                                                                as IntAnnotation).value
        
        if(prio != depPrio) {
            val newLabel = "_L_" + labelNr++
            sb.appendInd("prioB(" + depPrio + ", " + newLabel + ");\n")
            sb.appendInd("break;\n\n")
            sb.addCase(newLabel)
        }
        val newLabel = "_L_" + labelNr++
        sb.appendInd("pauseB(" + newLabel + ");\n")
        labeledNodes.put(sur.depth, newLabel)
        sb.appendInd("break;\n\n")
        
        sb.transformNode(sur.depth)
    }
    
    /**
     *  Transforms a Depth node into corresponding Java Code
     * 
     *  @param sb
     *              The StringBuilder the code is written into
     *  @param ass
     *              The Assignment node from which the code is extracted
     */
    private def void transformNode(StringBuilder sb, Depth dep) {
        val prio = (dep.getAnnotation(PriorityAuxiliaryData.OPTIMIZED_NODE_PRIORITIES_ANNOTATION) 
                                                                                as IntAnnotation).value
        maxPriority = Math.max(prio, maxPriority)
        // Build the label
        sb.addCase(labeledNodes.get(dep))
        sb.transformNode(dep.next.target)
    }
 
 //----------------------------------------------------------------------------------------------------------------
 //----------------------------------------HELPER FUNCTIONS--------------------------------------------------------   
 //----------------------------------------------------------------------------------------------------------------
    
    /**
     *  Appends a String s to the StringBuilder sb with the current indentation
     *  
     *  @param sb
     *              The StringBuilder the code is written into
     *  @param s
     *              The code written into the StringBuilder
     */
    private def void appendInd(StringBuilder sb, String s) {
        sb.append(currentIndentation + s)
    }
    
    /**
     *  Creates a new case/state statement and appends it to the StringBuilder sb
     *  
     *  @param sb
     *              The StringBuilder the code is written into
     *  @param newLabel
     *              The Label of the new Case/State
     */
    private def void addCase(StringBuilder sb, String newLabel) {
        currentIndentation = currentIndentation.substring(0, currentIndentation.length - 2)
        sb.appendInd("case " + newLabel + ":\n")
        currentIndentation += DEFAULT_INDENTATION
        states.add(newLabel)
    }
    
    /** 
     *  Converts a list of priorities to a String
     * 
     *  @param priorities
     *              The list of priorities to be converted to a String
     * 
     *  @returns
     *              A String of numbers in the form of "priority1, priority2, priority3, ..."
     */
    private def String toPrios(LinkedList<Integer> priorities) {
        var s = ""
        s += priorities.head
        for(prio : priorities.tail) {
            s += ", "
            s += prio.toString
        }
        return s
    }
    
    /** 
     *  Converts a list of Strings to a String separated by commas
     * 
     *  @param priorities
     *              The list of Strings to be converted to a String
     * 
     *  @returns
     *              A String in the form of "String1, String2, String3, ..."
     */
    private def String listToString(LinkedList<String> strings) {
        var s = ""
        s += strings.head
        for(string : strings.tail) {
            s += ", "
            s += string
        }
        return s
    }
    
    /** 
     *  Generates a new region name for states after a fork.
     *  If a name of a region has already been used, creates a new unique name.
     * 
     *  @param node
     *              A node that is a part of the region a new name is generated for
     * 
     *  @returns
     *              The new name that can be used as a name of a state
     */
    private def String getNewRegionName(Node node) {
        var newLabel = node.getStringAnnotationValue("regionName").replaceAll(" ", "")
        if(newLabel == "") {
            newLabel = "_L_" + labelNr++
            return newLabel
        }
        if(regionNr.containsKey(newLabel)) {
            val forkNr = regionNr.get(newLabel)
            regionNr.replace(newLabel, forkNr + 1)
            newLabel += "_" + forkNr
        } else {
            regionNr.put(newLabel, 1)
        }
        return newLabel
    }
    
    
    /**
     *  Translates a thread with entry node "node" into the StringBuilder sb and adds the threadname and its initial 
     *  prio to lists
     * 
     *  @param node the original node
     *  @param sb the stringbuilder to append the translation to
     *  @param threads a list of threadnames
     *  @param prios a list of initial priorities
     */
    private def void transformThread(Node node, StringBuilder sb, LinkedList<String> threads, LinkedList<Integer> prios,
                                            LinkedList<Integer> exitPrios) {
        var newLabel = node.getNewRegionName
        var prio = (node.getAnnotation(PriorityAuxiliaryData.OPTIMIZED_NODE_PRIORITIES_ANNOTATION) 
                                                                                as IntAnnotation).value
        var exitPrio = ((node as Entry).exit.getAnnotation(PriorityAuxiliaryData.OPTIMIZED_NODE_PRIORITIES_ANNOTATION) 
                                                                                as IntAnnotation).value
        
        threads.add(newLabel)
        prios.add(prio)
        exitPrios.add(exitPrio)
        labeledNodes.put(node, newLabel)
        sb.addCase(newLabel)
        sb.transformNode(node)
    }
    
}