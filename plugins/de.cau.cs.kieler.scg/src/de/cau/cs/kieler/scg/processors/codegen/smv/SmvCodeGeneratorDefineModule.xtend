/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2018 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.scg.processors.codegen.smv

import com.google.inject.Inject
import de.cau.cs.kieler.kexpressions.ValueType
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.VariableDeclaration
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.scg.Assignment
import de.cau.cs.kieler.scg.processors.codegen.smv.ScgConditionalAssignmentAnalyzer.ConditionalTree
import java.util.List
import org.eclipse.xtend.lib.annotations.Accessors

import static extension de.cau.cs.kieler.verification.codegen.SmvCodeGeneratorExtensions.*
import com.google.inject.Injector

/**
 * @author aas
 * 
 */
class SmvCodeGeneratorDefineModule extends SmvCodeGeneratorModuleBase {

    @Inject Injector injector
    @Inject extension KExpressionsValuedObjectExtensions
    @Inject extension SmvCodeSerializeHRExtensions

    private var ScgConditionalAssignmentAnalyzer scgConditionalAssignmentAnalyzer

    private static class FullyQualifiedConditionWithComment {
        @Accessors var String condition
        @Accessors var String comment
    }
    
    override getName() {
        return class.simpleName;
    }

    override generateInit() {
        scgConditionalAssignmentAnalyzer = injector.getInstance(ScgConditionalAssignmentAnalyzer)
        scgConditionalAssignmentAnalyzer.init(scg)
    }
    
    override generate() {
        incIndentationLevel
        appendIndentedLine("DEFINE")
        
        // Define valued objects that are no register values (pre of something) and no input to the model
        for (declaration : scg.declarations) {
            if (declaration instanceof VariableDeclaration) {
                for (valuedObject : declaration.valuedObjects) {
                    valuedObject.generateAssignment
                }
            }
        }
    }

    private def void generateAssignment(ValuedObject valuedObject) {
        val assignments = scgConditionalAssignmentAnalyzer.getAssignments(valuedObject)
        if(assignments !== null) {
            if(assignments.size == 1) {
                val assignment = assignments.head
                val conditionalTree = scgConditionalAssignmentAnalyzer.getConditionalTree(assignment)
                if(conditionalTree === null) {
                    valuedObject.generateUnconditionalAssignment(assignment, "")
                } else {
                    val condition = conditionalTree.getFullyQualifiedConditionWithComment.condition
                    valuedObject.generateUnconditionalAssignment(assignment, ''' -- WARNING: Only defined in SCG if («condition») is true''')
                }
            } else {
                valuedObject.generateConditionalAssignments(assignments)
            }
        } else {
            if(!valuedObject.variableDeclaration.isInput && !(valuedObject.name == "_GO")) {
                // TODO: This valued object should not exist in the first place.
                // It is probably a guard that is never set. (See also the comment in DefineUnboundVariablesOfSSA.
                appendIndentedLine('''«valuedObject.name» := FALSE; -- WARNING: This variable is undefined in the SCG''')
            }
        }
    }
    
    private def void generateUnconditionalAssignment(ValuedObject valuedObject, Assignment assignment, String comment) {
        val expression = assignment.expression.serializeHR
            .toSmvExpression
            .useBooleanInsteadIntegerIfNeeded(valuedObject)
        appendIndentedLine('''«valuedObject.name» := «expression»;«comment»''')    
    }

    private def void generateConditionalAssignments(ValuedObject valuedObject, List<Assignment> assignments) {
        appendIndentedLine('''«valuedObject.name» :=''')
        incIndentationLevel
        appendIndentedLine('''case''')
        incIndentationLevel
        for(assignment : assignments) {
            val conditionalTree = scgConditionalAssignmentAnalyzer.getConditionalTree(assignment)
            val fullyQualifiedConditionWithComment = getFullyQualifiedConditionWithComment(conditionalTree)
            
            val expression = assignment.expression.serializeHR
                .toSmvExpression
                .useBooleanInsteadIntegerIfNeeded(valuedObject)
            
            val comment = if(fullyQualifiedConditionWithComment.comment.isNullOrEmpty)
                              ""
                          else
                              ''' -- «fullyQualifiedConditionWithComment.comment»'''
            
            appendIndentedLine('''«fullyQualifiedConditionWithComment.condition» : «expression»;«comment»''')    
        }
        decIndentationLevel
        appendIndentedLine('''esac;''')
        decIndentationLevel
    }
    
    private def FullyQualifiedConditionWithComment getFullyQualifiedConditionWithComment(ConditionalTree parentConditional) {
        val result = new FullyQualifiedConditionWithComment => [
            condition = "TRUE"
            comment = ""
        ]
        
        if(parentConditional === null) {
            return result
        }
        val conditionForTrueBranch = parentConditional.conditional.condition.serializeHR
            .toSmvExpression
        
        // Select condition or the inverted condition,
        // depending on the control-flow branch this condition is for.
        // For the inverted condition, the SMV switch-case-default TRUE is returned.
        if (parentConditional.branchOfConditional) {
            result.condition = conditionForTrueBranch
        } else {
//          result.condition = '''!(«conditionForTrueBranch»)'''
            result.condition = '''TRUE'''
            result.comment = '''default case for !(«conditionForTrueBranch»)'''    
        }
        
        // Recursively concatenate conditions of parents if needed
        if(parentConditional.parent !== null) {
            val parentResult = getFullyQualifiedConditionWithComment(parentConditional.parent)
            result.condition = parentResult.condition + " & " + result.condition
            result. comment = parentResult.comment + ". " + parentResult.comment
        }
        return result
    }
    
    override generateDone() {
    }
    
    private def boolean isBoolean(ValuedObject valuedObject) {
        val declaration = valuedObject.declaration
        if(declaration instanceof VariableDeclaration) {
            return declaration.type == ValueType.BOOL
        }
        return false
    }
    
    private def String useBooleanInsteadIntegerIfNeeded(String s, ValuedObject valuedObject) {
        // FIXME: This is a dirty fix for assignment of 1 and 0 instead proper booleans
        if(valuedObject.isBoolean) {
            if(s == "0") {
                return "FALSE"
            } else if (s == "1") {
                return "TRUE"
            } else {
                val sNo1 = s.replace("| 1","| TRUE").replace("& 1","& TRUE")
                val sNo1No0 = sNo1.replace("| 0","| FALSE").replace("& 0","& FALSE")
                return sNo1No0
            }
        }
        return s
    }
}
