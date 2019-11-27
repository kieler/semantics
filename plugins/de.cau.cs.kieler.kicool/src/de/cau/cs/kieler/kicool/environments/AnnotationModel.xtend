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
package de.cau.cs.kieler.kicool.environments

import org.eclipse.emf.ecore.util.EcoreUtil.Copier
import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.emf.ecore.EObject
import de.cau.cs.kieler.kicool.compilation.Processor
import com.google.common.collect.HashMultimap

/**
 * @author ssm
 * @kieler.design 2018-04-13 proposed 
 * @kieler.rating 2018-04-13 proposed yellow
 * 
 * Convenient wrapper for Annotation Models
 *
 */
class AnnotationModel<T extends EObject> {
    
    @Accessors T model
    @Accessors Copier copier
    @Accessors Processor<?,?> processor
    var boolean stall
    val HashMultimap<Object, String> stalledInfos  = HashMultimap.create
    
    new(T model, Copier copier, Processor<?,?> processor) {
        this.model = model
        this.copier = copier
        this.processor = processor
        this.stall = false
    }
    
    new() {
        this.stall = true
    }
    
    def apply(T model, Copier copier, Processor<?,?> processor) {
        this.model = model 
        this.copier = copier
        this.processor = processor
        this.stall = false
        
        for (object : stalledInfos.keySet) {
            for (info : stalledInfos.get(object)) {
                addInfo(object, info)
            }
        }
    }
    
    def applyAnnotations() {
        processor.applyAnnotations
    }
    
    def EObject get(Object obj) {
        copier.get(obj)
    }
    
    def void addInfo(Object object, String info) {
        if (stall) {
            stalledInfos.put(object, info)            
        } else {
            processor.environment.infos.add(model, info, get(object), null)
        }
    }
    
    def void addWarning(Object object, String info) {
        processor.environment.warnings.add(model, info, get(object), null)
    }

    def void addError(Object object, String info) {
        processor.environment.errors.add(model, info, get(object), null)
    }
}