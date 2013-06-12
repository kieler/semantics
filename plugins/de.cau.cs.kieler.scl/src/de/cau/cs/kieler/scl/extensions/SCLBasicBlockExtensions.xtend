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
import de.cau.cs.kieler.scl.basicblocks.ParallelFork
import de.cau.cs.kieler.scl.basicblocks.ParallelJoin
import de.cau.cs.kieler.scl.basicblocks.ParallelForkImpl
import de.cau.cs.kieler.scl.scl.Parallel
import de.cau.cs.kieler.scl.basicblocks.ParallelJoinImpl
import org.yakindu.sct.model.stext.stext.Expression
import de.cau.cs.kieler.scl.scl.Thread

class SCLBasicBlockExtensions {
    
    @Inject
    extension SCLFactoryExtensions
    @Inject
    extension SCLGotoExtensions
    @Inject
    extension SCLStatementExtensions
    @Inject
    extension SCLStatementSequenceExtensions
    @Inject
    extension SCLDependencyExtensions
    
    public static val SPLIT_BLOCKS_AT_DEPENDENCY = true
    
    public static val BASICBLOCKPREFIX = 'g';
    
    // Decides whether or not a statement is the beginning of a new basic block.
    def boolean isBasicBlockFirst(Statement statement) {
        if (statement.isEmpty) return false
        
        val sseq = statement.getParentStatementSequence
        val prevStatement = statement.previousStatementHierarchical
        
        if (statement.isParallel) return true
        if (statement.isGoto) return false
        if (statement.isPause) return true
        if (sseq.statements.indexOf(statement) == 0) return true
        if (prevStatement.isConditional) return true
        if (prevStatement.isGoto) return true 
        if (SPLIT_BLOCKS_AT_DEPENDENCY) {
            if ((prevStatement.isAssignment || prevStatement.isConditional) && prevStatement.getInstruction.hasConcurrentTargetDependencies) return true;
            if ((statement.isAssignment || statement.isConditional) && statement.getInstruction.hasConcurrentTargetDependencies) return true;
        }

        if (statement.asInstructionStatement.getIncomingGotos.size==0) return false
        
        return true
    }
    
    // Decides whether or not a statement is the end of a basic block. 
    def boolean isBasicBlockLast(Statement statement) {
        if (statement.isEmpty) return false
        if (statement.isParallel) return true
        if (statement.isConditional) return true
        if (statement.isPause) return true
        
        var nextStatement = statement.nextStatement
        
        if (SPLIT_BLOCKS_AT_DEPENDENCY) {
            if ((statement.isAssignment || statement.isConditional) && statement.getInstruction.hasConcurrentTargetDependencies) return true;
            if ((nextStatement.isAssignment || nextStatement.isConditional) && nextStatement.getInstruction.hasConcurrentTargetDependencies) return true;
        }
        
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
        val instructionStatement = statement.instructionStatement
        val bBox = new ArrayList<Statement>
        if (instructionStatement == null) return bBox
        val sseq = instructionStatement.getParentStatementSequence
        
        if (instructionStatement.isGoto) { 
            if (instructionStatement.instruction.asGoto.getTargetStatement?.getInstructionStatement?.instruction == null) return bBox
            var statementHier = instructionStatement.previousStatementHierarchical
            if (statementHier == null) statementHier = instructionStatement.instruction.asGoto.getTargetStatement
            return getBasicBlockStatements(statementHier, isDepth)
        }
        
        // Transform statement to EObject Statement in case it is a statement that holds
        // a surface or depth.
        var Statement transformedStatement = instructionStatement
        if (instructionStatement.hasInstruction) transformedStatement = (instructionStatement as Statement).getInstruction.eContainer as Statement
        
        val oIndex = sseq.statements.indexOf(transformedStatement)
        if (oIndex < 0) return bBox
        val stmt = sseq.statements.get(oIndex)
        if (!stmt.isBasicBlockFirst || 
            (stmt.isPause && !isDepth && oIndex>0) ||
            (stmt.isParallel && !isDepth && oIndex>0)) {
            val predStatements = new ArrayList<Statement>
            var predIndex = oIndex - 1
            while (predIndex >= 0) {
                val predStmt = sseq.statements.get(predIndex)
                if (stmt.isBasicBlockFirst && predStmt.isBasicBlockLast && (!predStmt.isPause) && (!predStmt.isParallel)) predIndex = -1
                else {
                    if (!predStmt.isEmpty && !predStmt.isGoto) predStatements.add(predStmt) 
                    if (!predStmt.isBasicBlockFirst) predIndex = predIndex - 1
                    else predIndex = -1
                }
            }
            bBox.addAll(predStatements.reverse)
        }
        bBox.add(stmt)
        var breakOnFirst = false;
        if (stmt.isBasicBlockLast) {
          if (!isDepth) { return bBox }  
          else { breakOnFirst = true }
        } 
        var succIndex = oIndex + 1
        while (succIndex < sseq.statements.size) {
            val succStmt = sseq.statements.get(succIndex)
            if (breakOnFirst && succStmt.isBasicBlockFirst) succIndex = sseq.statements.size
            else {
            if (!succStmt.isEmpty && !succStmt.isGoto) bBox.add(succStmt) 
            if (!succStmt.isBasicBlockLast) succIndex = succIndex + 1
            else succIndex = sseq.statements.size
            }                    
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
        else if (statements.head.isParallel && (statements.size>1 || isDepth)) {
            val depth = SCL.createInstructionStatement
            depth.instruction = new ParallelJoinImpl(statements.head.instruction as Parallel)
            returnList.add(depth)
        }
        
        
        for (statement : statements) {
            if (!statement.isPause && !statement.isParallel) returnList.add(statement)
        }
        
        if (statements.last.isPause && (statements.size>1 || !isDepth)) {
            val surface = SCL.createInstructionStatement
            surface.instruction = new PauseSurfaceImpl(statements.last.instruction as Pause)
            returnList.add(surface)
        }
        if (statements.last.isParallel && (statements.size>1 || !isDepth)) {
            val surface = SCL.createInstructionStatement
            surface.instruction = new ParallelForkImpl(statements.last.instruction as Parallel)
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
    
//    def Instruction getPauseReference(Statement statement) {
//        if (statement.isPauseSurface) return (statement.instruction as PauseSurfaceImpl).PauseReference
//        if (statement.isPauseDepth) return (statement.instruction as PauseDepthImpl).PauseReference
//        return null
//    }

    def boolean isParallelFork(Statement statement) {
        statement.hasInstruction && statement.trueInstruction instanceof ParallelFork
    }
    
    def boolean isParallelJoin(Statement statement) {
        statement.hasInstruction && statement.trueInstruction instanceof ParallelJoin
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
        if (statements.head == null) return null
        if (statement.isPause && statements.head.isPause && statements.head.getInstruction != statement.getInstruction) 
            getBasicBlockByHead(statements.head, true)
        else
            getBasicBlockByHead(statements.head, false)
    }
    
    def BasicBlock getBasicBlockByAnyStatementDepth(Statement statement) {
        val statements = statement.getBasicBlockStatements(true)
        if (statements.head == null) return null
        getBasicBlockByHead(statements.head, true)
    }

    // Returns the hashcode id of the basic block
    // (Which is identical with the ID of the first statement.)    
    def String getBasicBlockID(BasicBlock basicBlock) {
        basicBlock.getHead.hashCode.toString
    }
    
    def containsEqual(List<BasicBlock> basicBlocks, BasicBlock basicBlock) {
        for(bb : basicBlocks) {
            if (bb.isEqual(basicBlock)) return true
        }
        return false
    }
    
    def removeEqual(List<BasicBlock> basicBlocks, BasicBlock basicBlock) {
        var i = 0
        while (i<basicBlocks.size) {
            val bb = basicBlocks.get(i)
            if (bb.isEqual(basicBlock)) {
                basicBlocks.remove(bb)
            } else {
                i = i + 1
            }
        }
    }
    
    def List<BasicBlock> getBasicBlocks(Statement statement) {
        val basicBlocks = new ArrayList<BasicBlock>;
        val sseq = statement.getParentStatementSequence
        for(stmt : sseq.statements) {
            val stmtBlock = stmt.getBasicBlockByAnyStatement
            if (stmtBlock != null && !basicBlocks.containsEqual(stmtBlock)) basicBlocks.add(stmtBlock)
            if (stmt.isPause) {
                val stmtBlockDepth = stmt.getBasicBlockByAnyStatementDepth
                if (stmtBlockDepth != null && !basicBlocks.containsEqual(stmtBlockDepth)) basicBlocks.add(stmtBlockDepth)
            }
            if (stmt.isParallel) {
                val stmtBlockDepth = stmt.getBasicBlockByAnyStatementDepth
                if (stmtBlockDepth != null && !basicBlocks.containsEqual(stmtBlockDepth)) basicBlocks.add(stmtBlockDepth)
            }
            if (stmt.hasInstruction && stmt.getInstruction instanceof Conditional)
                // ignore blocks that are already in the list 
//                basicBlocks.addAll((stmt.getInstruction as Conditional).statements.head.getBasicBlocks)
                for (block : (stmt.getInstruction as Conditional).statements.head.getBasicBlocks) {
                    if (!basicBlocks.containsEqual(block)) basicBlocks.add(block)  
                } 
            if (stmt.hasInstruction && stmt.getInstruction instanceof Parallel)
                // ignore blocks that are already in the list 
                for (thread : (stmt.getInstruction as Parallel).threads) {
                    for (block : thread.statements.head.getBasicBlocks) {
                        if (!basicBlocks.containsEqual(block)) basicBlocks.add(block)  
                    }
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
    
    def String getBasicBlockName(BasicBlock basicBlock) {
        BASICBLOCKPREFIX + basicBlock.getBasicBlockIndex.toString
    }
    
    def boolean headIsDepth(BasicBlock basicBlock) {
        basicBlock.getHead.hasInstruction && basicBlock.getHead.trueInstruction instanceof PauseDepth
    } 
    
    def List<BasicBlock> getBasicBlockPredecessor(BasicBlock basicBlock) {
        val predecessors = new ArrayList<BasicBlock>;

        if (basicBlock.statements.head.isParallelJoin) {
            for(thread : basicBlock.statements.head.getInstruction.asParallel.threads) {
                var predBlock = thread.statements.head.getBasicBlockByAnyStatement
                predecessors.add(predBlock)
            }
            return predecessors
        }

        var onlyNull = false
        if (basicBlock.getHead.isPause && basicBlock.headIsDepth) {
            val pauseSurface = basicBlock.getHead.getBasicBlockByAnyStatement
            predecessors.add(pauseSurface)
//            onlyNull = true
        } else {
       
            val predStmt = basicBlock.getHead.getPreviousInstructionStatementHierarchical
            val predStmtDirect = basicBlock.getHead.previousInstructionStatement
            if (!onlyNull && predStmt != null && predStmt.isConditional && predStmtDirect == null) {
                val cond = predStmt.getBasicBlockByAnyStatement;
                predecessors.add(cond)
            } else {
                if (!onlyNull && predStmt != null && !(predStmt.getInstruction instanceof Goto)) {
                    val sourceBlock = predStmt.getBasicBlockByAnyStatement
                    if (!sourceBlock.statements.contains(predStmt)) {
                        val sourceBlockDepth = predStmt.basicBlockByAnyStatementDepth
                        predecessors.add(sourceBlockDepth)    
                    } else {
                        predecessors.add(sourceBlock)
                    }
                } else {
                    if (predStmt == null && basicBlock.getHead.getInstruction.eContainer.eContainer instanceof Thread) {
                        val parBlock = (basicBlock.getHead.getInstruction.eContainer.eContainer.eContainer.eContainer as Statement).getBasicBlockByAnyStatement;
                        predecessors.add(parBlock)
                    }
                }
            }
        
        }
        
        if (!basicBlock.getHead.isPause || !basicBlock.headIsDepth)
        for (goto : basicBlock.getHead.asInstructionStatement.getIncomingGotos) {
            val sourceBlock = (goto.eContainer as Statement).getBasicBlockByAnyStatementDepth
            predecessors.add(sourceBlock)
        }
         
        predecessors
    }
    
    def boolean isPauseSurface(BasicBlock basicBlock) {
        if (basicBlock.statements.last.isPause) return true
        return false
    }
    
    def boolean isConditionalPredecessor(BasicBlock basicBlock, BasicBlock predecessor) {
        if (predecessor.statements.last.isConditional) {
            if (predecessor.statements.last.getInstruction.asConditional.statements.head.getBasicBlockByHead(false).isEqual(basicBlock))
                return true
        }
        
        return false
    }
    
    def Expression getConditionalExpression(BasicBlock basicBlock) {
        if (basicBlock.statements.last.isConditional) {
            return basicBlock.statements.last.getInstruction.asConditional.expression
        }
        return null
    }
    
    def boolean isParallelJoin(BasicBlock basicBlock) {
        if (basicBlock.statements.head.trueInstruction instanceof ParallelJoin) return true
        return false
    }
    
    def List<BasicBlock> getBasicBlockDependencyPredecessors(BasicBlock basicBlock) {
        val predecessors = new ArrayList<BasicBlock>;
        
        if (!SPLIT_BLOCKS_AT_DEPENDENCY) return predecessors
        if (!basicBlock.getHead.getInstruction.hasConcurrentDependencies) return predecessors;
        
        val bbInstruction = basicBlock.getHead().getInstruction
        val depList = bbInstruction.dependencyInstructions(bbInstruction.getProgram)
        for (targetStatement : depList) {
            if (!bbInstruction.isInSameThreadAs(targetStatement.getInstruction) && !bbInstruction.isInMainThread &&
                    !targetStatement.isInMainThread && bbInstruction.isDependencyTarget(targetStatement.getInstruction)
                ) {        
                    val sourceBlock = targetStatement.getBasicBlockByAnyStatement
                    if (!predecessors.containsEqual(sourceBlock)) predecessors.add(sourceBlock)
                }
        }         
              
        predecessors
    }
    
    
    def List<BasicBlock> getBasicBlockSuccessor(BasicBlock basicBlock) {
        val successors = new ArrayList<BasicBlock>;
        
        if (basicBlock.statements.last.isParallelFork) {
            for(thread : basicBlock.statements.last.getInstruction.asParallel.threads) {
                var succBlock = thread.statements.head.getBasicBlockByAnyStatement
                successors.add(succBlock)
            }
            return successors;
        }
        
        if (basicBlock.statements.last.isConditional) {
            val condHead = (basicBlock.statements.last.getInstruction as Conditional).statements.head
            if (condHead.isGoto) {
                val targetStatement = condHead.getInstruction.asGoto.getTargetStatement?.getInstructionStatement;
                if (targetStatement != null) {
                    val targetBlock = targetStatement.getBasicBlockByAnyStatement
                    if (targetBlock != null) successors.add(targetBlock)
                }
            } else {
                val targetBlock = condHead.getBasicBlockByAnyStatement
                if (targetBlock != null) successors.add(targetBlock)
            }
        }
        
        if (basicBlock.statements.last.isPause && 
            (!basicBlock.headIsDepth || basicBlock.getHead != basicBlock.statements.last)
        ) {
            val pauseDepth = basicBlock.statements.last.getBasicBlockByAnyStatementDepth
            successors.add(pauseDepth)
            return successors             
        }
        
        val nextStmt = basicBlock.statements.last.getNextInstructionStatementHierarchical(true)
        if (nextStmt != null) {
            successors.add(nextStmt.getBasicBlockByAnyStatement)
        } 
        
        successors
    }
    
    
}