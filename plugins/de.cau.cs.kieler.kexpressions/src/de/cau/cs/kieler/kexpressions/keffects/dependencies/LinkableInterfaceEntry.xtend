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
package de.cau.cs.kieler.kexpressions.keffects.dependencies

import de.cau.cs.kieler.kexpressions.keffects.Linkable
import de.cau.cs.kieler.kexpressions.ValuedObject
import org.eclipse.xtend.lib.annotations.Accessors
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions

/**
 * @author ssm
 * @kieler.design 2018-05-24 proposed 
 * @kieler.rating 2018-05-24 proposed yellow
 *
 */
class LinkableInterfaceEntry {
    
    extension KExpressionsValuedObjectExtensions kvoe = new KExpressionsValuedObjectExtensions
    
    @Accessors Linkable linkable
    @Accessors ValuedObject valuedObject
    @Accessors boolean directInputAccess
    @Accessors boolean directOutputAccess
    @Accessors boolean isWriteAccess
    
    new(Linkable linkable, ValuedObject valuedObject) {
        this.linkable = linkable
        this.valuedObject = valuedObject
    }
    
    def boolean isInput() {
        return valuedObject.input
    }
    
    def boolean isOutput() {
        return valuedObject.output
    }
    
    def boolean isLocal() {
        return valuedObject.local
    }
}