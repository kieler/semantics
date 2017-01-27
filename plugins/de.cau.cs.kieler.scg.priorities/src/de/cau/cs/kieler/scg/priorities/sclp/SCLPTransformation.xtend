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
package de.cau.cs.kieler.scg.priorities.sclp

import de.cau.cs.kieler.annotations.IntAnnotation
import de.cau.cs.kieler.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
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
import de.cau.cs.kieler.scg.SCGAnnotations
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.Surface
import java.util.ArrayList
import java.util.HashMap
import java.util.Stack
import javax.inject.Inject

import static extension de.cau.cs.kieler.core.model.codegeneration.HostcodeUtil.*
import de.cau.cs.kieler.scg.priorities.PriorityAuxiliaryData
import de.cau.cs.kieler.scg.transformations.c.SCG2CSerializeHRExtensions

/**
 * Class to perform the transformation of an SCG to C code in the priority based compilation chain.
 * @author lpe
 *
 */
class SCLPTransformation extends AbstractProductionTransformation{
    
     @Inject 
     extension AnnotationsExtensions
     @Inject 
     extension KExpressionsValuedObjectExtensions
     @Inject 
     extension SCG2CSerializeHRExtensions
     
     
     
    /** Default indentation of a c file */
    private val DEFAULT_INDENTATION = "  "
    
    /** Keeps track of the current indentation level */
    private var currentIndentation = ""
    
    /** Maps nodes to their corresponding labels, if there are any */
    private var labeledNodes = <Node, String> newHashMap
    
    /** Keeps track of the current label number for newly created labels */
    private var labelNr = 0
    
    /** Keeps track of region numbers for regions without a name. They will then recieve a 
     *  unique region number. */
    private var regionNr = 0
    
    /** Keeps track of previously used region names */
    private var regionNames = new ArrayList<String>
    
    /** StringBuilder to keep track of forks and joins with more than 4 elements. 
     *  There exists no macro for these forks and joins, therefore new macros are created if this happens. */
    private var forkJoinSb = new StringBuilder
    
    /** Keeps track of newly generated fork macros and prevents a fork macro to be generated multiple times */
    private var generatedForks = new ArrayList<Integer>

    /** Keeps track of newly generated join macros and prevents a join macro to be generated multiple times */
    private var generatedJoins = new ArrayList<Integer>
    
    /** Keeps track of the previous node to allow prio()-statements to be made if necessary */
    private var previousNode = new Stack<Node>
    
    /** Keeps track of already visited nodes */
    private var visited = new HashMap<Node, Boolean>
    
    
    override getProducedFeatureId() {
        "sclp.sclpTrans"
    }
    
    override getId() {
        "sclp.sclpTrans"
    }
    
    override getName() {
        "SCL_P"
    }
    
    override getRequiredFeatureIds() {
        return newHashSet("scg.scgPrio");
    }
    
    
    /**
     * Transform the SCG to C code based on the priority compilation.
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
        
        val program = new StringBuilder
        val sb = new StringBuilder
        labelNr  = 0
        regionNr = 0
        currentIndentation = ""
        forkJoinSb = new StringBuilder
        generatedForks.clear
        previousNode.clear
        
        
        program.addHeader;
        program.addGlobalHostcodeAnnotations(scg);
        sb.addProgram(scg);
        program.append(forkJoinSb)
        program.declareVariables(scg)
        program.append(sb)
        
        program.toString
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
    protected def void addProgram(StringBuilder sb, SCGraph scg) {
        
        
        
        sb.appendInd("int tick() {\n\n")
        currentIndentation += DEFAULT_INDENTATION
       
                 
        sb.transformNode(scg.nodes.filter(Entry).head)
         
        sb.appendInd("tickreturn();\n")
        currentIndentation = currentIndentation.substring(0, currentIndentation.length - 2)
        sb.appendInd("}")
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
//            println(declaration)
            if(declaration.type.toString == "string" || declaration.type.toString == "STRING") {
                sb.append("char*")
            } else {
                sb.appendInd(declaration.type.toString)
            }
            //sb.append("int")
            for(variables : declaration.valuedObjects) {
                if(!(variables.equals(declaration.valuedObjects.head))) {
                    sb.append(",")
                }
                sb.append(" ")
                sb.append(variables.name)                
            }
            sb.append(";\n")
        }
        sb.append("\n")
    }


    protected def void addGlobalHostcodeAnnotations(StringBuilder sb, SCGraph scg) {
        for (annotation : scg.getAnnotations(SCGAnnotations.ANNOTATION_HOSTCODE)) {
            sb.appendInd(annotation.asStringAnnotation.values.head.removeEscapeChars);
            sb.appendInd("\n")
        }
    }
        
    
    /**
     *  Adds a header to the program
     * 
     *  @param sb
     *              The StringBuilder the program writes the header into
     * 
     */
    protected def void addHeader(StringBuilder sb) {
        sb.append(
            "/*\n" 
            + " * Automatically generated C code by\n" 
            + " * KIELER SCCharts - The Key to Efficient Modeling\n" 
            + " *\n" 
            + " * http://rtsys.informatik.uni-kiel.de/kieler\n" 
            + " */\n"
            + "\n"
            + "#define _SC_NO_SIGNALS2VARS\n"
            + "#include \"scl.h\"\n"
            + "#include \"sc.h\"\n"
            + "#include \"sc.c\"\n"
            + "#include \"sc-generic.h\"\n\n"
            + "#define true 1\n"
            + "#define false 0\n"
            + "void reset() {}"
            + "\n")
    }
 
 //----------------------------------------------------------------------------------------------------------------
 //----------------------------------------NODE TRANSLATION--------------------------------------------------------   
 //----------------------------------------------------------------------------------------------------------------
     
    /**
     *  Transforms a node into corresponding c code
     * 
     *  @param sb
     *              The StringBuilder the code is written into
     *  @param node
     *              The node from which the code is extracted
     */
    private def void transformNode(StringBuilder sb, Node node) {
        valuedObjectPrefix = "";
        
        //If the node is a Join, we don't want it to be called within the controlFlow. It is supposed to be 
        //called from the Fork-Node. This guarantees that a Join will not get a label
        if(node instanceof Join) {
            return
        }

        if(!previousNode.empty()) {
            val prev = previousNode.peek()
            val prevPrio = prev.getAnnotation(PriorityAuxiliaryData.OPTIMIZED_NODE_PRIORITIES_ANNOTATION) as IntAnnotation
            val prio = node.getAnnotation(PriorityAuxiliaryData.OPTIMIZED_NODE_PRIORITIES_ANNOTATION) as IntAnnotation
            if(!(prev instanceof Fork) && prevPrio.value != prio.value) {
                sb.appendInd("prio(" + prio.value + ");\n")
            }
            if(prev instanceof Entry) {
                labeledNodes.put(node, labeledNodes.get(prev))
            }
        }
        
        if(!(node instanceof Exit)) {
            //If the node has already been visited before, add a goto, instead of translating it again
            if(visited.containsKey(node) && visited.get(node) && labeledNodes.containsKey(node)) {
            //if(labeledNodes.containsKey(node)) {
                sb.appendInd("goto " + labeledNodes.get(node) + ";\n")
                return
            } else {
                if(!labeledNodes.containsKey(node)) {
                    //If a node has multiple incoming control flows, create a goto label
                    val incomingControlFlows = node.incoming.filter(ControlFlow).toList
                    if(incomingControlFlows.size > 1) {
                        val newLabel = "label_" + labelNr++
                        labeledNodes.put(node, newLabel)
                        sb.appendInd(newLabel + ":\n")
                    }                
                }
            }
        }
        visited.put(node, true)
        
        previousNode.push(node)
        //Translate the node depending on its type
        if (node instanceof Assignment) {
            sb.transformNode(node as Assignment)
        } else if (node instanceof Conditional) {
            sb.transformNode(node as Conditional)
        } else if (node instanceof Fork) {
            sb.transformNode(node as Fork)
        } else if (node instanceof Join) {
            //Don't do anything here, Join will be called from the Fork node
        } else if (node instanceof Entry) {
            sb.transformNode(node as Entry)
        } else if (node instanceof Exit) {
            sb.transformNode(node as Exit)
        } else if (node instanceof Surface) {
            sb.transformNode(node as Surface)
        } else if (node instanceof Depth) {
            sb.transformNode(node as Depth)
        }
        
        previousNode.pop()
        
    }
    
    /**
     *  Transforms an Assignment node into corresponding c code
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
     *  Transforms a Conditional node into corresponding c code
     * 
     *  @param sb
     *              The StringBuilder the code is written into
     *  @param cond
     *              The Conditional node from which the code is extracted
     */
    private def void transformNode(StringBuilder sb, Conditional cond) {
        
        val condition = cond.condition.getAllReferences.head.valuedObject

        //IF-Case
        sb.appendInd("if(" + condition.name + "){\n")
        currentIndentation += DEFAULT_INDENTATION
        
        sb.transformNode(cond.then.target)
        
        currentIndentation = currentIndentation.substring(0, currentIndentation.length - 2)
        sb.appendInd("} ")
        
        //ELSE-Case
        sb.append("else {\n")
        currentIndentation += DEFAULT_INDENTATION
        sb.transformNode(cond.^else.target)
        
        currentIndentation = currentIndentation.substring(0, currentIndentation.length - 2)
        sb.appendInd("}\n")
        
    }
    
    
    /**
     *  Transforms a Fork node into corresponding c code
     * 
     *  @param sb
     *              The StringBuilder the code is written into
     *  @param fork
     *              The Fork node from which the code is extracted
     */
    private def void transformNode(StringBuilder sb, Fork fork) {

        var labelList = <String> newArrayList
        var nodeList = <Node> newArrayList
        var prioList = <Integer> newArrayList
        var endPrioList = <Integer> newArrayList
        var Node nodeHead
        var String labelHead
        var children = fork.next
        
        val xchildren = children.sortBy[(it.target.getAnnotation("optPrioIDs") as IntAnnotation).value].reverse
        
        
        nodeHead = xchildren.head.target
        
        for (child : xchildren) {
            val nxt = child.target
            val ann = nxt.getAnnotation("optPrioIDs") as IntAnnotation
            val last = (nxt as Entry).exit
            //FIXME: Dumb enumeration of regions
            val regionName = nxt.getStringAnnotationValue("regionName")
            
            if(!nxt.equals(nodeHead)) {                
                nodeList.add(nxt)
                prioList.add(ann.value)
                endPrioList.add((last.getAnnotation("optPrioIDs") as IntAnnotation).value) 
                
                if (regionName == "") {
                    labelList.add("region_" + regionNr++)
                } else {
                    if(regionNames.contains(regionName)) {
                        val newName = regionName + "_" + regionNr++
                        labelList.add(newName)
                        regionNames.add(newName)
                    } else {
                        labelList.add(regionName)
                        regionNames.add(regionName)
                    }
                }
            } else {
                if(regionName == "") {
                    labelHead = "region_" + regionNr++
                } else {
                    if(regionNames.contains(regionName)) {
                        val newName = regionName + "_" + regionNr++
                        labelHead = newName
                        regionNames.add(newName)
                    } else {
                        labelHead = regionName
                        regionNames.add(regionName)
                    }
                }
            }
            
        }
        sb.generateForkn(nodeList.length, labelList, prioList)
                
        //Creates the Strings for the different threads
        sb.appendInd(labelHead + ":\n")
        labeledNodes.put(nodeHead, labelHead)
        sb.transformNode(nodeHead)
        

        for(node : nodeList) {

            currentIndentation = currentIndentation.substring(0, currentIndentation.length - 2)
            sb.append("\n")
            sb.appendInd("} par {\n")
            currentIndentation += DEFAULT_INDENTATION  
            //sb.appendInd(labelList.get(nodeList.indexOf(node)) + ":\n") 
            
            val newLabel = labelList.get(nodeList.indexOf(node))
            sb.appendInd(newLabel + ":\n") 
            labeledNodes.put(node, newLabel)
            
            sb.transformNode(node)
            //Caution: The forked threads are not allowed to call the join node by themselves. Only this fork node
            //may call the join node after all threads are created!
        }
        
        currentIndentation = currentIndentation.substring(0, currentIndentation.length - 2)
        sb.appendInd("\n")
        
        var joinPrioList = <Integer> newArrayList
        joinPrioList.add(((nodeHead as Entry).exit.getAnnotation("optPrioIDs") as IntAnnotation).value)
        joinPrioList.addAll(endPrioList)
        joinPrioList.remove(joinPrioList.min())
        
        sb.generateJoinn(joinPrioList.size, joinPrioList)
        
        //Joins all the threads together again
        sb.transformNode(fork.join)
    }
    
    
    /**
     *  Transforms a Join node into corresponding c code
     * 
     *  @param sb
     *              The StringBuilder the code is written into
     *  @param join
     *              The Join node from which the code is extracted
     */
    private def void transformNode(StringBuilder sb, Join join) {
        //Eigentlich erst hier joinn aber das ignorieren wir mal.
        //Es macht ja keinen wirklichen Unterschied, ob das im Fork oder im Join generiert wird.
        sb.transformNode(join.next.target)
        
    }
    
    
    /**
     *  Transforms an Entry node into corresponding c code
     * 
     *  @param sb
     *              The StringBuilder the code is written into
     *  @param entry
     *              The Entry node from which the code is extracted
     */
    private def void transformNode(StringBuilder sb, Entry entry) {
        //If entry is the root node
        if(entry.incoming.empty) {
            if(entry.hasAnnotation("optPrioIDs")) {
                val p = entry.getAnnotation("optPrioIDs") as IntAnnotation
                sb.appendInd("tickstart(" + p.value + ");\n")
            }
            
        }
        
        sb.transformNode(entry.next.target)
        
        //Wenn root, dann: tickstart(p);
        //Ansonsten ignorieren
    }
    
    
    /**
     *  Transforms an Exit node into corresponding c code
     * 
     *  @param sb
     *              The StringBuilder the code is written into
     *  @param exit
     *              The Exit node from which the code is extracted
     */
    private def void transformNode(StringBuilder sb, Exit exit) {
        //Does absolutely nothing
        //Cannot have more than one incoming edge and cannot lower the priority.
        sb.appendInd("\n")
        if(exit.next != null) {
            sb.transformNode(exit.next.target)
        }
    }
    
    
    /**
     *  Transforms a Surface node into corresponding c code
     * 
     *  @param sb
     *              The StringBuilder the code is written into
     *  @param sur
     *              The Surface node from which the code is extracted
     */
    private def void transformNode(StringBuilder sb, Surface sur) {

        //if the priority after the pause is higher than before the pause, we must increase it 
        //before the pause. Else the increase of the priority would happen after other threads, whose
        //priorities might be higher at first, but lower after the increase of the priority.
        val depthPrio = sur.depth.getAnnotation("optPrioIDs") as IntAnnotation
        val prio = sur.getAnnotation("optPrioIDs") as IntAnnotation
        
        if(depthPrio.value > prio.value) {
            sb.appendInd("prio(" + depthPrio.value + ");\n")
        }

        sb.appendInd("pause;\n");
        
        sb.transformNode(sur.depth)
    }
    
    
    /**
     *  Transforms a Depth node into corresponding c code
     * 
     *  @param sb
     *              The StringBuilder the code is written into
     *  @param dep
     *              The Depth node from which the code is extracted
     */
    private def void transformNode(StringBuilder sb, Depth dep) {
        
        
        sb.transformNode(dep.next.target)
    }
    
 //----------------------------------------------------------------------------------------------------------------    
 //----------------------------------------AUXILIARY FUNCTIONS-----------------------------------------------------   
 //----------------------------------------------------------------------------------------------------------------

    /**
     *  Appends a String @s to the StringBuilder @sb with the current indentation
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
     *  Generates a forkn-statement. If n > 3, there are no pregenerated fork-statements for this amount of forks and a 
     *  new statement is generated
     *  
     *  @param sb
     *              The StringBuilder the code is written into
     *  @param n
     *              The amount of newly created threads
     *  @param labels
     *              The labels of each thread
     *  @param prios
     *              The priorities of each thread
     */
    private def generateForkn(StringBuilder sb, int n, ArrayList<String> labels, ArrayList<Integer> prios) {
        sb.appendInd("fork" + n + "(")
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
        currentIndentation += DEFAULT_INDENTATION
        
        if(n > 3 && !generatedForks.contains(n)) {
            forkJoinSb.append("#define fork" + n + "(")
            var s1 = ""
            var s2 = ""
            for(var i = 0; i < n; i++) {
                s1 = s1.concat("label" + i + ", p" + i)
                s2 = s2.concat("  fork1(label" + i + ", p" + i + ");")
                if(i != n - 1) {
                    s1 = s1.concat(", ")
                    s2 = s2.concat("   \\")
                }
                s2 = s2.concat("\n")
            }
            forkJoinSb.append(s1 + ") \\ \n")
            forkJoinSb.append(s2)
            forkJoinSb.append("\n")
            
            generatedForks.add(n)         
        }
    }     
    
    
    /**
     *  Generates a joinn-statement. If n > 4, there are no pregenerated join-statements for this amount of joins and a 
     *  new statement is generated
     *  
     *  @param sb
     *              The StringBuilder the code is written into
     *  @param n
     *              The amount of threads to join
     *  @param prioList
     *              The priorities of the threads
     */
    private def generateJoinn(StringBuilder sb, int n, ArrayList<Integer> prioList) {
        sb.appendInd("} join" + n + "(" + prioList.createPrioString + ");\n")
        
        if(n > 4 && !generatedJoins.contains(n)) {
            forkJoinSb.append("#define join" + n + "(")
            var s1 = ""
            var s2 = ""
            for(var i = 0; i < n; i++) {
                s1 = s1.concat("sib" + i)
                s2 = s2.concat("  join1(sib" + i + "); ")
                if(i != n - 1) {
                    s1 = s1.concat(", ")
                    s2 = s2.concat("\\")
                }
                s2 = s2.concat("\n")
            }
            forkJoinSb.append(s1 + ") \\ \n")
            forkJoinSb.append(s2)
            forkJoinSb.append("\n")
            
            generatedJoins.add(n)
        }
        /*sb.appendInd("}")
        for(prio : prioList) {
            sb.append(" join1(" + prio + ");\n")
        }*/
    }
    
    
    /**
     * Helper function to create a String containing the priorities of the different threads.
     * Used for the joinn-macro.
     * 
     * @param prioList
     *                  The priorities of the threads listed in the join statement
     */
    def createPrioString(ArrayList<Integer> prioList) {
        
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