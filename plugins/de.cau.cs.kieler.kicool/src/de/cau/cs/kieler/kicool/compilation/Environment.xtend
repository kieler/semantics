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
package de.cau.cs.kieler.kicool.compilation

import java.util.Map
import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.emf.ecore.EObject
import java.util.HashMap
import java.util.List

/**
 * @author ssm
 * @kieler.design 2017-02-19 proposed
 * @kieler.rating 2017-02-19 proposed yellow  
 */
class Environment {
    
    public static val MODEL = "model"
    public static val CONTEXT = "context"
    public static val META_PROCESSOR = "metaProcessor"
    public static val COMPILATION__UNIT = "compilationUnit"
    public static val ERRORS = "errors"        
        
    @Accessors Map<String, Object> data
        
    
    new() {
        data = new HashMap<String, Object>()
        data.put(ERRORS, <String> newLinkedList)
    }
    
    def setData(String key, Object data) {
        this.data.put(key, data)
    }
    
    def Object getData(String key) {
        data.get(key)
    }        
    
    def getModel() {
        data.get(MODEL)
    }
    
    def getEModel() {
        data.get(MODEL) as EObject
    }
    
    def setModel(Object model) {
        data.put(MODEL, model)
    }
    
    def setCompilationContext(CompilationContext cc) {
        data.put(CONTEXT, cc)
    }
    
    def getCompilationContext() {
        data.get(CONTEXT) as CompilationContext
    }    
    
    def getErrors() {
        data.get(ERRORS) as List<String>    
    }
    
    def setError(String msg) {
        errors += msg
    }
    
    def getStatus() {
        if (errors.size == 0) ProcessorStatus.OK else ProcessorStatus.ERRORS
    }
    
}