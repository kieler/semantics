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

import de.cau.cs.kieler.kicool.classes.IKiCoolCloneable
import java.util.LinkedList
import org.eclipse.emf.ecore.util.EcoreUtil.Copier

/**
 * @author ssm
 * @kieler.design 2018-05-24 proposed 
 * @kieler.rating 2018-05-24 proposed yellow
 *
 */
class LinkableInterfaceData extends LinkedList<LinkableInterfaceEntry> implements IKiCoolCloneable {
    
    override isMutable() {
        true
    }
    
    override cloneObject() {
        new LinkableInterfaceData => [
            it.addAll(this)
        ]
    }
    
    override void resolveCopiedObjects(Copier copier) {
        val resolved = new LinkableInterfaceData
        for (k : this) {
            val r = copier.get(k) as LinkableInterfaceEntry
            resolved.add(r)
        } 
        this.clear
        this.addAll(resolved)
    }    
        
}