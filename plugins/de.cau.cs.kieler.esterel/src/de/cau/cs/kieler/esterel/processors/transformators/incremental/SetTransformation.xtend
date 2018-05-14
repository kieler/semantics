/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2017 by
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
import de.cau.cs.kieler.esterel.Set
import de.cau.cs.kieler.kicool.compilation.EObjectReferencePropertyData
import org.eclipse.emf.ecore.EObject

/**
 * @author mrb
 *
 */
class SetTransformation extends InplaceProcessor<EsterelProgram> {
    
    // -------------------------------------------------------------------------
    // --                 K I C O      C O N F I G U R A T I O N              --
    // -------------------------------------------------------------------------
    
    public static val ID = "de.cau.cs.kieler.esterel.processors.set"
    
    override getId() {
        return ID
    }

    override getName() {
        return "Set"
    }
    
    @Inject
    extension EsterelTransformationExtensions
    
    var EObject lastStatement
    
    override process() {
        val nextStatement = environment.getProperty(SCEstIntermediateProcessor.NEXT_STATEMENT_TO_TRANSFORM).getObject
        val isDynamicCompilation = environment.getProperty(SCEstIntermediateProcessor.DYNAMIC_COMPILATION)
        
        if (isDynamicCompilation) {
            if (nextStatement instanceof Set) {
                transform(nextStatement)
            }
            else {
                throw new UnsupportedOperationException(
                    "The next statement to transform and this processor do not match.\n" +
                    "This processor ID: " + ID + "\n" +
                    "The statement to transform: " + nextStatement
                )
            }
            environment.setProperty(SCEstIntermediateProcessor.NEXT_STATEMENT_TO_TRANSFORM, new EObjectReferencePropertyData(lastStatement))
        }
        else {
            model.eAllContents.filter(Set).toList.forEach[transform]
        }
    }
    
    def transform(Set set) {
        val signal = set.signal
        val statements = set.getContainingList
        val pos = statements.indexOf(set)
        var assign1 = createAssignment(signal.createSignalReference, createOr(signal.createSignalReference, createTrue))
        var assign2 = createSetAssignment(signal.createSignalReference, createOr(signal.createSignalReference, createTrue))
        var assign3 = createCurAssignment(signal.createSignalReference, set.expression)
        statements.set(pos, assign3)
        statements.add(pos, assign2)
        statements.add(pos, assign1)
        lastStatement = assign3
    }
    
}