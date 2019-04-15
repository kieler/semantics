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
package de.cau.cs.kieler.kicool.processors.dependencies

import java.util.Set
import de.cau.cs.kieler.kicool.classes.IKiCoolCloneable
import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.emf.ecore.util.EcoreUtil.Copier
import de.cau.cs.kieler.kexpressions.keffects.Linkable

/**
 * @author ssm
 *
 */
class SingleLoopLinkable implements IKiCoolCloneable {
    
    @Accessors var Set<Linkable> criticalNodes = <Linkable> newLinkedHashSet
    @Accessors var boolean isDependencyLoop = false
    @Accessors var boolean persistent = false
    
    new(boolean persistent) {
        this.persistent = persistent
    }
    
    override isMutable() {
        false
    }
    
    override cloneObject() {
        new SingleLoopLinkable(persistent) => [ ld |
            ld.criticalNodes.addAll(criticalNodes)
            ld.isDependencyLoop = isDependencyLoop
        ] 
    }
    
    override void resolveCopiedObjects(Copier copier) {
        val resolvedLoopdData = <Linkable> newLinkedHashSet
        for (key : criticalNodes) {
            val newNode = copier.get(key) as Linkable
            resolvedLoopdData.add(newNode)
        } 
        if (persistent) {
            criticalNodes.addAll(resolvedLoopdData)           
        } else {
            criticalNodes = resolvedLoopdData
        }
    } 
    
}