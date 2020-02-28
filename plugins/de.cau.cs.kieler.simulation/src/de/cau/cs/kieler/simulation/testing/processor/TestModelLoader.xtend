/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2020 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.simulation.testing.processor

import de.cau.cs.kieler.kicool.compilation.Processor
import de.cau.cs.kieler.kicool.compilation.ProcessorType
import de.cau.cs.kieler.simulation.testing.TestModelData
import org.eclipse.emf.ecore.EObject
import de.cau.cs.kieler.core.services.KielerLanguage

/**
 * @author als
 */
class TestModelLoader extends Processor<TestModelData, EObject> {
    
    public static val ID = "de.cau.cs.kieler.simulation.testing.model.loader"
    public static val LANGUAGES = KielerLanguage.allRegisteredLanguages.toList
    
    override getId() {
        ID
    }
    
    override getName() {
        "Test Model Loader"
    }
    
    override getType() {
        ProcessorType.EXOGENOUS_TRANSFORMATOR
    }
    
    override process() {
        model = model.load(LANGUAGES.findFirst[supportedResourceExtensions.contains(model.modelFileExtension)]?.injector)
    }
    
}