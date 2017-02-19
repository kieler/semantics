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

/**
 * @author ssm
 * @kieler.design 2017-02-19 proposed
 * @kieler.rating 2017-02-19 proposed yellow  
 */
class Environment {
    
    public static val MODEL = "model"
    
    @Accessors
    Map<String, Object>data    
    
    def getModel() {
        data.get(MODEL)
    }
    
    def getEModel() {
        data.get(MODEL) as EObject
    }
}