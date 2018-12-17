/*
 * RegularSSATransformation.xtend * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2018 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.scg.processors.transformators.codegen.smv

import de.cau.cs.kieler.annotations.AnnotationsFactory
import de.cau.cs.kieler.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsCreateExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsDeclarationExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kexpressions.keffects.extensions.KEffectsExtensions
import de.cau.cs.kieler.kicool.compilation.InplaceProcessor
import de.cau.cs.kieler.kicool.kitt.tracing.Traceable
import de.cau.cs.kieler.scg.Assignment
import de.cau.cs.kieler.scg.Entry
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.SCGraphs
import de.cau.cs.kieler.scg.ScgFactory
import de.cau.cs.kieler.scg.ScgPackage
import de.cau.cs.kieler.scg.extensions.SCGCoreExtensions
import de.cau.cs.kieler.scg.extensions.SCGManipulationExtensions
import de.cau.cs.kieler.scg.ssa.IOPreserverExtensions
import de.cau.cs.kieler.scg.ssa.SSACoreExtensions
import de.cau.cs.kieler.scg.ssa.SSATransformationExtensions
import javax.inject.Inject

/**
 * @author aas
 */
class ReplacePreOperatorOfSCG extends InplaceProcessor<SCGraphs> implements Traceable {

    // -------------------------------------------------------------------------
    // --                 K I C O      C O N F I G U R A T I O N              --
    // -------------------------------------------------------------------------
    override getId() {
        return "de.cau.cs.kieler.scg.processors.ssa.replacepre"
    }

    override getName() {
        return "Replace Pre"
    }

    override process() {
        model.scgs.forEach[transform]
        model = model
    }

    // -------------------------------------------------------------------------
    // -------------------------------------------------------------------------
    @Inject extension SCGManipulationExtensions
    @Inject extension SCGCoreExtensions
    @Inject extension KExpressionsValuedObjectExtensions
    @Inject extension SSACoreExtensions
    @Inject extension SSATransformationExtensions
    @Inject extension KExpressionsDeclarationExtensions
    @Inject extension KExpressionsCreateExtensions   
    @Inject extension IOPreserverExtensions      
    @Inject extension AnnotationsExtensions
    extension AnnotationsFactory = AnnotationsFactory::eINSTANCE
    extension ScgFactory = ScgPackage.eINSTANCE.scgFactory
    @Inject extension KEffectsExtensions
    
    // -------------------------------------------------------------------------
    def SCGraph transform(SCGraph scg) {
        
        return scg
    }
}
