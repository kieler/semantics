package de.cau.cs.kieler.scl.seqscl.xtend

import com.google.inject.Guice
import com.google.common.collect.ImmutableList
import de.cau.cs.kieler.scl.scl.Program
import javax.inject.Inject
import de.cau.cs.kieler.scl.extensions.SCLFactoryExtensions
import de.cau.cs.kieler.scl.extensions.SCLCreateExtensions
import de.cau.cs.kieler.scl.extensions.SCLBasicBlockExtensions
import java.util.List
import de.cau.cs.kieler.scl.basicblocks.BasicBlock
import de.cau.cs.kieler.scl.scl.SclFactory

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
import de.cau.cs.kieler.scl.scl.Statement
import de.cau.cs.kieler.scl.scl.InstructionStatement
import de.cau.cs.kieler.scl.scl.VariableDefinition
import de.cau.cs.kieler.scl.extensions.SCLExpressionExtensions
import org.yakindu.sct.model.stext.stext.Expression
import org.yakindu.sct.model.stext.stext.ElementReferenceExpression
import de.cau.cs.kieler.scl.extensions.SCLStatementExtensions
import de.cau.cs.kieler.scl.scl.Assignment
import org.yakindu.sct.model.stext.stext.AssignmentExpression
import java.util.ArrayList
import org.yakindu.sct.model.stext.stext.LogicalOrExpression
import org.yakindu.sct.model.stext.stext.LogicalAndExpression

class SCLToSeqSCLTransformation {

//    @Inject
//    extension SCLFactoryExtensions
//    @Inject
//    extension SCLCreateExtensions
//    @Inject
//    extension SCLBasicBlockExtensions
    
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
    
    static val String RESETSIGNAL = 'RESET';
    
    def Program transformSCLToSCLControlflow(Program program) {
        val targetProgram = SCL.createProgram()
        
        targetProgram.setName(program.getName + "_tick")
        targetProgram.definitions.addAll(program.definitions.copyAll)
        targetProgram.definitions.add(createVariableDefinition(RESETSIGNAL, 'boolean'))
        
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


        var changed = false
        var basicBlockPool = basicBlocks.copy
//        var basicBlockPool = program.statements.head.getAllBasicBlocks 
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
        
        targetProgram
    }
    
    def List<Statement> transformBasicBlock(Program program, Program sourceProgram, BasicBlock basicBlock) {
        var newStatements = createNewStatementList
        val predecessors = basicBlock.getBasicBlockPredecessor
 
        if (basicBlock.isParallelJoin) {
            var unreachableJoin = false
            var Expression syncExp = null 
            var Expression termExp = null
            for(pred : predecessors) {
                var Expression handleExp = null;
                val emptyExp = SText.createLogicalNotExpression;
                val _parExp  = SText.createParenthesizedExpression
                var Expression innerExp = null 
                val guards = pred.getHead.basicBlocks;
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
    
    def VariableDefinition getDefinitionByName(Program program, String name) {
        program.definitions.filter(e | e.getName() == name).head
    }
    
    def ElementReferenceExpression getDefinitionByNameAsElemRef(Program program, String name) {
        val varRef = program.getDefinitionByName(name)
        val expression = SText.createElementReferenceExpression
        expression.setReference(varRef)
        expression        
    }
    
    def Statement transformVarRef(Statement statement, Program targetProgram, Program sourceProgram) {
        val instr = (statement.getInstruction as Assignment)
        val aExp = (instr.assignment as AssignmentExpression)
//        val varRef = aExp.varRef as ElementReferenceExpression
//        val varDec = sourceProgram.declarations.filter(e | e == varRef.reference).head
//        
//        val tarDec = targetProgram.getDeclarationByName(varDec.name)
//        varRef.reference = tarDec
        
        aExp.eAllContents.filter(typeof(ElementReferenceExpression)).forEach[
            val vD = sourceProgram.definitions.filter(e | e == it.reference).head
            val tD = targetProgram.getDefinitionByName(vD.name)
            it.reference = tD
        ]
        
        statement 
    }
    
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