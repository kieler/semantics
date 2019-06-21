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
package de.cau.cs.kieler.sccharts.processors.statebased.codegen

import org.eclipse.xtend.lib.annotations.Accessors
import de.cau.cs.kieler.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.kexpressions.keffects.Assignment
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.OperatorExpression
import de.cau.cs.kieler.kexpressions.BoolValue
import de.cau.cs.kieler.kexpressions.ValueType
import com.google.inject.Inject
import de.cau.cs.kieler.kexpressions.keffects.extensions.KEffectsExtensions
import de.cau.cs.kieler.kexpressions.TextExpression
import de.cau.cs.kieler.kexpressions.FunctionCall
import de.cau.cs.kieler.kexpressions.ReferenceCall
import java.util.List
import de.cau.cs.kieler.kexpressions.Expression
import de.cau.cs.kieler.kexpressions.PrintCall
import com.google.common.collect.Multimap
import com.google.common.collect.HashMultimap
import com.google.inject.Singleton
import de.cau.cs.kieler.kexpressions.RandomCall
import de.cau.cs.kieler.kexpressions.keffects.RandomizeCallEffect
import de.cau.cs.kieler.kexpressions.RandomizeCall
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsDeclarationExtensions
import de.cau.cs.kieler.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kexpressions.keffects.AssignOperator
import de.cau.cs.kieler.sccharts.extensions.SCChartsSerializeHRExtensions
import de.cau.cs.kieler.kexpressions.ReferenceDeclaration
import de.cau.cs.kieler.kexpressions.VariableDeclaration

/**
 * @author ssm
 *
 */
@Singleton
class StatebasedCCodeSerializeHRExtensions extends SCChartsSerializeHRExtensions {
    
    public static val INCLUDES = "includes"
    protected var CODE_ANNOTATION = "C"
    
    @Inject extension AnnotationsExtensions
    @Inject extension KEffectsExtensions    
    @Inject extension KExpressionsDeclarationExtensions
    @Inject extension KExpressionsValuedObjectExtensions
    
    @Accessors var String valuedObjectPrefix
    @Accessors var String prePrefix 
    @Accessors val Multimap<String, String> modifications = HashMultimap.create
    
    override dispatch CharSequence serialize(ValueType valueType) {
        if (valueType == ValueType.BOOL) {
            return "char"
        } else if (valueType == ValueType.STRING) {
            return "char*"
        } else if (valueType == ValueType.FLOAT) {
            return "double"
        } else {
            return valueType.literal
        }
    }
    
    override dispatch CharSequence serialize(ValuedObject valuedObject) {
        var vo = valuedObjectPrefix + valuedObject.name
        for (index : valuedObject.cardinalities) {
            vo = vo + "[" + index.toString + "]"
        }
        vo
    }    
    
    override dispatch CharSequence serialize(ValuedObjectReference valuedObjectReference) {
        var vo = valuedObjectPrefix + valuedObjectReference.valuedObject.name
        if (valuedObjectReference.valuedObject.isExternalReference) {
            vo = valuedObjectReference.valuedObject.name
        }
        for (index : valuedObjectReference.indices) {
            vo = vo + "[" + index.serialize + "]"
        }
        vo
    }    
    
    override dispatch CharSequence serializeHR(ValuedObjectReference valuedObjectReference) {
        var vo = valuedObjectPrefix + valuedObjectReference.valuedObject.name
        if (valuedObjectReference.valuedObject.isExternalReference) {
            vo = valuedObjectReference.valuedObject.name
        }
        for (index : valuedObjectReference.indices) {
            vo = vo + "[" + index.serializeHR + "]"
        }
        vo
    }    
    
    protected override CharSequence serializeHROperatorExpressionPRE(OperatorExpression expression) {
        val prefix = valuedObjectPrefix
        valuedObjectPrefix = valuedObjectPrefix + prePrefix
        val s = expression.subExpressions.head.serializeHR
        valuedObjectPrefix = prefix
        return s.toString.replaceFirst(prePrefix + "_", prePrefix)
    }  
    
    override dispatch CharSequence serialize(BoolValue expression) {
        if (expression.value) return "1"
        return "0"
    }
    
    override CharSequence serializeAssignment(Assignment assignment, CharSequence expressionStr) {
        var res = ""
        
        if (assignment.valuedObject !== null) {
            res = res + valuedObjectPrefix + assignment.valuedObject.name
            if (!assignment.indices.nullOrEmpty) {
                for(index : assignment.indices) {
                    res = res + "[" + index.serialize + "]"
                }
            }
            
            res = res + assignment.operator.serializeAssignOperator
        }
        if (expressionStr !== null) {
            res = res + expressionStr
        }
        
        return res
    }   
    
    dispatch override CharSequence serializeHR(Assignment assignment) {
        if (assignment.valuedObject !== null) {
            var CharSequence assignmentText = ""
            if (assignment.expression !== null && !assignment.operator.isPostfixOperator) {
                assignmentText = serializeHRWithCasts(assignment)
            }
            var valuedObjectName = valuedObjectPrefix + assignment.valuedObject.name
            if (!assignment.indices.nullOrEmpty) {
                valuedObjectName = valuedObjectName + serializeHRIndices(assignment.indices)
            }
            if (assignment.expression instanceof TextExpression) {
                assignmentText = (assignment.expression as TextExpression).text
            }
            var String assignmentStr
            if (assignment.operator == AssignOperator::ASSIGNMIN) {
                assignmentStr = valuedObjectName + " = (" + valuedObjectName + " < " + assignmentText + ") ? " + valuedObjectName + " : " + assignmentText
            } else if (assignment.operator == AssignOperator::ASSIGNMAX) {
                assignmentStr = valuedObjectName + " = (" + valuedObjectName + " > " + assignmentText + ") ? " + valuedObjectName + " : " + assignmentText
            } else {
                assignmentStr = valuedObjectName + assignment.operator.serializeAssignOperator + assignmentText
            }
            assignmentStr
        } else if (assignment.expression instanceof TextExpression) {
            (assignment.expression as TextExpression).text
        } else if (assignment.expression instanceof FunctionCall) {
            serialize(assignment.expression) 
        }
        else if (assignment.expression instanceof ReferenceCall) {
            (assignment.expression as ReferenceCall).serializeHR
        } else if (assignment.expression instanceof PrintCall) {
            (assignment.expression as PrintCall).serializeHR
        }
    }    
    
    protected def String serializeHRWithCasts(Assignment assignment) {
        if (assignment.valuedObject === null) return ""
        if (!(assignment.expression instanceof ValuedObjectReference)) return serializeHR(assignment.expression).toString 
        val vo = assignment.valuedObject
        val exp = assignment.expression as ValuedObjectReference
        
        var result = serializeHR(assignment.expression).toString
        if (vo.declaration instanceof VariableDeclaration && exp.valuedObject.declaration instanceof VariableDeclaration) {
            if (vo.variableDeclaration.type == ValueType.INT && exp.valuedObject.variableDeclaration.type == ValueType.FLOAT) {
                result = "(int)(" + result + ")"
            }            
        } 
        return result
    }    
    
    protected def CharSequence serializeHRIndices(List<Expression> indices) {
        var String indicesStr = ""
        for(index : indices) {
            indicesStr = indicesStr + "[" + 
                serializeHR(index)
                + "]"          
        }
        indicesStr
    }     

    override dispatch CharSequence serialize(PrintCall printCall) {
        var paramStr = printCall.parameters.serializeParameters.toString
        
        if (!modifications.containsEntry(INCLUDES, "<stdio.h>"))
            modifications.put(INCLUDES, "<stdio.h>")
        
        return "printf(" + paramStr.substring(1, paramStr.length - 1) + ")"
    }
    
    override dispatch CharSequence serialize(TextExpression textExp) {
        return textExp.text
    }  
    
    override dispatch CharSequence serialize(RandomCall randomCall) {
        return "((float) rand() / RAND_MAX)"
    }
    
    override dispatch CharSequence serializeHR(RandomCall randomCall) {
        return "((float) rand() / RAND_MAX)"
    }
    
    override dispatch CharSequence serialize(RandomizeCallEffect randomizeCallEffect) {
        return "srand(0)"
    }
    
    override dispatch CharSequence serialize(RandomizeCall randomizeCall) {
        if (!modifications.containsEntry(INCLUDES, "<time.h>"))
            modifications.put(INCLUDES, "<time.h>")
            
        return "srand(time(NULL))"
    }
    
    override dispatch CharSequence serializeHR(RandomizeCallEffect randomizeCallEffect) {
        randomizeCallEffect.serialize
    }
    
    override dispatch CharSequence serializeHR(RandomizeCall randomizeCall) {
        randomizeCall.serialize
    }
    
    
    protected def getCodeAnnotation() {
        CODE_ANNOTATION
    }
    
    override dispatch CharSequence serializeHR(ReferenceCall referenceCall) {
        val declaration = referenceCall.valuedObject.declaration
        if (declaration instanceof ReferenceDeclaration) {
            if (declaration.extern.nullOrEmpty) { 
                return referenceCall.valuedObject.serializeHR.toString + referenceCall.parameters.serializeHRParameters
            } else {
                var code = declaration.extern.head.code
                if (declaration.extern.exists[ hasAnnotation(codeAnnotation) ]) {
                    code = declaration.extern.filter[ hasAnnotation(codeAnnotation) ].head.code
                }
                return code + referenceCall.parameters.serializeHRParameters
            }
        } else {
            return referenceCall.serializeVOR.toString + referenceCall.parameters.serializeParameters
        }
    }    
    
    override dispatch CharSequence serialize(ReferenceCall referenceCall) {
        val declaration = referenceCall.valuedObject.declaration
        if (declaration instanceof ReferenceDeclaration) {
            if (declaration.extern.nullOrEmpty) { 
                return referenceCall.valuedObject.serialize.toString + referenceCall.parameters.serializeParameters
            } else {
                var code = declaration.extern.head.code
                if (declaration.extern.exists[ hasAnnotation(codeAnnotation) ]) {
                    code = declaration.extern.filter[ hasAnnotation(codeAnnotation) ].head.code
                }
                return code + referenceCall.parameters.serializeParameters
            }
        } else {
            return referenceCall.serializeVOR.toString + referenceCall.parameters.serializeParameters
        }
    }    
    
}
