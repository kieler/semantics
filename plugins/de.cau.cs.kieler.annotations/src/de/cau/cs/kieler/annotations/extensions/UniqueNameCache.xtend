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

import java.util.HashSet

/**
 * @author ssm,aas
 * @kieler.design 2017-06-28 proposed 
 * @kieler.rating 2017-06-28 proposed yellow 
 *
 */
class UniqueNameCache extends HashSet<String> {
    
    private val maxNumberForBaseName = <String, Integer> newHashMap
    
    public def String getNewUniqueName(String baseName) {
        if(contains(baseName)) {
            val freeSuffix = (maxNumberForBaseName.getOrDefault(baseName, 0)+1)
            val newUniquName = baseName+freeSuffix 
            maxNumberForBaseName.put(baseName, freeSuffix)
            add(newUniquName)
            return newUniquName 
        } else {
            add(baseName)
            return baseName
        }
    } 
    
    public def boolean isUnique(String name) {
        return contains(name)
    } 
}