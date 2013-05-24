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
        
        val List<BasicBlock> basicBlocks = program.statements.head.getAllBasicBlocks

        for(basicBlock : basicBlocks) {
            targetProgram.declarations.add(createVariableDeclaration(basicBlock.basicBlockName, 'boolean'))
        }

        for(basicBlock : basicBlocks) {
            targetProgram.statements.addAll(targetProgram.transformBasicBlock(program, basicBlock));    
        }        
        
        targetProgram
    }
    
    def List<Statement> transformBasicBlock(Program program, Program sourceProgram, BasicBlock basicBlock) {
        var newStatements = createNewStatementList
        val predecessors = basicBlock.getBasicBlockPredecessor;
        
        val guardConditional = createSCLConditional
        
        if (predecessors.size==0) {
            val expression = SText.createElementReferenceExpression
            expression.setReference(program.getDeclarationByName('GO'))
            guardConditional.expression = expression
        } else if (predecessors.size==1) {
            val expression = SText.createElementReferenceExpression
            expression.setReference(program.getDeclarationByName(predecessors.head.basicBlockName))
            guardConditional.expression = expression
        } else if (predecessors.size>1) {
            var expression = SText.createElementReferenceExpression as Expression
            (expression as ElementReferenceExpression).setReference(program.getDeclarationByName(predecessors.head.basicBlockName))
            for(Integer i: 1..(predecessors.size - 1)) {
                val exp2 = SText.createElementReferenceExpression 
                exp2.setReference(program.getDeclarationByName(predecessors.get(i).basicBlockName))
                expression = createOrExpression(expression, exp2) 
            }
            guardConditional.expression = expression
        }

//        val stmt = createSCLEmptyStatement
//        stmt.setLabel("Test")
        for(statement : basicBlock.statements) {
            if (statement.isAssignment) {
                val stmt = statement.copy.transformVarRef(program, sourceProgram)
                stmt.setLabel(null)
                guardConditional.statements.add(stmt);
            }
        }    
        val guardAssignment = createSCLAssignment(
            createAssignmentExpression(program.getDeclarationByNameAsElemRef(basicBlock.basicBlockName),
                assignBoolean(true)),
            program.getDeclarationByName(basicBlock.basicBlockName)              
        ).createStatement;
        guardConditional.statements.add(guardAssignment);    
                
        newStatements.add(guardConditional.createStatement)
        
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
        val varRef = aExp.varRef as ElementReferenceExpression
        val varDec = sourceProgram.declarations.filter(e | e == varRef.reference).head
        
        val tarDec = targetProgram.getDeclarationByName(varDec.name)
        varRef.reference = tarDec
        
        statement 
    }
     
}