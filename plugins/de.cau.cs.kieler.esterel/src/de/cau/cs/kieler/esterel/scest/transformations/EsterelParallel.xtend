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
package de.cau.cs.kieler.esterel.scest.transformations

import com.google.inject.Inject
import de.cau.cs.kieler.esterel.esterel.EsterelThread
import de.cau.cs.kieler.esterel.scest.extensions.SCEstExtension
import de.cau.cs.kieler.esterel.scest.features.SCEstFeature
import de.cau.cs.kieler.esterel.scest.scest.SCEstProgram
import de.cau.cs.kieler.kico.transformation.AbstractExpansionTransformation
import de.cau.cs.kieler.kitt.tracing.Traceable
import de.cau.cs.kieler.scl.scl.Parallel
import de.cau.cs.kieler.scl.scl.SclFactory
import de.cau.cs.kieler.scl.scl.Thread
import org.eclipse.emf.common.util.EList
import de.cau.cs.kieler.scl.scl.Pause
import de.cau.cs.kieler.scl.scl.Goto
import de.cau.cs.kieler.scl.scl.Label
import de.cau.cs.kieler.scl.scl.Statement
import de.cau.cs.kieler.esterel.esterel.StatementContainer

/**
 * @author mrb
 *
 */
class EsterelParallel extends AbstractExpansionTransformation implements Traceable{
    
    // -------------------------------------------------------------------------
    // --                 K I C O      C O N F I G U R A T I O N              --
    // -------------------------------------------------------------------------
    override getId() {
        return SCEstTransformation::ESTERELPARALLEL_ID
    }

    override getName() {
        return SCEstTransformation::ESTERELPARALLEL_NAME
    }

    override getExpandsFeatureId() {
        return SCEstFeature::ESTERELPARALLEL_ID
    }
        
//    override getProducesFeatureIds() {
//        return Sets.newHashSet(SCEstTransformation::INITIALIZATION_ID, SCEstTransformation::ENTRY_ID,
//            SCEstTransformation::CONNECTOR_ID)
//    }
//
//    override getNotHandlesFeatureIds() {
//        return Sets.newHashSet(SCEstTransformation::COUNTDELAY_ID, SCEstTransformation::COMPLEXFINALSTATE_ID, SCEstTransformation::HISTORY_ID,
//            SCEstTransformation::EXPANSION_ID)
//    }
    
    @Inject
    extension SCEstExtension
    
    def SCEstProgram transform(SCEstProgram prog) {
        for (module : prog.modules) {
            var statements = module.statements
            for (var i=0; i<statements.length; i++) {
                statements.set(i, statements.get(i).transformStatement)
            }
        }
        return prog
    }
    
    def Statement transformStatement(Statement statement) {
        if (statement instanceof de.cau.cs.kieler.esterel.esterel.EsterelParallel) {
            var parallel = createParallel
            for (thread : (statement as de.cau.cs.kieler.esterel.esterel.EsterelParallel).threads) {
                parallel.threads.add(createThread => [ statements.add(thread.statements) ])
            }
            return parallel
        }
        else if (statement instanceof StatementContainer) {
            var statements = (statement as StatementContainer).statements
            for (var i=0; i<statements.length; i++) {
                statements.set(i, statements.get(i).transformStatement)
            }
        }
        return statement
    }
    
}