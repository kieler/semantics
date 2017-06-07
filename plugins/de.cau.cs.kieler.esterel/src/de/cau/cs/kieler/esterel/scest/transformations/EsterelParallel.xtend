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

import com.google.common.collect.Sets
import com.google.inject.Inject
import de.cau.cs.kieler.kico.transformation.AbstractExpansionTransformation
import de.cau.cs.kieler.kitt.tracing.Traceable
import static extension de.cau.cs.kieler.kitt.tracing.TracingEcoreUtil.*
import static extension de.cau.cs.kieler.kitt.tracing.TransformationTracing.*
import de.cau.cs.kieler.esterel.scest.extensions.SCEstExtension
import de.cau.cs.kieler.esterel.scest.scest.SCEstModule
import de.cau.cs.kieler.scl.scl.Statement
import org.eclipse.emf.common.util.EList
import de.cau.cs.kieler.esterel.esterel.EsterelThread
import de.cau.cs.kieler.scl.scl.Thread
import de.cau.cs.kieler.scl.scl.Parallel
import de.cau.cs.kieler.scl.scl.SclFactory
import de.cau.cs.kieler.esterel.scest.scest.SCEstProgram

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
        return SCEstTransformation::ESTERELPARALLEL_ID
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
        for (var j=0; j<prog.modules.length ; j++) {
            var module = prog.modules.get(j)
            if (module.statements != null) {
                var statements = module.statements
                for (var i=0; i<statements.length ; i++) {
                    var statement = statements.get(i)
                    if (statement instanceof de.cau.cs.kieler.esterel.esterel.EsterelParallel) {
                        var Parallel parallel SclFactory::eINSTANCE.createParallel()
                        var threads = (statement as de.cau.cs.kieler.esterel.esterel.EsterelParallel).threads
                        var EList<Thread> newthreads
                        for (EsterelThread et : threads) {
                            var Thread t = SclFactory::eINSTANCE.createThread()
                            t.statements += et.statements
                            newthreads += t
                        }
                        parallel.threads += newthreads
                        module.statements.set(i, parallel)
                    }
                }
            }
            prog.modules.set(j, module)            
        }
        return prog;
    }
    
}