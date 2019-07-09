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
class LoopDataLinkable extends SingleLoopLinkable implements IKiCoolCloneable {
    
    @Accessors var Set<SingleLoopLinkable> loops = <SingleLoopLinkable> newLinkedHashSet
    
    new(boolean persistent) {
        super(persistent)
    }
    
    override isMutable() {
        false
    }
    
    override preserveInSnapshot() {
        true
    }
    
    override cloneObject() {
        new LoopDataLinkable(persistent) => [ ld |
            ld.criticalNodes.addAll(criticalNodes)
            loops.forEach[ loop |
                ld.loops.add(loop.cloneObject as SingleLoopLinkable)
            ]
        ] 
    }
    
    override void resolveCopiedObjects(Copier copier) {
        val resolvedLoopData = <Linkable> newLinkedHashSet
        for (key : criticalNodes) {
            val newNode = copier.get(key) as Linkable
            resolvedLoopData.add(newNode)
        }
        if (persistent) {
            criticalNodes.addAll(resolvedLoopData)
        } else {
            criticalNodes = resolvedLoopData
        }
        loops.forEach[ resolveCopiedObjects(copier) ]
    } 
    
}