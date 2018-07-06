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
package de.cau.cs.kieler.kicool.classes

/**
 * @author ssm
 * @kieler.design 2018-05-28 proposed
 * @kieler.rating 2018-05-28 proposed yellow  
 */
interface ITypedKiCoolCloneable<T> extends IKiCoolCloneable {
    
    def T getTypedOriginalObject() { 
        getOriginalObject as T
    }
}