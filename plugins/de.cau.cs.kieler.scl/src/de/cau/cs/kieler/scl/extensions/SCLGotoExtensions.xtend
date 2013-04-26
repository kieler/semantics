package de.cau.cs.kieler.scl.extensions

import com.google.inject.Inject
import de.cau.cs.kieler.scl.scl.AbstractThread
import de.cau.cs.kieler.scl.scl.Goto
import de.cau.cs.kieler.scl.scl.InstructionStatement
import de.cau.cs.kieler.scl.scl.Statement

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*

class SCLGotoExtensions {
    
    @Inject
    extension SCLThreadExtensions
    
    // ======================================================================================================
    // ==                 G O T O  - L O O K U P   M E T A M O D E L   E X T E N S I O N                   ==
    // ======================================================================================================
    
    /*
     * These methods help to find goto targets and successor instructions of labels.
     */
    
    // Retrieves the target statement of a goto statement.
    // REMARK: Because the target may not exit this function may return null! 
    def Statement getTargetStatement(Goto goto) {
        getTargetStatement(goto, goto.getThread)
    }
    
    def Statement getTargetStatement(Goto goto, AbstractThread thread) {
        thread.eAllContents.filter(typeof(Statement)).filter(e|e.label == goto.targetLabel).head
    }
    
    // Checks weather or not a specified goto target exists in the instruction list
    def boolean targetExists(Goto goto) {
        targetExists(goto, goto.getThread)
    }

    def boolean targetExists(Goto goto, AbstractThread thread) {
        getTargetStatement(goto, thread) != null
    }

    // Retrieves the first valid InstructionStatement in a Thread at/after the given Statement
    // If the statement is already an InstructionStatement return immediately
    // REMARK: May return null, if no further InstructionStatement exists
    // To get a valid instruction from a goto jump, one can write
    //      goto.getTargetStatement?.getInstructionStatement?.instruction
    // The result value will be the instruction or null. 
    def InstructionStatement getInstructionStatement(Statement statement) {
        if (statement instanceof InstructionStatement) return statement as InstructionStatement
        var statements = statement.getThread.statements.copyAll
        while(statements.size>0 && statements.head != statement) statements = statements.tail.toList
        if (statements.size==0) return null
        return statements.head as InstructionStatement
    }
    
    def int getIncomingJumpCount(InstructionStatement statement) {
        statement.getThread.statements.allContents.filter(typeof(Goto)).filter(e|e.getTargetStatement == statement).size
    }
}