package de.cau.cs.kieler.scl.extensions

import de.cau.cs.kieler.scl.scl.Instruction
import de.cau.cs.kieler.scl.scl.InstructionStatement
import de.cau.cs.kieler.scl.scl.Program
import de.cau.cs.kieler.scl.scl.Statement
import de.cau.cs.kieler.scl.scl.Thread
import de.cau.cs.kieler.scl.scl.AbstractThread

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
        getThread(instruction.eContainer as Statement)
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
    def dispatch boolean inSameThreadAs(Instruction instruction, Instruction secondInstruction) {
        getThread(instruction) == getThread(secondInstruction)
    }

    def dispatch boolean inSameThreadAs(Statement statement, Statement secondStatement) {
        getThread(statement) == getThread(secondStatement)
    }
    
    // Checks if an instruction is in the main thread list (program.instructions)
    def dispatch boolean isInMainThread(Instruction instruction) {
        getThread(instruction) == getMainThread(instruction)
    }

    def dispatch boolean isInMainThread(Statement statement) {
        getThread(statement) == getMainThread(statement)
    }

    // Checks if an instruction is in the given instruction list
    def dispatch boolean isInThread(Instruction instruction, Thread thread) {
        thread.eAllContents.filter(typeof(InstructionStatement)).exists(e|e.instruction == instruction)
    }    

    def dispatch boolean isInThread(Statement statement, Thread thread) {
        thread.eAllContents.filter(typeof(Statement)).exists(e|e == statement)
    }
    
    def dispatch boolean contains(Thread thread, Instruction instruction) {
        instruction.isInThread(thread)
    }    
    
    def dispatch boolean contains(Thread thread, Statement statement) {
        statement.isInThread(thread)
    }
    
}