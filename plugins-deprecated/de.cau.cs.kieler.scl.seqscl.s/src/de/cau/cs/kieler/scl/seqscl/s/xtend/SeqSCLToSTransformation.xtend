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
package de.cau.cs.kieler.scl.seqscl.s.xtend

import com.google.inject.Guice
import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
import de.cau.cs.kieler.scl.scl.Program
import de.cau.cs.kieler.scl.extensions.SCLFactoryExtensions
import de.cau.cs.kieler.scl.extensions.SCLCreateExtensions
import de.cau.cs.kieler.scl.extensions.SCLBasicBlockExtensions
import java.util.List
import de.cau.cs.kieler.scl.scl.Statement
import de.cau.cs.kieler.scl.extensions.SCLExpressionExtensions
import org.yakindu.sct.model.stext.stext.ElementReferenceExpression
import de.cau.cs.kieler.scl.extensions.SCLStatementExtensions
import org.yakindu.sct.model.stext.stext.AssignmentExpression
import java.util.ArrayList

import de.cau.cs.kieler.s.s.SFactory;
import de.cau.cs.kieler.core.kexpressions.*
import de.cau.cs.kieler.core.kexpressions.KExpressionsFactory;
import org.yakindu.base.types.Type
import de.cau.cs.kieler.core.kexpressions.ValueType
import com.google.inject.Injector
import org.eclipse.xtext.serializer.ISerializer
import de.cau.cs.kieler.scl.SCLStandaloneSetup
import org.yakindu.sct.model.stext.stext.LogicalAndExpression
import org.yakindu.sct.model.stext.stext.LogicalOrExpression
import org.yakindu.sct.model.stext.stext.LogicalNotExpression
import org.yakindu.sct.model.stext.stext.ParenthesizedExpression
import org.yakindu.sct.model.stext.stext.PrimitiveValueExpression
import org.yakindu.sct.model.stext.stext.BoolLiteral
import org.yakindu.sct.model.stext.stext.IntLiteral

/**
 * This class transforms a sequential SCL program into an S program.
 * The transformation proceeds pretty straightforward.
 * 
 * @author: ssm
 */
class SeqSCLToSTransformation {

    private static val Injector i = SCLStandaloneSetup::doSetup();
    private static val ISerializer serializer = i.getInstance(typeof(ISerializer));

    extension de.cau.cs.kieler.scl.extensions.SCLExpressionExtensions SCLExpressionExtensions = 
         Guice::createInjector().getInstance(typeof(SCLExpressionExtensions))
    extension de.cau.cs.kieler.scl.extensions.SCLStatementExtensions SCLStatementExtensions = 
         Guice::createInjector().getInstance(typeof(SCLStatementExtensions))

         
    // Factories for S und K(expressions).
    def SFactory() {
        SFactory::eINSTANCE
    }
    
    def KFactory() {
        KExpressionsFactory::eINSTANCE
    }
    
    // Main transformation method
    def de.cau.cs.kieler.s.s.Program transformSeqSCLToSProgram(Program program) {
        val targetProgram = SFactory.createProgram()
        targetProgram.setName(program.getName())

        // Copy definitions.
        for(decl : program.definitions) {
            val vari = KFactory.createSignal
            vari.setName(decl.getName)
            vari.setType(decl.getType.toKType)
            vari.setIsInput(decl.isInput)
            vari.setIsOutput(decl.isOutput)
            vari.setCombineOperator(CombineOperator::NONE);
                
            targetProgram.signals.add(vari);
        }
        
        // Create go state, emit the go signal and traverse to the tick function.
        val stateGo = SFactory.createState
        stateGo.setName('_go');
        val stateTick = SFactory.createState
        val goTrans = SFactory.createTrans
        goTrans.setContinuation(stateTick)
        val goEmit = SFactory.createEmit
        val trueBool = KFactory.createBooleanValue
        trueBool.setValue(true)
        goEmit.setSignal(targetProgram.signals.filter(e|e.getName=='GO').head)
        goEmit.setValue(trueBool)
        stateGo.instructions.add(goEmit)
        stateGo.instructions.add(goTrans)
        
        stateTick.setName('_tickStart');
        val tickTrans = SFactory.createTrans
        tickTrans.setContinuation(stateTick)
        
        // Query instructions and add them to the tick function.
        val instructions = program.statements.transformStatements(targetProgram)
        stateTick.instructions.addAll(instructions)
        
        stateTick.instructions.add(SFactory.createPause)
        stateTick.instructions.add(tickTrans)
        
        targetProgram.states.add(stateGo);
        targetProgram.states.add(stateTick)
        targetProgram.setPriority(1)
        
        targetProgram
    }
    
    // Transforms a list of SCL statements to a list of S instructions.
    def List<de.cau.cs.kieler.s.s.Instruction> transformStatements(List<Statement> statements,  
        de.cau.cs.kieler.s.s.Program targetProgram
    ) {
        // Since a sequential SCL program only consists out of assignments and conditionals,
        // the transformation is reasonable.
        val iL = new ArrayList<de.cau.cs.kieler.s.s.Instruction>

        for(stmt : statements) {
            if (stmt.isAssignment) {
                val asgn = stmt.getInstruction.asAssignment.assignment as AssignmentExpression;
                val emitSignal = SFactory.createEmit
                emitSignal.setSignal((asgn.varRef as ElementReferenceExpression).toSignal(targetProgram) as Signal);
                var kex = toKExpression(asgn.expression, targetProgram, true)
                emitSignal.setValue(kex);
                iL.add(emitSignal)
            } else if (stmt.isConditional) {
                val kex = stmt.getInstruction.asConditional.expression.toKExpression(targetProgram, true);
                var cond = SFactory.createIf
                val kex2 = KFactory.createOperatorExpression
                val bool = KFactory.createBooleanValue
                bool.setValue(true)
                kex2.setOperator(OperatorType::EQ) 
                kex2.subExpressions.add(kex)
                kex2.subExpressions.add(bool)
                
                cond.setExpression(kex2)
                
                val cIL = stmt.getInstruction.asConditional.statements.transformStatements(targetProgram)
                cond.instructions.addAll(cIL)       
                iL.add(cond)         
            }
        }
        return iL    
    } 

    // Transforms a SyncText expression to an S signal.    
    def Signal toSignal(
        org.yakindu.sct.model.stext.stext.ElementReferenceExpression expression,
        de.cau.cs.kieler.s.s.Program targetProgram
    ) {
        return (targetProgram.signals.filter(e|
                e.getName.equals(serializer.serialize(expression as ElementReferenceExpression).correctSerialization.chop)
            ).head)
    }

    // Transforms all used SyncText expressions to equivalent Kexpressions.
    def de.cau.cs.kieler.core.kexpressions.Expression toKExpression(
        org.yakindu.sct.model.stext.stext.Expression expression,
        de.cau.cs.kieler.s.s.Program targetProgram, 
        boolean createValueOf
    ) {
        if (expression instanceof ElementReferenceExpression) {
            val refser = serializer.serialize((expression as ElementReferenceExpression)).correctSerialization.chop
            val target = targetProgram.signals.filter(e|e.name.equals(refser))
            val head = target.head;
            val valobj = KFactory.createValuedObjectReference
            valobj.setValuedObject(head)
            if (createValueOf) { return valobj.createValueOfExp }
            return valobj
        } else if (expression instanceof LogicalAndExpression) {
            val exp = (expression as LogicalAndExpression)
            val and = KFactory.createOperatorExpression
            and.setOperator(OperatorType::AND)
            val left = exp.leftOperand.toKExpression(targetProgram, createValueOf)
            val right = exp.rightOperand.toKExpression(targetProgram, createValueOf)
            if (left != null && right != null) {
                and.subExpressions.add(left)
                and.subExpressions.add(right)
                return and
            }
        } else if (expression instanceof LogicalOrExpression) {
            val exp = (expression as LogicalOrExpression)
            val or = KFactory.createOperatorExpression
            or.setOperator(OperatorType::OR)
            val left = exp.leftOperand.toKExpression(targetProgram, createValueOf)
            val right = exp.rightOperand.toKExpression(targetProgram, createValueOf)
            if (left != null && right != null) {
                or.subExpressions.add(left)
                or.subExpressions.add(right)
                return or
            }
        } else if (expression instanceof LogicalNotExpression) {
            val exp = (expression as LogicalNotExpression)
            val oper = KFactory.createOperatorExpression
            oper.setOperator(OperatorType::NOT)
            val not = exp.operand.toKExpression(targetProgram, createValueOf)
            if (not != null) {
                oper.subExpressions.add(not)
                return oper
            }
        } else if (expression instanceof ParenthesizedExpression) {
            val exp = (expression as ParenthesizedExpression)
            val inner = exp.expression.toKExpression(targetProgram, createValueOf)
            if (inner != null) {
                return inner
            }
        } else if (expression instanceof PrimitiveValueExpression) {
            val value = (expression as PrimitiveValueExpression).value
            if (value instanceof BoolLiteral) {
                var bool = KFactory.createBooleanValue
                bool.setValue((value as BoolLiteral).value)
                return bool
            }
            if (value instanceof IntLiteral) {
                var num = KFactory.createIntValue
                num.setValue((value as IntLiteral).value)
                return num
            } 
        }
        return null
    }

    // Short-cut to encapsulate a kexpression in a value of kexpresison.
    def de.cau.cs.kieler.core.kexpressions.Expression createValueOfExp(de.cau.cs.kieler.core.kexpressions.Expression expression) {
        val voe = KFactory.createOperatorExpression
        voe.setOperator(OperatorType::VAL)        
        voe.subExpressions.add(expression)
        voe
    }
    
    // Retrieve type enum identified by its name. 
    def ValueType toKType(Type vdType) {
        if (vdType == null) return ValueType::BOOL;
        if (vdType.getName == 'integer') return ValueType::INT;
        ValueType::BOOL;
    }
    
    // Helper: chop spaces in string.
    def String chop(String s) {
        s.replace(" ", "")
    }
}