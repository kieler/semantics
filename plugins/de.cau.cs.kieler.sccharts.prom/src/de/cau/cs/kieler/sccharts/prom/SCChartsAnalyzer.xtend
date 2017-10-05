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
        return "de.cau.cs.kieler.sccharts.processors.transformators.takenTransitionSignaling, \n"
             + "de.cau.cs.kieler.sccharts.processors.transformators.reference, \n"
             + "de.cau.cs.kieler.sccharts.processors.transformators.for, \n"
             + "de.cau.cs.kieler.sccharts.processors.transformators.const, \n"
             + "de.cau.cs.kieler.sccharts.processors.transformators.signal, \n"
             + "de.cau.cs.kieler.sccharts.processors.transformators.pre, \n"
             + "de.cau.cs.kieler.sccharts.processors.transformators.suspend, \n"
             + "de.cau.cs.kieler.sccharts.processors.transformators.countDelay, \n"
             + "de.cau.cs.kieler.sccharts.processors.transformators.weakSuspend, \n"
             + "de.cau.cs.kieler.sccharts.processors.transformators.history, \n"
             + "de.cau.cs.kieler.sccharts.processors.transformators.deferred, \n"
             + "de.cau.cs.kieler.sccharts.processors.transformators.static, \n"
             + "de.cau.cs.kieler.sccharts.processors.transformators.duringAction, \n"
             + "de.cau.cs.kieler.sccharts.processors.transformators.complexFinalState, \n"
             + "de.cau.cs.kieler.sccharts.processors.transformators.abort, \n"
             + "de.cau.cs.kieler.sccharts.processors.transformators.exitAction, \n"
             + "de.cau.cs.kieler.sccharts.processors.transformators.initialization, \n"
             + "de.cau.cs.kieler.sccharts.processors.transformators.entryAction, \n"
             + "de.cau.cs.kieler.sccharts.processors.transformators.connector, \n"
             + "de.cau.cs.kieler.sccharts.processors.transformators.triggerEffect, \n"
             + "de.cau.cs.kieler.sccharts.processors.transformators.surfaceDepth, \n" 
             + "de.cau.cs.kieler.sccharts.scg.processors.transformators.SCG, \n"
             // SCG transformations
             + "de.cau.cs.kieler.scg.processors.transformators.dependency, \n"
             + "de.cau.cs.kieler.scg.processors.transformators.basicBlocks, \n"
             + "de.cau.cs.kieler.scg.processors.transformators.expressions, \n"
             + "de.cau.cs.kieler.scg.processors.transformators.guards, \n"
             + "de.cau.cs.kieler.scg.processors.transformators.scheduler, \n"
             + "de.cau.cs.kieler.scg.processors.transformators.sequentializer"
    }
}