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
package de.cau.cs.kieler.kicool.kitt.tracing.internal

import de.cau.cs.kieler.kexpressions.extensions.EcoreUtilExtensions
import de.cau.cs.kieler.kicool.kitt.tracing.TracingEcoreUtil
import java.util.Collection
import org.eclipse.emf.ecore.EObject

/**
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
class TracingEcoreUtilExtensions extends EcoreUtilExtensions {

    override <T extends EObject> T copy(T eObject) {
        return TracingEcoreUtil.copy(eObject)
    }

    override <T> Collection<T> copyAll(Collection<? extends T> eObjects) {
        return TracingEcoreUtil.copyAll(eObjects)
    }

}