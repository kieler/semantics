/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2023 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sccharts.processors

import com.google.common.collect.HashMultimap
import com.google.inject.Inject
import de.cau.cs.kieler.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.kexpressions.AccessModifier
import de.cau.cs.kieler.kexpressions.IODeclaration
import de.cau.cs.kieler.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsDeclarationExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kexpressions.kext.ClassDeclaration
import de.cau.cs.kieler.kexpressions.kext.DeclarationScope
import de.cau.cs.kieler.kexpressions.kext.extensions.KExtEnumExtensions
import de.cau.cs.kieler.kicool.kitt.tracing.Traceable
import de.cau.cs.kieler.sccharts.extensions.SCChartsScopeExtensions

import static extension de.cau.cs.kieler.kicool.kitt.tracing.TracingEcoreUtil.*

/**
 * SCCharts transformation to unpack classes.
 * 
 * @author als
 */
class UnpackClasses extends SCChartsProcessor implements Traceable {

    @Inject extension KExpressionsValuedObjectExtensions
    @Inject extension KExpressionsDeclarationExtensions
    @Inject extension KExtEnumExtensions
    @Inject extension SCChartsScopeExtensions
    @Inject extension AnnotationsExtensions
    
    public static val ID = "de.cau.cs.kieler.sccharts.processors.unpackClasses"
    public static val GENERATED_PREFIX = "_"
    
    public static val UNPACK_ANNOTATION = "UnpackClass"
    public static val RENAME_ANNOTATION = "UnpackRenaming"
    
    override getId() {
        ID
    }

    override getName() {
        "Unpack Classes"
    }

    override process() {
        for (root : model.rootStates) {
            val unpackClasses = newArrayList
            
            // collect annotated classes
            for (scope : root.allScopes.toIterable) {
                for (classDecl : scope.declarations.filter(ClassDeclaration)) {
                    if (classDecl.hasAnnotation(UNPACK_ANNOTATION)) {
                        unpackClasses += classDecl
                    }
                    // inner classes
                    for (inner : classDecl.eAllContents.filter(ClassDeclaration).toIterable) {
                        if (inner.hasAnnotation(UNPACK_ANNOTATION)) {
                            unpackClasses += inner
                        }
                    }
                }
            }
            
            //unpack
            if (!unpackClasses.empty) {
                // snapshot old state
                snapshot
                
                // Find all references to tarted classes
                val classRefs = HashMultimap.create
                for (vor : root.eAllContents.filter(ValuedObjectReference).filter[unpackClasses.contains(it.valuedObject.declaration)].toIterable) {
                    classRefs.put(vor.valuedObject.declaration as ClassDeclaration, vor)
                }
                
                // start processing with inner classes first
                unpackClasses.reverse
                
                for (unpack: unpackClasses) {
                    val targetScope = unpack.eContainer
                    if (targetScope instanceof DeclarationScope) {
                        if (unpack.valuedObjects.size == 1) {
                            val vo = unpack.valuedObjects.head
                            
                            // Adjust members
                            for (member : unpack.declarations) {
                                for (memberVO : member.valuedObjects) {
                                    // Cardinality
                                    if (!vo.cardinalities.empty) {
                                        if (member.isMethod) {
                                            environment.errors.add("Unpacking an array instance of a class with methods is not yet supported.")
                                        } else {
                                             memberVO.cardinalities.addAll(0, vo.cardinalities.map[copy])
                                        }
                                    }
                                   
                                    // Name
                                    var name = vo.name + GENERATED_PREFIX + memberVO.name
                                    if (memberVO.hasAnnotation(RENAME_ANNOTATION)) {
                                        name = vo.name + memberVO.getStringAnnotationValue(RENAME_ANNOTATION)
                                    } else if (member.hasAnnotation(RENAME_ANNOTATION)) {
                                        name = vo.name + member.getStringAnnotationValue(RENAME_ANNOTATION)
                                    }
                                    memberVO.name = name
                                    
                                    // IO
                                    if (member instanceof IODeclaration) {
                                        member.input = unpack.input
                                        member.output = unpack.output
                                    }
                                    
                                    // Visibility
                                    member.access = AccessModifier.UNDEF
                                }
                            }
                            
                            // Move members
                            targetScope.declarations.addAll(
                                targetScope.declarations.indexOf(unpack),
                                unpack.declarations)
                            
                            // Fix references (remove instance reference)
                            for (ref : classRefs.get(unpack)) {
                                ref.valuedObject = ref.subReference.valuedObject
                                ref.indices += ref.subReference.indices
                                ref.subReference = ref.subReference.subReference
                            }
                            
                            // Remove class
                            unpack.remove
                        } else {
                            environment.errors.add("Unpacking multiple instances of the same class is not yet supported.")
                        }
                    } else {
                        environment.errors.add("No viable parent scope to unpack class into.")
                    }
                }
            }
        }
    }
    
}
