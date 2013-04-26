package de.cau.cs.kieler.scl.extensions

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
import com.google.inject.Inject
import de.cau.cs.kieler.scl.scl.Statement
import de.cau.cs.kieler.scl.scl.Goto
import de.cau.cs.kieler.scl.scl.Thread
import de.cau.cs.kieler.scl.scl.InstructionStatement
import de.cau.cs.kieler.scl.scl.AbstractThread

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
        getTargetStatement(goto.targetLabel, goto.getThread)
    }
    
    def Statement getTargetStatement(Goto goto, Thread thread) {
        getTargetStatement(goto.targetLabel, thread)
    }
    
    def Statement getTargetStatement(String targetLabel, AbstractThread thread) {
        thread.eAllContents.filter(typeof(Statement)).filter(e|e.label == targetLabel).head
    }
    
    // Checks weather or not a specified goto target exists in the instruction list
    def boolean targetExists(Goto goto) {
        targetExists(goto, goto.getThread)
    }

    def boolean targetExists(Goto goto, AbstractThread thread) {
        getTargetStatement(goto.targetLabel, thread) != null
    }

    def InstructionStatement getInstructionStatement(Statement statement) {
        if (statement instanceof InstructionStatement) return statement as InstructionStatement
        var statements = statement.getThread.statements.copyAll
        while(statements.size>0 && statements.head != statement) statements = statements.tail.toList
        if (statements.size==0) return null
        return statements.head as InstructionStatement
    }
}