package de.cau.cs.kieler.scl.extensions

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
import com.google.inject.Inject
import de.cau.cs.kieler.scl.scl.InstructionStatement
import java.util.List
import de.cau.cs.kieler.scl.scl.Statement
import java.util.ArrayList
import de.cau.cs.kieler.scl.scl.Assignment

class SCLBasicBlockExtensions {
    
    @Inject
    extension SCLGotoExtensions
    @Inject
    extension SCLStatementExtensions
    @Inject
    extension SCLThreadExtensions
    
    def ArrayList<Statement> getBasicBlock(Statement statement) {
        getBasicBlock(statement, statement.getThread.statements)
    }
    
    def ArrayList<Statement> getBasicBlock(Statement statement, List<Statement> statements) {
        val bBox = new ArrayList<Statement>
        var boolean add = false
        for (stmt : statements) {
            if (add) {
                if (stmt.hasInstruction && 
                        ((stmt.getInstruction instanceof Assignment && 
                        stmt.asInstructionStatement.getIncomingGotos.size>0)
                    || (!(stmt.getInstruction instanceof Assignment)))
                    ) add = false 
                if (add && stmt != null && !stmt.isEmpty)
                    bBox.add(stmt)
            } else {
                if (stmt == statement) {
                    add = true
                    bBox.add(stmt)
                    if (stmt.hasInstruction && (!(stmt.getInstruction instanceof Assignment))) add = false
                }
            }
        }
        bBox
    }
    
    def boolean isInBasicBlock(Statement statement, List<Statement> basicBlock) {
        basicBlock.contains(statement)
    }
    
    def ArrayList<ArrayList<Statement>> getBasicBlockPredecessors(List<Statement> basicBox) {
        val predecessors = new ArrayList<ArrayList<Statement>>
        val headStatement = basicBox.head
        val hsThread = headStatement.getThread
        if (hsThread.statements.head == headStatement) {
            // headStatement is first statement in this thread
            // check container
        } else {
            // check previous instruction
            
        }
        
        predecessors
    }
    
}