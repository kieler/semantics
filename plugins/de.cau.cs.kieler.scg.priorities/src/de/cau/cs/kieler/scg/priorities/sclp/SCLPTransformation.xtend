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

import de.cau.cs.kieler.core.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.core.kexpressions.OperatorExpression
import de.cau.cs.kieler.core.kexpressions.OperatorType
import de.cau.cs.kieler.core.kexpressions.ValuedObject
import de.cau.cs.kieler.core.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kico.KiCoProperties
import de.cau.cs.kieler.kico.KielerCompilerContext
import de.cau.cs.kieler.kico.transformation.AbstractProductionTransformation
import de.cau.cs.kieler.scg.Assignment
import de.cau.cs.kieler.scg.Conditional
import de.cau.cs.kieler.scg.Depth
import de.cau.cs.kieler.scg.Entry
import de.cau.cs.kieler.scg.Exit
import de.cau.cs.kieler.scg.Fork
import de.cau.cs.kieler.scg.Join
import de.cau.cs.kieler.scg.Node
import de.cau.cs.kieler.scg.SCGAnnotations
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.Surface
import de.cau.cs.kieler.scg.priorities.PriorityAuxiliaryData
import java.util.HashMap
import javax.inject.Inject
import org.eclipse.xtend.lib.annotations.Accessors

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
     
     
    val VOSet  = <ValuedObject> newHashSet
    val PRESet = <ValuedObject> newHashSet
    
    
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
        val sb = new StringBuilder
        
        val nodePrios = context.getCompilationResults
        
        if(nodePrios == null) {
            //Throw some error!!
        }
        
        sb.addHeader;
        sb.addGlobalHostcodeAnnotations(scg);
        sb.addProgram(scg, nodePrios);
        
        
        sb.toString
    }
    
    
    protected def void addProgram(StringBuilder sb, SCGraph scg, HashMap<Node, Integer> nodePrios) {
        
        
        /*
         * A whole lot of something here!
         */
         val Node node = scg.nodes.filter(Assignment).head
             if(node instanceof Assignment) {
                 sb.transformNode(node as Assignment)
             }
             else if(node instanceof Conditional) {
                 sb.transformNode(node as Conditional)
             }
             else if(node instanceof Fork) {
                 sb.transformNode(node as Fork)
             }
             else if(node instanceof Join) {
                 sb.transformNode(node as Join)
             }
             else if(node instanceof Entry) {
                 sb.transformNode(node as Entry)
             }
             else if(node instanceof Exit) {
                 sb.transformNode(node as Exit)
             }
             else if(node instanceof Surface) {
                 sb.transformNode(node as Surface)
             }
             else if(node instanceof Depth) {
                 sb.transformNode(node as Depth)
             }
         
    }


    protected def void addGlobalHostcodeAnnotations(StringBuilder sb, SCGraph scg) {
        for (annotation : scg.getAnnotations(SCGAnnotations.ANNOTATION_HOSTCODE)) {
            sb.append(annotation.asStringAnnotation.values.head.removeEscapeChars);
            sb.append("\n")
        }
    }
        
    
    
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
    
    
    private def void transformNode(StringBuilder sb, Assignment ass) {
//        val PREs = <ValuedObject> newHashSet
        val VOs  = <ValuedObject> newHashSet
        val expression = ass.expression
        expression.getAllReferences.forEach[VOs += it.valuedObject]
        
//        if (expression instanceof OperatorExpression) {
//            if (expression.operator == OperatorType.PRE) {
//                PREs += expression.eAllContents.filter(ValuedObjectReference).map[valuedObject].toList
//            }
//        }
        
        for(vo : VOs.filter[!VOSet.contains(it)]) {
            sb.append(vo).append(";\n")
            VOSet += vo
        }
//        println("asdfgasd")
//        for(pre : PREs.filter[!PRESet.contains(it)]) {
//            println("hasl")
//            pre.valuedObjects.head.toString
//            sb.append(pre.valuedObjects.head.toString).append(" = 0").append(";\n")
//            sb.append("asdasdas\n")
//            PRESet += pre
//        }
        
    }
    
    
    private def void transformNode(StringBuilder sb, Conditional cond) {
        
    }
    
    private def void transformNode(StringBuilder sb, Fork fork) {
        
    }
    
    private def void transformNode(StringBuilder sb, Join join) {
        
    }
    
    private def void transformNode(StringBuilder sb, Entry entry) {
        
    }
    
    private def void transformNode(StringBuilder sb, Exit exit) {
        
    }
    
    private def void transformNode(StringBuilder sb, Surface sur) {
        sb.append("pause;\n");
        transformNode(sb, sur.depth)
    }
    
    private def void transformNode(StringBuilder sb, Depth dep) {
        
    }
    
    /**
     * Retrieves the required Node Priorities from the KielerCompilerContext
     * 
     * @param context
     *          The context from which to retrieve the priorities
     * @return
     *          The previously calculated Node Priorities
     */
    private def HashMap<Node, Integer> getCompilationResults(KielerCompilerContext context) {
        val compilationResult = context.getProperty(KiCoProperties.COMPILATION_RESULT)
        if(compilationResult == null) {
            //Do Something and exit
            println("No compilation results!")
            return null
        }
        val prioAuxData = compilationResult.getAuxiliaryData(PriorityAuxiliaryData).head
        if(prioAuxData == null) {
            println("No Priority Data compiled!")
            return null
        }
        return prioAuxData.optimizedPrioID
    }
    
}