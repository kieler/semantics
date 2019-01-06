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
package de.cau.cs.kieler.scg.processors

import de.cau.cs.kieler.kicool.compilation.InplaceProcessor
import de.cau.cs.kieler.kicool.compilation.VariableStore
import de.cau.cs.kieler.scg.SCGraphs

/**
 * @author aas
 *
 */
class StoreVariableDeclarations extends InplaceProcessor<SCGraphs> {
    
    override getId() {
        "de.cau.cs.kieler.scg.processors.storeVariableDeclarations"
    }
    
    override getName() {
        "Add VariableDeclarations to VariableStore"
    }
    
    override process() {
        val model = getModel
        val store = VariableStore.get(compilationContext.startEnvironment)
        for(scg : model.scgs) {
            for(decl : scg.declarations) {
                for(vo : decl.valuedObjects) {
                    store.update(vo)
                }
            }
        }
    }
}