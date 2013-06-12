package de.cau.cs.kieler.scl.controlflow.xtend

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
import de.cau.cs.kieler.scl.scl.VariableDeclaration
import de.cau.cs.kieler.scl.extensions.SCLExpressionExtensions
import org.yakindu.sct.model.stext.stext.Expression
import org.yakindu.sct.model.stext.stext.ElementReferenceExpression
import de.cau.cs.kieler.scl.extensions.SCLStatementExtensions
import de.cau.cs.kieler.scl.scl.Assignment
import org.yakindu.sct.model.stext.stext.AssignmentExpression
import java.util.ArrayList

class SCLToSCLCFTransformation {

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
    
    def Program transformSCLToSCLControlflow(Program program) {
        val targetProgram = SCL.createProgram()
        
        targetProgram.setName(program.getName + "_seqcf")
        targetProgram.declarations.addAll(program.declarations.copyAll)
        targetProgram.declarations.add(createVariableDeclaration('GO', 'boolean'))
        
        var List<BasicBlock> basicBlocks = program.statements.head.getAllBasicBlocks

        for(basicBlock : basicBlocks) {
            targetProgram.declarations.add(createVariableDeclaration(basicBlock.basicBlockName, 'boolean'))
            if (basicBlock.isPauseSurface)
                targetProgram.declarations.add(createVariableDeclaration(basicBlock.basicBlockName + '_pre', 'boolean'))
            if (basicBlock.isParallelJoin) {
                for (pred : basicBlock.getBasicBlockPredecessor) {
                    targetProgram.declarations.add(createVariableDeclaration(pred.emptyBlockName, 'boolean'))
                }
            }
        }


        var changed = false
        var basicBlockPool = program.statements.head.getAllBasicBlocks 
        while(basicBlockPool.size>0) {
            changed = false
            val tempPool = ImmutableList::copyOf(basicBlockPool)
            for(basicBlock : tempPool) {
                var predecessors = basicBlock.getBasicBlockPredecessor
                var depPredecessors = basicBlock.getBasicBlockDependencyPredecessors 
                var ready = true
                
                for (pred : predecessors) {
                    if (!pred.isPauseSurface && basicBlockPool.containsEqual(pred)) {ready = false}
                    if (basicBlock.isParallelJoin) {
                        val guards = pred.getHead.basicBlocks
                        for (guard : guards) {
                            if (basicBlockPool.containsEqual(guard)) { ready = false }
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
                        targetProgram.getDeclarationByName(basicBlock.basicBlockName + '_pre'),
                        targetProgram.getDeclarationByName(basicBlock.basicBlockName)
                    ).createStatement
                )
            }
        }
        
        targetProgram
    }
    
    def List<Statement> transformBasicBlock(Program program, Program sourceProgram, BasicBlock basicBlock) {
        var newStatements = createNewStatementList
        val predecessors = basicBlock.getBasicBlockPredecessor;
 
        if (basicBlock.isParallelJoin) {
            var Expression syncExp = null; 
            var Expression termExp = null;
            for(pred : predecessors) {
                var Expression handleExp = null;
                val emptyExp = SText.createLogicalNotExpression;
                val _parExp  = SText.createParenthesizedExpression
                var Expression innerExp = null 
                val guards = pred.getHead.basicBlocks
                val predID = guards.head.basicBlockName;
                innerExp = SText.createElementReferenceExpression as Expression
                (innerExp as ElementReferenceExpression).setReference(program.getDeclarationByName(predID))
                if (guards.size>1) {
                    for(Integer i: 1..(guards.size - 1)) {
                        var predIDi = guards.get(i).basicBlockName
                        val exp2 = createElementReferenceExpression(program.getDeclarationByName(predIDi))
                        innerExp = createOrExpression(innerExp, exp2)
                    } 
                }
                _parExp.setExpression(innerExp);
                emptyExp.setOperand(_parExp)
                
                for (guard : guards) {
                    if (guard.isExitBlock) {
                        termExp = termExp.addOrExpression(createElementReferenceExpression(program.getDeclarationByName(guard.basicBlockName)))
                        handleExp = handleExp.addOrExpression(createElementReferenceExpression(program.getDeclarationByName(guard.basicBlockName)))
                    }
                }
                
                val emptyAssignment = createSCLAssignment(
                    createAssignmentExpression(program.getDeclarationByNameAsElemRef(pred.emptyBlockName),
                        emptyExp),
                    program.getDeclarationByName(pred.emptyBlockName)              
                ).createStatement;
                newStatements.add(emptyAssignment)
                
                handleExp = handleExp.addOrExpression(createElementReferenceExpression(program.getDeclarationByName(pred.emptyBlockName)))
                syncExp = syncExp.addAndExpression(createParanthesizedExpression(handleExp))
            }        
            syncExp = syncExp.addAndExpression(createParanthesizedExpression(termExp))

            val guardAssignment = createSCLAssignment(
                createAssignmentExpression(program.getDeclarationByNameAsElemRef(basicBlock.basicBlockName),
                    syncExp),
                program.getDeclarationByName(basicBlock.basicBlockName)              
            ).createStatement;
            newStatements.add(guardAssignment)
            
        }
        else 
        {
 
        var Expression guardExpression = null        
         if (predecessors.size==0) {
            val expression = SText.createElementReferenceExpression
            expression.setReference(program.getDeclarationByName('GO'))
            guardExpression = expression
        } else if (predecessors.size==1) {
            var predID = predecessors.head.getBasicBlockName
            if (predecessors.head.isPauseSurface) predID = predID + '_pre'
            val expression = SText.createElementReferenceExpression
            expression.setReference(program.getDeclarationByName(predID))
            if (basicBlock.isConditionalPredecessor(predecessors.head)) {
                var andExp = predecessors.head.getConditionalExpression.copy;
                andExp = andExp.transformExpression(program, sourceProgram);
                guardExpression = createAndExpression(expression, andExp);                
            } else {
                guardExpression = expression
            }
        } else if (predecessors.size>1) {
            var predID = predecessors.head.getBasicBlockName
            if (predecessors.head.isPauseSurface) predID = predID + '_pre'
            var expression = SText.createElementReferenceExpression as Expression
            (expression as ElementReferenceExpression).setReference(program.getDeclarationByName(predID))
            for(Integer i: 1..(predecessors.size - 1)) {
                var predIDi = predecessors.get(i).getBasicBlockName
                if (predecessors.get(i).isPauseSurface) predIDi = predIDi + '_pre'
                val exp2 = SText.createElementReferenceExpression 
                exp2.setReference(program.getDeclarationByName(predIDi))
                expression = createOrExpression(expression, exp2) 
            }
            guardExpression = expression
        }
 
        val guardAssignment = createSCLAssignment(
            createAssignmentExpression(program.getDeclarationByNameAsElemRef(basicBlock.basicBlockName),
                guardExpression),
            program.getDeclarationByName(basicBlock.basicBlockName)              
        ).createStatement;
        
        
        newStatements.add(guardAssignment)
        
        }

        val guardConditional = createSCLConditional
        guardConditional.expression = program.getDeclarationByNameAsElemRef(basicBlock.basicBlockName)
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
    
    def VariableDeclaration getDeclarationByName(Program program, String name) {
        program.declarations.filter(e | e.getName() == name).head
    }
    
    def ElementReferenceExpression getDeclarationByNameAsElemRef(Program program, String name) {
        val varRef = program.getDeclarationByName(name)
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
            val vD = sourceProgram.declarations.filter(e | e == it.reference).head
            val tD = targetProgram.getDeclarationByName(vD.name)
            it.reference = tD
        ]
        
        statement 
    }
    
    def transformExpression(Expression exp, Program targetProgram, Program sourceProgram) {
        if (exp instanceof ElementReferenceExpression) {
            val ere = exp as ElementReferenceExpression
            val vD = sourceProgram.declarations.filter(e | e == ere.reference).head
                val tD = targetProgram.getDeclarationByName(vD.name)
                ere.reference = tD
        } else {
            exp.eAllContents.filter(typeof(ElementReferenceExpression)).forEach[
                val vD = sourceProgram.declarations.filter(e | e == it.reference).head
                val tD = targetProgram.getDeclarationByName(vD.name)
                it.reference = tD
            ]
        }
        exp
    }
     
}