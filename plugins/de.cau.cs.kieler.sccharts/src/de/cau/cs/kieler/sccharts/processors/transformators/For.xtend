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
import de.cau.cs.kieler.core.model.Pair
import de.cau.cs.kieler.kexpressions.IntValue
import de.cau.cs.kieler.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsCreateExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsDeclarationExtensions
import de.cau.cs.kieler.sccharts.Region
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.extensions.SCChartsScopeExtensions
import de.cau.cs.kieler.sccharts.processors.SCChartsProcessor

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*

/**
 * 
 * @author ssm
 * @kieler.design 2017-08-01 proposed
 * @kieler.rating 2017-08-01 proposed yellow  
 */
class For extends SCChartsProcessor {
    
    @Inject extension KExpressionsDeclarationExtensions
    @Inject extension KExpressionsCreateExtensions
    @Inject extension SCChartsScopeExtensions
    
    override getId() {
        "de.cau.cs.kieler.sccharts.processors.transformators.for"
    }
    
    override getName() {
        "For V2"
    }
    
    override process() {
        val model = getModel
        
        for (rootState : model.rootStates) {
            rootState.transformFor    
        }
    }
    
    protected def transformFor(State state) {
        val forRegions = state.getAllStates.map[regions.filter[ counterVariable != null ]].toList.flatten.toList
        
        for (r : forRegions) {
            r.transformForRegion
        }
    }
    
    protected def transformForRegion(Region region) {
        val range = region.forRegionRange
        region.transformForRegionRange(range.first, range.second)
    }
    
    static def Pair<Integer, Integer> getForRegionRange(Region region) {
        switch (region.forStart) {
            IntValue: {
                val firstValue = (region.forStart as IntValue).value
                val secondValue = (region.forEnd as IntValue).value
                return new Pair<Integer, Integer>(firstValue, secondValue)
            }
            ValuedObjectReference: {
                val firstValue = 0
                val secondValue = ((region.forStart as ValuedObjectReference).valuedObject.cardinalities.head as IntValue).value - 1
                return new Pair<Integer, Integer>(firstValue, secondValue)
            }
        }
        throw new UnsupportedOperationException("The for region range type is not supported.")
    }
    
    protected def transformForRegionRange(Region region, int firstValue, int secondValue) {
        val regionCopy = region.copy => [
            forStart = null
            forEnd = null
        ]
        val references = regionCopy.eAllContents.filter(ValuedObjectReference).filter[ valuedObject == regionCopy.counterVariable ].toList
        regionCopy.counterVariable = null
        
        for(i : firstValue..secondValue) {
            val counterVariable = region.counterVariable.copy => [
                initialValue = createIntValue(i)
            ]
            
            for (ref : references) {
              ref.valuedObject = counterVariable  
            }  
            val regionCopyCopy = regionCopy.copy
            
            createIntDeclaration => [
                const = true
                valuedObjects += counterVariable
                regionCopyCopy.declarations += it
            ]
            
            region.parentState.regions += regionCopyCopy
            
            snapshot
        }
        
        region.remove
    }
    
    protected def transformForRegionWithReference(Region region) {
        
    }
    
}
