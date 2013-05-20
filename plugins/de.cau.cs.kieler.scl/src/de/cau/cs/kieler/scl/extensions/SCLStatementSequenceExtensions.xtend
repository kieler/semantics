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

import de.cau.cs.kieler.scl.scl.StatementSequence
import de.cau.cs.kieler.scl.scl.Conditional
import de.cau.cs.kieler.scl.scl.Instruction
import de.cau.cs.kieler.scl.scl.InstructionStatement
import de.cau.cs.kieler.scl.scl.Parallel
import de.cau.cs.kieler.scl.scl.Program
import de.cau.cs.kieler.scl.scl.Statement
import de.cau.cs.kieler.scl.scl.Thread
import java.util.List
import javax.inject.Inject

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
import de.cau.cs.kieler.scl.scl.Goto
import de.cau.cs.kieler.scl.basicblocks.PauseSurface
import de.cau.cs.kieler.scl.basicblocks.PauseSurfaceImpl
import de.cau.cs.kieler.scl.basicblocks.PauseDepth
import de.cau.cs.kieler.scl.basicblocks.PauseDepthImpl

class SCLStatementSequenceExtensions {
        
    @Inject
    extension SCLStatementExtensions        
    @Inject
    extension SCLGotoExtensions
        
    // ======================================================================================================
    // ==                   S C L T H R E A D   M E T A M O D E L   E X T E N S I O N                      ==
    // ======================================================================================================
    
    /*
     * Methods for scl threads and instructions in this context 
     */
    
    // Retrieve the thread list of a given instruction
    def Thread getThread(Instruction instruction) {
        getThread(instruction.eContainer as Statement)
    }
    
    def Thread getThread(Statement statement) {
        var container = statement.eContainer
        if (container == null && statement.hasInstruction) container = statement.getInstruction
        while (container != null) {
            if (container instanceof Thread) return (container as Thread)
            container = container.eContainer
        }
        return null
    }

    def Program getProgram(Instruction instruction) {
//        var container = instruction
//        if (container instanceof PauseSurface) container = (container as PauseSurfaceImpl).PauseReference
//        else if (container instanceof PauseDepth) container = (container as PauseDepthImpl).PauseReference
        getProgram(instruction.eContainer as Statement)
    }
    
    def Program getProgram(Statement statement) {
        var container = statement.eContainer
        if (container == null && statement.hasInstruction) container = statement.getInstruction
        while (container != null) {
            if (container instanceof Program) return container as Program
            container = container.eContainer
        }
        return null
    }
    
    def StatementSequence getParentStatementSequence(Instruction instruction) {
        getParentStatementSequence(instruction.eContainer as Statement)
    }
    
    def StatementSequence getParentStatementSequence(Statement statement) {
        var container = statement.eContainer
        if (container == null && statement.hasInstruction) container = statement.getInstruction
        while (container != null) {
            if (container instanceof StatementSequence) return (container as StatementSequence)
            container = container.eContainer
        }
        return null
    }

    // Checks if two instructions are in the same thread instruction list 
//    def dispatch boolean isInSameThreadAs(Instruction instruction, Instruction secondInstruction) {
//        getThread(instruction) == getThread(secondInstruction)
//    }
//
//    def dispatch boolean isInSameThreadAs(Statement statement, Statement secondStatement) {
//        getThread(statement) == getThread(secondStatement)
//    }
    
    // Checks if an instruction is in the main thread list (program.instructions)
//    def dispatch boolean isInMainThread(Instruction instruction) {
//        getThread(instruction) == getMainThread(instruction)
//    }
//
//    def dispatch boolean isInMainThread(Statement statement) {
//        getThread(statement) == getMainThread(statement)
//    }

    // Checks if an instruction is in the given thread
//    def dispatch boolean isInThread(Instruction instruction, AbstractThread thread) {
//        thread.eAllContents.filter(typeof(InstructionStatement)).exists(e|e.instruction == instruction)
//    }    

    // Checks if a statement is in the given thread
//    def dispatch boolean isInThread(Statement statement, AbstractThread thread) {
//        thread.eAllContents.filter(typeof(Statement)).exists(e|e == statement)
//    }
    
    // Checks if a thread contains the given instruction
//    def dispatch boolean contains(AbstractThread thread, Instruction instruction) {
//        instruction.isInThread(thread)
//    }    
    
    // Checks if a thread contains the given statement
//    def dispatch boolean contains(AbstractThread thread, Statement statement) {
//        statement.isInThread(thread)
//    }
    
    // Drop previous statements from a list of statements till the given statement
//    def dropPrevious(List<Statement> statements, Statement statement) {
//        var stmts = statements.copyAll
//        while(stmts != null && stmts.size>0 && stmts.head != statement) 
//            stmts = stmts.tail.toList
//        stmts
//    }
//    
//    def dropPrevious(StatementSequence thread, Statement statement) {
//        if (statement.eContainer instanceof Conditional) {
//            return dropPrevious((statement.eContainer as Conditional).statements, statement)    
//        } else {
//            return dropPrevious(thread.statements, statement)
//        }
//    }
    
    def InstructionStatement getPreviousInstructionStatement(Statement statement) {
        val sseq = statement.getParentStatementSequence
        var index = sseq.statements.indexOf(statement) - 1
        if (index<0) return null
        while(index>=0) {
            val stmt = sseq.statements.get(index)
            if (stmt.hasInstruction) { return stmt.asInstructionStatement }
            index = index - 1
        }
        return null
    }
    
    def Statement getPreviousStatement(Statement statement) {
        val sseq = statement.getParentStatementSequence
        var index = sseq.statements.indexOf(statement) - 1
        if (index<0) return null
        sseq.statements.get(index)
    }
    
    def Statement getPreviousStatementHierarchical(Statement statement) {
        val sseq = statement.getParentStatementSequence
        var index = sseq.statements.indexOf(statement) - 1
        if (index<0) {
            if (statement.eContainer instanceof Parallel) return (statement.eContainer as Parallel).getStatement
            if (statement.eContainer instanceof Conditional) return (statement.eContainer as Conditional).getStatement
            return null
        }
        sseq.statements.get(index)
    }

    def Statement getPreviousInstructionStatementHierarchical(Statement statement) {
        var prevStatement = statement.previousStatementHierarchical
        while (prevStatement != null && prevStatement.isEmpty) 
            prevStatement = prevStatement.previousStatementHierarchical
        prevStatement
    }
    
    
    def Statement getNextStatement(Statement statement) {
        getNextStatement(statement, false)
    }
    
    def Statement getNextStatement(Statement statement, boolean resolveGotos) {
        val sseq = statement.getParentStatementSequence
        var transformedStatement = statement
        if (statement.hasInstruction) transformedStatement = statement.instruction.eContainer as Statement
        var index = sseq.statements.indexOf(transformedStatement) + 1
        if (index >= sseq.statements.size) return null
        var result = sseq.statements.get(index)
        var int cyclebreaker = 64
        if (resolveGotos) while (result != null && result.isGoto && cyclebreaker > 0) {
            val goto = result.getInstruction as Goto
            result = goto.getTargetStatement  
            cyclebreaker = cyclebreaker - 1
        }         
        result
    }
    
    def Statement getNextInstructionStatement(Statement statement) {
        getNextInstructionStatement(statement, false)
    }

    def Statement getNextInstructionStatement(Statement statement, boolean resolveGotos) {
        var nextStatement = statement.getNextStatement(resolveGotos)
        while (nextStatement != null && nextStatement.isEmpty) 
            nextStatement = nextStatement.getNextStatement(resolveGotos)
        nextStatement
    }

    def Statement getNextStatementHierarchical(Statement statement) {
        getNextStatementHierarchical(statement, false) 
    }
    
    def Statement getNextStatementHierarchical(Statement statement, boolean resolveGotos) {
        val stmt = statement.getNextStatement(resolveGotos)
        if (stmt == null) {
            if (statement.eContainer instanceof Parallel) return (statement.eContainer as Parallel).getStatement.getNextStatement(resolveGotos)
            if (statement.eContainer instanceof Conditional) return (statement.eContainer as Conditional).getStatement.getNextStatement(resolveGotos)
            return null
        }
        stmt
    }

    def Statement getNextInstructionStatementHierarchical(Statement statement) {
        getNextInstructionStatementHierarchical(statement, false) 
    }

    def Statement getNextInstructionStatementHierarchical(Statement statement, boolean resolveGotos) {
        var nextStatement = statement.getNextStatementHierarchical(resolveGotos)
        while (nextStatement != null && nextStatement.isEmpty) 
            nextStatement = nextStatement.getNextStatementHierarchical(resolveGotos)
        nextStatement
    }    
    
}