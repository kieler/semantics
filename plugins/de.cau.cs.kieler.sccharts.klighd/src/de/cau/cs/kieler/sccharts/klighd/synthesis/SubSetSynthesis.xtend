/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2016 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.sccharts.klighd.synthesis

import org.eclipse.emf.ecore.EObject
import java.util.Collection
import org.eclipse.elk.graph.KGraphElement

/**
 * @author ssm
 *
 */
abstract class SubSetSynthesis<I extends EObject, O extends KGraphElement, T extends Collection<O>> extends SubSynthesis<I, O>{
    
    public def T transformToSet(I element) {
        val T result = performTranformationToSet(element);
        result.forEach[
            hooks.invokeHooks(hookType, element, it);
        ]
        return result;
    }    
    
    abstract def T performTranformationToSet(I element);
    
    override O transform(I element) {
        val T result = performTranformationToSet(element);
        hooks.invokeHooks(hookType, element, result.head);
        return result.head;
    }
    
    override O performTranformation(I element) {
        // un-abstract it
    }
        
}