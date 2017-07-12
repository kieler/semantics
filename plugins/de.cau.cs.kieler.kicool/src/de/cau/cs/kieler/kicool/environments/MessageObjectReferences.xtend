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
package de.cau.cs.kieler.kicool.environments

import java.util.LinkedList
import de.cau.cs.kieler.kicool.classes.IColorSystem

/**
 * @author ssm
 * @kieler.design 2017-07-11 proposed 
 * @kieler.rating 2017-07-11 proposed yellow
 *
 */
class MessageObjectReferences<T> extends LinkedList<MessageObjectLink> {
    
    def add(String msg) {
        add(new MessageObjectLink(msg, null, true, null))
    }
    
    def add(String msg, Object object) {
        add(new MessageObjectLink(msg, object, true, null))
    }
    
    def add(String msg, Object object, boolean annotate) {
        add(new MessageObjectLink(msg, object, annotate, null))
    }
    
    def add(String msg, Object object, boolean annotate, IColorSystem colorSystem) {
        add(new MessageObjectLink(msg, object, annotate, colorSystem))
    }
    
}