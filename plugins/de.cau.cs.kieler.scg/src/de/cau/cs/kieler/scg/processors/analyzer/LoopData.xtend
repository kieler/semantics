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
package de.cau.cs.kieler.scg.processors.analyzer

import java.util.Set
import de.cau.cs.kieler.scg.Node
import de.cau.cs.kieler.kicool.classes.IKiCoolCloneable
import org.eclipse.xtend.lib.annotations.Accessors

/**
 * @author ssm
 *
 */
class LoopData implements IKiCoolCloneable {
    
    @Accessors var Set<Node> criticalNodes = <Node> newLinkedHashSet
    
    override isMutable() {
        false
    }
    
    override cloneObject() {
        this
    }
    
    override isVolatile() {
        true
    }
    
}