/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2013 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.scl.extensions

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
import java.util.ArrayList
import org.yakindu.sct.model.stext.stext.ElementReferenceExpression
import de.cau.cs.kieler.scl.scl.Assignment
import de.cau.cs.kieler.scl.scl.Conditional
import org.eclipse.emf.ecore.EObject
import org.yakindu.sct.model.stext.stext.AssignmentExpression
import org.yakindu.sct.model.stext.stext.Expression
import org.yakindu.sct.model.stext.stext.PrimitiveValueExpression
import org.yakindu.sct.model.stext.stext.BoolLiteral
import de.cau.cs.kieler.scl.scl.VariableDeclaration
import java.util.List
import de.cau.cs.kieler.scl.scl.Instruction
import org.eclipse.emf.common.util.EList
import de.cau.cs.kieler.scl.scl.StatementSequence
import javax.inject.Inject
import de.cau.cs.kieler.scl.scl.Statement

class SCLDependencyExtensions {
    
    @Inject
    extension SCLCreateExtensions;
    @Inject
    extension SCLStatementExtensions;
    @Inject
    extension SCLStatementSequenceExtensions;
    
    public static val DEPENDENCY_TYPE_UNKNOWN = 0
    public static val DEPENDENCY_TYPE_WW = 1
    public static val DEPENDENCY_TYPE_WI = 2
    public static val DEPENDENCY_TYPE_WR = 3
    public static val DEPENDENCY_TYPE_RI = 4
    
    // ======================================================================================================
    // ==                   D E P E N D E N C Y   M E T A M O D E L   E X T E N S I O N                    ==
    // ======================================================================================================

/* ----------------------------------------------------
 * SText expression example structure
 *     
 * CONDITIONAL
 * LogicalRelationExpressionImpl
 *     ElementReferenceExpressionImpl
 *         VariableDeclarationImpl
 *             Name
 *     operator = RelationalOperator
 *         == >=
 *     PrimitiveValueExpressionImpl
 *         value = BoolLiteralImpl
 * 
 *     ParenthesizedExpressionImpl
 *         NumericalAddSubtractExpressionImpl
 *         ...
 * 
 * ASSIGNMENT
 * AssignmentExpression
 *     expression = PrimitiveValueExpressionImpl
 *     operator = AssignmentOperator
 *     varRef = ElementReferenceExpressionImpl
 * ----------------------------------------------------
 */   

    // Checks if the given instruction is an assignment or a conditional statement and retrieves a list
    // of ElementReferenceExpressions on which this statement depends on. 
    def ArrayList<ElementReferenceExpression> dependencyReferences(Instruction instruction) {
        if (instruction instanceof Assignment) return dependencyReferences(instruction as Assignment) 
        if (instruction instanceof Conditional) return dependencyReferences(instruction as Conditional)
        return new ArrayList<ElementReferenceExpression>
    }
 
    // Retrieve the list of ElementReferenceExpressions for an assignment statement.
    def ArrayList<ElementReferenceExpression> dependencyReferences(Assignment instruction) {
        val resList = new ArrayList<ElementReferenceExpression>
        val AssignmentExpression aExp = instruction.assignment as AssignmentExpression
        
        resList.add(aExp.varRef as ElementReferenceExpression)
        aExp.expression.eAllContents.toIterable.filter(typeof(ElementReferenceExpression)).forEach(e |
            resList.add(e))
                
        resList 
    }
    
    // Shortcut for conditionals
    def ArrayList<ElementReferenceExpression> dependencyReferences(Conditional instruction) {
        return dependencyReferences(instruction.expression)
    }

    // Retrieve the list of ElementReferenceExpressions for a conditional statement.
    def ArrayList<ElementReferenceExpression> dependencyReferences(Expression expression) {
        val resList = new ArrayList<ElementReferenceExpression>
        if (expression instanceof ElementReferenceExpression) resList.add((expression as ElementReferenceExpression))
        expression.eAllContents.toIterable.filter(typeof(ElementReferenceExpression)).forEach(e |
            resList.add(e))
        resList
    }
    
    // Retrieves a list of all instructions in a given instruction list which depend on the given 
    // ElementReferenceExpression.
    def List<Statement> dependencyInstructions(StatementSequence iList, ElementReferenceExpression varRef) {
        val iS = createNewStatementList()
        
        for(instr : iList.eAllContents.filter(typeof(Instruction)).toList) {
            if ((instr instanceof Assignment) || (instr instanceof Conditional)) {
                val references = instr.dependencyReferences 
                for (reference : references) {
                    if (reference.reference.equals(varRef.reference))
                        if (!iS.contains(instr)) iS.add((instr.eContainer as Statement));
                }
            }    
        }
        
        iS
    }
    
    // Retrieves a list of all instructions in a given instruction list which depend on a 
    // ElementReferenceExpression which is also a dependency for a given instruction.
    def List<Statement> dependencyInstructions(Instruction instruction, StatementSequence iList) {
        val iS = createNewStatementList()
        val references = instruction.dependencyReferences
        if (references == null) return iS
        
        for(reference : references) {
            iS.addAll(iList.dependencyInstructions(reference).filter(e | e!=instruction))
        }
        
        iS
    }
    
    
    
    def boolean isConfluentWriterAbs(Instruction firstInst, Instruction secondInst) {
        if ((!(firstInst instanceof Assignment)) || (!(secondInst instanceof Assignment))) return false
        val asgn1 = (firstInst as Assignment).assignment as AssignmentExpression
        val asgn2 = (secondInst as Assignment).assignment as AssignmentExpression
        
        if ((asgn1.varRef as ElementReferenceExpression).reference != (asgn2.varRef as ElementReferenceExpression).reference) return false
        if (asgn1.operator != asgn2.operator) return false
        if (asgn1.expression instanceof PrimitiveValueExpression && asgn2.expression instanceof PrimitiveValueExpression) {
            val pve1 = asgn1.expression as PrimitiveValueExpression
            val pve2 = asgn2.expression as PrimitiveValueExpression
            if (pve1.value instanceof BoolLiteral && pve2.value instanceof BoolLiteral) {
                if ((pve1.value as BoolLiteral).value == (pve2.value as BoolLiteral).value) return true
            }
        }
        return false
    }
    
    def boolean isWriterAbs(Instruction instruction) {
        if (!(instruction instanceof Assignment)) return false
        val asgn = (instruction as Assignment).assignment as AssignmentExpression
        val varRef = asgn.varRef
        
        if (asgn.expression.eAllContents.toIterable.filter(typeof(ElementReferenceExpression)).
            filter(e | e.equals(varRef)).size==0) return true
        return false
    }

    def boolean isWriterRel(Instruction instruction) {
        if (!(instruction instanceof Assignment)) return false
        val asgn = (instruction as Assignment).assignment as AssignmentExpression
        val varRef = asgn.varRef
        
        if (asgn.expression.eAllContents.toIterable.filter(typeof(ElementReferenceExpression)).
            filter(e | e.equals(varRef)).size>0) return true
        return false
    }
    
    def VariableDeclaration getWriteRef(Instruction instruction) {
        if (!(instruction instanceof Assignment)) return null
        val asgn = (instruction as Assignment).assignment as AssignmentExpression
        return ((asgn.varRef as ElementReferenceExpression).reference as VariableDeclaration)
    }
    
    def boolean isReader(Instruction instruction, VariableDeclaration vardec) {
        if (instruction instanceof Assignment) {
            val asgn = (instruction as Assignment).assignment as AssignmentExpression
            if (asgn.expression.eAllContents.toIterable.filter(typeof(ElementReferenceExpression)).
                filter(e | e.reference.equals(vardec)).size>0) return true
        } else if (instruction instanceof Conditional) {
            val cond = (instruction as Conditional).expression
            if (cond instanceof ElementReferenceExpression && 
                (cond as ElementReferenceExpression).reference.equals(vardec)) return true
            if (cond.eAllContents.toIterable.filter(typeof(ElementReferenceExpression)).
                filter(e | e.reference.equals(vardec)).size>0) return true
        }
        return false
    }
    
    
    def List<Statement> getConcurrentDependencies(Instruction instruction) {
        val dList = new ArrayList<Statement>
        val depList = instruction.dependencyInstructions(instruction.getProgram)
        for (targetStatement : depList) {
            if (!instruction.isInSameThreadAs(targetStatement.getInstruction) && !instruction.isInMainThread &&
                    !targetStatement.isInMainThread
                ) {        
                    dList.add(targetStatement)
                }
        }
        dList
    }
     
    def boolean hasConcurrentDependencies(Instruction instruction) {
        getConcurrentDependencies(instruction).size > 0
    }
    
    def List<Statement> getConcurrentTargetDependencies(Instruction instruction) {
        val dList = new ArrayList<Statement>
        val depList = instruction.dependencyInstructions(instruction.getProgram)
        for (targetStatement : depList) {
            if (!instruction.isInSameThreadAs(targetStatement.getInstruction) && !instruction.isInMainThread &&
                    !targetStatement.isInMainThread
                ) {
                    if (instruction.isDependencyTarget(targetStatement.getInstruction))        
                        dList.add(targetStatement)
                }
        }
        dList
    }
    
    def boolean hasConcurrentTargetDependencies(Instruction instruction) {
        getConcurrentTargetDependencies(instruction).size != 0
    }
    
    
    
    
    def int dependencyType(Instruction firstInst, Instruction secondInst) {
        if (firstInst.isWriterAbs && secondInst.isWriterAbs && firstInst.getWriteRef==secondInst.getWriteRef &&
            !isConfluentWriterAbs(firstInst, secondInst)) return DEPENDENCY_TYPE_WW
        if (firstInst.isWriterAbs && secondInst.isWriterRel && firstInst.getWriteRef==secondInst.getWriteRef)
            return DEPENDENCY_TYPE_WI
        if (firstInst.isWriterAbs && secondInst.isReader(firstInst.getWriteRef)) return DEPENDENCY_TYPE_WR
        if (firstInst.isWriterRel && secondInst.isReader(firstInst.getWriteRef)) return DEPENDENCY_TYPE_RI
        return DEPENDENCY_TYPE_UNKNOWN
    }
    
    def boolean isDependencyTarget(Instruction target, Instruction source) {
        dependencyType(source, target) != DEPENDENCY_TYPE_UNKNOWN
    }
    
    def String dependencyTypeToString(int type) {
        if (type == DEPENDENCY_TYPE_WW) return "ww"
        if (type == DEPENDENCY_TYPE_WR) return "wr"
        if (type == DEPENDENCY_TYPE_WI) return "wi"
        if (type == DEPENDENCY_TYPE_RI) return "ri"
        return "null"
    }
    
    def int compareSCLDependencyOrder(Instruction i1, Instruction i2) {
        var order = 1
        if (i1 instanceof Assignment) order = -1
        if (i1 instanceof Conditional && (!(i2 instanceof Assignment))) order = -1
        order
    }
   
}