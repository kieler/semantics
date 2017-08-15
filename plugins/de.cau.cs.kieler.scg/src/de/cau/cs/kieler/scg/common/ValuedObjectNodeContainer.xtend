/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright ${year} by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.scg.common

import de.cau.cs.kieler.kexpressions.keffects.util.ValuedObjectContainer
import org.eclipse.xtend.lib.annotations.Accessors
import de.cau.cs.kieler.scg.Node
import de.cau.cs.kieler.kexpressions.keffects.Assignment
import de.cau.cs.kieler.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.kexpressions.ValuedObject

/**
 * 
 * @author ssm
 * @kieler.design 2017-08-15 proposed 
 * @kieler.rating 2017-08-15 proposed yellow
 */
class ValuedObjectNodeContainer extends ValuedObjectContainer {
    
    @Accessors var Node node = null
    
    def set(Assignment assignment, Node node) {
        super.set(assignment)
        this.node = node
    }
    
    def set(ValuedObjectReference valuedObjectReference, Node node) {
        super.set(valuedObjectReference)
        this.node = node
    }
    
    def set(ValuedObject valuedObject, Node node) {
        super.set(valuedObject)
        this.node = node
    }        
    
}