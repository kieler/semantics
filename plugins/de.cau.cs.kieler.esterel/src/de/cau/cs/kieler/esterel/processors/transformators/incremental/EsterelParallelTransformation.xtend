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
import org.eclipse.emf.ecore.EObject
import de.cau.cs.kieler.kicool.compilation.InplaceProcessor
import de.cau.cs.kieler.kicool.compilation.EObjectReferencePropertyData
import de.cau.cs.kieler.esterel.extensions.EsterelTransformationExtensions
import de.cau.cs.kieler.esterel.EsterelProgram
import de.cau.cs.kieler.esterel.EsterelParallel
import de.cau.cs.kieler.esterel.EsterelThread
import static extension org.eclipse.emf.ecore.util.EcoreUtil.*

/**
 * @author mrb
 *
 */
class EsterelParallelTransformation extends InplaceProcessor<EsterelProgram> {
    
    // -------------------------------------------------------------------------
    // --                 K I C O      C O N F I G U R A T I O N              --
    // -------------------------------------------------------------------------
    
    public static val ID = "de.cau.cs.kieler.esterel.processors.parallel"
    
    override getId() {
        return ID
    }

    override getName() {
        return "Parallel"
    }
    
    @Inject
    extension EsterelTransformationExtensions
    
    var EObject lastStatement
    
    override process() {
        val nextStatement = environment.getProperty(SCEstIntermediateProcessor.NEXT_STATEMENT_TO_TRANSFORM).getObject
        val isDynamicCompilation = environment.getProperty(SCEstIntermediateProcessor.DYNAMIC_COMPILATION)
        
        if (isDynamicCompilation) {
            if (nextStatement instanceof EsterelParallel) {
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
            model.eAllContents.filter(EsterelParallel).toList.forEach[transform]
        }
    }
    
    def transform(EsterelParallel parallel) {
        val newParallel = createParallel
        for (t : parallel.statements) {
            newParallel.threads.add(createThread => [ statements.add((t as EsterelThread).statements) ])
        }
        parallel.replace(newParallel)
        lastStatement = newParallel
    }
    
}