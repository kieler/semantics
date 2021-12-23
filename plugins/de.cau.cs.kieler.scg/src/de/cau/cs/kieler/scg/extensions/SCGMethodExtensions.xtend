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
import de.cau.cs.kieler.annotations.IntAnnotation
import de.cau.cs.kieler.annotations.ReferenceAnnotation
import de.cau.cs.kieler.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.kexpressions.Declaration
import de.cau.cs.kieler.kexpressions.MethodDeclaration
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsDeclarationExtensions
import de.cau.cs.kieler.kexpressions.kext.ClassDeclaration
import de.cau.cs.kieler.kicool.environments.Environment
import de.cau.cs.kieler.scg.Assignment
import de.cau.cs.kieler.scg.Node
import de.cau.cs.kieler.scg.SCGraph
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
    def ClassDeclaration getSelfParameterClass(Declaration decl) {
        return (decl.getAnnotation(SCGAnnotations.ANNOTATION_METHOD_REQUIRES_SELF) as ReferenceAnnotation)?.object as ClassDeclaration
    }
    def void setSelfParameterClass(Declaration method, ClassDeclaration clazz) {
        method?.annotations.removeIf[SCGAnnotations.ANNOTATION_METHOD_REQUIRES_SELF.equalsIgnoreCase(name)]
        method?.addReferenceAnnotation(SCGAnnotations.ANNOTATION_METHOD_REQUIRES_SELF, clazz)
    }
    def void markSelfInParameter(MethodDeclaration method) {
        method?.addTagAnnotation(SCGAnnotations.ANNOTATION_METHOD_REQUIRES_SELF)
    }
    def void markSelfVO(ValuedObject vo) {
        vo?.addTagAnnotation(SCGAnnotations.ANNOTATION_METHOD_REQUIRES_SELF)
    }
    def boolean isSelfVO(ValuedObject vo) {
        return vo?.hasAnnotation(SCGAnnotations.ANNOTATION_METHOD_REQUIRES_SELF)
    }
    def boolean isSelfVO(Declaration d) {
        return d.valuedObjects.exists[isSelfVO]
    }
    
    def hasTickDataInParameter(MethodDeclaration method) {
        return method?.hasAnnotation(SCGAnnotations.ANNOTATION_METHOD_REQUIRES_TICKDATA)
    }
    def void markTickDataInParameter(MethodDeclaration method) {
        method?.addTagAnnotation(SCGAnnotations.ANNOTATION_METHOD_REQUIRES_TICKDATA)
    }
    
    def isHostMethod(MethodDeclaration method) {
        val container = method.eContainer
        if (container instanceof ClassDeclaration) {
            return container.host
        }
        return false
    }

    def Collection<? extends SCGraph> copyMethodSCGs(Iterable<SCGraph> scgs, Map<ValuedObject, ValuedObject> VOmap, Environment env) {
        val newSCGs = newArrayList
        for (scg : scgs.filter[method]) {
            val copier = new Copier
            val newSCG = copier.copy(scg) as SCGraph
            copier.copyReferences
            
            // Fix references to outside VOs
            for (entry : copier.entrySet.filter[key instanceof ValuedObjectReference]) {
                val source = entry.key as ValuedObjectReference
                if (!copier.keySet.contains(source.valuedObject)) { // is variable outside the method
                    val target = entry.value as ValuedObjectReference
                    if (VOmap.containsKey(source.valuedObject)) {
                        target.valuedObject = VOmap.get(source.valuedObject)
                        //println("Redirected VOR " + target.valuedObject.name)
                    } else {
                        env.warnings.add("Could not redirect VOR to new VO when copying method. VO name: " + source.valuedObject?.name)
                    }
                }
            }
            
            // Fix method annotation
            val oldMethodVO = scg.methodDeclaration.valuedObjects.head
            val newMethodAnno = (newSCG.getAnnotation(SCGAnnotations.ANNOTATION_METHOD_REFERENCE) as ReferenceAnnotation)
            newMethodAnno.object = VOmap.get(oldMethodVO).eContainer
            
            // Fix self class reference
            if (scg.methodDeclaration.hasSelfInParameter) {
                val oldSelfDelc = scg.declarations.findFirst[isSelfVO]
                val oldSelfClass = oldSelfDelc.getSelfParameterClass
                val newSelfClass = VOmap.get(oldSelfClass.valuedObjects.head).eContainer as ClassDeclaration
                val newSelfDelc = newSCG.declarations.findFirst[isSelfVO]
                newSelfDelc.setSelfParameterClass(newSelfClass)
            }
            
            newSCGs += newSCG
        }
        return newSCGs
    }
}
