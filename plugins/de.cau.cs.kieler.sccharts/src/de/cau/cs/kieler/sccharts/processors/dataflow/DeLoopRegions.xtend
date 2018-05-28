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
package de.cau.cs.kieler.sccharts.processors.dataflow

import com.google.inject.Inject
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsDeclarationExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kexpressions.kext.extensions.KExtDeclarationExtensions
import de.cau.cs.kieler.sccharts.Scope
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.processors.SCChartsProcessor

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
import de.cau.cs.kieler.kexpressions.VariableDeclaration
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.keffects.extensions.KEffectsExtensions
import de.cau.cs.kieler.sccharts.DataflowRegion
import de.cau.cs.kieler.sccharts.extensions.SCChartsControlflowRegionExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsStateExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsTransitionExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsActionExtensions
import org.eclipse.emf.ecore.EObject
import de.cau.cs.kieler.sccharts.DelayType
import de.cau.cs.kieler.sccharts.PreemptionType
import de.cau.cs.kieler.sccharts.SCChartsFactory
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsCreateExtensions
import de.cau.cs.kieler.kexpressions.VectorValue
import de.cau.cs.kieler.kexpressions.keffects.Assignment
import de.cau.cs.kieler.kexpressions.IgnoreValue
import de.cau.cs.kieler.kexpressions.ReferenceDeclaration
import de.cau.cs.kieler.sccharts.ControlflowRegion
import de.cau.cs.kieler.sccharts.SCCharts
import de.cau.cs.kieler.sccharts.extensions.SCChartsDataflowRegionExtensions
import de.cau.cs.kieler.kexpressions.keffects.dependencies.AbstractDependencyAnalysis
import de.cau.cs.kieler.kexpressions.keffects.dependencies.LinkableInterfaceData
import de.cau.cs.kieler.kexpressions.keffects.DataDependency
import de.cau.cs.kieler.kexpressions.ValueType
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsReplacementExtensions
import de.cau.cs.kieler.kicool.environments.AnnotationModel

/**
 * @author ssm
 * @kieler.design 2018-05-28 proposed
 * @kieler.rating 2018-05-28 proposed yellow  
 */
class DeLoopRegions extends SCChartsProcessor {
    
    @Inject extension SCChartsControlflowRegionExtensions
    @Inject extension SCChartsDataflowRegionExtensions
    @Inject extension SCChartsStateExtensions
    @Inject extension SCChartsTransitionExtensions
    @Inject extension SCChartsActionExtensions
    @Inject extension KExpressionsValuedObjectExtensions
    @Inject extension KEffectsExtensions
    @Inject extension KExtDeclarationExtensions
    @Inject extension KExpressionsDeclarationExtensions
    @Inject extension KExpressionsCreateExtensions
    @Inject extension KExpressionsReplacementExtensions
    
    extension SCChartsFactory sccFactory = SCChartsFactory.eINSTANCE
    
    static val GENERATED_PREFIX = "__dlr_"
    
    var regionCounter = 0
    
    override getId() {
        "de.cau.cs.kieler.sccharts.processors.DeLoopRegions"
    }
    
    override getName() {
        "DeLoop"
    }
    
    var AnnotationModel<SCCharts> annotationModel 
    
    override process() {
        val model = getModel
        annotationModel = model.createAnnotationModel
        
        for (subModel : model.rootStates.immutableCopy) {
            subModel.processSuperState(model)
        }
    }
    
    def processSuperState(State state, SCCharts scc) {
        val cfrs = state.regions.filter(ControlflowRegion).toList
         
        for (cfr : cfrs.immutableCopy) {
            val initialState = cfr.states.filter[ initial ].head
            
            val incomingDelayed = initialState.incomingTransitions.filter[ delayed ].toList
            
            if (incomingDelayed.size > 1) {
                annotationModel.addWarning(initialState, "The initial state has more than one incoming delayed transition.")
            }              
            
            for (id : incomingDelayed) {
                id.remove
            }
            
            for (d : cfr.states.map[ outgoingTransitions ].flatten.filter[ delayed ]) {
                annotationModel.addWarning(d.eContainer, "Non-initial delay detected.")
            }
                        
            snapshot
        }
    }
    
}
