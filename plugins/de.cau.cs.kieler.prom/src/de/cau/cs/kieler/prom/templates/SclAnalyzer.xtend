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
package de.cau.cs.kieler.prom.templates

import de.cau.cs.kieler.prom.FileExtensions
import de.cau.cs.kieler.scl.SCLProgram
import org.eclipse.emf.ecore.EObject

/**
 * @author aas
 *
 */
class SclAnalyzer extends DeclarationAnalyzer {
    /**
     * {@inheritDoc}
     */
    override getDeclarations(EObject model) {
        if(model instanceof SCLProgram) {
            val rootModule = model.modules.get(0)
            if(rootModule != null) {
                return rootModule.declarations
            }
        }
    }
    
    /**
     * {@inheritDoc}
     */
    override getModelName(EObject model) {
        if(model instanceof SCLProgram) {
            val module = model.modules.get(0)
            if(module != null) {
                return module.name    
            }
        }
    }
    
    /**
     * {@inheritDoc}
     */
    override getSupportedFileExtensions() {
        return #[FileExtensions.SCL]
    }
    
    /**
     * {@inheritDoc}
     */
    override getSupportedModelTypes() {
        return #[SCLProgram]
    }
    
    /**
     * {@inheritDoc}
     */
    override protected getDefaultSimulationFrontend() {
        return "de.cau.cs.kieler.scl.processors.transformators.scl2scg, \n"
             // SCG transformations
             + "de.cau.cs.kieler.scg.processors.transformators.dependency, \n"
             + "de.cau.cs.kieler.scg.processors.transformators.basicBlocks, \n"
             + "de.cau.cs.kieler.scg.processors.transformators.expressions, \n"
             + "de.cau.cs.kieler.scg.processors.transformators.guards, \n"
             + "de.cau.cs.kieler.scg.processors.transformators.scheduler, \n"
             + "de.cau.cs.kieler.scg.processors.transformators.sequentializer"
    }
}