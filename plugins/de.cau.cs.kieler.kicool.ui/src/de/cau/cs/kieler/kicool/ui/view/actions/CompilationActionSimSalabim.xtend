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
package de.cau.cs.kieler.kicool.ui.view.actions

import de.cau.cs.kieler.kicool.compilation.observer.ProcessorFinished
import de.cau.cs.kieler.kicool.compilation.observer.AbstractContextNotification

/**
 * @author ssm
 * @kieler.design 2017-05-11 proposed
 * @kieler.rating 2017-05-11 proposed yellow  
 */
class CompilationActionSimSalabim {
    public static val SIM_MODEL = "Double rainbow... what does it mean?"
    public static val SIM_ANSWER = "Well, a double rainbow is a phenomenon of optics that displays a spectrum of light due to the sun shining on droplets of moisture in the atmosphere. Does that explain it?"
    
    static def void simSalabim(AbstractContextNotification arg) {
        if (arg instanceof ProcessorFinished) {
            val model = arg.processorUnit.environment.model
            if (model instanceof String) {
                if (model.equals(CompilationActionSimSalabim.SIM_MODEL)) {
                    println(CompilationActionSimSalabim.SIM_ANSWER)
                }
            }
        }
    }
}