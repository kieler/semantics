package de.cau.cs.kieler.scl.seqscl.s.xtend

import com.google.inject.Guice
import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
import org.eclipse.emf.ecore.util.EcoreUtil;
import com.google.common.collect.ImmutableList
import de.cau.cs.kieler.scl.scl.Program
import javax.inject.Inject
import de.cau.cs.kieler.scl.extensions.SCLFactoryExtensions
import de.cau.cs.kieler.scl.extensions.SCLCreateExtensions
import de.cau.cs.kieler.scl.extensions.SCLBasicBlockExtensions
import java.util.List
import de.cau.cs.kieler.scl.basicblocks.BasicBlock
import de.cau.cs.kieler.scl.scl.SclFactory
import org.yakindu.sct.model.stext.stext.Expression

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

import de.cau.cs.kieler.s.s.impl.SFactoryImpl;
import de.cau.cs.kieler.s.s.SFactory;
import de.cau.cs.kieler.core.kexpressions.*
import de.cau.cs.kieler.core.kexpressions.KExpressionsFactory;
import org.yakindu.base.types.Type
import de.cau.cs.kieler.core.kexpressions.ValueType
import com.google.inject.Injector
import org.eclipse.xtext.serializer.ISerializer
import de.cau.cs.kieler.scl.SCLStandaloneSetup
import org.yakindu.sct.model.stext.stext.Expression
import org.yakindu.sct.model.stext.stext.AssignmentExpression

class SeqSCLToSTransformation {

    private static val Injector i = SCLStandaloneSetup::doSetup();
    private static val ISerializer serializer = i.getInstance(typeof(ISerializer));

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

         
    def SFactory() {
        SFactory::eINSTANCE
    }
    
    def KFactory() {
        KExpressionsFactory::eINSTANCE
    }
    
    def de.cau.cs.kieler.s.s.Program transformSeqSCLToSProgram(Program program) {
        val targetProgram = SFactory.createProgram()
        targetProgram.setName(program.getName())

        for(decl : program.declarations) {
            val vari = KFactory.createSignal
            vari.setName(decl.getName)
            vari.setType(decl.getType.toKType)
            if (decl.initialValue != null) 
                vari.setInitialValue(serializer.serialize(decl.initialValue).correctSerialization) 
                
            targetProgram.signals.add(vari);
        }
        
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
        
        stateTick.setName('_tick');
        val tickTrans = SFactory.createTrans
        tickTrans.setContinuation(stateTick)
        
        program.statements.transformStatements(targetProgram, stateTick)
        
        stateTick.instructions.add(SFactory.createPause)
        stateTick.instructions.add(tickTrans)
        
        targetProgram.states.add(stateGo);
        targetProgram.states.add(stateTick)
        
        targetProgram
    }
     
    def void transformStatements(List<Statement> statements,  
        de.cau.cs.kieler.s.s.Program targetProgram,
        de.cau.cs.kieler.s.s.State targetState
    ) {
        for(stmt : statements) {
            if (stmt.isAssignment) {
                val asgn = stmt.getInstruction.asAssignment.assignment
                val emitSignal = SFactory.createEmit
                emitSignal.setSignal(targetProgram.signals.filter(e|
                    e.getName==serializer.serialize((asgn as AssignmentExpression).varRef).correctSerialization
                ).head)
                val kex = (asgn as AssignmentExpression).expression.toKExpression(targetProgram);
                emitSignal.setValue(kex.copy);
                targetState.instructions.add(emitSignal)
            } else if (stmt.isConditional) {
                
            }
        }    
    } 
    
    def de.cau.cs.kieler.core.kexpressions.Expression toKExpression(
        org.yakindu.sct.model.stext.stext.Expression expression,
        de.cau.cs.kieler.s.s.Program targetProgram
    ) {
        if (expression instanceof ElementReferenceExpression) {
            return (targetProgram.signals.filter(e|
                    e.getName==serializer.serialize(expression as ElementReferenceExpression).correctSerialization
                ).head) as de.cau.cs.kieler.core.kexpressions.Expression
        }
        
        return null
    }
     
    def ValueType toKType(Type vdType) {
        if (vdType == null) return ValueType::BOOL;
        if (vdType.getName == 'integer') return ValueType::INT;
        ValueType::BOOL;
    }
}