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

import de.cau.cs.kieler.kicool.compilation.internal.EnvironmentPropertyHolder
import org.eclipse.xtend.lib.annotations.Accessors
import de.cau.cs.kieler.kicool.classes.IKiCoolCloneable
import org.eclipse.emf.ecore.util.EcoreUtil.Copier

/**
 * Data storage for one snapshots.
 * 
 * @author ssm
 * @kieler.design 2018-07-05 proposed
 * @kieler.rating 2018-07-05 proposed yellow  
 */
class Snapshot {

    @Accessors Object object = null
    @Accessors EnvironmentPropertyHolder environment = new EnvironmentPropertyHolder
    
    def processEnvironmentSnapshot(Environment environment, Copier copier) {
        if (copier === null) return;
        
        for(k : environment.allProperties.keySet) {
            val v = environment.getProperty(k)
            if (v instanceof IKiCoolCloneable) {
                if (v.preserveInSnapshot) {
                    val clone =  v.cloneObject
                    clone.resolveCopiedObjects(copier)
                    this.environment.allProperties.put(k, clone)
                }
            }
        }
    }    
    
}