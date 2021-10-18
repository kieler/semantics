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
package de.cau.cs.kieler.kicool.processors.analyzers

import java.util.Map
import org.eclipse.emf.ecore.EObject

/**
 * @author als
 */
class EcoreModelData extends AbstractModelDataCollector<EObject> {
    
    override getId() {
        "de.cau.cs.kieler.kicool.processors.analyzers.model.data.ecore"
    }
    
    override getName() {
        "Ecore Model Data"
    }
    
    override collect(EObject model, Map<String, Object> data) {
        data.put("ecore.eobjects", model.eAllContents.size)
    }
    
}