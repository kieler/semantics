/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
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
package de.cau.cs.kieler.sccharts.processors.dataflow

import com.google.inject.Inject
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsCreateExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsDeclarationExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kexpressions.keffects.Assignment
import de.cau.cs.kieler.kexpressions.keffects.extensions.KEffectsExtensions
import de.cau.cs.kieler.sccharts.ControlflowRegion
import de.cau.cs.kieler.sccharts.DataflowRegion
import de.cau.cs.kieler.sccharts.SCCharts
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.extensions.SCChartsActionExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsDataflowRegionExtensions
import de.cau.cs.kieler.sccharts.processors.SCChartsProcessor

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*

/**
 * @author ssm
 * @kieler.design 2018-05-29 proposed
 * @kieler.rating 2018-05-29 proposed yellow  
 */
class ToSimpleDataflow extends SCChartsProcessor {
    
    @Inject extension KExpressionsCreateExtensions
    @Inject extension KExpressionsDeclarationExtensions
    @Inject extension KExpressionsValuedObjectExtensions
    @Inject extension KEffectsExtensions
    @Inject extension SCChartsActionExtensions
    @Inject extension SCChartsDataflowRegionExtensions
    
    override getId() {
        "de.cau.cs.kieler.sccharts.processors.toSimpleDataflow"
    }
    
    override getName() {
        "Dataflow"
    }
    
    override process() {
        val model = getModel
        
        for (subModel : model.rootStates.filter[ regions.head instanceof ControlflowRegion ].toList) {
            subModel.processSuperState(model)
        }
    }
    
    def processSuperState(State state, SCCharts scc) {
        val cfr = state.regions.filter(ControlflowRegion).head
        
        val dfr = state.createDataflowRegion(state.name)
         
        for (d : cfr.declarations.immutableCopy) {
            dfr.declarations += d
        }

        val initial = cfr.states.filter[ initial ].head
        
        if (initial.outgoingTransitions.size == 1) {
            initial.processAssignment(dfr)
        } else if (initial.outgoingTransitions.size == 2) {
            initial.processConditional(dfr) 
        }
            
        cfr.remove
        snapshot
    }
    
    protected def processAssignment(State state, DataflowRegion dfr) {
        val t = state.outgoingTransitions.head
        val a = t.effects.head as Assignment
        
        dfr.equations += a 
    }
    
    protected def processConditional(State state, DataflowRegion dfr) {
        val tThen = state.outgoingTransitions.head
        val tElse = state.outgoingTransitions.get(1)
        val aThen = tThen.effects.head as Assignment
        val aElse = tElse.effects.head as Assignment
        
        val asgn = aThen.valuedObject
        // TODO: check if asgn is the same for both tansitions
        
        dfr.equations += createAssignment => [
            reference = asgn.reference
            expression = createConditionalExpression(tThen.trigger, aThen.expression, aElse.expression)
        ]  
    }
    
}
