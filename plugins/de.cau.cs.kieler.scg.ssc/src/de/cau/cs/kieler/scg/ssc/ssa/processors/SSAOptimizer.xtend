/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2016 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.scg.ssc.ssa.processors

import com.google.common.collect.HashMultimap
import de.cau.cs.kieler.core.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.core.kexpressions.Declaration
import de.cau.cs.kieler.core.kexpressions.FunctionCall
import de.cau.cs.kieler.core.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kico.KielerCompilerContext
import de.cau.cs.kieler.kico.transformation.AbstractProductionTransformation
import de.cau.cs.kieler.scg.Assignment
import de.cau.cs.kieler.scg.Entry
import de.cau.cs.kieler.scg.Exit
import de.cau.cs.kieler.scg.Join
import de.cau.cs.kieler.scg.Node
import de.cau.cs.kieler.scg.RelativeWrite_Read
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.extensions.SCGControlFlowExtensions
import de.cau.cs.kieler.scg.extensions.SCGCoreExtensions
import de.cau.cs.kieler.scg.extensions.SCGThreadExtensions
import de.cau.cs.kieler.scg.ssc.features.SSAFeature
import de.cau.cs.kieler.scg.ssc.features.SSAOptFeature
import de.cau.cs.kieler.scg.ssc.ssa.SSACacheExtensions
import de.cau.cs.kieler.scg.ssc.ssa.SSACoreExtensions
import javax.inject.Inject

import static com.google.common.collect.Sets.*
import static de.cau.cs.kieler.scg.ssc.ssa.SSAFunction.*

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
import de.cau.cs.kieler.scg.Conditional
import de.cau.cs.kieler.core.kexpressions.Parameter
import de.cau.cs.kieler.scg.DataDependency
import de.cau.cs.kieler.scg.ssc.ssa.MergeExpressionExtension
import de.cau.cs.kieler.core.kexpressions.Expression

/**
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
class SSAOptimizer extends AbstractProductionTransformation {

    // -------------------------------------------------------------------------
    // --                 K I C O      C O N F I G U R A T I O N              --
    // -------------------------------------------------------------------------
    override getId() {
        return "scg.ssa.opt"
    }

    override getName() {
        return "SSA Optimization"
    }

    override getProducedFeatureId() {
        return SSAOptFeature.ID
    }

    override getRequiredFeatureIds() {
        return newHashSet(SSAFeature.ID)
    }

    // -------------------------------------------------------------------------
    
    @Inject
    extension SCGControlFlowExtensions
    @Inject
    extension SCGCoreExtensions
    @Inject
    extension SCGThreadExtensions
    
    @Inject
    extension KExpressionsValuedObjectExtensions
    
    @Inject
    extension AnnotationsExtensions
    
    @Inject
    extension SSACoreExtensions
    @Inject
    extension SSACacheExtensions
    
    @Inject
    extension MergeExpressionExtension

    // -------------------------------------------------------------------------
    
    def SCGraph transform(SCGraph scg, KielerCompilerContext context) {


//        context.markSSACreatedAssignmentVariables(scg)

        scg.createStringAnnotation(SSAOptFeature.ID, SSAOptFeature.ID)
        return scg
    }

}
