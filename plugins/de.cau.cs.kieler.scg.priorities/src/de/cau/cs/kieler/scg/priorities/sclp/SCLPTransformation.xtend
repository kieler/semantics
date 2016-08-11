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

import de.cau.cs.kieler.core.annotations.IntAnnotation
import de.cau.cs.kieler.core.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsValuedObjectExtensions
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
import de.cau.cs.kieler.scg.priorities.extensions.SCLPTransformationExtensions
import java.util.ArrayList
import javax.inject.Inject

import static extension de.cau.cs.kieler.core.model.codegeneration.HostcodeUtil.*

/**
 * @author lpe
 *
 */
class SCLPTransformation extends AbstractProductionTransformation{
    
     @Inject 
     extension AnnotationsExtensions
     @Inject 
     extension KExpressionsValuedObjectExtensions
     @Inject
     extension SCLPTransformationExtensions
     
     
    /** Default indentation of a c file */
    private val DEFAULT_INDENTATION = "  "
    /** Keeps track of the current indentation level */
    private var currentIndentation = ""
    /**  */
    private var label = 0
    /** Maps nodes to their corresponding labels, if there are any */
    private var labeledNodes = <Node, String> newHashMap
    /** Keeps track of the current label number for newly created labels */
    private var labelNr = 0
    /** Keeps track of region numbers for regions without a name. They will then recieve a 
     *  unique region number. */
    private var regionNr = 0
    private var forkJoinSb = new StringBuilder
    private var generatedForks = new ArrayList
    
    
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
     *          The SCGraph from which the code is translated from
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
     */
    protected def void addProgram(StringBuilder sb, SCGraph scg) {
        
        
        sb.appendInd("int tick() {\n\n")
        currentIndentation += DEFAULT_INDENTATION

         
         val Node node = scg.nodes.filter(Entry).head
         sb.transformNode(node)
         
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
     *              The SCG the method extracts the variables from
     * 
     */
    protected def void declareVariables(StringBuilder sb, SCGraph scg) {
        
        val decl = scg.declarations
        for(declaration : decl) {
            sb.appendInd(declaration.type.toString)
            sb.append(" ")
            sb.append(declaration.valuedObjects.head.name)
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
            + " \n"
            + "#include \"scl_p.h\"\n\n")
    }
    
    
    /**
     *  Transforms a node into corresponding c code
     * 
     *  @param sb
     *              The StringBuilder the code is written into
     *  @param node
     *              The node from which the code is extracted
     */
    private def void transformNode(StringBuilder sb, Node node) {
        
        //If the node is a Join, we don't want it to be called within the controlFlow. It is supposed to be 
        //called from the Fork-Node. This guarantees that a Join will not get a label
        if(node instanceof Join) {
            return
        }
        
        //If the node has already been visited before, add a goto, instead of translating it again
        if(labeledNodes.containsKey(node)) {
            sb.appendInd("goto " + labeledNodes.get(node) + ";\n")
            return
        } else {
            //If a node has multiple incoming control flows, create a goto label
            val incomingControlFlows = node.incoming.filter(ControlFlow).toList
            if(incomingControlFlows.size > 1) {
                val newLabel = "label_" + labelNr++
                labeledNodes.put(node, newLabel)
                sb.appendInd(newLabel + ":\n")
            
            }
        }
        
        //Translate the node depending on its type
        if (node instanceof Assignment) {
            sb.transformNode(node as Assignment)
        } else if (node instanceof Conditional) {
            sb.transformNode(node as Conditional)
        } else if (node instanceof Fork) {
            sb.transformNode(node as Fork)
        } else if (node instanceof Join) {
            //Dont do anything here, Join will be called from the Fork node
        } else if (node instanceof Entry) {
            sb.transformNode(node as Entry)
        } else if (node instanceof Exit) {
            sb.transformNode(node as Exit)
        } else if (node instanceof Surface) {
            sb.transformNode(node as Surface)
        } else if (node instanceof Depth) {
            sb.transformNode(node as Depth)
        }
        
    }
    
    //TODO Check for errors and missing things
    /**
     *  Transforms an Assignment node into corresponding c code
     * 
     *  @param sb
     *              The StringBuilder the code is written into
     *  @param ass
     *              The Assignment node from which the code is extracted
     */
    private def void transformNode(StringBuilder sb, Assignment ass) {


        sb.appendInd(ass.valuedObject.name)
        sb.append(" = ")
        sb.expand(ass.expression)
        sb.append(";\n")
        
        sb.transformNode(ass.next.target)
        
    }
    
    
    //TODO!!!!!!! Check for errors and stuff (seems correct I think)
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

        //TODO: Handling of Priorities                                                 <<<<<<<<<<<<<< IMPORTANT
        var labelList = <String> newArrayList
        var nodeList = <Node> newArrayList
        var prioList = <Integer> newArrayList
        var Node nodeHead
        var String labelHead
        
        for (cFlow : fork.next) {
            if (cFlow.equals(fork.next.head)) {
                nodeHead = cFlow.target
            }
            val nxt = cFlow.target
            val ann = nxt.getAnnotation("optPrioIDs") as IntAnnotation
            if(!cFlow.equals(fork.next.head)) {                
                nodeList.add(nxt)
                prioList.add(ann.value)
                if (nxt.getStringAnnotationValue("regionName") == "") {
                    labelList.add("region_" + regionNr++)
                } else {
                    labelList.add(nxt.getStringAnnotationValue("regionName"))
                }
            } else {
                if(nxt.getStringAnnotationValue("regionName") == "") {
                    labelHead = "region_" + regionNr++
                } else {
                    labelHead = nxt.getStringAnnotationValue("regionName")
                }
            }
            
        }

        sb.generateForkn(nodeList.length, labelList, prioList)
                
        //Creates the Strings for the different threads
        sb.appendInd(labelHead + ":\n")
        sb.transformNode(nodeHead)
        

        for(node : nodeList) {

            currentIndentation = currentIndentation.substring(0, currentIndentation.length - 2)
            sb.append("\n")
            sb.appendInd("} par {\n")
            currentIndentation += DEFAULT_INDENTATION  
            sb.appendInd(labelList.get(nodeList.indexOf(node)) + ":\n") 
            sb.transformNode(node)
            //Caution: The ThreadBuilder is not allowed to call the join node by itself. Only this fork node
            //may call the join node after all threads are created!
        }
        
        currentIndentation = currentIndentation.substring(0, currentIndentation.length - 2)
        sb.appendInd("\n")
        sb.appendInd("} join" + nodeList.length + "(" + prioList.createPrioString + ");\n")
        
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
     *  Generates a forkn-statement. If n > 4, there are no pregenerated fork-statements for this amount of forks and a 
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
        
        if(n > 4 && !generatedForks.contains(n)) {
            println("asd")
            forkJoinSb.append("#define fork" + n + "(" + labelsAndPrios + ")\n")
            for(var i = 0; i < n; i++) {
                forkJoinSb.append("  fork(")
                forkJoinSb.append(labels.get(i))
                forkJoinSb.append(", ")
                forkJoinSb.append(prios.get(i).toString)
                forkJoinSb.append(")\n")
            }
            forkJoinSb.append("\n")
            
            generatedForks.add(n)         
        }
    }     
     
     
     
    //TODO: Generate Joins (Dont know exactly what to do there)
     
     
    /*
    private def generateForkn(StringBuilder sb, int n, ArrayList<String> labels, ArrayList<Integer> prios) {
        if(n != labels.size || n != prios.size) {
            //Somethings wrong
        }
        
        if(n <= 4) {
            sb.appendInd("fork" + n + "(")
            for(var i = 0; i < n-1; i++) {                
                sb.append(labels.get(i) + ", " + prios.get(i) + ", ")
            }
            sb.append(labels.get(n-1) + ", " + prios.get(n-1) + ") {\n")
            currentIndentation += DEFAULT_INDENTATION
            
        } else {
            val div = n/4
            val mod = n%4
            
            for(var i = 0; i < div; i++) {
                sb.appendInd("fork4" + "(")
                for(var j = i*4; j < (i+1)*4 - 1; j++) {
                    sb.append(labels.get(j) + ", " + prios.get(j) + ", ")
                }
                sb.append(labels.get((i+1)*4 - 1) + ", " + prios.get((i+1)*4 -1) + ") {\n")
                currentIndentation+=DEFAULT_INDENTATION
            }
            
            if(mod > 0) {
                sb.appendInd("fork" + mod + "(")
                for(var i = 0; i < mod - 1; i++) {
                    sb.append(labels.get(div*4 + i) + ", " + prios.get(div*4 + i) + ", ")
                }
                sb.append(labels.get(div*4 + mod-1) + ", " + prios.get(div*4 + mod-1) + ") {\n")
                currentIndentation+=DEFAULT_INDENTATION
            }
        }
    }
    */
    
    
    
}