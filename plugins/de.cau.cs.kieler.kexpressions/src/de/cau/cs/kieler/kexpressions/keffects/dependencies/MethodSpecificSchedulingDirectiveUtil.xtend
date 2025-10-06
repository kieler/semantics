/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2024 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.kexpressions.keffects.dependencies

import com.google.inject.Inject
import de.cau.cs.kieler.annotations.StringAnnotation
import de.cau.cs.kieler.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.kexpressions.MethodDeclaration
import de.cau.cs.kieler.kexpressions.ScheduleObjectReference
import de.cau.cs.kieler.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions

/**
 * @author als
 */
class MethodSpecificSchedulingDirectiveUtil {
    
    private static val ANNOTATION = "__dep_method_sd"
    
    @Inject extension AnnotationsExtensions
    @Inject extension KExpressionsValuedObjectExtensions

    public def markAsMethodSD(ScheduleObjectReference sor, MethodDeclaration method) {
        if (sor === null || method === null) {
            return
        }
        sor.addStringAnnotation(ANNOTATION, method.valuedObjects.head?.name)
    }

    public def String getMethodSDMarking(ScheduleObjectReference sor) {
        val anno = sor.annotations.findFirst[ANNOTATION.equals(it.name)]
        if (anno instanceof StringAnnotation) {
            return anno.values.head
        }
        return null
    }
    
    public def isMethodSpecific(ScheduleObjectReference sor) {
        if (sor !== null) {
            return sor.hasAnnotation(ANNOTATION)
        }
        return false
    }

    public def isMethodSpecificMatch(ScheduleObjectReference sor, ValuedObjectIdentifier voi) {
        if (sor !== null && voi !== null) {
            val m = sor.methodSDMarking
            if (m !== null) {
                val match = m.equals(voi.valuedObject.name) 
                    && voi.valuedObject.declaration instanceof MethodDeclaration
                if (!match) {
                    // Special handling for inlined methods because there in no method to find
                    if(sor.eContainer.eAllContents.filter(ValuedObjectReference).filter[it.valuedObject !== null].forall[
                        !m.equals(it.valuedObject.name) || !(it.valuedObject.declaration instanceof MethodDeclaration)
                    ]) { // If there is no method, it was inlined, hence, simulate a match
                        // FIXME Improve
                        return true
                    }
                }
                return match
            }
        }
        return false
    }
}
