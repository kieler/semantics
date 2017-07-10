/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2014 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.esterel.transformations

import com.google.common.collect.Sets
import de.cau.cs.kieler.kico.transformation.AbstractExpansionTransformation
import de.cau.cs.kieler.esterel.features.EsterelFeature
import de.cau.cs.kieler.esterel.esterel.Program
import de.cau.cs.kieler.esterel.scest.transformations.SCEstTransformation
import de.cau.cs.kieler.esterel.scest.scest.SCEstProgram
import de.cau.cs.kieler.esterel.scest.scest.SCEstModule
import de.cau.cs.kieler.esterel.esterel.Module
import com.google.inject.Inject
import de.cau.cs.kieler.esterel.scest.extensions.SCEstExtension

/**
 * This class handles the default NO simulation visualization
 * 
 * @author cmot
 * @kieler.design 2014-07-23 proposed cmot
 * @kieler.rating 2014-07-23 proposed yellow
 */
class SCEstTransform extends AbstractExpansionTransformation {
    
    //-------------------------------------------------------------------------
    //--                 K I C O      C O N F I G U R A T I O N              --
    //-------------------------------------------------------------------------
    
    override getId() {
        return "esterel.scest"
    }

    override getName() {
        return "SCEst"
    }

    override getExpandsFeatureId() {
        return "esterel.scest"
    }

    override getProducesFeatureIds() {
        return Sets.newHashSet(SCEstTransformation::INITIALIZATION_ID)
    }
    
    @Inject
    extension SCEstExtension
    
    def SCEstProgram transform(Program prog) {
        for (var i=0; i<prog.modules.length; i++) {
            prog.modules.set(i, prog.modules.get(i) as SCEstModule)
        }
        return prog as SCEstProgram
//        var scestProgram = createSCEstProgram
//        for (m : prog.modules) {
//            scestProgram.modules.add(m.copyModule)
//        }
//        scestProgram
    }
    
    def SCEstModule copyModule(Module m) {
        var module = createSCEstModule
        module.annotations += m.annotations
        module.name = m.name
        module.intConstantDecls += m.intConstantDecls
        module.intFunctionDecls += m.intFunctionDecls
        module.intProcedureDecls += m.intProcedureDecls
        module.intRelationDecls += m.intRelationDecls
        module.intSensorDecls += m.intSensorDecls
        module.intSignalDecls += m.intSignalDecls
        module.intTaskDecls += m.intTaskDecls
        module.intTypeDecls += m.intTypeDecls
        module.statements += m.statements
        return module
    }

}
