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
package de.cau.cs.kieler.kicool.compilation.internal

import de.cau.cs.kieler.annotations.extensions.UniqueNameCache
import org.eclipse.emf.ecore.EObject
import de.cau.cs.kieler.annotations.NamedObject

/**
 * @author ssm
 * @kieler.design 2017-06-28 proposed 
 * @kieler.rating 2017-06-28 proposed yellow 
 */
class UniqueNameCachePopulation {
    
    static def void populateNameCache(Object object, UniqueNameCache cache) {
        if (!(object instanceof EObject)) return;
        
        (object as EObject).eAllContents.filter(NamedObject).forEach[
            cache.getNewUniqueName(it.name)
        ] 
    }
    
}