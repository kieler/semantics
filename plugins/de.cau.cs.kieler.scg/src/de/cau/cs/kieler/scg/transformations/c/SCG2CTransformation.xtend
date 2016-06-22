/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2016 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.scg.transformations.c

import com.google.inject.Inject
import de.cau.cs.kieler.core.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.core.kexpressions.Expression
import de.cau.cs.kieler.core.kexpressions.OperatorExpression
import de.cau.cs.kieler.core.kexpressions.OperatorType
import de.cau.cs.kieler.core.kexpressions.ValuedObject
import de.cau.cs.kieler.core.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kico.KielerCompilerContext
import de.cau.cs.kieler.kico.transformation.AbstractProductionTransformation
import de.cau.cs.kieler.scg.Assignment
import de.cau.cs.kieler.scg.Conditional
import de.cau.cs.kieler.scg.ControlFlow
import de.cau.cs.kieler.scg.Node
import de.cau.cs.kieler.scg.SCGAnnotations
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.features.SCGFeatures
import de.cau.cs.kieler.scg.transformations.SCGTransformations

import static extension de.cau.cs.kieler.core.model.codegeneration.HostcodeUtil.*
import java.util.Stack

/**
 * @author ssm
 * @kieler.design 2016-06-21 proposed 
 * @kieler.rating 2016-06-21 proposed yellow 
 * 
 */
class SCG2CTransformation extends AbstractProductionTransformation {

    @Inject extension AnnotationsExtensions
    @Inject extension SCG2CSerializeHRExtensions
    @Inject extension KExpressionsValuedObjectExtensions
    
    public static val TICK_LOGIC_FUNCTION_NAME = "tickLogic"
    public static val TICK_FUNCTION_NAME = "tick"
    public static val RESET_FUNCTION_NAME = "reset"
    public static val TICK_STRUCT_NAME = "TickData"
    public static val TICK_LOCAL_DATA_NAME = "data"
    public static val TICK_LOCAL_DATA_POINTER_NAME = "tickdata"
    public static val TICK_LOCAL_DATA_POINTER = "*" + TICK_LOCAL_DATA_POINTER_NAME
    public static val DEFAULT_INDENTATION = "  "
    public static val GUARD_TYPE = "char"
    public static val DEFAULT_PRE_PREFIX = "p"

    override getId() {
        return SCGTransformations.SCG2C_ID
    }

    override getName() {
        return SCGTransformations.SCG2C_NAME
    }

    override getProducedFeatureId() {
        return SCGFeatures.C_ID
    }

    override getRequiredFeatureIds() {
        return newHashSet(SCGFeatures.SEQUENTIALIZE_ID)
    }

    public def String transform(SCGraph scg, KielerCompilerContext context) {
        val sb = new StringBuilder

        sb.addHeader
        sb.addGlobalHostcodeAnnotations(scg)
        sb.addProgram(scg)

        sb.toString
    }

    protected def addProgram(StringBuilder sb, SCGraph scg) {
        val tickStarts = scg.nodes.filter(Assignment).filter[incoming.filter(ControlFlow).empty].toList
        var suffixCounter = 0
        var String functionSuffix
        val initSB = new StringBuilder
        val implSB = new StringBuilder
        for (tickStart : tickStarts) {
            if (tickStarts.size < 2) {
                functionSuffix = ""
            } else {
                functionSuffix = suffixCounter.toString
            }
            tickStart.addTick(initSB, implSB, scg, functionSuffix)
            suffixCounter++
        }
        
        sb.append("\n")
        sb.append(initSB).append("\n")
        sb.append(implSB).append("\n")
    }

    protected def addTick(Assignment tickStart, StringBuilder initSB, StringBuilder implSB, SCGraph scg,
        String functionSuffix) {
        var Node node = tickStart
        val tickLogicFunction = new StringBuilder
        val resetFunction = new StringBuilder
        val tickFunction = new StringBuilder
        val tickStruct = new StringBuilder
        var String indent = DEFAULT_INDENTATION;
        
        val VOSet = <ValuedObject> newHashSet
        val PRESet = <ValuedObject> newHashSet
        val conditionalStack = new Stack<Conditional>
        val conditionalSet = <Conditional> newHashSet
        
        tickLogicFunction.append("void ")
        tickLogicFunction.append(TICK_LOGIC_FUNCTION_NAME).append(functionSuffix).append("(");
        tickLogicFunction.append(TICK_STRUCT_NAME).append(functionSuffix).append(" ").append(TICK_LOCAL_DATA_POINTER)
        tickLogicFunction.append(") {\n");
        tickLogicFunction.append(DEFAULT_INDENTATION).append(TICK_STRUCT_NAME).append(functionSuffix).
            append(" ").append(TICK_LOCAL_DATA_NAME).append(" = ").append(TICK_LOCAL_DATA_POINTER).
            append(";\n\n")
        
        resetFunction.append("void ")
        resetFunction.append(RESET_FUNCTION_NAME).append(functionSuffix).append("(");
        resetFunction.append(TICK_STRUCT_NAME).append(functionSuffix).append(" ").append(TICK_LOCAL_DATA_POINTER)
        resetFunction.append(") {\n");
        resetFunction.append(DEFAULT_INDENTATION).append(TICK_STRUCT_NAME).append(functionSuffix).
            append(" ").append(TICK_LOCAL_DATA_NAME).append(" = ").append(TICK_LOCAL_DATA_POINTER).
            append(";\n\n")
        
        tickStruct.append("typedef struct {\n")      
        
        prePrefix = DEFAULT_PRE_PREFIX 
        
        while (node != null) {
            var Expression expression = null
            val VOs = <ValuedObject> newHashSet      
            val PREs = <ValuedObject> newHashSet      
            
            if (node instanceof Assignment) {
                val incomingControlFlows = node.incoming.filter(ControlFlow).toList
                if (incomingControlFlows.size>1) {
                    val conditional = conditionalStack.pop
                    
                    if (conditional.^else.target == node || conditionalSet.contains(conditional)) {
                        indent = indent.substring(0, indent.length - 2)
                        tickLogicFunction.append(indent).append("}\n")
                    } else {
                        tickLogicFunction.append(indent.substring(0, indent.length - 2)).append("} else {\n")
                        conditionalStack.push(conditional)
                        conditionalSet += conditional
                    }
                }                
                
                valuedObjectPrefix = TICK_LOCAL_DATA_NAME + "."
                tickLogicFunction.append(indent).append(node.serializeHR).append(";\n")
                expression = node.expression
                VOs += node.valuedObject
                
                node = node.next?.target
            } else if (node instanceof Conditional) {
                tickLogicFunction.append(indent).append("if (").append(node.condition.serializeHR).append(") {\n")
                indent = indent + DEFAULT_INDENTATION
                conditionalStack.push(node) 
                expression = node.condition                
                node = node.then?.target
            } else {
                throw new Exception("C code generation backend cannot handle nodes that are not of type assignment or conditional.")
            }
            
            if (expression != null) {
                expression.getAllReferences.forEach[VOs += it.valuedObject]
                if (expression instanceof OperatorExpression) {
                    if (expression.operator == OperatorType.PRE) {
                        PREs += expression.eAllContents.filter(ValuedObjectReference).map[valuedObject].toList
                    }
                }
            }
            
            for(vo : VOs.filter[ !VOSet.contains(it) ]) {
                tickStruct.append(DEFAULT_INDENTATION).append(GUARD_TYPE).append(" ")
                valuedObjectPrefix = ""
                tickStruct.append(vo.serializeHR).append(";\n")
                VOSet += vo
            }
            
            for(pre : PREs.filter[ !PRESet.contains(it) ]) {
                valuedObjectPrefix = TICK_LOCAL_DATA_NAME + "." + DEFAULT_PRE_PREFIX
                resetFunction.append(DEFAULT_INDENTATION)
                resetFunction.append(pre.serializeHR).append(" = 0").append(";\n")
                
                valuedObjectPrefix = DEFAULT_PRE_PREFIX
                tickStruct.append(DEFAULT_INDENTATION).append(GUARD_TYPE).append(" ")
                tickStruct.append(pre.serializeHR).append(";\n")
                PRESet += pre 
            }            
            
        }
        
        
        tickFunction.append("void ")
        tickFunction.append(TICK_FUNCTION_NAME).append(functionSuffix).append("(")
        tickFunction.append(TICK_STRUCT_NAME).append(functionSuffix).append(" ").append(TICK_LOCAL_DATA_POINTER)
        tickFunction.append(") {\n");
        tickFunction.append(DEFAULT_INDENTATION).append(TICK_STRUCT_NAME).append(functionSuffix).
            append(" ").append(TICK_LOCAL_DATA_NAME).append(" = ").append(TICK_LOCAL_DATA_POINTER).
            append(";\n\n")        
        
        tickFunction.append(DEFAULT_INDENTATION).
            append(TICK_LOGIC_FUNCTION_NAME).append("(").append(TICK_LOCAL_DATA_POINTER_NAME).append(");\n\n")
        if (!VOSet.filter[ it.name.equals("_GO")].empty) {
            tickFunction.append(DEFAULT_INDENTATION).append(TICK_LOCAL_DATA_NAME).append("._GO = 0;\n")
            resetFunction.append(DEFAULT_INDENTATION).append(TICK_LOCAL_DATA_NAME).append("._GO = 1;\n")            
        }

        for(pre : PRESet) {
            valuedObjectPrefix = TICK_LOCAL_DATA_NAME + "." + DEFAULT_PRE_PREFIX
            tickFunction.append(DEFAULT_INDENTATION)
            tickFunction.append(pre.serializeHR).append(" = ")
            valuedObjectPrefix = TICK_LOCAL_DATA_NAME + "."
            tickFunction.append(pre.serializeHR).append(";\n")
        }                              
        
        
        tickLogicFunction.append("}\n");
        resetFunction.append("}\n");
        tickStruct.append("} ").append(TICK_STRUCT_NAME).append(functionSuffix).append(";\n")
        tickFunction.append("}\n");   
            
        initSB.append(tickStruct).append("\n")
        implSB.append(resetFunction).append("\n")
        implSB.append(tickLogicFunction).append("\n")
        implSB.append(tickFunction).append("\n")
    }

    protected def addGlobalHostcodeAnnotations(StringBuilder sb, SCGraph scg) {
        for (annotation : scg.getAnnotations(SCGAnnotations.ANNOTATION_HOSTCODE)) {
            sb.append(annotation.asStringAnnotation.values.head.removeEscapeChars);
            sb.append("\n")
        }
    }

    protected def void addHeader(StringBuilder sb) {
        sb.append(
            "/*\n" + " * Automatically generated C code by\n" + " * KIELER SCCharts - The Key to Efficient Modeling\n" +
                " *\n" + " * http://rtsys.informatik.uni-kiel.de/kieler\n" + " */\n")
    }

}
