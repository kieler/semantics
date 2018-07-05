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
package de.cau.cs.kieler.scg.processors.analyzer

import java.util.Set
import de.cau.cs.kieler.scg.Node
import de.cau.cs.kieler.kicool.classes.IKiCoolCloneable
import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.emf.ecore.util.EcoreUtil.Copier

/**
 * @author ssm
 *
 */
class LoopData extends SingleLoop implements IKiCoolCloneable {
    
    @Accessors var Set<SingleLoop> loops = <SingleLoop> newLinkedHashSet
    
    new(boolean persistent) {
        super(persistent)
    }
    
    override isMutable() {
        false
    }
    
    override cloneObject() {
        new LoopData(persistent) => [ ld |
            ld.criticalNodes.addAll(criticalNodes)
            loops.forEach[ loop |
                ld.loops.add(loop.cloneObject as SingleLoop)
            ]
        ] 
    }
    
    override void resolveCopiedObjects(Copier copier) {
        val resolvedLoopData = <Node> newLinkedHashSet
        for (key : criticalNodes) {
            val newNode = copier.get(key) as Node
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