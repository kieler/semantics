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
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsDeclarationExtensions
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.ScgFactory
import de.cau.cs.kieler.scg.processors.SCGAnnotations
import java.util.Collection
import java.util.List
import java.util.Map
import org.eclipse.emf.ecore.util.EcoreUtil.Copier

/**
 * 
 * @author als
 */
class SCGMethodExtensions { 
    
    @Inject extension AnnotationsExtensions
    @Inject extension KExpressionsDeclarationExtensions
    
    def boolean isMethod(SCGraph scg) {
        return scg.hasAnnotation(SCGAnnotations.ANNOTATION_METHOD_REFERENCE)
    }
    
    def MethodDeclaration getMethodDeclaration(SCGraph scg) {
        return (scg.getAnnotation(SCGAnnotations.ANNOTATION_METHOD_REFERENCE) as ReferenceAnnotation).object as MethodDeclaration
    }
    
    def ignoreMethods(List<SCGraph> scgs) {
        return scgs.filter[!method].toList
    }
    def ignoreMethods(Iterable<SCGraph> scgs) {
        return scgs.filter[!method]
    }

    def Collection<? extends SCGraph> copyMethodSCGs(Iterable<SCGraph> scgs, Map<ValuedObject, ValuedObject> VOmap) {
        return scgs.filter[method].map[ scg |
            val copier = new Copier
            val newSCG = copier.copy(scg) as SCGraph
            copier.copyReferences
            
            // Fix references to outside VOs
            copier.entrySet.filter(ValuedObjectReference).filter[VOmap.containsKey(valuedObject)].forEach[valuedObject = VOmap.get(valuedObject)]
            
            return newSCG
        ].toList
    }
}
