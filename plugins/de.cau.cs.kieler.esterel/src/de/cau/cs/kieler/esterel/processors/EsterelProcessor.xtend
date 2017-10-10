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
package de.cau.cs.kieler.esterel.processors

import de.cau.cs.kieler.esterel.EsterelProgram
import de.cau.cs.kieler.kicool.compilation.InplaceProcessor

/**
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
abstract class EsterelProcessor extends InplaceProcessor<EsterelProgram> {
    
    override process() {
        setModel(getModel.transform)
    }
    
    abstract def EsterelProgram transform(EsterelProgram p)
    
}