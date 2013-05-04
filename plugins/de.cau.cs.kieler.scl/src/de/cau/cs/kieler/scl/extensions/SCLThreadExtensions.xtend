package de.cau.cs.kieler.scl.extensions

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
import de.cau.cs.kieler.scl.scl.Instruction
import de.cau.cs.kieler.scl.scl.InstructionStatement
import de.cau.cs.kieler.scl.scl.Program
import de.cau.cs.kieler.scl.scl.Statement
import de.cau.cs.kieler.scl.scl.Thread
import de.cau.cs.kieler.scl.scl.AbstractThread
import java.util.List
import java.util.ArrayList
import de.cau.cs.kieler.scl.scl.Conditional

class SCLThreadExtensions {
        
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
    
}