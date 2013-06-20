package de.cau.cs.kieler.scl.seqscl.s.xtend

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

import de.cau.cs.kieler.s.s.impl.SFactoryImpl;
import de.cau.cs.kieler.s.s.SFactory;

class SeqSCLToSTransformation {

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
    
    def de.cau.cs.kieler.s.s.Program transformSeqSCLToSProgram(Program program) {
        val targetProgram = SFactory.createProgram()

        targetProgram
    }
     
}