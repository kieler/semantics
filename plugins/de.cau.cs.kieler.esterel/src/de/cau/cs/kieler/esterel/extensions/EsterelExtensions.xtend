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

import de.cau.cs.kieler.esterel.ConstantDeclaration
import de.cau.cs.kieler.esterel.FunctionDeclaration
import de.cau.cs.kieler.esterel.InputDeclaration
import de.cau.cs.kieler.esterel.InputOutputDeclaration
import de.cau.cs.kieler.esterel.OutputDeclaration
import de.cau.cs.kieler.esterel.SensorDeclaration
import de.cau.cs.kieler.esterel.Signal
import de.cau.cs.kieler.esterel.SignalDeclaration
import de.cau.cs.kieler.esterel.TypeDeclaration
import de.cau.cs.kieler.kexpressions.Declaration
import de.cau.cs.kieler.kexpressions.ValueType
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.scl.Module
import de.cau.cs.kieler.esterel.EsterelParallel
import de.cau.cs.kieler.esterel.EsterelThread
import de.cau.cs.kieler.esterel.Constant
import de.cau.cs.kieler.kexpressions.VariableDeclaration
import de.cau.cs.kieler.esterel.Variable
import de.cau.cs.kieler.esterel.Sensor
import de.cau.cs.kieler.esterel.EsterelProgram
import de.cau.cs.kieler.esterel.Present

/**
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
class EsterelExtensions {
    
    def sensorDeclarations(Module m) {
        return m.declarations.filter(SensorDeclaration)
    }
        
    def sensors(Declaration d) {
        return d.valuedObjects.filter(Sensor)
    }
    
    def constantDeclarations(Module m) {
        return m.declarations.filter(ConstantDeclaration)
    }
        
    def constants(Declaration d) {
        return d.valuedObjects.filter(Constant)
    }
    
    def signalDeclarations(Module m) {
        return m.declarations.filter(SignalDeclaration)
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
        return m.declarations.filter(TypeDeclaration)
    }
    
    def functionDeclarations(Module m) {
        return m.declarations.filter(FunctionDeclaration)
    }
    
    def ValueType type(ValuedObject vo) {
        switch (vo) {
            Signal: return vo.type
            Sensor: return vo.type.type
        }
    }
    
    def threads(EsterelParallel par) {
        return par.statements.filter(EsterelThread)
    }
    
    // ---------------------------------------------------------------------
    
    def isKernel(EsterelProgram prog) {
        return prog.eAllContents.forall[
            switch (it) {
                // TODO
                default: false
            }
        ]
    }
    
}