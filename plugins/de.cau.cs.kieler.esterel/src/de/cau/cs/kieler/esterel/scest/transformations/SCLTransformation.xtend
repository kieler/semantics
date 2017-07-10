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
import de.cau.cs.kieler.scl.scl.SCLProgram
import de.cau.cs.kieler.scl.scl.ScopeStatement
import com.google.common.collect.Sets
import de.cau.cs.kieler.esterel.esterel.LocalVariable
import de.cau.cs.kieler.esterel.esterel.LocalSignalDecl
import de.cau.cs.kieler.scl.features.SCLFeatures
import de.cau.cs.kieler.annotations.Annotation
import de.cau.cs.kieler.esterel.esterel.Module

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
    
    override getProducesFeatureIds() {
        return Sets.newHashSet(SCLFeatures.BASIC_ID)
    }

    override getNotHandlesFeatureIds() {
        return Sets.newHashSet(
              SCEstTransformation::ABORT_ID, SCEstTransformation::ESTERELPARALLEL_ID
            , SCEstTransformation::NOTHING_ID, SCEstTransformation::HALT_ID
            , SCEstTransformation::BLOCK_ID, SCEstTransformation::EMIT_ID
            , SCEstTransformation::SUSTAIN_ID
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
        sclProg.name = "GENERATED_SCL_MODULE"
        for (m : prog.modules) {
            m.removeLocalSignalsAndVariables
            m.removeDepthAnnotations
            transformModule(m, sclProg)
        }
        return sclProg
    }
    
    def transformModule(Module module, SCLProgram prog) {
        if (module.statements.length == 1 && module.statements.get(0).isInterfaceScope() ) {
            (module.statements.get(0) as ScopeStatement).renameIScope(module.name)
            prog.statements.add( module.statements.get(0) )
        }
        else {
            throw new UnsupportedOperationException(
                        "The following module is not ready to be transformed into a SCL metamodel! " + module.name)
        }
    }
    
    def removeLocalSignalsAndVariables(Module module) {
        var localVariables = module.eAllContents.toList.filter(LocalVariable)
        var localSignals = module.eAllContents.toList.filter(LocalSignalDecl)
        // remove original local IVariables
        for (v : localVariables) {
            if (v.statements.size == 1 && (v.statements.get(0) instanceof ScopeStatement)) {
                var statements = v.getContainingList
                var pos = statements.indexOf(v)
                statements.set(pos, v.statements.get(0))
            }
            else {
                throw new UnsupportedOperationException(
                        "There should be just one statement (a scope) in the statements list of the following local variable declaration! " + v)
            }
        }
        // remove original local ISignals
        for (s : localSignals) {
            if (s.statements.size == 1 && (s.statements.get(0) instanceof ScopeStatement)) {
                var statements = s.getContainingList
                var pos = statements.indexOf(s)
                statements.set(pos, s.statements.get(0))
            }
            else {
                throw new UnsupportedOperationException(
                        "There should be just one statement (a scope) in the statements list of the following local signal declaration! " + s)
            }
        }
    }
    
    def removeDepthAnnotations(Module module) {
        var annotationList = module.eAllContents.toList.filter(Annotation)
        for (a : annotationList) {
            if (a.isGenerated) {
                var annotations =  a.getContainingList
                annotations.remove(a)
            }
        }
    }
    
}