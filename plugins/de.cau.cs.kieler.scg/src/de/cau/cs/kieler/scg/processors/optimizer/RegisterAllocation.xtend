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
package de.cau.cs.kieler.scg.processors.optimizer

import de.cau.cs.kieler.scg.Node
import org.eclipse.xtend.lib.annotations.Accessors
import com.google.common.collect.HashMultimap
import com.google.common.collect.Multimap

/**
 * @author ssm
 * @kieler.design 2018-01-12 proposed 
 * @kieler.rating 2018-01-12 proposed yellow
 *
 */
class RegisterAllocation {
    @Accessors val registerRange = new HashMapStack<Node>
    @Accessors val freedRegister = <String> newLinkedList
    @Accessors val Multimap<Node, String> recycleAfterNode = HashMultimap.create
    
    @Accessors var Multimap<Node, String> reverseRegisterRange 
    
    def createReverseRangeMap() {
        reverseRegisterRange = HashMultimap.create
        for (r : registerRange.keySet) {
            reverseRegisterRange.put(registerRange.peek(r), r)
        }
    } 
}