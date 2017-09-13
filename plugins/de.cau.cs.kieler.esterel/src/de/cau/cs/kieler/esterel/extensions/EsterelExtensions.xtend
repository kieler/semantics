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

import de.cau.cs.kieler.esterel.ConstantMultiDeclaration
import de.cau.cs.kieler.esterel.EsterelModule
import de.cau.cs.kieler.esterel.InputDeclaration
import de.cau.cs.kieler.esterel.InputOutputDeclaration
import de.cau.cs.kieler.esterel.OutputDeclaration
import de.cau.cs.kieler.esterel.SensorDeclaration
import de.cau.cs.kieler.esterel.Signal
import de.cau.cs.kieler.esterel.SignalDeclaration
import de.cau.cs.kieler.kexpressions.Declaration
import de.cau.cs.kieler.kexpressions.ValueType
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.scl.Module
import de.cau.cs.kieler.esterel.TypeDeclaration
import de.cau.cs.kieler.esterel.FunctionDeclaration

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
        
    def sensors(Declaration d) {
        return d.valuedObjects.filter(SensorDeclaration)
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
    
    def signals(Declaration d) {
        return d.valuedObjects.filter(Signal)
    }
    
    def isInput(SignalDeclaration d) {
        return d instanceof InputDeclaration || d instanceof InputOutputDeclaration
    }
    
    def isInputOnly(SignalDeclaration d) {
        return d instanceof InputDeclaration
    } 
       
    def isOutput(SignalDeclaration d) {
        return d instanceof OutputDeclaration || d instanceof InputOutputDeclaration
    }
    
    def isOutputOnly(SignalDeclaration d) {
        return d instanceof OutputDeclaration
    }
    
    def typeDeclarations(Module m) {
        if (m instanceof EsterelModule) {
            return m.esterelDeclarations.filter(TypeDeclaration)
        }
        return emptyList
    }
    
    def functionDeclarations(Module m) {
        if (m instanceof EsterelModule) {
            return m.esterelDeclarations.filter(FunctionDeclaration)
        }
        return emptyList
    }
    
    def ValueType type(ValuedObject vo) {
        switch (vo) {
            case Signal: return (vo as Signal).type
        }
    }
    
}