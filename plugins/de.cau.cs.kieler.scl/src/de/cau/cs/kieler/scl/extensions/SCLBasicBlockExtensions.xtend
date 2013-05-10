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
    def List<Statement> getBasicBlockStatements(Statement statement) {
        getBasicBlockStatements(statement, false)
    }
    
    def List<Statement> getBasicBlockStatements(Statement statement, boolean isDepth) {
        val statements = statement.getStatementSequence
        val bBox = new ArrayList<Statement>
        
        if (statement.isGoto) { 
            var statementHier = statement.previousStatementHierarchical
            return getBasicBlockStatements(statementHier, isDepth)
        }
        
        val oIndex = statements.indexOf(statement)
        if (oIndex < 0) return bBox
        val stmt = statements.get(oIndex)
        if (!stmt.isBasicBlockFirst || 
            (stmt.isPause && !isDepth && oIndex>0)) {
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
        if (stmt.isBasicBlockLast && !isDepth) return bBox
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
    def Statement getBasicBlockHead(BasicBlock basicBlock) {
        basicBlock.getHead
    }
    
    def BasicBlock createBasicBlock() {
        new BasicBlock()
    } 
    
    def BasicBlock create basicBlock: createBasicBlock() getBasicBlockByHead(Statement basicBlockHead, boolean isDepth) {
        val statements = basicBlockHead.getBasicBlockStatements(isDepth)
        basicBlock.addAll(statements)
        basicBlock.setPauseHeadIsDepth(isDepth)
    }
    
    def BasicBlock getBasicBlockByAnyStatement(Statement statement) {
        val statements = statement.getBasicBlockStatements
        if (statements.head.isPause && statements.head != statement) 
            getBasicBlockByHead(statements.head, true)
        else
            getBasicBlockByHead(statements.head, false)
    }
    
    def BasicBlock getBasicBlockByAnyStatementDepth(Statement statement) {
        val statements = statement.getBasicBlockStatements(true)
        getBasicBlockByHead(statements.head, true)
    }

    // Returns the hashcode id of the basic block
    // (Which is identical with the ID of the first statement.)    
    def String getBasicBlockID(BasicBlock basicBlock) {
        basicBlock.getHead.hashCode.toString
    }
    
    def List<BasicBlock> getBasicBlocks(Statement statement) {
        val basicBlocks = new ArrayList<BasicBlock>
        val cf = statement.getStatementSequence
        for(stmt : cf) {
            val stmtBlock = stmt.getBasicBlockByAnyStatement
            if (stmtBlock != null && !basicBlocks.contains(stmtBlock)) basicBlocks.add(stmtBlock)
            if (stmt.isPause) {
                val stmtBlockDepth = stmt.getBasicBlockByAnyStatementDepth
                if (stmtBlockDepth != null && !basicBlocks.contains(stmtBlockDepth)) basicBlocks.add(stmtBlockDepth)
            }
            if (stmt.hasInstruction && stmt.getInstruction instanceof Conditional) 
                basicBlocks.addAll((stmt.getInstruction as Conditional).statements.head.getBasicBlocks) 
        }
        basicBlocks
    }
    
    def List<BasicBlock> getAllBasicBlocks(Statement statement) {
        getBasicBlocks(statement.getMainThread.statements.head)
    }
    
    def int getAllBasicBlocksCount(Statement statement) {
        getAllBasicBlocks(statement).size
    }
    
    def int getBasicBlockIndex(BasicBlock basicBlock) {
        var c = 0
        for(block : basicBlock.getHead.getAllBasicBlocks) {
            if (basicBlock.isEqual(block)) return c        
            c = c + 1
        }
        c = -1
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