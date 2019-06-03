/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2013 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.scg.extensions

import com.google.inject.Inject
import de.cau.cs.kieler.annotations.ReferenceAnnotation
import de.cau.cs.kieler.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.kexpressions.MethodDeclaration
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.processors.SCGAnnotations

/**
 * 
 * @author als
 */
class SCGMethodExtensions { 
    
    @Inject extension AnnotationsExtensions
    
    def boolean isMethod(SCGraph scg) {
        return scg.hasAnnotation(SCGAnnotations.ANNOTATION_METHOD_REFERENCE)
    }
    
    def MethodDeclaration getMethodDeclaration(SCGraph scg) {
        return (scg.getAnnotation(SCGAnnotations.ANNOTATION_METHOD_REFERENCE) as ReferenceAnnotation).object as MethodDeclaration
    }
    
}
