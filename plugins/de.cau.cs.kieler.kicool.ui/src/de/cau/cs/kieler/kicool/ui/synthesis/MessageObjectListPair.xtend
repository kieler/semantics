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
package de.cau.cs.kieler.kicool.ui.synthesis

import de.cau.cs.kieler.kicool.environments.MessageObjectList

/**
 * @author ssm
 * @kieler.design 2017-07-10 proposed
 * @kieler.rating 2017-07-10 proposed yellow  
 */
class MessageObjectListPair {

    val Pair<MessageObjectList, Object> pair
   
    new(MessageObjectList list, Object object) {
        pair = new Pair(list, object)
    }
    
    def getKey() {
        return pair.key
    }
    def getValue() {
        return pair.value
    }
    
    override equals(Object obj) {
        return pair.equals(obj)
    }
    override hashCode() {
        return pair.hashCode
    }
    override toString() {
        return pair.toString
    }
    
}