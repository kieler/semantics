/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright ${year} by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.scg.processors.simulink

import de.cau.cs.kieler.kicool.compilation.InplaceProcessor
import de.cau.cs.kieler.kicool.compilation.CodeContainer

/**
 * @author msa
 *
 */
class SimulinkProcessor extends InplaceProcessor<CodeContainer> {
    
    override getId() {
        "de.cau.cs.kieler.scg.processors.simulink"
    }
    
    override getName() {
        "Simulink"
    }
    
    override process() {
        getModel.add("wrapper", "hello world!")
    }
    
}