/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2013 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
 package de.cau.cs.kieler.scl.extensions

import com.google.inject.Inject
import de.cau.cs.kieler.scl.basicblocks.BasicBlock
import de.cau.cs.kieler.scl.scl.Conditional
import de.cau.cs.kieler.scl.scl.Goto
import de.cau.cs.kieler.scl.scl.Statement
import java.util.ArrayList
import java.util.List
import de.cau.cs.kieler.scl.scl.Pause
import de.cau.cs.kieler.scl.basicblocks.PauseDepthImpl
import de.cau.cs.kieler.scl.scl.impl.StatementImpl
import de.cau.cs.kieler.scl.basicblocks.PauseSurfaceImpl
import de.cau.cs.kieler.scl.basicblocks.PauseDepth
import de.cau.cs.kieler.scl.basicblocks.PauseSurface
import de.cau.cs.kieler.scl.scl.Instruction

class SCLBasicBlockExtensions {
    
    @Inject
    extension SCLFactoryExtensions
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
        basicBlock.statements.contains(statement)
    }
    
    // Retrieves the statement, that identifies the basic block
    def Statement getBasicBlockHead(BasicBlock basicBlock) {
        basicBlock.getHead
    }
    
    def List<Statement> separateSurfaceAndDepth(List<Statement> statements, boolean isDepth) {
        val returnList = new ArrayList<Statement>
        if (statements.head.isPause && (statements.size>1 || isDepth)) {
            val depth = SCL.createInstructionStatement
            depth.instruction = new PauseDepthImpl(statements.head.instruction as Pause)
            returnList.add(depth)
        }
        for (statement : statements) {
            if (!statement.isPause) returnList.add(statement)
        }
        if (statements.last.isPause && (statements.size>1 || !isDepth)) {
            val surface = SCL.createInstructionStatement
            surface.instruction = new PauseSurfaceImpl(statements.last.instruction as Pause)
            returnList.add(surface)
        }
        
        returnList
    }
    
    def boolean isPauseSurface(Statement statement) {
        statement.hasInstruction && statement.trueInstruction instanceof PauseSurface
    }
    
    def boolean isPauseDepth(Statement statement) {
        statement.hasInstruction && statement.trueInstruction instanceof PauseDepth
    }
    
    def Instruction getPauseReference(Statement statement) {
        if (statement.isPauseSurface) return (statement.instruction as PauseSurfaceImpl).PauseReference
        if (statement.isPauseDepth) return (statement.instruction as PauseDepthImpl).PauseReference
        return null
    }
    
    def BasicBlock createBasicBlock() {
        new BasicBlock()
    } 
    
    def BasicBlock create basicBlock: createBasicBlock() getBasicBlockByHead(Statement basicBlockHead, boolean isDepth) {
        val statements = basicBlockHead.getBasicBlockStatements(isDepth).separateSurfaceAndDepth(isDepth)
        basicBlock.statements.addAll(statements)
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
        val basicBlocks = new ArrayList<BasicBlock>;
        val sseq = statement.getParentStatementSequence
        for(stmt : sseq.statements) {
            val stmtBlock = stmt.getBasicBlockByAnyStatement
            if (stmtBlock != null && !basicBlocks.contains(stmtBlock)) basicBlocks.add(stmtBlock)
            if (stmt.isPause) {
                val stmtBlockDepth = stmt.getBasicBlockByAnyStatementDepth
                if (stmtBlockDepth != null && !basicBlocks.contains(stmtBlockDepth)) basicBlocks.add(stmtBlockDepth)
            }
            if (stmt.hasInstruction && stmt.getInstruction instanceof Conditional)
                // ignore blocks that are already in the list 
//                basicBlocks.addAll((stmt.getInstruction as Conditional).statements.head.getBasicBlocks)
                for (block : (stmt.getInstruction as Conditional).statements.head.getBasicBlocks) {
                    if (!basicBlocks.contains(block)) basicBlocks.add(block)  
                } 
        }
        basicBlocks
    }
    
    def List<BasicBlock> getAllBasicBlocks(Statement statement) {
        // check if instruction is pausedepth or pausesurface
//        if (statement.isEmpty) return getBasicBlocks(statement.getProgram.statements.head)
//        var instruction = statement.instruction
//        if (statement.isPauseSurface) instruction = (statement.instruction as PauseSurfaceImpl).PauseReference
//        if (statement.isPauseDepth) instruction = (statement.instruction as PauseDepthImpl).PauseReference
        getBasicBlocks(statement.getProgram.statements.head);
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
    
    def boolean headIsDepth(BasicBlock basicBlock) {
        basicBlock.getHead.hasInstruction && basicBlock.getHead.trueInstruction instanceof PauseDepth
    } 
    
    def List<BasicBlock> getBasicBlockPredecessor(BasicBlock basicBlock) {
        val predecessors = new ArrayList<BasicBlock>;
        val predStmt = basicBlock.getHead.getPreviousInstructionStatementHierarchical
        if (predStmt == null || (predStmt.isConditional && basicBlock.headIsDepth)) {
            if (basicBlock.getHead.isPause && basicBlock.headIsDepth) {
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
        
        if (basicBlock.statements.last.isConditional) 
            successors.add((basicBlock.statements.last.getInstruction as Conditional).statements.head.getBasicBlockByAnyStatement)
        
        val nextStmt = basicBlock.statements.last.getNextInstructionStatementHierarchical(true)
        if (nextStmt != null) {
            successors.add(nextStmt.getBasicBlockByAnyStatement)
        } else if (basicBlock.statements.last.isPause && 
            (!basicBlock.headIsDepth || basicBlock.getHead != basicBlock.statements.last)
        ) {
            val pauseDepth = basicBlock.getHead.getBasicBlockByAnyStatementDepth
            successors.add(pauseDepth)             
        }
        
        successors
    }
    
    
}