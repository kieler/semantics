/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2013 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
 package de.cau.cs.kieler.scl.extensions

import com.google.common.collect.ImmutableList
import com.google.inject.Inject
import de.cau.cs.kieler.scl.basicblocks.BasicBlock
import de.cau.cs.kieler.scl.basicblocks.ParallelFork
import de.cau.cs.kieler.scl.basicblocks.ParallelForkImpl
import de.cau.cs.kieler.scl.basicblocks.ParallelJoin
import de.cau.cs.kieler.scl.basicblocks.ParallelJoinImpl
import de.cau.cs.kieler.scl.basicblocks.PauseDepth
import de.cau.cs.kieler.scl.basicblocks.PauseDepthImpl
import de.cau.cs.kieler.scl.basicblocks.PauseSurface
import de.cau.cs.kieler.scl.basicblocks.PauseSurfaceImpl
import de.cau.cs.kieler.scl.scl.Conditional
import de.cau.cs.kieler.scl.scl.Goto
import de.cau.cs.kieler.scl.scl.Parallel
import de.cau.cs.kieler.scl.scl.Pause
import de.cau.cs.kieler.scl.scl.Program
import de.cau.cs.kieler.scl.scl.Statement
import de.cau.cs.kieler.scl.scl.Thread
import java.util.ArrayList
import java.util.HashMap
import java.util.List
import org.yakindu.sct.model.stext.stext.Expression

import static de.cau.cs.kieler.scl.extensions.SCLBasicBlockExtensions.*

/**
 * The SCL basic block extension comprises all mandatory methods for creating, comparing and manipulating 
 * basic blocks. It also implement a cache mechanism to speed up the time consuming basic block calculations.
 * 
 * @author: ssm
 */

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
    
    // This switch decides whether or not basic blocks are separated at incoming dependency edges.
    public static val SPLIT_BLOCKS_AT_DEPENDENCY = true
    
    // Prefixes for basic block descriptions
    public static val BASICBLOCKPREFIX = 'g';
    public static val EMPTYBLOCKPREFIX = 'e';
    
    // Cache for whole SCL programs
    public var HashMap<Program, ArrayList<BasicBlock>> CachedPrograms
    
    // The cache map for SCL programs is initialized in the constructor.
    def SCLBasicExtensions() {
        CachedPrograms = new HashMap<Program, ArrayList<BasicBlock>>
    }
    
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
        
        var nextStatement = statement.nextStatement;
        
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

        // If the statement is a goto, we need a little more magic, find the target and retry the method.
        // Therefore, a goto jump belongs to another statement in the context of basic blocks since it is
        // not visible as node in the SCG.           
        if (instructionStatement.isGoto) { 
            if (instructionStatement.instruction.asGoto.getTargetStatement?.getInstructionStatement?.instruction == null) return bBox
            var statementHier = instructionStatement.previousStatementHierarchical
            if (statementHier == null) statementHier = instructionStatement.instruction.asGoto.getTargetStatement
            return getBasicBlockStatements(statementHier, false)
        }
        
        // Transform statement to EObject Statement in case it is a statement that holds
        // a surface or depth.
        var Statement transformedStatement = instructionStatement
        if (instructionStatement.hasInstruction) transformedStatement = (instructionStatement as Statement).getInstruction.eContainer as Statement
        
        // Retrieve statement sequence to work with...
        var ArrayList<Statement> sList = new ArrayList<Statement>
        var oIndex = sseq.statements.indexOf(transformedStatement)
        if (oIndex < 0) {
            if (sseq instanceof Conditional) {
                oIndex = (sseq as Conditional).elseStatements.indexOf(transformedStatement)
                if (oIndex < 0) {
                    return bBox
                }
                sList.addAll((sseq as Conditional).elseStatements)
            }
        } else { sList.addAll(sseq.statements) }
        
        // If the actual statement is not the beginning of a new block, search the beginning and
        // add all statements to the basic block list. 
        val stmt = sList.get(oIndex)
        if (!stmt.isBasicBlockFirst || 
            (stmt.isPause && !isDepth && oIndex>0) ||
            (stmt.isParallel && !isDepth && oIndex>0)) {
            val predStatements = new ArrayList<Statement>
            var predIndex = oIndex - 1
            while (predIndex >= 0) {
                val predStmt = sList.get(predIndex)
                if (stmt.isBasicBlockFirst && predStmt.isBasicBlockLast && (!predStmt.isPause) && (!predStmt.isParallel)) predIndex = -1
                else {
                    if (!predStmt.isEmpty && !predStmt.isGoto) predStatements.add(predStmt) 
                    if (!predStmt.isBasicBlockFirst) predIndex = predIndex - 1
                    else predIndex = -1
                }
            }
            bBox.addAll(predStatements.reverse)
        }
        
        // Add the statement to the block and return, if it's already the last statement of the block.
        bBox.add(stmt)
        var breakOnFirst = false;
        if (stmt.isBasicBlockLast) {
          if (!isDepth) { return bBox }  
          else { breakOnFirst = true }
        } 
        
        // Otherwise add the succeeding statements until a closing statement is found.
        var succIndex = oIndex + 1
        while (succIndex < sList.size) {
            val succStmt = sList.get(succIndex)
            if (breakOnFirst && succStmt.isBasicBlockFirst &&
                // if following statement is a new surface, include it 
                !succStmt.isPause && !succStmt.isParallel
            ) succIndex = sList.size
            else {
                if (!succStmt.isEmpty && !succStmt.isGoto) bBox.add(succStmt) 
                if (!succStmt.isBasicBlockLast) succIndex = succIndex + 1
                else succIndex = sList.size
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
    
    // Separates pause and parallel statements in two (surface and depth) statements. 
    def List<Statement> separateSurfaceAndDepth(List<Statement> statements, boolean isDepth) {
        val returnList = new ArrayList<Statement>
        if (statements.head.isPause && (statements.size>1 || (isDepth && statements.size == 1))) {
            val depth = SCL.createInstructionStatement
            depth.instruction = new PauseDepthImpl(statements.head.instruction as Pause)
            returnList.add(depth)
        }
        else if (statements.head.isParallel && (statements.size>1 || (isDepth && statements.size == 1))) {
            val depth = SCL.createInstructionStatement
            depth.instruction = new ParallelJoinImpl(statements.head.instruction as Parallel)
            returnList.add(depth)
        }
        
        
        for (statement : statements) {
            if (!statement.isPause && !statement.isParallel) returnList.add(statement)
        }
        
        if (statements.last.isPause && (statements.size>1 || (!isDepth && statements.size == 1))) {
            val surface = SCL.createInstructionStatement
            surface.instruction = new PauseSurfaceImpl(statements.last.instruction as Pause)
            returnList.add(surface)
        }
        else if (statements.last.isParallel && (statements.size>1 || (!isDepth && statements.size == 1))) {
            val surface = SCL.createInstructionStatement
            surface.instruction = new ParallelForkImpl(statements.last.instruction as Parallel)
            returnList.add(surface)
        }
        
        returnList
    }
    
    // Returns true, if the statement is a pause surface.
    def boolean isPauseSurface(Statement statement) {
        statement.hasInstruction && statement.trueInstruction instanceof PauseSurface
    }
    
    // Returns true, if the statement is a pause depth.
    def boolean isPauseDepth(Statement statement) {
        statement.hasInstruction && statement.trueInstruction instanceof PauseDepth
    }

    // Returns true, if the statement is a parallel fork.    
    def boolean isParallelFork(Statement statement) {
        statement.hasInstruction && statement.trueInstruction instanceof ParallelFork
    }
    
    // Returns true, if the statement is a parallel join.
    def boolean isParallelJoin(Statement statement) {
        statement.hasInstruction && statement.trueInstruction instanceof ParallelJoin
    }

    // Creates a new basic block instance.
    def BasicBlock createBasicBlock() {
        new BasicBlock()
    } 
    
    // Creates a new basic block identified by its head.
    def BasicBlock create basicBlock: createBasicBlock() getBasicBlockByHead(Statement basicBlockHead, boolean isDepth) {
        val statements = basicBlockHead.getBasicBlockStatements(isDepth).separateSurfaceAndDepth(isDepth)
        basicBlock.statements.addAll(statements)
    }
    
    // Creates a new basic block identified by any of its statements.
    def BasicBlock getBasicBlockByAnyStatement(Statement statement) {
        val statements = statement.getBasicBlockStatements
        if (statements.head == null) return null
        // if in depth and heads differ, search by new head
        if (statement.isPause && (statements.head.isPause || statements.head.isParallel) && statements.head.getInstruction != statement.getInstruction) 
            getBasicBlockByHead(statements.head, true)
        else
            getBasicBlockByHead(statements.head, false)
    }
    
    // Creates a new basic block and forces it to treat its head as depth, if the head is a split instruction.
    def BasicBlock getBasicBlockByAnyStatementDepth(Statement statement) {
        val statements = statement.getBasicBlockStatements(true)
        if (statements.head == null) return null
        if (statements.head.isConditional) {
            return getBasicBlockByHead(statements.head, false)
        } else {
            getBasicBlockByHead(statements.head, true)
        }
    }

    // Returns the hashcode id of the basic block
    // (Which is identical with the ID of the first statement.)    
    def String getBasicBlockID(BasicBlock basicBlock) {
        basicBlock.getHead.hashCode.toString
    }
    
    // Returns true, if a list of basic block already contains a basic block with an equal statement list.
    def containsEqual(List<BasicBlock> basicBlocks, BasicBlock basicBlock) {
        for(bb : basicBlocks) {
            if (bb.isEqual(basicBlock)) return true
        }
        return false
    }
    
    // Removes any equal basic blocks from a list of basic blocks.
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
    
    // Copies a list of basic blocks.
    def List<BasicBlock> copy(List<BasicBlock> basicBlocks) {
        val newList = new ArrayList<BasicBlock>
        for(bb : basicBlocks) {
            newList.add(bb)
        }
        newList
    }
     
     // Retrieves all basic blocks in a statement list context identified by a statement.
    def List<BasicBlock> getBasicBlocks(Statement statement) {
        getBasicBlocks(statement, true)
    } 
    
    def List<BasicBlock> getDirectBasicBlocks(Statement statement) {
        getBasicBlocks(statement, false)
    }
     
    def List<BasicBlock> getBasicBlocks(Statement statement, boolean hierarchical) {
        val basicBlocks = new ArrayList<BasicBlock>;
        val sseq = statement.getParentStatementSequence
        var c = 0
        for(stmt : sseq.statements) {
            for(bb : stmt._getBasicBlocksByStatement(hierarchical)) {
                if (!basicBlocks.containsEqual(bb)) basicBlocks.add(bb)
            }
            c = c + 1
        }
        if (sseq instanceof Conditional) {
            for(stmt : (sseq as Conditional).elseStatements) {
                for(bb : stmt._getBasicBlocksByStatement(hierarchical)) {
                    if (!basicBlocks.containsEqual(bb)) basicBlocks.add(bb)
                }
            }            
        }
        basicBlocks
    }

    // Recursive method to find all basic blocks in a statement context.
    // Used by get basic blocks.     
    def List<BasicBlock> _getBasicBlocksByStatement(Statement stmt, boolean hierarchical) {
        val basicBlocks = new ArrayList<BasicBlock>
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
            if (stmt.hasInstruction && stmt.getInstruction instanceof Conditional) {
                for (block : (stmt.getInstruction as Conditional).statements.head.getBasicBlocks) {
                    if (!basicBlocks.containsEqual(block)) basicBlocks.add(block)  
                } 
                if ((stmt.getInstruction as Conditional).elseStatements.size>0) { 
                    for (block : (stmt.getInstruction as Conditional).elseStatements.head.getBasicBlocks) {
                        if (!basicBlocks.containsEqual(block)) basicBlocks.add(block)  
                    } 
                }
            }
            if (stmt.hasInstruction && stmt.getInstruction instanceof Parallel && hierarchical)
                // ignore blocks that are already in the list 
                for (thread : (stmt.getInstruction as Parallel).threads) {
                    for (block : thread.statements.head.getBasicBlocks) {
                        if (!basicBlocks.containsEqual(block)) basicBlocks.add(block)  
                    }
                } 
        basicBlocks
    }

    // Retrieves all basic blocks of a program (identified by any of its statements).
    // The result is cached and used again if the blocks of the program in question are queried again.    
    def List<BasicBlock> getAllBasicBlocks(Statement statement) {
        val program = statement.getProgram
        
        if (CachedPrograms == null) {
            CachedPrograms = new HashMap<Program, ArrayList<BasicBlock>>
        }
        if (CachedPrograms.containsKey(program)) {
            val cache = CachedPrograms.get(program)
            if (cache.size>0) return cache
        }
        
        val basicBlocks = getBasicBlocks(program.statements.head);
        
        CachedPrograms.put(program, basicBlocks as ArrayList<BasicBlock>)
        val ArrayList<BasicBlock> hashmap = CachedPrograms.get(program)
        Debug(hashmap.toString);
        
        basicBlocks
    }
    
    // Retrieves the count of basic blocks of a program.
    def int getAllBasicBlocksCount(Statement statement) {
        getAllBasicBlocks(statement).size
    }
    
    // Returns the index of a basic block in a list of basic blocks.
    def int getBasicBlockIndex(BasicBlock basicBlock) {
        if (basicBlock.CachedIndex>-1) return basicBlock.CachedIndex;
        var c = 0
        val basicBlocks = basicBlock.getHead.getAllBasicBlocks
        for(block : basicBlocks) {
            if (basicBlock.isEqual(block)) {
                basicBlock.CachedIndex = c 
                return c
            }        
            c = c + 1
        }
        c = -1
    }
    
    // Returns the name of a basic block.
    def String getBasicBlockName(BasicBlock basicBlock) {
        var String name = "";
        if (!basicBlock.CachedName.nullOrEmpty) {
            name = basicBlock.CachedName
        } else {
            name = BASICBLOCKPREFIX + basicBlock.getBasicBlockIndex.toString
            basicBlock.CachedName = name
        }
        
        name
    }

    // Returns the name of a basic block that is used as empty mark in the synchronizer join context.
    def String getEmptyBlockName(BasicBlock basicBlock) {
        var String name = ""
        if (!basicBlock.CachedEmptyName.nullOrEmpty) {
            name = basicBlock.CachedEmptyName
        } else {
            name = EMPTYBLOCKPREFIX + basicBlock.getBasicBlockIndex.toString
            basicBlock.CachedEmptyName = name
        }
        
        name
    }
    
    // Returns the name of the basic block w.r.t. to its role.
    def String getBasicBlockName(BasicBlock basicBlock, boolean emptyBlock) {
        if (emptyBlock) return basicBlock.getEmptyBlockName
        else return basicBlock.getBasicBlockName
    }
    
    // Returns true, if the head of a basic block is the depth of a pause.
    def boolean headIsDepth(BasicBlock basicBlock) {
        basicBlock.getHead.hasInstruction && basicBlock.getHead.trueInstruction instanceof PauseDepth
    } 
    
    // Returns a list of basic blocks that pose as predecessors to a given basic block.
    def List<BasicBlock> getBasicBlockPredecessor(BasicBlock basicBlock) {
        val predecessors = new ArrayList<BasicBlock>;
        if (!basicBlock.CachedPredecessors.nullOrEmpty) {
            predecessors.addAll(basicBlock.CachedPredecessors)
            return predecessors;
        }

        if (basicBlock.statements.head.isParallelJoin) {
            for(thread : basicBlock.statements.head.getInstruction.asParallel.threads) {
                var predBlock = thread.statements.head.getBasicBlockByAnyStatement;
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
        
            if (predStmtDirect.isConditional && predStmt.equals(predStmtDirect)) {
                val trueBlock = predStmt.getInstruction.asConditional.statements.last.basicBlockByAnyStatementDepth
                if (trueBlock!=null && !predecessors.containsEqual(trueBlock)) predecessors.add(trueBlock)
            }
        }
        
        if (!basicBlock.getHead.isPause || !basicBlock.headIsDepth)
        for (goto : basicBlock.getHead.asInstructionStatement.getIncomingGotos) {
            val sourceBlock = (goto.eContainer as Statement).getBasicBlockByAnyStatementDepth
            predecessors.add(sourceBlock)
        }

        basicBlock.CachedPredecessors.addAll(predecessors)         
        predecessors
    }
    
    // Returns true, if the last instruction of a basic block is a pause surface.
    def boolean isPauseSurface(BasicBlock basicBlock) {
        if (basicBlock.statements.last.trueInstruction instanceof PauseSurface) return true
        return false
    }
    
    // Returns true, if the last instruction of a basic block is a conditional.
    def boolean isConditionalPredecessor(BasicBlock basicBlock, BasicBlock predecessor) {
        if (predecessor.statements.last.isConditional) return true;
        return false
    }
    
    // Returns true, if a basic block resides in the true branch of a conditional predecessor.
    def boolean isConditionalPredecessorTrueBranch(BasicBlock basicBlock, BasicBlock predecessor) {
        if (predecessor.statements.last.isConditional) {
            if (predecessor.statements.last.getInstruction.asConditional.statements.head.getBasicBlockByHead(false).isEqual(basicBlock))
                return true
            else
            if (predecessor.statements.last.getInstruction.asConditional.statements.head.isGoto) {
                val tStmt = predecessor.statements.last.getInstruction.asConditional.statements.head.getInstruction.asGoto.getTargetStatement
                if (tStmt.getBasicBlockByHead(false).isEqual(basicBlock)) return true            
           }
        }
        
        return false
    }
    
    // Returns the expression of a conditional predecessor.
    def Expression getConditionalExpression(BasicBlock basicBlock) {
        if (basicBlock.statements.last.isConditional) {
            return basicBlock.statements.last.getInstruction.asConditional.expression
        }
        return null
    }
    
    // Returns true, if the basic block starts with a parallel join.
    def boolean isParallelJoin(BasicBlock basicBlock) {
        if (basicBlock.statements.head.trueInstruction instanceof ParallelJoin) return true
        return false
    }
   
    // Returns true, if the basic block closes with a parallel fork.
    def boolean isParallelFork(BasicBlock basicBlock) {
        if (basicBlock.statements.last.trueInstruction instanceof ParallelFork) return true
        return false
    }

    // Returns a list of basic blocks that are dependency predecessors to a given basic block.
    def List<BasicBlock> getBasicBlockDependencyPredecessors(BasicBlock basicBlock) {
        val predecessors = new ArrayList<BasicBlock>;
        if (!basicBlock.CachedDependencyPredecessors.nullOrEmpty) {
            predecessors.addAll(basicBlock.CachedDependencyPredecessors)
            return predecessors;
        }
        
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
              
        basicBlock.CachedDependencyPredecessors.addAll(predecessors)
        predecessors
    }
    
    // Retrieves a list of basic block successors.
    def List<BasicBlock> getBasicBlockSuccessor(BasicBlock basicBlock) {
        val successors = new ArrayList<BasicBlock>;
        if (!basicBlock.CachedSuccessors.nullOrEmpty) {
            successors.addAll(basicBlock.CachedSuccessors)
            return successors;
        }        
        
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

        basicBlock.CachedSuccessors.addAll(successors)        
        successors
    }
    
    // Returns true, if a basic block is the last block in a thread (and hence, is followed by an exit node).
    def boolean isExitBlock(BasicBlock basicBlock) {
        val succ = basicBlock.basicBlockSuccessor 
        if (succ.size == 0) return true
        if (succ.size == 1 && basicBlock.getHead.isConditional) return true
        return false
    }
    
    // Returns true, if a basic block is an exit block and basic block's last statement is a conditional.
    def boolean isConditionalExitBlock(BasicBlock basicBlock) {
//        if (basicBlock.isExitBlock && basicBlock.statements.last.isConditional) return true
        if (basicBlock.statements.last.isConditional) return true
        return false
    }
    
    // Returns true, if the exit node of an conditional exit block is connected to the true branch of the 
    // given conditional.
    def boolean isConditionalExitBlockTrue(BasicBlock basicBlock) {
        if (basicBlock == null) return false;
        val lastStatement = basicBlock.statements.last.getInstruction.asConditional.statements.last;
        if (lastStatement.isConditional) { return isConditionalExitBlockTrue(lastStatement.getBasicBlockByAnyStatementDepth) }
        if (lastStatement.isGoto && !lastStatement.getInstruction.asGoto.getTargetStatement.endOfSequence) {return true} 
        return false
    }
    
    // Remove all surface basic block from a thread (identified by its basic blocks).
    def List<BasicBlock> stripSurface(List<BasicBlock> basicBlocks) {
        val newBlockList = new ArrayList<BasicBlock>;
        var cfpassed = false
        var foundNestedSurface = false;
        var foundSurface = false; 
        
        for(bb : basicBlocks) {
            if (bb.isParallelJoin) {
                if (bb.getHead.getInstruction.eAllContents.toIterable.filter(typeof(Pause)).size>0) {
                    foundNestedSurface = true
                }
            }
            if (bb.statements.last.isConditional ||
                bb.statements.last.isParallel ||
                bb.statements.last.isGoto 
            ) {
                cfpassed = true
            } 
            if (bb.isPauseSurface && !cfpassed) {
                foundSurface = true
            }
        }
        if (!foundSurface && !foundNestedSurface) {
            newBlockList.addAll(basicBlocks)
            return newBlockList
        }
        
        if (foundNestedSurface) {
            newBlockList.addAll(basicBlocks)
            for(bb : basicBlocks) {
                if (bb.isParallelJoin) {
                    val predecessors = bb.getBasicBlockPredecessor
                    for (preds : predecessors) { 
                        val guards = preds.getHead.basicBlocks
                        for (nested : guards) {
                            newBlockList.removeEqual(nested)
                        }
                    }
                }
                if (bb.isParallelFork) {
                    newBlockList.removeEqual(bb);
                }
            }
            return newBlockList                
        }
            
        var skip = true
        for(bb : basicBlocks) {
            if (skip==true) {
                if (!foundNestedSurface && bb.isPauseSurface) {
                    skip = false
                }
                if (foundNestedSurface && bb.isParallelJoin) {
                    skip = false
                }
            } else {
                newBlockList.add(bb)
            }
        }
        
        newBlockList
    }
    
    // Only retrieve the surfaces of a thread (identified by its basic blocks).
    def List<BasicBlock> getSurfaces(List<BasicBlock> basicBlocks) {
        val newBlockList = new ArrayList<BasicBlock>;
        
        for(bb : basicBlocks) {
            if (bb.isPauseSurface) {
                newBlockList.add(bb)
            }
        }
        
        newBlockList
    }    
    
    // Returns true, if a program is ASC schedulable.
    def boolean isASCSchedulable(Program program) {
        program.ASCPool.size == 0
    }
    
    // Returns a list of blocks that remained in the basic block pool after the ASC algorithm completed.    
    def List<BasicBlock> ASCPool(Program program) {
        var changed = false
        var basicBlockPool = program.statements.head.getAllBasicBlocks 
        while(basicBlockPool.size>0) {
            Debug("---")
            var String poolStr = "";
            for (bb : basicBlockPool) {
                poolStr = poolStr + bb.basicBlockName + " "
            }
            Debug("Blocks in pool: " + poolStr)
            changed = false
            val tempPool = ImmutableList::copyOf(basicBlockPool)
            for(basicBlock : tempPool) {
                var predecessors = basicBlock.getBasicBlockPredecessor
                var depPredecessors = basicBlock.getBasicBlockDependencyPredecessors 
                var ready = true
                
                for (pred : predecessors) {
                    if (!pred.isPauseSurface && basicBlockPool.containsEqual(pred) && !basicBlock.isParallelJoin) {ready = false}
                    if (basicBlock.isParallelJoin) {
                        val guards = pred.getHead.basicBlocks.getSurfaces
                        for (guard : guards) {
                            if (basicBlockPool.containsEqual(guard)) { 
                                ready = false;
                                Debug("Join: " + basicBlock.basicBlockName + " guard " + guard.basicBlockName + " failed!")
                            }
                        }
                    }     
                }
                for (pred : depPredecessors) {
                    if (!pred.head.isPauseSurface && basicBlockPool.containsEqual(pred)) {ready = false}     
                } 
                                
                if (ready) {
                    basicBlockPool.removeEqual(basicBlock)
                    changed = true
                }    
            }        
            if (!changed) {
                Debug("SCL ERROR: Program not schedulable!")
                for(pool : basicBlockPool) {
                    Debug("  not scheduled item: " + pool.basicBlockName)
                }
                return basicBlockPool
            }
        }
                
        Debug("No blocks left in pool: Program seems to be schedulable!");
        basicBlockPool
    }
   
}