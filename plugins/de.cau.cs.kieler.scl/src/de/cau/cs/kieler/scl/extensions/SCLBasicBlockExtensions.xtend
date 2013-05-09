package de.cau.cs.kieler.scl.extensions

import com.google.inject.Inject
import de.cau.cs.kieler.scl.scl.Assignment
import de.cau.cs.kieler.scl.scl.Conditional
import de.cau.cs.kieler.scl.scl.Goto
import de.cau.cs.kieler.scl.scl.Statement
import java.util.ArrayList
import java.util.List
import de.cau.cs.kieler.scl.extensions.BasicBlock

class SCLBasicBlockExtensions {
    
    @Inject
    extension SCLGotoExtensions
    @Inject
    extension SCLStatementExtensions
    @Inject
    extension SCLThreadExtensions
    
    // Decides weather or not a statement is the beginning of a new basic block.
    def boolean isBasicBlockFirst(Statement statement) {
        if (statement.isEmpty) return false
        
        val statements = statement.getStatementSequence
        val prevStatement = statement.previousStatementHierarchical
        
        if (statement.isGoto) return false
        if (statement.isPause) return true
        if (statements.indexOf(statement) == 0) return true
        if (prevStatement.isConditional) return true
        if (prevStatement.isGoto) return true 
        if (statement.asInstructionStatement.getIncomingGotos.size==0) return false
        
        return true
    }
    
    // Decides weather or not a statement is the end of a basic block. 
    def boolean isBasicBlockLast(Statement statement) {
        if (statement.isEmpty) return false
        if (statement.isConditional) return true
        if (statement.isPause) return true
        
        val statements = statement.getStatementSequence
        var succIndex = statements.indexOf(statement) + 1 
        
        while (succIndex < statements.size) {
            val succStatement = statements.get(succIndex)
            if (succStatement.isEmpty || succStatement.isGoto) succIndex = succIndex + 1
            else {
                val incomingGotos = succStatement.asInstructionStatement.getIncomingGotos.size
                if (incomingGotos == 0) return false
                else return true
            }
        }
        return true
    }
    
    // Retrieves all statements of a basic block, identified by its first statement.
    // If the first statement is a pause, the depth of the pause is the beginning of this block. 
    // (In contrast the surface of a pause statement at the bottom of a block.)
    def BasicBlock getBasicBlockStatements(Statement statement) {
        val statements = statement.getStatementSequence
        val bBox = new BasicBlock()
        
        if (statement.isGoto) { 
            var statementHier = statement.previousStatementHierarchical
            bBox.add(statementHier)
            return bBox
        }
        
        val oIndex = statements.indexOf(statement)
        if (oIndex < 0) return bBox
        val stmt = statements.get(oIndex)
        if (!stmt.isBasicBlockFirst) {
            val predStatements = new ArrayList<Statement>
            var predIndex = oIndex - 1
            while (predIndex >= 0) {
                val predStmt = statements.get(predIndex)
                if (!predStmt.isEmpty) predStatements.add(predStmt) 
                if (!predStmt.isBasicBlockFirst) predIndex = predIndex - 1
                else predIndex = -1
            }
            bBox.addAll(predStatements.reverse)
        }
        bBox.add(stmt)
        if (stmt.isBasicBlockLast) return bBox
        var succIndex = oIndex + 1
        while (succIndex < statements.size) {
            val succStmt = statements.get(succIndex)
            if (!succStmt.isEmpty) bBox.add(succStmt) 
            if (!succStmt.isBasicBlockLast) succIndex = succIndex + 1
            else succIndex = statements.size                    
        }
        bBox
    }

    
    // Checks whether or not a statement exists in the given basic block
    def boolean isInBasicBlock(Statement statement, BasicBlock basicBlock) {
        basicBlock.StatementSequence.contains(statement)
    }
    
    // Retrievies the statement, that identifies the basic block
    def Statement getBasicBlockFirst(List<Statement> basicBlock) {
        basicBlock.head
    }
    
    def Statement getBasicBlock(Statement statement) {
        statement.getBasicBlockStatements.head
    }

    // Returns the hashcode id of the basic block
    // (Which is identical with the ID of the first statement.)    
    def String getBasicBlockID(Statement basicBlockHead) {
        basicBlockHead.hashCode.toString
    }
    
    def List<Statement> getBasicBlocks(Statement statement) {
        val allRoots = new ArrayList<Statement>
        val cf = statement.getStatementSequence
        for(stmt : cf) {
            val stmtBlockHead = stmt.getBasicBlockStatements.head
            if (stmtBlockHead != null && !allRoots.contains(stmtBlockHead)) allRoots.add(stmtBlockHead)
            if (stmt.hasInstruction && stmt.getInstruction instanceof Conditional) 
                allRoots.addAll((stmt.getInstruction as Conditional).statements.head.getBasicBlocks) 
        }
        allRoots
    }
    
    def List<Statement> getAllBasicBlocks(Statement statement) {
        getBasicBlocks(statement.getMainThread.statements.head)
    }
    
    def int getAllBasicBlocksCount(Statement statement) {
        getAllBasicBlocks(statement).size
    }
    
    def int getBasicBlockIndex(Statement basicBlockHead) {
        val allRoots = basicBlockHead.getAllBasicBlocks
        allRoots.indexOf(basicBlockHead)
    }
    
    def ArrayList<Statement> getBasicBlockPredecessorRoots(Statement basicBlockHead) {
        val predecessors = new ArrayList<Statement>
        val predStmt = basicBlockHead.getPreviousInstructionStatementHierarchical
        if (predStmt == null) return predecessors
        
//        if (!(predStmt.asInstructionStatement.getInstruction instanceof Goto)) predecessors.add(predStmt.getBasicBlockRoot)
//        for (goto : basicBlockRoot.asInstructionStatement.getIncomingGotos) {
//            predecessors.add((goto.eContainer as Statement).getBasicBlockFirst)
//        }
         
        predecessors
    }
    
    
}