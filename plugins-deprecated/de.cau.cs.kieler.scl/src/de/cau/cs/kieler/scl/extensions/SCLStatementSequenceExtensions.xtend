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

/**
 * Collection of statement sequence extensions.
 * 
 * @author: ssm
 * 
 */

class SCLStatementSequenceExtensions {
        
    @Inject
    extension SCLStatementExtensions        
    @Inject
    extension SCLGotoExtensions
        
 
    // Retrieve the thread of a given instruction/statement
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

    // Retrieve the parallel instruction of a subordinate instruction / statement
    def Parallel getParallel(Instruction instruction) {
        getParallel(instruction.eContainer as Statement);
    }
    
    def Parallel getParallel(Statement statement) {
        var container = statement.eContainer
        if (container == null && statement.hasInstruction) container = statement.getInstruction
        while (container != null) {
            if (container instanceof Parallel) return (container as Parallel)
            container = container.eContainer
        }
        return null
    }

    // Retrieve the program of an instruction / statement
    def Program getProgram(Instruction instruction) {
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

    // Retrieve the statement sequence of an instruction / statement    
    def StatementSequence getParentStatementSequence(Instruction instruction) {
        getParentStatementSequence(instruction.eContainer as Statement)
    }
    
    def StatementSequence getParentStatementSequence(Statement statement) {
        if (statement == null) return null
        var container = statement.eContainer
        if (container == null && statement.hasInstruction) container = statement.getInstruction
        while (container != null) {
            if (container instanceof StatementSequence) return (container as StatementSequence)
            container = container.eContainer
        }
        return null
    }

    // Checks if two instructions / statements are in the same thread instruction list 
    def dispatch boolean isInSameThreadAs(Instruction instruction, Instruction secondInstruction) {
        getThread(instruction) == getThread(secondInstruction)
    }

    def dispatch boolean isInSameThreadAs(Statement statement, Statement secondStatement) {
        getThread(statement) == getThread(secondStatement)
    }
    
    // Checks if an instruction /statement is in the main thread list (program.instructions)
    def dispatch boolean isInMainThread(Instruction instruction) {
        getThread(instruction) == null
    }

    def dispatch boolean isInMainThread(Statement statement) {
        getThread(statement) == null
    }
    
    // Checks whether or not two instructions /statements share the same parent
    def boolean hasSameThreadParentAs(Instruction instruction, Instruction secondInstruction) {
        (instruction.eContainer as Statement).hasSameThreadParentAs((secondInstruction.eContainer as Statement))
    }
    
    def boolean hasSameThreadParentAs(Statement statement, Statement secondStatement) {
        statement.getThread?.eContainer == secondStatement.getThread?.eContainer
    }

    // Retrieves the least common ancestor of two instructions / statements
    def Parallel getLeastCommonAncestorParallel(Instruction instruction, Instruction secondInstruction) {
        getLeastCommonAncestorParallel(instruction.eContainer as Statement, 
            secondInstruction.eContainer as Statement
            )
    }
    
    def Parallel getLeastCommonAncestorParallel(Statement statement, Statement secondStatement) {
        // As explained in DATE'13 the least common ancestor fork (lcaf) is determined recursively
        // throughout encapsulating parallel instructions.
        var ps1 = statement.getThread;
        while (ps1 != null) {
            var ps2 = secondStatement.getThread;
            while (ps2 != null) {
                if (ps1 != ps2) {
                    val ps1p = ps1.eContainer as Parallel
                    val ps2p = ps2.eContainer as Parallel
                    if (ps1p == ps2p) return ps1p
                }
                ps2 = (ps2.eContainer as Parallel).getThread
            }
            ps1 = (ps1.eContainer as Parallel).getThread
        }
        return null
    }
    

    // Retrieves the instruction statement preceding the given instruction.
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
    
    // Retrieves the preceding statement regardless of its type.
    def Statement getPreviousStatement(Statement statement) {
        val sseq = statement.getParentStatementSequence
        var index = sseq.statements.indexOf(statement) - 1
        if (index<0) return null
        sseq.statements.get(index)
    }
    
    // Retrieves the preceding statements with respect of hierarchy.
    def Statement getPreviousStatementHierarchical(Statement statement) {
        val sseq = statement.getParentStatementSequence
        var transformedStatement = statement
        if (statement.hasInstruction) transformedStatement = statement.instruction.eContainer as Statement
        var index = sseq.statements.indexOf(transformedStatement) - 1
        if (index<0) {
            if (transformedStatement.eContainer instanceof Parallel) return (transformedStatement.eContainer as Parallel).getStatement
            if (transformedStatement.eContainer instanceof Conditional) return (transformedStatement.eContainer as Conditional).getStatement
            return null
        }
        sseq.statements.get(index)
    }

    // Retrieves the preceding instruction statement with repsect of hierarchy.
    def Statement getPreviousInstructionStatementHierarchical(Statement statement) {
        var prevStatement = statement.previousStatementHierarchical
        while (prevStatement != null && prevStatement.isEmpty) 
            prevStatement = prevStatement.previousStatementHierarchical
        prevStatement
    }
    
    // Returns the next statements.
    def Statement getNextStatement(Statement statement) {
        getNextStatement(statement, false)
    }
    
    // Returns the next statement and follows goto jumps, if the next statement is a goto.
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
    
    // Retrieves the next instruction statement.
    def Statement getNextInstructionStatement(Statement statement) {
        getNextInstructionStatement(statement, false)
    }

    // Retrieves the next instruction statement including goto jump follow-ups.
    def Statement getNextInstructionStatement(Statement statement, boolean resolveGotos) {
        var nextStatement = statement.getNextStatement(resolveGotos)
        while (nextStatement != null && nextStatement.isEmpty) 
            nextStatement = nextStatement.getNextStatement(resolveGotos)
        nextStatement
    }
    
    // Retrieves the next statement respecting hierarchy.
    def Statement getNextStatementHierarchical(Statement statement) {
        getNextStatementHierarchical(statement, false) 
    }
    
    // Retrieves the next statement respecting hierarchy and goto jumps.
    def Statement getNextStatementHierarchical(Statement statement, boolean resolveGotos) {
        val stmt = statement.getNextStatement(resolveGotos)
        if (stmt == null) {
            if (statement.eContainer instanceof Parallel) return (statement.eContainer as Parallel).getStatement.getNextStatement(resolveGotos)
            if (statement.eContainer instanceof Conditional) return (statement.eContainer as Conditional).getStatement.getNextStatement(resolveGotos)
            return null
        }
        stmt
    }

    // Retrieves the next instruction statement respecting hierarchy and goto jumps.
    def Statement getNextInstructionStatementHierarchical(Statement statement) {
        getNextInstructionStatementHierarchical(statement, false) 
    }

    def Statement getNextInstructionStatementHierarchical(Statement statement, boolean resolveGotos) {
        var nextStatement = statement.getNextStatementHierarchical(resolveGotos)
        while (nextStatement != null && nextStatement.isEmpty) 
            nextStatement = nextStatement.getNextStatementHierarchical(resolveGotos)
        nextStatement
    }    
    
    // Returns true, if a statement is the last statement of a statement sequence.
    def boolean endOfSequence(Statement statement) {
        statement.getNextInstructionStatement(false) == null
    }
    
}