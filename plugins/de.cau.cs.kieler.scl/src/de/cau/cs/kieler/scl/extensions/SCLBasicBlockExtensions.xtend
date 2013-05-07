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
    
    def boolean isInBasicBlock(Statement statement, Statement basicBlockRoot) {
        isInBasicBlock(statement, basicBlockRoot.getBasicBlock)
    }
    
    def boolean isInBasicBlock(Statement statement, List<Statement> basicBlock) {
        basicBlock.contains(statement)
    }
    
    def Statement getBasicBlockRoot(Statement basicBlockStatement) {
        basicBlockStatement.getBasicBlock.getBasicBlockRoot
    }
    
    def Statement getBasicBlockRoot(List<Statement> basicBlock) {
        basicBlock.head
    }
    
    def String getBasicBlockID(Statement basicBlockStatement) {
        basicBlockStatement.getBasicBlock.getBasicBlockID
    }
    
    def String getBasicBlockID(List<Statement> basicBlock) {
        basicBlock.getBasicBlockRoot.hashCode.toString
    }
    
    def ArrayList<Statement> getBasicBlockPredecessors(Statement basicBlockRoot) {
        
    }
    
    def ArrayList<ArrayList<Statement>> getBasicBlockPredecessors(List<Statement> basicBlock) {
        val predecessors = new ArrayList<ArrayList<Statement>>
        val headStatement = basicBlock.head
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