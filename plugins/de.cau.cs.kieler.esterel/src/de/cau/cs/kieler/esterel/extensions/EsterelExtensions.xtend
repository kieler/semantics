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

import de.cau.cs.kieler.annotations.Annotation
import de.cau.cs.kieler.esterel.Block
import de.cau.cs.kieler.esterel.Constant
import de.cau.cs.kieler.esterel.ConstantDeclaration
import de.cau.cs.kieler.esterel.Emit
import de.cau.cs.kieler.esterel.EsterelParallel
import de.cau.cs.kieler.esterel.EsterelProgram
import de.cau.cs.kieler.esterel.EsterelThread
import de.cau.cs.kieler.esterel.Exit
import de.cau.cs.kieler.esterel.Function
import de.cau.cs.kieler.esterel.FunctionDeclaration
import de.cau.cs.kieler.esterel.InputDeclaration
import de.cau.cs.kieler.esterel.InputOutputDeclaration
import de.cau.cs.kieler.esterel.LocalSignalDeclaration
import de.cau.cs.kieler.esterel.Loop
import de.cau.cs.kieler.esterel.Nothing
import de.cau.cs.kieler.esterel.OutputDeclaration
import de.cau.cs.kieler.esterel.Present
import de.cau.cs.kieler.esterel.Procedure
import de.cau.cs.kieler.esterel.ProcedureDeclaration
import de.cau.cs.kieler.esterel.Relation
import de.cau.cs.kieler.esterel.RelationDeclaration
import de.cau.cs.kieler.esterel.Sensor
import de.cau.cs.kieler.esterel.SensorDeclaration
import de.cau.cs.kieler.esterel.Signal
import de.cau.cs.kieler.esterel.SignalDeclaration
import de.cau.cs.kieler.esterel.SignalReference
import de.cau.cs.kieler.esterel.Task
import de.cau.cs.kieler.esterel.TaskDeclaration
import de.cau.cs.kieler.esterel.Trap
import de.cau.cs.kieler.esterel.TrapExpression
import de.cau.cs.kieler.esterel.TrapReference
import de.cau.cs.kieler.esterel.TypeDeclaration
import de.cau.cs.kieler.esterel.TypeDefinition
import de.cau.cs.kieler.esterel.Variable
import de.cau.cs.kieler.kexpressions.Declaration
import de.cau.cs.kieler.kexpressions.OperatorExpression
import de.cau.cs.kieler.kexpressions.ValueType
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.scl.Module
import de.cau.cs.kieler.scl.Pause

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
    
    def variables(Declaration d) {
        return d.valuedObjects.filter(Variable)
    }
    
    def typeDeclarations(Module m) {
        return m.declarations.filter(TypeDeclaration)
    }
    
    def types(Declaration d) {
        return d.valuedObjects.filter(TypeDefinition)
    }
    
    def functionDeclarations(Module m) {
        return m.declarations.filter(FunctionDeclaration)
    }
     
    def functions(Declaration d) {
        return d.valuedObjects.filter(Function)
    }   
    
    def taskDeclarations(Module m) {
        return m.declarations.filter(TaskDeclaration)
    }
     
    def tasks(Declaration d) {
        return d.valuedObjects.filter(Task)
    }
    
    def procedureDeclarations(Module m) {
        return m.declarations.filter(ProcedureDeclaration)
    }
     
    def procedures(Declaration d) {
        return d.valuedObjects.filter(Procedure)
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
        return prog.modules.size == 1 &&
        prog.eAllContents.forall[
            switch (it) {
                Module: true
                SignalDeclaration: true
                Signal: idType === null && initialValue === null && (type === null || type === ValueType.PURE)
                RelationDeclaration: true
                Relation: true
                EsterelParallel: true
                EsterelThread: true
                Nothing: true
                Block: true
                Emit: expression === null
                Present: cases.nullOrEmpty
                Loop: delay === null
                Trap: trapHandler.empty
                Exit: expression === null
                LocalSignalDeclaration: true
                TrapExpression: true
                TrapReference: true
                SignalReference: true
                Pause: true
                OperatorExpression: true
                Annotation: true
                ValuedObject: "tick".equals(name)
                default: false
            }
        ]
    }
    
}