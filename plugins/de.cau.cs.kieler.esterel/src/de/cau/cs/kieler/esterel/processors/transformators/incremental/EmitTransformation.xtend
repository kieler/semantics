/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright ${year} by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.esterel.processors.transformators.incremental

import com.google.inject.Inject
import de.cau.cs.kieler.kicool.compilation.InplaceProcessor
import de.cau.cs.kieler.esterel.extensions.EsterelTransformationExtensions
import de.cau.cs.kieler.esterel.EsterelProgram
import de.cau.cs.kieler.esterel.Emit
import de.cau.cs.kieler.esterel.Signal
import de.cau.cs.kieler.kexpressions.ValueType
import static extension org.eclipse.emf.ecore.util.EcoreUtil.*

/**
 * @author mrb
 *
 */
class EmitTransformation extends InplaceProcessor<EsterelProgram> {
    
    // -------------------------------------------------------------------------
    // --                 K I C O      C O N F I G U R A T I O N              --
    // -------------------------------------------------------------------------
    
    public static val ID = "de.cau.cs.kieler.esterel.processors.emit"
    
    override getId() {
        return ID
    }

    override getName() {
        return "Emit"
    }
    
    @Inject
    extension EsterelTransformationExtensions
    
    override process() {
        val nextStatement = environment.getProperty(SCEstIntermediateProcessor.NEXT_STATEMENT_TO_TRANSFORM).getObject
        val isDynamicCompilation = environment.getProperty(SCEstIntermediateProcessor.DYNAMIC_COMPILATION)
        
        if (isDynamicCompilation) {
            if (nextStatement instanceof Emit) {
                transform(nextStatement)
            }
            else {
                throw new UnsupportedOperationException(
                    "The next statement to transform and this processor do not match.\n" +
                    "This processor ID: " + ID + "\n" +
                    "The statement to transform: " + nextStatement
                )
            }
        }
        else {
            model.eAllContents.filter(Emit).toList.forEach[transform]
        }
    }
    
    def transform(Emit emit) {
        var signal = emit.signal as Signal
        if (emit.expression === null && signal.type != ValueType.PURE) {
            throw new UnsupportedOperationException("The following signal is a valued signal. 
                                    Thus a non valued emit is invalid! " + signal.toString)
        }
        val statements = emit.getContainingList
        val pos = statements.indexOf(emit)
        val expr = createOr(signal.createSignalReference, createTrue)
        emit.replace(createAssignment(signal.createSignalReference, expr))
        if (emit.expression !== null) {
            if (signal.type != ValueType.PURE) {
                val assign2 = createCurAssignment(signal.createSignalReference, 
                    createOperatorExpression(signal.createSignalReference, 
                        emit.expression, signal.combineOperator.getOperator
                    ))
                statements.add(pos+1, assign2)
            }
            else {
                throw new UnsupportedOperationException("The following signal is not a valued signal! 
                                                        Thus a valued emit is invalid! " + signal.toString)
            }
        }
    }
    
}