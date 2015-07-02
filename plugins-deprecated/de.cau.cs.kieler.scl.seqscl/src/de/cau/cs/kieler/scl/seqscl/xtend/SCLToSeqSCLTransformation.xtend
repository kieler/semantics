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
package de.cau.cs.kieler.scl.seqscl.xtend

import com.google.common.collect.ImmutableList
import com.google.inject.Guice
import de.cau.cs.kieler.scl.basicblocks.BasicBlock
import de.cau.cs.kieler.scl.extensions.SCLBasicBlockExtensions
import de.cau.cs.kieler.scl.extensions.SCLCreateExtensions
import de.cau.cs.kieler.scl.extensions.SCLExpressionExtensions
import de.cau.cs.kieler.scl.extensions.SCLFactoryExtensions
import de.cau.cs.kieler.scl.extensions.SCLStatementExtensions
import de.cau.cs.kieler.scl.scl.Assignment
import de.cau.cs.kieler.scl.scl.Program
import de.cau.cs.kieler.scl.scl.Statement
import de.cau.cs.kieler.scl.scl.VariableDefinition
import java.util.List
import org.yakindu.sct.model.stext.stext.AssignmentExpression
import org.yakindu.sct.model.stext.stext.ElementReferenceExpression
import org.yakindu.sct.model.stext.stext.Expression
import org.yakindu.sct.model.stext.stext.LogicalAndExpression
import org.yakindu.sct.model.stext.stext.LogicalOrExpression

import static de.cau.cs.kieler.scl.seqscl.xtend.SCLToSeqSCLTransformation.*

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*

/**
 * Manages the transformation from SCL to sequential SCL.
 * At first it is checked which basic blocks can be placed because their predecessors are already processed.
 * Secondly, the block itself is processed and removed from the list of to-be-processed blocks.
 * If all blocks can be ordered, the program is acyclic and therefore schedulable.
 * 
 * @author: ssm
 */

class SCLToSeqSCLTransformation {

    extension de.cau.cs.kieler.scl.extensions.SCLFactoryExtensions SCLFactoryExtensions = 
         Guice::createInjector().getInstance(typeof(SCLFactoryExtensions))
    extension de.cau.cs.kieler.scl.extensions.SCLCreateExtensions SCLCreateExtensions = 
         Guice::createInjector().getInstance(typeof(SCLCreateExtensions))
    extension de.cau.cs.kieler.scl.extensions.SCLBasicBlockExtensions SCLBasicBlockExtensions = 
         Guice::createInjector().getInstance(typeof(SCLBasicBlockExtensions))
    extension de.cau.cs.kieler.scl.extensions.SCLExpressionExtensions SCLExpressionExtensions = 
         Guice::createInjector().getInstance(typeof(SCLExpressionExtensions))
    extension de.cau.cs.kieler.scl.extensions.SCLStatementExtensions SCLStatementExtensions = 
         Guice::createInjector().getInstance(typeof(SCLStatementExtensions))
    
    // Name of the reset (or go) signal.
    static val String RESETSIGNAL = 'RESET';
    // Name of the module suffix which will be appended to the original name
    static val String PROGRAMSUFFIX = "_tick";
    
    def Program transformSCLToSCLControlflow(Program program) {
        val targetProgram = SCL.createProgram()
        
        // Create the new program.
        // As it is also an SCL program, we can copy all definitions and append additional ones.
        targetProgram.setName(program.getName + PROGRAMSUFFIX)
        targetProgram.definitions.addAll(program.definitions.copyAll)
        targetProgram.definitions.add(createVariableDefinition(RESETSIGNAL, 'boolean'))
        
        // Retrieve all basic blocks (they are now cached!)
        // and create guards for all blocks.
        var List<BasicBlock> basicBlocks = program.statements.head.getAllBasicBlocks

        for(basicBlock : basicBlocks) {
            targetProgram.definitions.add(createVariableDefinition(basicBlock.basicBlockName, 'boolean'))
            if (basicBlock.isPauseSurface)
                targetProgram.definitions.add(createVariableDefinition(basicBlock.basicBlockName + '_pre', 'boolean'))
            if (basicBlock.isParallelJoin) {
                for (pred : basicBlock.getBasicBlockPredecessor) {
                    targetProgram.definitions.add(createVariableDefinition(pred.emptyBlockName, 'boolean'))
                }
            }
        }

        // Perform the ASC analysis and place all blocks that can be placed.
        // TODO: remove code duplication (ASC analysis is partly included in the basic block extension)
        var changed = false
        var basicBlockPool = basicBlocks.copy
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
                        val guards = pred.getHead.directBasicBlocks.getSurfaces
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
                    targetProgram.statements.addAll(targetProgram.transformBasicBlock(program, basicBlock));
                    basicBlockPool.removeEqual(basicBlock)
                    changed = true
                }    
            }        
            if (!changed) {
                Debug("SCL ERROR: Program not schedulable!")
                for(pool : basicBlockPool) {
                    Debug("  not scheduled item: " + pool.basicBlockName)
                }
                return targetProgram
            }
        }


        
        for(basicBlock : basicBlocks) {
            if (basicBlock.isPauseSurface) {
                targetProgram.statements.add(
                    createSCLAssignment(
                        targetProgram.getDefinitionByName(basicBlock.basicBlockName + '_pre'),
                        targetProgram.getDefinitionByName(basicBlock.basicBlockName)
                    ).createStatement
                )
            }
        }
        
        Debug("No blocks left in pool: Program seems to be schedulable!");
        targetProgram
    }
    
    // Transform basic block is called by the main analysis. It is called when all prerequisites for a
    // block are met and it is eligible to be processed. 
    // The method differs if a block is a join or not and proceeds according to its type.
    def List<Statement> transformBasicBlock(Program program, Program sourceProgram, BasicBlock basicBlock) {
        var newStatements = createNewStatementList
        val predecessors = basicBlock.getBasicBlockPredecessor
 
        // If the block is a parallel join block, a synchronizer has to be built.
        if (basicBlock.isParallelJoin) {
            var unreachableJoin = false
            var Expression syncExp = null 
            var Expression termExp = null
            for(pred : predecessors) {
                var Expression handleExp = null;
                val emptyExp = SText.createLogicalNotExpression;
                val _parExp  = SText.createParenthesizedExpression
                var Expression innerExp = null 
                val guards = pred.getHead.directBasicBlocks;
                val surfaceGuards = guards.getSurfaces
                val predID = surfaceGuards.head.basicBlockName;
                innerExp = SText.createElementReferenceExpression as Expression
                (innerExp as ElementReferenceExpression).setReference(program.getDefinitionByName(predID))
                if (surfaceGuards.size>1) {
                    for(Integer i: 1..(surfaceGuards.size - 1)) {
                        var predIDi = surfaceGuards.get(i).basicBlockName
                        val exp2 = createElementReferenceExpression(program.getDefinitionByName(predIDi))
                        innerExp = createOrExpression(innerExp, exp2)
                    } 
                }
                _parExp.setExpression(innerExp);
                emptyExp.setOperand(_parExp)
                
                for (guard : guards) {
                    if (guard.isExitBlock) {
                        var Expression exitExp = createElementReferenceExpression(program.getDefinitionByName(guard.basicBlockName))
                        if (guard.isConditionalExitBlock && !guard.isConditionalExitBlockTrue) {
                            exitExp = exitExp.addAndExpression(guard.getConditionalExpression.copy.transformExpression(program, sourceProgram)).addParanthesizedExpression    
                        } 
                        termExp = termExp.addOrExpression(exitExp)
                        handleExp = handleExp.addOrExpression(exitExp.copy)
                    }
                }
                
                val emptyAssignment = createSCLAssignment(
                    createAssignmentExpression(program.getDefinitionByNameAsElemRef(pred.emptyBlockName),
                        emptyExp),
                    program.getDefinitionByName(pred.emptyBlockName)              
                ).createStatement;
                newStatements.add(emptyAssignment)
                
                handleExp = handleExp.addOrExpression(createElementReferenceExpression(program.getDefinitionByName(pred.emptyBlockName)))
                if (handleExp != null) 
                    syncExp = syncExp.addAndExpression(createParanthesizedExpression(handleExp))
            }        
            if (termExp != null) {
                syncExp = syncExp.addAndExpression(createParanthesizedExpression(termExp))
            } else {
                unreachableJoin = true
            }

            val guardAssignment = createSCLAssignment(
                createAssignmentExpression(program.getDefinitionByNameAsElemRef(basicBlock.basicBlockName),
                    syncExp),
                program.getDefinitionByName(basicBlock.basicBlockName)              
            ).createStatement;
            newStatements.add(guardAssignment)
            
        }
        // if the block is not a join, continue here...
        else 
        {
 
        var Expression guardExpression = null        
         if (predecessors.size==0) {
            val expression = SText.createElementReferenceExpression
            expression.setReference(program.getDefinitionByName(RESETSIGNAL))
            guardExpression = expression
        } else if (predecessors.size==1) {
            var predID = predecessors.head.getBasicBlockName
            if (predecessors.head.isPauseSurface) predID = predID + '_pre'
            val expression = SText.createElementReferenceExpression
            expression.setReference(program.getDefinitionByName(predID))
            if (basicBlock.isConditionalPredecessor(predecessors.head)) {
                var andExp = predecessors.head.getConditionalExpression.copy;
                if (!basicBlock.isConditionalPredecessorTrueBranch(predecessors.head)) {
                    andExp = andExp.negate
                }
                andExp = andExp.transformExpression(program, sourceProgram);
                guardExpression = createAndExpression(expression, andExp);                
            } else {
                guardExpression = expression
            }
        } else if (predecessors.size>1) {
            var predID = predecessors.head.getBasicBlockName
            if (predecessors.head.isPauseSurface) predID = predID + '_pre'
            var expression = SText.createElementReferenceExpression as Expression
            (expression as ElementReferenceExpression).setReference(program.getDefinitionByName(predID))

            if (basicBlock.isConditionalPredecessor(predecessors.head)) {
                var andExp = predecessors.head.getConditionalExpression.copy;
                if (!basicBlock.isConditionalPredecessorTrueBranch(predecessors.head)) {
                    andExp = andExp.negate
                }
                andExp = andExp.transformExpression(program, sourceProgram);
                expression = createParanthesizedExpression(createAndExpression(expression, andExp));                
            }

            for(Integer i: 1..(predecessors.size - 1)) {
                var predIDi = predecessors.get(i).getBasicBlockName
                if (predecessors.get(i).isPauseSurface) predIDi = predIDi + '_pre'
                var exp2 = SText.createElementReferenceExpression as Expression 
                (exp2 as ElementReferenceExpression).setReference(program.getDefinitionByName(predIDi))

                if (basicBlock.isConditionalPredecessor(predecessors.get(i))) {
                    var andExp = predecessors.get(i).getConditionalExpression.copy;
                    if (!basicBlock.isConditionalPredecessorTrueBranch(predecessors.get(i))) {
                        andExp = andExp.negate
                    }
                    andExp = andExp.transformExpression(program, sourceProgram);
                    exp2 = createParanthesizedExpression(createAndExpression(exp2, andExp));                
                }

                expression = createOrExpression(expression, exp2) 
            }
            guardExpression = expression
        }
        
        if (predecessors.size!=0 && basicBlock.isEqual(sourceProgram.statements.head.getBasicBlockByHead(false))) {
            val expression = SText.createElementReferenceExpression
            expression.setReference(program.getDefinitionByName(RESETSIGNAL))
            
            if (guardExpression instanceof LogicalOrExpression || guardExpression instanceof LogicalAndExpression) {
                guardExpression = createParanthesizedExpression(guardExpression)
            }
            
            guardExpression = createOrExpression(expression, guardExpression)
        }
 
        val guardAssignment = createSCLAssignment(
            createAssignmentExpression(program.getDefinitionByNameAsElemRef(basicBlock.basicBlockName),
                guardExpression),
            program.getDefinitionByName(basicBlock.basicBlockName)              
        ).createStatement;
        
        
        newStatements.add(guardAssignment)
        
        }

        val guardConditional = createSCLConditional
        guardConditional.expression = program.getDefinitionByNameAsElemRef(basicBlock.basicBlockName)
        for(statement : basicBlock.statements) {
            if (statement.isAssignment) {
                val stmt = statement.copy.transformVarRef(program, sourceProgram)
                stmt.setLabel(null)
                guardConditional.statements.add(stmt);
            }
        }    
         
        if (guardConditional.statements.size>0) {       
            newStatements.add(guardConditional.createStatement)
        }
        
        newStatements
    }
    
    // Returns the definition identified by its name.
    def VariableDefinition getDefinitionByName(Program program, String name) {
        program.definitions.filter(e | e.getName() == name).head
    }
    
    // Returns the definition identified by its name as element reference expression.
    def ElementReferenceExpression getDefinitionByNameAsElemRef(Program program, String name) {
        val varRef = program.getDefinitionByName(name)
        val expression = SText.createElementReferenceExpression
        expression.setReference(varRef)
        expression        
    }
    
    // Transforms the references of an assignment expression of the source program the 
    // corresponding references in the target program.
    def Statement transformVarRef(Statement statement, Program targetProgram, Program sourceProgram) {
        val instr = (statement.getInstruction as Assignment)
        val aExp = (instr.assignment as AssignmentExpression)
        
        aExp.eAllContents.filter(typeof(ElementReferenceExpression)).forEach[
            val vD = sourceProgram.definitions.filter(e | e == it.reference).head
            val tD = targetProgram.getDefinitionByName(vD.name)
            it.reference = tD
        ]
        
        statement 
    }
    
    
    // Transforms the references of an element reference expression (or all nested element reference 
    // expressions) of the source program the 
    // corresponding references in the target program.
    def transformExpression(Expression exp, Program targetProgram, Program sourceProgram) {
        if (exp instanceof ElementReferenceExpression) {
            val ere = exp as ElementReferenceExpression
            val vD = sourceProgram.definitions.filter(e | e == ere.reference).head
                val tD = targetProgram.getDefinitionByName(vD.name)
                ere.reference = tD
        } else {
            exp.eAllContents.filter(typeof(ElementReferenceExpression)).forEach[
                val vD = sourceProgram.definitions.filter(e | e == it.reference).head
                val tD = targetProgram.getDefinitionByName(vD.name)
                it.reference = tD
            ]
        }
        exp
    }
     
}