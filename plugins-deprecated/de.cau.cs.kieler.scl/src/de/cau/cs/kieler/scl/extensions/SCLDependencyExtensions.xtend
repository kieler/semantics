/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2013 by
 * + Kiel University
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
import de.cau.cs.kieler.scl.scl.VariableDefinition
import java.util.List
import de.cau.cs.kieler.scl.scl.Instruction
import org.eclipse.emf.common.util.EList
import de.cau.cs.kieler.scl.scl.StatementSequence
import javax.inject.Inject
import de.cau.cs.kieler.scl.scl.Statement
import org.yakindu.sct.model.stext.stext.AssignmentOperator;

/**
 * The dependency extension contains all mandatory methods to determine and categorize SCL statement
 * dependencies.
 * 
 * @author: ssm
 */

class SCLDependencyExtensions {
    
    @Inject
    extension SCLCreateExtensions;
    @Inject
    extension SCLStatementExtensions;
    @Inject
    extension SCLStatementSequenceExtensions;
    
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
    
    // Checks whether or not a writer is a confluent writer.
    def boolean isConfluentWriterAbs(Instruction firstInst, Instruction secondInst) {
        if ((!(firstInst instanceof Assignment)) || (!(secondInst instanceof Assignment))) return false
        val asgn1 = (firstInst as Assignment).assignment as AssignmentExpression
        val asgn2 = (secondInst as Assignment).assignment as AssignmentExpression
        
        if (asgn1.operator != asgn2.operator) return false
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
    
    // Checks whether or not an instruction is an absolute writer.
    def boolean isWriterAbs(Instruction instruction) {
        if (!(instruction instanceof Assignment)) return false
        val asgn = (instruction as Assignment).assignment as AssignmentExpression
        val varRef = asgn.varRef
        if (asgn.operator != AssignmentOperator::ASSIGN) return false;
        
        if (asgn.expression.eAllContents.toIterable.filter(typeof(ElementReferenceExpression)).
            filter(e | e.equals(varRef)).size==0) return true
        return false
    }

    // Checks whether or not an instruction is an relative writer.
    def boolean isWriterRel(Instruction instruction) {
        if (!(instruction instanceof Assignment)) return false
        val asgn = (instruction as Assignment).assignment as AssignmentExpression
        val varRef = asgn.varRef
        if (asgn.operator != AssignmentOperator::ASSIGN) return true;
        
        if (asgn.expression.eAllContents.toIterable.filter(typeof(ElementReferenceExpression)).
            filter(e | e.equals(varRef)).size>0) return true
        return false
    }
    
    // Retrieves the definition of a writer. 
    def VariableDefinition getWriteRef(Instruction instruction) {
        if (!(instruction instanceof Assignment)) return null
        val asgn = (instruction as Assignment).assignment as AssignmentExpression
        return ((asgn.varRef as ElementReferenceExpression).reference as VariableDefinition)
    }
    
    // Returns true, is an instruction is a reader w.r.t. a definition.
    def boolean isReader(Instruction instruction, VariableDefinition vardec) {
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
    
    // Returns a list of concurrent dependencies w.r.t. a given instruction. 
    def List<Statement> getConcurrentDependencies(Instruction instruction) {
        val dList = new ArrayList<Statement>
        val depList = instruction.dependencyInstructions(instruction.getProgram)
        for (targetStatement : depList) {
            if (!instruction.isInSameThreadAs(targetStatement.getInstruction) && !instruction.isInMainThread &&
                    !targetStatement.isInMainThread &&
                     instruction.getLeastCommonAncestorParallel(targetStatement.getInstruction) != null
                ) {        
                    dList.add(targetStatement)
                }
        }
        dList
    }
     
    // Returns true, if an instruction has concurrent dependencies.
    def boolean hasConcurrentDependencies(Instruction instruction) {
        getConcurrentDependencies(instruction).size > 0
    }
    
    // Returns a list of statements, that comprise a concurrent dependency that targets a given instruction.
    def List<Statement> getConcurrentTargetDependencies(Instruction instruction) {
        val dList = new ArrayList<Statement>
        val depList = instruction.dependencyInstructions(instruction.getProgram)
        for (targetStatement : depList) {
            if (!instruction.isInSameThreadAs(targetStatement.getInstruction) && !instruction.isInMainThread &&
                    !targetStatement.isInMainThread &&
                    instruction.getLeastCommonAncestorParallel(targetStatement.getInstruction) != null
                ) {
                    if (instruction.isDependencyTarget(targetStatement.getInstruction))        
                        dList.add(targetStatement)
                }
        }
        dList
    }
    
    // Returns true, if an instruction has concurrent dependencies that target the given instruction.
    def boolean hasConcurrentTargetDependencies(Instruction instruction) {
        getConcurrentTargetDependencies(instruction).size != 0
    }

    // Determines the type of a dependency defined by its two instructions.    
    def DependencyType dependencyType(Instruction firstInst, Instruction secondInst) {
        if (firstInst.isWriterAbs && secondInst.isWriterAbs && firstInst.getWriteRef==secondInst.getWriteRef &&
            !isConfluentWriterAbs(firstInst, secondInst)) return DependencyType::WRITEWRITE;
        if (firstInst.isWriterAbs && secondInst.isWriterRel && firstInst.getWriteRef==secondInst.getWriteRef)
            return DependencyType::WRITEINCREMENT;
        if (firstInst.isWriterAbs && secondInst.isReader(firstInst.getWriteRef)) return DependencyType::WRITEREAD;
        if (firstInst.isWriterRel && secondInst.isReader(firstInst.getWriteRef)) return DependencyType::READINCREMENT;
        return DependencyType::UNKNOWN;
    }
    
    // Returns true, if the target instruction is actually a target for a dependency.
    def boolean isDependencyTarget(Instruction target, Instruction source) {
        dependencyType(source, target) != DependencyType::UNKNOWN;
    }
    
    // Cast types to string (accoring to DATE'13) for display reasons.
    def String dependencyTypeToString(DependencyType type) {
        if (type == DependencyType::WRITEWRITE) return "ww"
        if (type == DependencyType::WRITEREAD) return "wr"
        if (type == DependencyType::WRITEINCREMENT) return "wi"
        if (type == DependencyType::READINCREMENT) return "ri"
        return "null"
    }
    
    // Sort instructions according to DAC'13 scheme: init-write-read.
    def int compareSCLDependencyOrder(Instruction i1, Instruction i2) {
        var order = 1
        if (i1 instanceof Assignment) order = -1
        if (i1 instanceof Conditional && (!(i2 instanceof Assignment))) order = -1
        order
    }
   
}