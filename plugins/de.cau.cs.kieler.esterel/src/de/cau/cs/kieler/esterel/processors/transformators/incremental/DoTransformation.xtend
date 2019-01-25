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
import de.cau.cs.kieler.esterel.Do
import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
import org.eclipse.emf.ecore.EObject
import de.cau.cs.kieler.kicool.compilation.EObjectReferencePropertyData

/**
 * @author mrb
 *
 */
class DoTransformation extends AbstractSCEstDynamicProcessor<Do> {
    
    // -------------------------------------------------------------------------
    // --                 K I C O      C O N F I G U R A T I O N              --
    // -------------------------------------------------------------------------
    
    public static val ID = "de.cau.cs.kieler.esterel.processors.do"
    
    override getId() {
        return ID
    }

    override getName() {
        return "Do"
    }
    
    @Inject
    extension EsterelTransformationExtensions
    
    override transform(Do doo) {
        val abort = createAbort
        abort.statements.addAll(doo.statements)
        // do upto
        if (doo.delay !== null) {
            abort.delay = doo.delay
            abort.statements.addHaltFunctionality
        }
        // do watching
        else {
            abort.delay = doo.watching
            abort.doStatements.addAll(doo.watchingStatements)
        }
        doo.replace(abort)
        lastStatement = abort
        environment.setProperty(SCEstIntermediateProcessor.TRANSFORM_THIS_STATEMENT, true)
    }

}