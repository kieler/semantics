/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http:// rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2017 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.scg.processors.priority

import com.google.inject.Inject
import de.cau.cs.kieler.annotations.AnnotationsFactory
import de.cau.cs.kieler.annotations.IntAnnotation
import de.cau.cs.kieler.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.kexpressions.Declaration
import de.cau.cs.kieler.kexpressions.ValueType
import de.cau.cs.kieler.kexpressions.VariableDeclaration
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsDeclarationExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kexpressions.kext.ClassDeclaration
import de.cau.cs.kieler.kicool.compilation.CodeContainer
import de.cau.cs.kieler.kicool.compilation.Processor
import de.cau.cs.kieler.kicool.compilation.ProcessorType
import de.cau.cs.kieler.kicool.compilation.codegen.CodeGeneratorNames
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
import de.cau.cs.kieler.scg.SCGraphs
import de.cau.cs.kieler.scg.Surface
import de.cau.cs.kieler.scg.extensions.SCGControlFlowExtensions
import de.cau.cs.kieler.scg.extensions.SCGThreadExtensions
import de.cau.cs.kieler.scg.processors.SCGAnnotations
import de.cau.cs.kieler.scg.processors.codegen.c.CCodeSerializeHRExtensions
import java.util.ArrayList
import java.util.HashMap
import java.util.HashSet
import java.util.List
import java.util.Stack

import static de.cau.cs.kieler.kicool.compilation.codegen.AbstractCodeGenerator.*
import static de.cau.cs.kieler.kicool.compilation.codegen.CodeGeneratorNames.*

/**
 * Class to perform the transformation of an SCG to C code in the priority based compilation chain.
 * @author lpe ssm
 *
 */
class SCLPTransformation extends Processor<SCGraphs, CodeContainer> {
    
    @Inject extension AnnotationsExtensions
    @Inject extension CCodeSerializeHRExtensions
    @Inject extension SCGThreadExtensions
    @Inject extension KExpressionsDeclarationExtensions
    @Inject extension SCGControlFlowExtensions
    @Inject extension KExpressionsValuedObjectExtensions
     
    extension AnnotationsFactory = AnnotationsFactory.eINSTANCE
    
    static val TICK_DATA = "TickData"
     
    /** Default indentation of a c file */
	val DEFAULT_INDENTATION = "  "
    
    /** Keeps track of the current indentation level */
	var currentIndentation = ""
    
    /** Maps nodes to their corresponding labels, if there are any */
	var labeledNodes = <Node, String>newHashMap
    
    /** Keeps track of the current label number for newly created labels */
	var labelNr = 0
    
    /** Keeps track of region numbers for regions without a name. They will then recieve a 
     *  unique region number. */
    var regionNr = 0
    
    /** Keeps track of previously used region names */
    var regionNames = new ArrayList<String>
    
    /** StringBuilder to keep track of forks with more than 4 elements. 
     *  There exists no macro for these forks, therefore new macros are created if this happens. 
     *  This StringBuilder collects the macros for programs with under WORD_SIZE priorities. */
    var forkSb = new StringBuilder
    
    /** StringBuilder to keep track of joins with more than 4 elements. 
     *  There exists no macro for these joins, therefore new macros are created if this happens. 
     *  This StringBuilder collects the macros for programs with under WORD_SIZE priorities. */
    var joinSbUnderWordsize = new StringBuilder
    
    /** StringBuilder to keep track of joins with more than 4 elements. 
     *  There exists no macro for these joins, therefore new macros are created if this happens. 
     *  This StringBuilder collects the macros for programs with over WORD_SIZE priorities. */
    var joinSbOverWordsize = new StringBuilder
    
    /** Keeps track of newly generated fork macros and prevents a fork macro to be generated multiple times */
    var generatedForks = new ArrayList<Integer>

    /** Keeps track of newly generated join macros and prevents a join macro to be generated multiple times */
    var generatedJoins = new ArrayList<Integer>
    
    /** Keeps track of the previous node to allow prio()-statements to be made if necessary */
    var previousNode = new Stack<Node>
    
    /** Keeps track of already visited nodes */
    var visited = new HashMap<Node, Boolean>
    
    /** Saves all prioIDs of nodes inside a thread (as represented by its Entry node) */
    var threadPriorities = new HashMap<Node, ArrayList<Integer>>
    
    override getId() {
        "de.cau.cs.kieler.scg.processors.sclp"
    }
    
    override getName() {
        "SCL_P"
    }
    
    override getType() {
        ProcessorType.EXOGENOUS_TRANSFORMATOR
    }
    
    override process() {
        val code = new CodeContainer
        transform(getModel.scgs.head, code)
        
        setModel(code)
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
    def transform(SCGraph scg, CodeContainer code) {
        
        val header = new StringBuilder
        val program = new StringBuilder
        val sb = new StringBuilder
        labelNr  = 0
        regionNr = 0
        currentIndentation = ""
        forkSb = new StringBuilder
        joinSbOverWordsize = new StringBuilder
        joinSbUnderWordsize = new StringBuilder
        generatedForks.clear
        generatedJoins.clear
        previousNode.clear
        regionNames.clear
        threadPriorities.clear
        
        valuedObjectPrefix = "d->";
        
        program.addLicense
        program.addHeader(scg);
        program.addGlobalHostcodeAnnotations(scg);
        sb.addProgram(scg);
        program.append(forkSb)
        if(joinSbOverWordsize.length > 0) {
            program.append("#ifdef _idsetSize\n")
            program.append(joinSbOverWordsize)
            program.append("\n#else\n")
            program.append(joinSbUnderWordsize)
            program.append("#endif\n\n")            
        }
        program.append(sb)
        
        header.addLicense
        header.append("#define false 0\n")
        header.append("#define true 1\n")
        header.append("typedef int bool;\n\n")
        header.declareVariables(scg)
        header.append("void reset(TickData* d);\nint tick(TickData* d);")
        
        val naming = <CodeGeneratorNames, String> newHashMap
        naming.put(TICK, environment.getProperty(TICK_FUNCTION_NAME))
        naming.put(RESET, environment.getProperty(RESET_FUNCTION_NAME))
        naming.put(LOGIC, environment.getProperty(LOGIC_FUNCTION_NAME))
        naming.put(TICKDATA, environment.getProperty(TICKDATA_STRUCT_NAME))        
        
        code.addCHeader(scg.name + ".h", header.toString).naming.putAll(naming)
        code.addCCode(scg.name + ".c", program.toString).naming.putAll(naming)
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
        sb.appendInd("void reset("+TICK_DATA+"* d) {}\n\n")
        sb.appendInd("int tick("+TICK_DATA+"* d) {\n\n")
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
        
        sb.appendInd("typedef struct {\n")
        currentIndentation += DEFAULT_INDENTATION
        
        scg.declarations.generateDeclarations(sb, 0)
        currentIndentation = currentIndentation.substring(0, currentIndentation.length - DEFAULT_INDENTATION.length)
        sb.appendInd("} "+TICK_DATA+";\n")
        sb.append("\n")
    }
    
    protected def void generateDeclarations(List<Declaration> declarations, StringBuilder code, int depth) {
        val indentation = "  "
        for (declaration : declarations) {
            if (declaration instanceof ClassDeclaration) {
                (0..depth).forEach[code.append(indentation)]
                code.append("struct ")
                code.append(declaration.name)
                if (!declaration.host) {
                    code.append(" {\n")
                    declaration.declarations.generateDeclarations(code, depth + 1)
                    (0..depth).forEach[code.append(indentation)]
                    code.append("}")
                }
                for (valuedObject : declaration.valuedObjects) {
                    code.append(" ")
                    code.append(valuedObject.name)
                    if (valuedObject.isArray) {
                        for (cardinality : valuedObject.cardinalities) {
                            code.append("[" + cardinality.serializeHR + "]")
                        }
                    }
                    if (valuedObject !== declaration.valuedObjects.last) code.append(", ")
                }
                code.append(";\n")
            } else if (declaration instanceof VariableDeclaration) {
                for (valuedObject : declaration.valuedObjects) {
                    (0..depth).forEach[code.append(indentation)]
                    val declarationType = if (declaration.type != ValueType.HOST || declaration.hostType.nullOrEmpty) 
                        declaration.type.serializeHR
                        else declaration.hostType
                    code.append(declarationType)
                    code.append(" ")
                    code.append(valuedObject.name)
                    if (valuedObject.isArray) {
                        for (cardinality : valuedObject.cardinalities) {
                            code.append("[" + cardinality.serializeHR + "]")
                        }
                    }
                    code.append(";\n")
                }
            }
        }
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
    protected def void addHeader(StringBuilder sb, SCGraph scg) {
        
        val maxPID = (scg.getAnnotation("maxPrioID") as IntAnnotation).value
        
        sb.append(
              "#define _SC_NOTRACE\n"
            + "#define _SC_NO_SIGNALS2VARS\n"
            + "#define _SC_ID_MAX " + maxPID + "\n\n"
            + "#include \""+ scg.name + ".h\"\n"
            + "#include \"scl.h\"\n"
            + "#include \"sc.h\"\n"
            + "#include \"sc-generic.h\"\n\n")
//            + "#define true 1\n"
//            + "#define false 0\n\n")
    }
    
    protected def void addLicense(StringBuilder sb) {
        
        sb.append(
            "/*\n" 
            + " * Automatically generated C code by\n" 
            + " * KIELER SCCharts - The Key to Efficient Modeling\n" 
            + " *\n" 
            + " * http:// rtsys.informatik.uni-kiel.de/kieler\n" 
            + " */\n"
            + "\n")
    }
 
 // ----------------------------------------------------------------------------------------------------------------
 // ----------------------------------------NODE TRANSLATION--------------------------------------------------------   
 // ----------------------------------------------------------------------------------------------------------------
     
    /**
     *  Transforms a node into corresponding c code
     * 
     *  @param sb
     *              The StringBuilder the code is written into
     *  @param node
     *              The node from which the code is extracted
     */
    private def void transformNode(StringBuilder sb, Node node) {
//        valuedObjectPrefix = "";
        
        // If the node is a Join, we don't want it to be called within the controlFlow. It is supposed to be 
        //   called from the Fork-Node. This guarantees that a Join will not get a label.
        // This should further never be the case, since the fork calls the join directly.
        if(node instanceof Join) {
            return
        }

        if(!previousNode.empty() && !(node instanceof Depth)) {
            val prev = previousNode.peek()
            val prevPrio = prev.getAnnotation(PriorityAuxiliaryData.OPTIMIZED_NODE_PRIORITIES_ANNOTATION) as IntAnnotation
            val prio = node.getAnnotation(PriorityAuxiliaryData.OPTIMIZED_NODE_PRIORITIES_ANNOTATION) as IntAnnotation
            if(!(prev instanceof Fork) && prevPrio.value != prio.value) {
                sb.appendInd("prio(" + prio.value + ");\n")
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
            if(visited.containsKey(node) && visited.get(node) && labeledNodes.containsKey(node)) {
            // if(labeledNodes.containsKey(node)) {
                sb.appendInd("goto " + labeledNodes.get(node) + ";\n")
                return
            } else {
                if(!labeledNodes.containsKey(node)) {
                    // If a node has multiple incoming control flows, create a goto label
                    val incomingControlFlows = node.incomingLinks.filter(ControlFlow).toList
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
        // Translate the node depending on its type
        if (node instanceof Assignment) {
            sb.transformNode(node as Assignment)
        } else if (node instanceof Conditional) {
            sb.transformNode(node as Conditional)
        } else if (node instanceof Fork) {
            sb.transformNode(node as Fork)
        } else if (node instanceof Join) {
            // Don't do anything here, Join will be called from the Fork node
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
        
        sb.transformNode(ass.next.targetNode)
        
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
        

        // IF-Case
        sb.appendInd("if(" + cond.condition.serializeHR + "){\n")
        currentIndentation += DEFAULT_INDENTATION
        
        sb.transformNode(cond.then.targetNode)
        
        currentIndentation = currentIndentation.substring(0, currentIndentation.length - 2)
        sb.appendInd("} ")
        
        // ELSE-Case
        sb.append("else {\n")
        currentIndentation += DEFAULT_INDENTATION
        sb.transformNode(cond.^else.targetNode)
        
        currentIndentation = currentIndentation.substring(0, currentIndentation.length - 2)
        sb.appendInd("}\n")
        
        // For Review:
//        if(cond.then.target instanceof Exit) {
//            if(cond.^else.target instanceof Exit) {
//                
//            } else {
//                sb.appendInd("if(!(" + cond.condition.serializeHR + ")){\n")
//                currentIndentation += DEFAULT_INDENTATION
//                
//                sb.transformNode(cond.^else.target)
//                
//                currentIndentation = currentIndentation.substring(0, currentIndentation.length - 2)
//                sb.appendInd("}\n")
//                
//                sb.transformNode(cond.then.target)
//            }
//        } else {
//            // IF-Case
//            sb.appendInd("if(" + cond.condition.serializeHR + "){\n")
//            currentIndentation += DEFAULT_INDENTATION
//            
//            sb.transformNode(cond.then.target)
//            
//            currentIndentation = currentIndentation.substring(0, currentIndentation.length - 2)
//            sb.appendInd("} ")
//            
//            // ELSE-Case
//            if(!(cond.^else.target instanceof Exit)) {
//                sb.append("else {\n")
//                currentIndentation += DEFAULT_INDENTATION
//                sb.transformNode(cond.^else.target)
//                
//                currentIndentation = currentIndentation.substring(0, currentIndentation.length - 2)
//                sb.appendInd("}\n")                            
//            } else {
//                sb.appendInd("\n")
//            }
//        }
        
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
        var joinPrioList = <Integer> newArrayList
        var prioList = <Integer> newArrayList
        var joinPrioSet = new HashSet<Integer>
        var children = fork.next
        var min = Integer.MAX_VALUE
        var Node minNode
        var max = Integer.MIN_VALUE
        var Node maxNode
        var forkBody = new StringBuilder
        var String labelHead
        
        currentIndentation += DEFAULT_INDENTATION
        
        // Find threads with maximal entry priority and minimal exit priority
        for(child : children) {
            val entry = child.targetNode
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
            child.targetNode.annotations += createIntAnnotation => [
                name = "exitPrio"
                value = minx
            ]
            var node = child.targetNode
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
                // Create label
                forkBody.appendInd(newLabel + ":\n")
                labeledNodes.put(node, newLabel)
                
                // Translate thread
                forkBody.transformNode(node)
                
                joinPrioSet.addAll(threadPriorities.get(node))
                
                // Create par-statement between threads
                currentIndentation = currentIndentation.substring(0, currentIndentation.length - 2)
                forkBody.append("\n")
                forkBody.appendInd("} par {\n")
                currentIndentation += DEFAULT_INDENTATION
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
        // Create label
        forkBody.appendInd(newLabel + ":\n")
        labeledNodes.put(minNode, newLabel)
        
        // Translate thread
        forkBody.transformNode(minNode)
        currentIndentation = currentIndentation.substring(0, currentIndentation.length - 2)
        
        
        
        // Create fork
        sb.generateForkn(children.length - 1, labelHead, labelList, prioList)      
        // Append Body
        sb.append(forkBody)
        // Create join
        sb.appendInd("\n")

        sb.generateJoinn(joinPrioSet.size, joinPrioSet)
        
        // Joins all the threads together again
        previousNode.push(fork.join)
        sb.transformNode(fork.join)
        previousNode.pop
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
        sb.transformNode(join.next.targetNode)
        
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
        // If entry is the root node
        var threadPrios = new ArrayList<Integer>
        if(entry.hasAnnotation("optPrioIDs")) {
            var prio = (entry.getAnnotation("optPrioIDs") as IntAnnotation).value
            
            if(entry.incomingLinks.empty) {
                sb.appendInd("tickstart(" + prio + ");\n")                
            } else {
                if(entry.hasAnnotation("exitPrio")) {
                    val minThreadExitPrio = (entry.getAnnotation("exitPrio") as IntAnnotation).value 
                    if(prio < minThreadExitPrio) {
                        threadPrios.add(prio)
                    }                    
                }
            }
            threadPriorities.put(entry, threadPrios)
        }
        
        sb.transformNode(entry.next.targetNode)
        
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
        // Does absolutely nothing
        // Cannot have more than one incoming edge and cannot lower the priority.
        sb.appendInd("\n")
        if(exit.next !== null) {
            val entry = exit.threadEntry
            val prio = (exit.getAnnotation("optPrioIDs") as IntAnnotation).value
            threadPriorities.get(entry).add(prio)
            threadPriorities.get(exit.next.targetNode.threadEntry).addAll(threadPriorities.get(entry))
            sb.transformNode(exit.next.targetNode)
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

        // If the priority after the pause is higher than before the pause, we must increase it 
        //   before the pause. Else the increase of the priority would happen after other threads, whose
        //   priorities might be higher at first, but lower after the increase of the priority.
        val depthPrio = sur.depth.getAnnotation("optPrioIDs") as IntAnnotation
        val prio = sur.getAnnotation("optPrioIDs") as IntAnnotation
        
        if(depthPrio.value != prio.value) {
            sb.appendInd("prio(" + depthPrio.value + ");\n")
        }
        if(sur.threadEntry.hasAnnotation("exitPrio")) {
            if(prio.value > (sur.threadEntry.getAnnotation("exitPrio") as IntAnnotation).value) {
                threadPriorities.get(sur.threadEntry).add(prio.value)
            }            
        }
        sb.appendInd("pause;\n");
        previousNode.push(sur.depth)
        sb.transformNode(sur.depth)
        previousNode.pop
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
        
        
        sb.transformNode(dep.next.targetNode)
    }
    
 // ----------------------------------------------------------------------------------------------------------------    
 // ----------------------------------------AUXILIARY FUNCTIONS-----------------------------------------------------   
 // ----------------------------------------------------------------------------------------------------------------

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
    private def generateForkn(StringBuilder sb, int n, String label, ArrayList<String> labels, ArrayList<Integer> prios) {
        
        sb.appendInd("fork" + n + "(" + label + ",")
        
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
//         currentIndentation += DEFAULT_INDENTATION
        
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
    private def generateJoinn(StringBuilder sb, int n, HashSet<Integer> prioList) {
        sb.appendInd("} join" + n + "(" + prioList.createPrioString + ");\n")

        
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
    }
    
    
    /**
     * Helper function to create a String containing the priorities of the different threads.
     * Used for the joinn-macro.
     * 
     * @param prioList
     *                  The priorities of the threads listed in the join statement
     */
    def createPrioString(HashSet<Integer> prioList) {
        
        var s = new StringBuilder()
        
        for(prio : prioList) {
            s.append(prio)
            if(!prio.equals(prioList.last)) {
                s.append(", ")
            }
        }
        
        
        return s.toString
    }
    
    
    private def static removeEscapeChars(String string) {
        string.replaceAll("\\\\\\\"", "\"").replaceAll("\\\\\\\\", "\\\\")
    }    
}
