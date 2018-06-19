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
package de.cau.cs.kieler.kicool.deploy.processor

import de.cau.cs.kieler.kicool.compilation.InplaceProcessor
import de.cau.cs.kieler.kicool.compilation.VariableStore
import org.eclipse.emf.ecore.EObject

/**
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
class VariableStoreCleaner extends InplaceProcessor<EObject> {

    override getId() {
        "de.cau.cs.kieler.kicool.deploy.variable.store.clean"
    }

    override getName() {
        "Variable Store Cleaner"
    }

    override process() {
        // Initialize varibable store
        val voStore = VariableStore.getVariableStore(environment)
        voStore.removeAllUncontainedVO(model, environment, true, true)
        voStore.matchAllVOs(model, environment, false)
    }
}
