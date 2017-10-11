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
    override protected getDefaultCompileChain() {
        return "de.cau.cs.kieler.sccharts.processors.transformators.takenTransitionSignaling, \n"
             + "de.cau.cs.kieler.sccharts.netlist.simple"
    }
}