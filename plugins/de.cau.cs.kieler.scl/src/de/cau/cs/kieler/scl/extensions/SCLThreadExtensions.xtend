package de.cau.cs.kieler.scl.extensions

import de.cau.cs.kieler.scl.scl.AbstractThread
import de.cau.cs.kieler.scl.scl.Conditional
import de.cau.cs.kieler.scl.scl.Instruction
import de.cau.cs.kieler.scl.scl.InstructionStatement
import de.cau.cs.kieler.scl.scl.Parallel
import de.cau.cs.kieler.scl.scl.Program
import de.cau.cs.kieler.scl.scl.Statement
import java.util.List
import javax.inject.Inject

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*

class SCLThreadExtensions {
        
    @Inject
    extension SCLStatementExtensions        
        
    // ======================================================================================================
    // ==                   S C L T H R E A D   M E T A M O D E L   E X T E N S I O N                      ==
    // ======================================================================================================
    
    /*
     * Methods for scl threads and instructions in this context 
     */
    
    // Retrieve the thread list of a given instruction
    def AbstractThread getThread(Instruction instruction) {
        getThread(instruction.eContainer as Statement)
    }
    
    def AbstractThread getThread(Statement statement) {
        var container = statement.eContainer
        while (container != null) {
            if (container instanceof AbstractThread) return container as AbstractThread
            container = container.eContainer
        }
        return null
    }

    def AbstractThread getMainThread(Instruction instruction) {
        getMainThread(instruction.eContainer as Statement)
    }
    
    def AbstractThread getMainThread(Statement statement) {
        var container = statement.eContainer
        while (container != null) {
            if (container instanceof Program) return container as AbstractThread
            container = container.eContainer
        }
        return null
    }
    
    def Statement[] getControlFlow(Instruction instruction) {
        getControlFlow(instruction.eContainer as Statement)
    }
    
    def Statement[] getControlFlow(Statement statement) {
        var container = statement.eContainer
        while (container != null) {
            if (container instanceof AbstractThread) return (container as AbstractThread).statements
            if (container instanceof Conditional) return (container as Conditional).statements
            container = container.eContainer
        }
        return null
    }

    // Checks if two instructions are in the same thread instruction list 
    def dispatch boolean isInSameThreadAs(Instruction instruction, Instruction secondInstruction) {
        getThread(instruction) == getThread(secondInstruction)
    }

    def dispatch boolean isInSameThreadAs(Statement statement, Statement secondStatement) {
        getThread(statement) == getThread(secondStatement)
    }
    
    // Checks if an instruction is in the main thread list (program.instructions)
    def dispatch boolean isInMainThread(Instruction instruction) {
        getThread(instruction) == getMainThread(instruction)
    }

    def dispatch boolean isInMainThread(Statement statement) {
        getThread(statement) == getMainThread(statement)
    }

    // Checks if an instruction is in the given thread
    def dispatch boolean isInThread(Instruction instruction, AbstractThread thread) {
        thread.eAllContents.filter(typeof(InstructionStatement)).exists(e|e.instruction == instruction)
    }    

    // Checks if a statement is in the given thread
    def dispatch boolean isInThread(Statement statement, AbstractThread thread) {
        thread.eAllContents.filter(typeof(Statement)).exists(e|e == statement)
    }
    
    // Checks if a thread contains the given instruction
    def dispatch boolean contains(AbstractThread thread, Instruction instruction) {
        instruction.isInThread(thread)
    }    
    
    // Checks if a thread contains the given statement
    def dispatch boolean contains(AbstractThread thread, Statement statement) {
        statement.isInThread(thread)
    }
    
    // Drop previous statements from a list of statements till the given statement
    def dropPrevious(List<Statement> statements, Statement statement) {
        var stmts = statements.copyAll
        while(stmts != null && stmts.size>0 && stmts.head != statement) 
            stmts = stmts.tail.toList
        stmts
    }
    
    def dropPrevious(AbstractThread thread, Statement statement) {
        if (statement.eContainer instanceof Conditional) {
            return dropPrevious((statement.eContainer as Conditional).statements, statement)    
        } else {
            return dropPrevious(thread.statements, statement)
        }
    }
    
    def InstructionStatement getPreviousInstructionStatement(Statement statement) {
        val thread = statement.getThread
        var index = thread.statements.indexOf(statement) - 1
        if (index<0) return null
        while(index>=0) {
            val stmt = thread.statements.get(index)
            if (stmt.hasInstruction) { return stmt.asInstructionStatement }
            index = index - 1
        }
        return null
    }
    
    def Statement getPreviousStatement(Statement statement) {
        val thread = statement.getThread
        var index = thread.statements.indexOf(statement) - 1
        if (index<0) return null
        thread.statements.get(index)
    }
    
    def Statement getPreviousStatementHierarchical(Statement statement) {
        val cf = statement.getControlFlow
        var index = cf.indexOf(statement) - 1
        if (index<0) {
            if (statement.eContainer instanceof Parallel) return (statement.eContainer as Parallel).getStatement
            if (statement.eContainer instanceof Conditional) return (statement.eContainer as Conditional).getStatement
            return null
        }
        cf.get(index)
    }

    def Statement getPreviousInstructionStatementHierarchical(Statement statement) {
        var prevStatement = statement.previousStatementHierarchical
        while (prevStatement != null && prevStatement.isEmpty) 
            prevStatement = prevStatement.previousStatementHierarchical
        prevStatement
    }

    
}