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
package de.cau.cs.kieler.sccharts.processors.transformators

import com.google.inject.Inject
import de.cau.cs.kieler.kexpressions.OperatorExpression
import de.cau.cs.kieler.kexpressions.Parameter
import de.cau.cs.kieler.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsDeclarationExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kexpressions.keffects.Assignment
import de.cau.cs.kieler.kexpressions.keffects.Emission
import de.cau.cs.kieler.kexpressions.kext.extensions.KExtDeclarationExtensions
import de.cau.cs.kieler.sccharts.ControlflowRegion
import de.cau.cs.kieler.sccharts.Scope
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.extensions.SCChartsReferenceExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsScopeExtensions
import de.cau.cs.kieler.sccharts.processors.SCChartsProcessor

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
import de.cau.cs.kieler.kexpressions.Value
import de.cau.cs.kieler.kexpressions.Expression
import de.cau.cs.kieler.kexpressions.VariableDeclaration
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.keffects.extensions.KEffectsExtensions
import de.cau.cs.kieler.sccharts.DataflowRegion
import de.cau.cs.kieler.sccharts.extensions.SCChartsDataflowRegionExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsControlflowRegionExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsStateExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsTransitionExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsActionExtensions
import org.eclipse.emf.ecore.EObject

/**
 * @author ssm
 * @kieler.design 2017-10-19 proposed
 * @kieler.rating 2017-10-19 proposed yellow  
 */
class Dataflow extends SCChartsProcessor {
    
    @Inject extension SCChartsDataflowRegionExtensions
    @Inject extension SCChartsControlflowRegionExtensions
    @Inject extension SCChartsStateExtensions
    @Inject extension SCChartsTransitionExtensions
    @Inject extension SCChartsActionExtensions
    
    static val GENERATED_PREFIX = "__df_"
    
    override getId() {
        "de.cau.cs.kieler.sccharts.processors.transformators.dataflow"
    }
    
    override getName() {
        "Dataflow V2"
    }
    
    override process() {
        
    }
    
    def processStates(State state) {
        for (df : state.getDataflowRegions.toList) {
            df.processDataflowRegion
            
            snapshot
        }
    }
    
    def processDataflowRegion(DataflowRegion dataflowRegion) {
        val removeList = <EObject> newLinkedList => [ add(dataflowRegion) ]
        val parentState = dataflowRegion.eContainer as State
        
        val newControlflowRegion = parentState.createControlflowRegion(GENERATED_PREFIX + dataflowRegion.name)
        val newMainState = newControlflowRegion.createState(GENERATED_PREFIX + "main") => [
            initial = true
        ]
        for (declaration : dataflowRegion.declarations.immutableCopy) {
            newControlflowRegion.declarations += declaration
        }
        
        var i = 0
        for (equation : dataflowRegion.equations.immutableCopy) {
            val newEqCfRegion = newMainState.createControlflowRegion(GENERATED_PREFIX + "subRegion_" + i)
            val newEqCfState = newEqCfRegion.createState(GENERATED_PREFIX + "" + i) => [ initial = true]
            val selfLoop = newEqCfState.createTransitionTo(newEqCfState)
            selfLoop.addAssignment(equation)
            i++
        }
        
        for (r : removeList) {
            r.remove
        }
    }
    
}
