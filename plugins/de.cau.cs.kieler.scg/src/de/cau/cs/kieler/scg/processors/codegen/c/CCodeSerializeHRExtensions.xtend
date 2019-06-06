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
package de.cau.cs.kieler.scg.processors.codegen.c

import com.google.common.collect.HashMultimap
import com.google.common.collect.Multimap
import com.google.inject.Inject
import com.google.inject.Singleton
import de.cau.cs.kieler.annotations.StringAnnotation
import de.cau.cs.kieler.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.annotations.registry.AnnotationsRegistry
import de.cau.cs.kieler.annotations.registry.AnnotationsType
import de.cau.cs.kieler.kexpressions.BoolValue
import de.cau.cs.kieler.kexpressions.Expression
import de.cau.cs.kieler.kexpressions.FunctionCall
import de.cau.cs.kieler.kexpressions.OperatorExpression
import de.cau.cs.kieler.kexpressions.PrintCall
import de.cau.cs.kieler.kexpressions.RandomCall
import de.cau.cs.kieler.kexpressions.RandomizeCall
import de.cau.cs.kieler.kexpressions.ReferenceCall
import de.cau.cs.kieler.kexpressions.ReferenceDeclaration
import de.cau.cs.kieler.kexpressions.TextExpression
import de.cau.cs.kieler.kexpressions.ValueType
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.kexpressions.VariableDeclaration
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsTypeExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kexpressions.keffects.AssignOperator
import de.cau.cs.kieler.kexpressions.keffects.RandomizeCallEffect
import de.cau.cs.kieler.kexpressions.keffects.extensions.KEffectsExtensions
import de.cau.cs.kieler.kexpressions.kext.extensions.KExtDeclarationExtensions
import de.cau.cs.kieler.scg.Assignment
import de.cau.cs.kieler.scg.codegen.CodeGeneratorSerializeHRExtensions
import java.util.List
import org.eclipse.xtend.lib.annotations.Accessors
import de.cau.cs.kieler.scg.extensions.SCGMethodExtensions
import de.cau.cs.kieler.kexpressions.MethodDeclaration
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsCreateExtensions

/**
 * @author ssm
 *
 */
@Singleton
class CCodeSerializeHRExtensions extends CodeGeneratorSerializeHRExtensions {
    
    public static val INCLUDES = "includes"
    protected var CODE_ANNOTATION = "C"
    
    static val HOSTCODE_EVAL = AnnotationsRegistry.register("eval", AnnotationsType.USER, StringAnnotation,  TextExpression, 
        "Annotation that tells the hostcode text expression which parts should be evaluation to valued objects")
    
    @Inject extension AnnotationsExtensions
    @Inject extension KEffectsExtensions    
    @Inject extension KExpressionsValuedObjectExtensions
    @Inject extension KExpressionsCreateExtensions
    @Inject extension KExtDeclarationExtensions
    @Inject extension KExpressionsTypeExtensions
    @Inject extension SCGMethodExtensions
    
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
        var vo = valuedObject.name
        if (!valuedObject.isLocalVariable) {
            vo = valuedObjectPrefix + vo
        }
        for (index : valuedObject.cardinalities) {
            vo = vo + "[" + index.toString + "]"
        }
        vo
    }    
    
    override dispatch CharSequence serialize(ValuedObjectReference valuedObjectReference) {
        var vo = valuedObjectReference.valuedObject.name
        if (!valuedObjectReference.valuedObject.isLocalVariable) {
            vo = valuedObjectPrefix + vo
        }
        if (valuedObjectReference.valuedObject.isExternalReference) {
//            vo = valuedObjectReference.valuedObject.getReferenceDeclaration.extern.head.code
            vo = valuedObjectReference.valuedObject.name
        }
        for (index : valuedObjectReference.indices) {
            vo = vo + "[" + index.serialize + "]"
        }
        if (valuedObjectReference.subReference !== null) {
            vo += "." + valuedObjectReference.subReference.serializeVOR
        }
        vo
    }    
    
    override dispatch CharSequence serializeHR(ValuedObjectReference valuedObjectReference) {
        var vo = valuedObjectReference.valuedObject.name
        if (!valuedObjectReference.valuedObject.isLocalVariable) {
            vo = valuedObjectPrefix + vo
        }
        if (valuedObjectReference.valuedObject.isExternalReference) {
            vo = valuedObjectReference.valuedObject.name
        }
        for (index : valuedObjectReference.indices) {
            vo = vo + "[" + index.serializeHR + "]"
        }
        if (valuedObjectReference.subReference !== null) {
            vo += "." + valuedObjectReference.subReference.serializeVOR
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
    
//    override CharSequence serializeAssignment(de.cau.cs.kieler.kexpressions.keffects.Assignment assignment, CharSequence expressionStr) {
//        var res = ""
//        
//        if (assignment.valuedObject !== null) {
//            res = res + valuedObjectPrefix + assignment.valuedObject.name
//            if (!assignment.indices.nullOrEmpty) {
//                for(index : assignment.indices) {
//                    res = res + "[" + index.serialize + "]"
//                }
//            }
//            if (assignment.reference.subReference !== null) {
//                res += "." + assignment.reference.subReference.serializeVOR
//            }
//            res = res + assignment.operator.serializeAssignOperator
//        }
//        if (expressionStr !== null) {
//            res = res + expressionStr
//        }
//        
//        return res
//    }   
    
    dispatch override CharSequence serializeHR(Assignment assignment) {
        if (assignment.valuedObject !== null) {
            var CharSequence assignmentText = ""
            if (assignment.expression !== null && !assignment.operator.isPostfixOperator) {
                assignmentText = serializeHRWithCasts(assignment)
            }
            var valuedObjectName = assignment.valuedObject.name
            if (!assignment.isLocalVariable) {
                valuedObjectName = valuedObjectPrefix + valuedObjectName
            }
            if (!assignment.indices.nullOrEmpty) {
                valuedObjectName = valuedObjectName + serializeHRIndices(assignment.indices)
            }
            if (assignment.reference.subReference !== null) {
                valuedObjectName += "." + assignment.reference.subReference.serializeVOR
            }
            if (assignment.expression instanceof TextExpression) {
                assignmentText = (assignment.expression as TextExpression).serializeHR
            }
            var String assignmentStr
            val isComplex = assignment.expression instanceof OperatorExpression
            if (assignment.operator == AssignOperator::ASSIGNMIN) {
                if (isComplex) assignmentText = "(" + assignmentText + ")"
                assignmentStr = valuedObjectName + " = (" + valuedObjectName + " < " + assignmentText + ") ? " + valuedObjectName + " : " + assignmentText
            } else if (assignment.operator == AssignOperator::ASSIGNMAX) {
                if (isComplex) assignmentText = "(" + assignmentText + ")"
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
        if (!(assignment.expression.isFloatExpression)) {
            return serializeHR(assignment.expression).toString
        } 
        val vo = assignment.valuedObject
        val exp = assignment.expression
        
        var result = serializeHR(assignment.expression).toString
        if (vo.declaration instanceof VariableDeclaration && vo.variableDeclaration.type == ValueType.INT && exp.isFloatExpression) {
            result = "(int)(" + result + ")"
        } 
        return result
    }
    
    protected override CharSequence serializeHRIndices(List<Expression> indices) {
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
    
    def dispatch CharSequence serializeHR(TextExpression textExp) {
        textExp.serialize
    }
    override dispatch CharSequence serialize(TextExpression textExp) {
        var hostcode = textExp.text
        if (textExp.hasAnnotation(HOSTCODE_EVAL)) {
            val CDS = textExp.getClosestDeclarationScope // ClosestDeclarationScope
            if (CDS !== null) {
                for (eval : textExp.getAnnotation(HOSTCODE_EVAL).asStringAnnotation.values) {
                    val vo = CDS.findValuedObjectByName(eval)
                    if (vo !== null) {
                        val voText = vo.serialize
                        hostcode = hostcode.replaceAll(eval, voText.toString)
                    } 
                }
            }
        }
        return hostcode
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
        } if (declaration instanceof MethodDeclaration) {
            val name = if (declaration.hasSelfInParameter) {
                var ValuedObjectReference lastVOR = referenceCall
                while (lastVOR.subReference !== null) {
                    lastVOR = lastVOR.subReference
                }
                lastVOR.valuedObject.name
            } else {
                referenceCall.serializeVOR.toString
            }
            val params = newArrayList
            params.addAll(referenceCall.parameters)
            if (declaration.hasSelfInParameter) {
                params.add(0, createParameter =>[
                    callByReference = true
                    val ex = referenceCall.serializeVOR.toString
                    expression = ex.substring(0, ex.lastIndexOf(".")).asTextExpression
                ])
            }
            if (declaration.hasTickDataInParameter) {
                params.add(0, createParameter =>[
                    expression = valuedObjectPrefix.replaceAll("\\.", "").replaceAll("->", "").asTextExpression
                ])
            }
            return name + params.serializeParameters
        } else {
            return referenceCall.serializeVOR.toString + referenceCall.parameters.serializeParameters
        }
    }    
    
    override dispatch CharSequence serialize(ReferenceCall referenceCall) {
        return referenceCall.serializeHR
    }    
    
}
