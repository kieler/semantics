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
import de.cau.cs.kieler.esterel.scest.extensions.SCEstExtension
import de.cau.cs.kieler.esterel.scest.features.SCEstFeature
import de.cau.cs.kieler.esterel.scest.scest.SCEstProgram
import de.cau.cs.kieler.kico.transformation.AbstractExpansionTransformation
import de.cau.cs.kieler.kitt.tracing.Traceable
import de.cau.cs.kieler.esterel.scest.scest.SCEstModule
import de.cau.cs.kieler.scl.scl.SCLProgram
import de.cau.cs.kieler.scl.scl.ScopeStatement
import com.google.common.collect.Sets

/**
 * @author mrb
 *
 */
class SCLTransformation extends AbstractExpansionTransformation implements Traceable{
    
    // -------------------------------------------------------------------------
    // --                 K I C O      C O N F I G U R A T I O N              --
    // -------------------------------------------------------------------------
    override getId() {
        return SCEstTransformation::SCL_ID
    }

    override getName() {
        return SCEstTransformation::SCL_NAME
    }

    override getExpandsFeatureId() {
        return SCEstFeature::SCL_ID
    }
        
//    override getProducesFeatureIds() {
//        return Sets.newHashSet(SCEstTransformation::)
//    }
//
    override getNotHandlesFeatureIds() {
        return Sets.newHashSet(
              SCEstTransformation::ABORT_ID, SCEstTransformation::ESTERELPARALLEL_ID
            , SCEstTransformation::NOTHING_ID, SCEstTransformation::HALT_ID
            , SCEstTransformation::BLOCK_ID, SCEstTransformation::EMIT_ID
            , SCEstTransformation::SUSTAIN_ID, SCEstTransformation::ESTERELASSIGNMENT_ID
            , SCEstTransformation::PROCCALL_ID, SCEstTransformation::PRESENT_ID
            , SCEstTransformation::IFTEST_ID, SCEstTransformation::LOOP_ID
            , SCEstTransformation::REPEAT_ID, SCEstTransformation::AWAIT_ID
            , SCEstTransformation::EVERYDO_ID, SCEstTransformation::SUSPEND_ID
            , SCEstTransformation::TRAP_ID, SCEstTransformation::EXEC_ID
            , SCEstTransformation::LOCALSIGNALDECL_ID, SCEstTransformation::LOCALVARIABLE_ID
            , SCEstTransformation::RUN_ID, SCEstTransformation::DO_ID
            , SCEstTransformation::UNEMIT_ID, SCEstTransformation::SET_ID
            , SCEstTransformation::SIGNAL_ID, SCEstTransformation::CONSTANT_ID
            , SCEstTransformation::SENSOR_ID, SCEstTransformation::FUNCTION_ID
            , SCEstTransformation::LABELRENAMING_ID
        )
    }

    @Inject
    extension SCEstExtension

    def SCLProgram transform(SCEstProgram prog) {
        var sclProg = createSCLProg
        for (m : prog.modules) {
            transformModule(m, sclProg)
        }
        return sclProg
    }
    
    def transformModule(SCEstModule module, SCLProgram prog) {
        if (module.statements.length == 1 && module.statements.get(0).isInterfaceScope() ) {
            var scope = module.statements.get(0) as ScopeStatement
            prog.declarations.addAll(scope.declarations)
            prog.statements.add(scope.statements)
        }
    }
    
}