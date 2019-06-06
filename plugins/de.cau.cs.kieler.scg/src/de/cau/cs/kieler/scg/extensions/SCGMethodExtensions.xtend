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
import de.cau.cs.kieler.kexpressions.Declaration
import de.cau.cs.kieler.scg.Node
import de.cau.cs.kieler.scg.Assignment
import de.cau.cs.kieler.annotations.IntAnnotation

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
    
    def boolean isParameter(Declaration decl) {
        return decl.valuedObjects.exists[parameter]
    }
    def boolean isParameter(ValuedObject vo) {
        return vo.hasAnnotation(SCGAnnotations.ANNOTATION_METHOD_PARAMETER)
    }
    def int getParameterIndex(ValuedObject vo) {
        return (vo.getAnnotation(SCGAnnotations.ANNOTATION_METHOD_PARAMETER) as IntAnnotation).value
    }
    
    def boolean isReturn(Node node) {
        return node.hasAnnotation(SCGAnnotations.ANNOTATION_RETURN_NODE)
    }
    def boolean isReturn(Declaration decl) {
        return decl.valuedObjects.exists[isReturn]
    }
    def boolean isReturn(ValuedObject vo) {
        return vo.hasAnnotation(SCGAnnotations.ANNOTATION_RETURN_NODE)
    }
    
    def ignoreMethods(List<SCGraph> scgs) {
        return scgs.filter[!method].toList
    }
    def ignoreMethods(Iterable<SCGraph> scgs) {
        return scgs.filter[!method]
    }
    
    def markAllLocalVariables(SCGraph scg) {
        scg.declarations.map[valuedObjects].flatten.forEach[markLocalVariable]
    }
    def markLocalVariable(ValuedObject vo) {
        vo.addTagAnnotation(SCGAnnotations.ANNOTATION_METHOD_LOCAL_VARIABLE)
    }
    def isLocalVariable(ValuedObject vo) {
        return vo?.hasAnnotation(SCGAnnotations.ANNOTATION_METHOD_LOCAL_VARIABLE)
    }
    def isLocalVariable(Assignment asm) {
        return asm.reference?.valuedObject?.hasAnnotation(SCGAnnotations.ANNOTATION_METHOD_LOCAL_VARIABLE)
    }
    def unmarkAllLocalVariables(SCGraph scg) {
        scg.declarations.map[valuedObjects].flatten.forEach[unmarkLocalVariable]
    }
    def unmarkLocalVariable(ValuedObject vo) {
        vo.removeAnnotations(SCGAnnotations.ANNOTATION_METHOD_LOCAL_VARIABLE)
    }
    
    def hasSelfInParameter(MethodDeclaration method) {
        return method?.hasAnnotation(SCGAnnotations.ANNOTATION_METHOD_REQUIRES_SELF)
    }
    def void markSelfInParameter(MethodDeclaration method) {
        method?.addTagAnnotation(SCGAnnotations.ANNOTATION_METHOD_REQUIRES_SELF)
    }
    
    def hasTickDataInParameter(MethodDeclaration method) {
        return method?.hasAnnotation(SCGAnnotations.ANNOTATION_METHOD_REQUIRES_TICKDATA)
    }
    def void markTickDataInParameter(MethodDeclaration method) {
        method?.addTagAnnotation(SCGAnnotations.ANNOTATION_METHOD_REQUIRES_TICKDATA)
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
