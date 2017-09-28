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
package de.cau.cs.kieler.sccharts.prom

import de.cau.cs.kieler.prom.templates.DeclarationAnalyzer
import de.cau.cs.kieler.sccharts.SCCharts
import org.eclipse.emf.ecore.EObject
import de.cau.cs.kieler.prom.FileExtensions

/**
 * @author aas
 *
 */
class SCChartsAnalyzer extends DeclarationAnalyzer {
    /**
     * {@inheritDoc}
     */
    override getDeclarations(EObject model) {
        if(model instanceof SCCharts) {
            val rootState = model.rootStates.get(0)
            if(rootState != null) {
                return rootState.declarations
            }
        }
    }
    
    /**
     * {@inheritDoc}
     */
    override getModelName(EObject model) {
        if (model instanceof SCCharts) {
            if(!model.rootStates.isNullOrEmpty) {
                return model.rootStates.get(0).name
            }
        }
    }
    
    /**
     * {@inheritDoc}
     */
    override getSupportedFileExtensions() {
        return #[FileExtensions.SCCHART]
    }
    
    /**
     * {@inheritDoc}
     */
    override getSupportedModelTypes() {
        return #[SCCharts]
    }
    
    /**
     * {@inheritDoc}
     */
    override protected getDefaultSimulationFrontend() {
        // TODO: Make a compilation system to compile SCCharts to SCG
        return "de.cau.cs.kieler.sccharts.processors.transformators.takenTransitionSignaling"
             + ", de.cau.cs.kieler.sccharts.processors.transformators.reference"
             + ", de.cau.cs.kieler.sccharts.processors.transformators.for"
             + ", de.cau.cs.kieler.sccharts.processors.transformators.const"
             + ", de.cau.cs.kieler.sccharts.processors.transformators.signal"
             + ", de.cau.cs.kieler.sccharts.processors.transformators.pre"
             + ", de.cau.cs.kieler.sccharts.processors.transformators.suspend"
             + ", de.cau.cs.kieler.sccharts.processors.transformators.countDelay"
             + ", de.cau.cs.kieler.sccharts.processors.transformators.weakSuspend"
             + ", de.cau.cs.kieler.sccharts.processors.transformators.history"
             + ", de.cau.cs.kieler.sccharts.processors.transformators.deferred"
             + ", de.cau.cs.kieler.sccharts.processors.transformators.static"
             + ", de.cau.cs.kieler.sccharts.processors.transformators.duringAction"
             + ", de.cau.cs.kieler.sccharts.processors.transformators.complexFinalState"
             + ", de.cau.cs.kieler.sccharts.processors.transformators.abort"
             + ", de.cau.cs.kieler.sccharts.processors.transformators.exitAction"
             + ", de.cau.cs.kieler.sccharts.processors.transformators.initialization"
             + ", de.cau.cs.kieler.sccharts.processors.transformators.entryAction"
             + ", de.cau.cs.kieler.sccharts.processors.transformators.connector"
             + ", de.cau.cs.kieler.sccharts.processors.transformators.triggerEffect"
             + ", de.cau.cs.kieler.sccharts.processors.transformators.surfaceDepth" 
             + ", de.cau.cs.kieler.sccharts.scg.processors.transformators.SCG"
    }
}