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
package de.cau.cs.kieler.annotations.extensions

import de.cau.cs.kieler.annotations.NamedObject
import java.util.regex.Pattern

/**
 * @author ssm
 * @kieler.design 2017-06-28 proposed 
 * @kieler.rating 2017-06-28 proposed yellow 
 *
 */
class UniqueNameExtensions {
    
    def createUniqueNameCache() {
        new UniqueNameCache
    }   
    
    def NamedObject uniqueName(NamedObject namedObject, UniqueNameCache nameCache) {
        if (nameCache.contains(namedObject.name)) {
            val p = Pattern.compile("[0-9]+$");
            val m = p.matcher(namedObject.name);
            if(m.find()) {
                val n = Integer.parseInt(m.group)
                namedObject.name = namedObject.name.substring(0, namedObject.name.length - m.group.length) + n
            } else {
                namedObject.name = namedObject.name + "0"
            }
            namedObject.uniqueName(nameCache)
        } else {
            nameCache += namedObject.name
        }
        namedObject
    }
    
    def isUnique(NamedObject namedObject, UniqueNameCache nameCache) {
        !nameCache.contains(namedObject.name)
    }
    
}