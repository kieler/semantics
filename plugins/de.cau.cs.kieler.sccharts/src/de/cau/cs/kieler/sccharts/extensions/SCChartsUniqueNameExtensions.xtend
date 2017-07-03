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
package de.cau.cs.kieler.sccharts.extensions

import java.util.regex.Pattern
import de.cau.cs.kieler.annotations.extensions.UniqueNameCache
import de.cau.cs.kieler.annotations.extensions.UniqueNameExtensions
import de.cau.cs.kieler.kexpressions.Identifiable

/**
 * @author ssm
 * @kieler.design 2017-06-28 proposed 
 * @kieler.rating 2017-06-28 proposed yellow 
 *
 */
class SCChartsUniqueNameExtensions extends UniqueNameExtensions {
    
    def <T extends Identifiable> T uniqueName(T namedObject, UniqueNameCache nameCache) {
        if (nameCache.contains(namedObject.id)) {
            val p = Pattern.compile("[0-9]+$");
            val m = p.matcher(namedObject.id);
            if(m.find()) {
                val n = Integer.parseInt(m.group)
                namedObject.id = namedObject.id.substring(0, namedObject.id.length - m.group.length) + n
            } else {
                namedObject.id = namedObject.id + "0"
            }
            namedObject.uniqueName(nameCache)
        } else {
            nameCache += namedObject.id
        }
        namedObject
    }
    
    def <T extends Identifiable> isUnique(T namedObject, UniqueNameCache nameCache) {
        !nameCache.contains(namedObject.id)
    }

    
}