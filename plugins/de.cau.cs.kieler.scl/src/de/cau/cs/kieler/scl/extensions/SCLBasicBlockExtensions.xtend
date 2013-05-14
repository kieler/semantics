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
    extension SCLStatementSequenceExtensions
    
    // Decides weather or not a statement is the beginning of a new basic block.
    def boolean isBasicBlockFirst(Statement statement) {
        if (statement.isEmpty) return false
        
        val sseq = statement.getParentStatementSequence
        val prevStatement = statement.previousStatementHierarchical
        
        if (statement.isGoto) return false
        if (statement.isPause) return true
        if (sseq.statements.indexOf(statement) == 0) return true
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
        
        val sseq = statement.getParentStatementSequence
        var succIndex = sseq.statements.indexOf(statement) + 1 
        
        while (succIndex < sseq.statements.size) {
            val succStatement = sseq.statements.get(succIndex)
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
        val sseq = statement.getParentStatementSequence
        val bBox = new ArrayList<Statement>
        
        if (statement.isGoto) { 
            var statementHier = statement.previousStatementHierarchical
            return getBasicBlockStatements(statementHier, isDepth)
        }
        
        val oIndex = sseq.statements.indexOf(statement)
        if (oIndex < 0) return bBox
        val stmt = sseq.statements.get(oIndex)
        if (!stmt.isBasicBlockFirst || 
            (stmt.isPause && !isDepth && oIndex>0)) {
            val predStatements = new ArrayList<Statement>
            var predIndex = oIndex - 1
            while (predIndex >= 0) {
                val predStmt = sseq.statements.get(predIndex)
                if (!predStmt.isEmpty) predStatements.add(predStmt) 
                if (!predStmt.isBasicBlockFirst) predIndex = predIndex - 1
                else predIndex = -1
            }
            bBox.addAll(predStatements.reverse)
        }
        bBox.add(stmt)
        if (stmt.isBasicBlockLast && !isDepth) return bBox
        var succIndex = oIndex + 1
        while (succIndex < sseq.statements.size) {
            val succStmt = sseq.statements.get(succIndex)
            if (!succStmt.isEmpty) bBox.add(succStmt) 
            if (!succStmt.isBasicBlockLast) succIndex = succIndex + 1
            else succIndex = sseq.statements.size                    
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
        val sseq = statement.getParentStatementSequence
        for(stmt : sseq.statements) {
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
        getBasicBlocks(statement.getProgram.statements.head)
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
    
    def List<BasicBlock> getBasicBlockPredecessor(BasicBlock basicBlock) {
        val predecessors = new ArrayList<BasicBlock>;
        val predStmt = basicBlock.getHead.getPreviousInstructionStatementHierarchical
        if (predStmt == null || (predStmt.isConditional && basicBlock.PauseHeadIsDepth)) {
            if (basicBlock.getHead.isPause && basicBlock.PauseHeadIsDepth) {
                val pauseSurface = basicBlock.getHead.getBasicBlockByAnyStatement
                predecessors.add(pauseSurface)
            }
            return predecessors
        }
        
        if (!(predStmt.getInstruction instanceof Goto)) predecessors.add(predStmt.getBasicBlockByAnyStatement)
        for (goto : basicBlock.getHead.asInstructionStatement.getIncomingGotos) {
            predecessors.add((goto.eContainer as Statement).getBasicBlockByAnyStatement)
        }
         
        predecessors
    }
    
    def List<BasicBlock> getBasicBlockSuccessor(BasicBlock basicBlock) {
        val successors = new ArrayList<BasicBlock>;
        
        if (basicBlock.StatementSequence.last.isConditional) 
            successors.add((basicBlock.StatementSequence.last.getInstruction as Conditional).statements.head.getBasicBlockByAnyStatement)
        
        val nextStmt = basicBlock.StatementSequence.last.getNextInstructionStatementHierarchical(true)
        if (nextStmt != null) {
            successors.add(nextStmt.getBasicBlockByAnyStatement)
        } else if (basicBlock.StatementSequence.last.isPause && 
            (!basicBlock.PauseHeadIsDepth || basicBlock.getHead != basicBlock.StatementSequence.last)
        ) {
            val pauseDepth = basicBlock.getHead.getBasicBlockByAnyStatementDepth
            successors.add(pauseDepth)             
        }
        
        successors
    }
    
    
}