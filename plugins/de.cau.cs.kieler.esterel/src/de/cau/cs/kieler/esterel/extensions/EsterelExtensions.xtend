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
package de.cau.cs.kieler.esterel.extensions

import de.cau.cs.kieler.scl.Module
import de.cau.cs.kieler.esterel.EsterelModule
import de.cau.cs.kieler.esterel.SensorDeclaration
import de.cau.cs.kieler.esterel.ConstantMultiDeclaration
import de.cau.cs.kieler.esterel.SignalDeclaration

/**
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
class EsterelExtensions {
    
    def sensorDeclarations(Module m) {
        if (m instanceof EsterelModule) {
            return m.esterelDeclarations.filter(SensorDeclaration)
        }
        return emptyList
    }
    
    def constantDeclarations(Module m) {
        if (m instanceof EsterelModule) {
            return m.esterelDeclarations.filter(ConstantMultiDeclaration).map[constantDecalrations].flatten
        }
        return emptyList
    }
    
    def signalDeclarations(Module m) {
        if (m instanceof EsterelModule) {
            return m.esterelDeclarations.filter(SignalDeclaration)
        }
        return emptyList
    }
}