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

import org.eclipse.emf.ecore.util.EcoreUtil.Copier
import java.util.Iterator
import org.eclipse.emf.ecore.EObject
import java.util.List

/**
 * @author ssm
 *
 */
class EnvironmentUtil {
    
    static def <T extends EObject> List<EObject> resolveCopiedObjects(Copier copier, Iterator<T> iterator) {
        val result = <EObject> newLinkedList
        for(object : iterator.toIterable.filter[ it !== null ]) {
            if (copier.containsKey(object)) {
                result += copier.get(object)
            }
        }
        result
    }   
    
}