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
package de.cau.cs.kieler.esterel.scest.validation

import de.cau.cs.kieler.esterel.esterel.Emit
import org.eclipse.xtext.validation.Check
import com.google.inject.Inject
import de.cau.cs.kieler.esterel.scest.extensions.SCEstExtension
import de.cau.cs.kieler.esterel.scest.scest.UnEmit
import de.cau.cs.kieler.annotations.Annotation
import de.cau.cs.kieler.esterel.esterel.IVariable
import de.cau.cs.kieler.esterel.esterel.VariableDecl
import de.cau.cs.kieler.esterel.esterel.ISignal

/**
 * @author mrb
 *
 */
class SCEstValidator extends SCEstJavaValidator{
    
    @Inject
    extension SCEstExtension
    
    @Check
    def void checkEmits(Emit emit) {
        if (!emit.signal.emitAllowed) {
            error(emit.signal.name + " cannot be emitted!", emit, null, -1)
        }
    }
    
    @Check
    def void checkEmitSignal(Emit emit) {
        if (emit.signal.type.isPure) {
            if (emit.expression != null) {
                error(emit.signal.name + " is not a valued signal!", emit, null, -1)
            }
        }
        else {
            if (emit.expression == null) {
                error("No valued emit allowed for pure signal " + emit.signal.name + "!", emit, null, -1)
            }
        }
    }
    
    @Check
    def void checkUnemit(UnEmit unEmit) {
        if (!unEmit.signal.emitAllowed) {
            error(unEmit.signal.name + " cannot be unEmitted!", unEmit, null, -1)
        }
    }
    
    @Check
    def void annotation(Annotation annotation) {
        if (annotation.isGenerated || annotation.isInterfaceAnnotation) {
            error("Annotations of name '" + interfaceScope + "' or '" + generatedAnnotation + "' are forbidden!", annotation, null, -1)
        }
    }
    
    @Check
    def void combineOperator(IVariable variable) {
        if (!combineOperatorFitsType((variable.eContainer as VariableDecl).type?.type, variable.combineOperator)) {
            error("The combine operator " + variable.combineOperator + " does not fit the variables type!", variable, null, -1)
        }
    }
    
    @Check
    def void combineOperator(ISignal signal) {
        if (!combineOperatorFitsType(signal.type, signal.combineOperator)) {
            error("The combine operator " + signal.combineOperator + " does not fit the signals type " + signal.type + "!", signal, null, -1)
        }
    }
    
    
}