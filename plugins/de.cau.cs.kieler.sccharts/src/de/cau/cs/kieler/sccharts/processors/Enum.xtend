/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2014 by
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
import de.cau.cs.kieler.annotations.AnnotationsFactory
import de.cau.cs.kieler.annotations.NamedObject
import de.cau.cs.kieler.annotations.ReferenceAnnotation
import de.cau.cs.kieler.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.core.properties.Property
import de.cau.cs.kieler.kexpressions.Declaration
import de.cau.cs.kieler.kexpressions.ReferenceDeclaration
import de.cau.cs.kieler.kexpressions.ValueType
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsCreateExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsDeclarationExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kexpressions.kext.ClassDeclaration
import de.cau.cs.kieler.kexpressions.kext.extensions.KExtEnumExtensions
import de.cau.cs.kieler.kicool.compilation.VariableStore
import de.cau.cs.kieler.kicool.kitt.tracing.Traceable
import de.cau.cs.kieler.sccharts.SCCharts
import de.cau.cs.kieler.sccharts.Scope
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.extensions.SCChartsScopeExtensions

import static extension de.cau.cs.kieler.kicool.kitt.tracing.TransformationTracing.*
import static extension org.eclipse.emf.ecore.util.EcoreUtil.*

/**
 * SCCharts Enum Transformation.
 * 
 * @author als
 */
class Enum extends SCChartsProcessor implements Traceable {

    public static val TRANSFORM_ENUMS = new Property<Boolean>("de.cau.cs.kieler.sccharts.abort.transformEnums", false) // for testing on false (should be true later)

    // -------------------------------------------------------------------------
    // --                 K I C O      C O N F I G U R A T I O N              --
    // -------------------------------------------------------------------------
    public static val ID = "de.cau.cs.kieler.sccharts.processors.enum"

    static val CONSOLIDATION_ANNOTATION = "de.cau.cs.kieler.sccharts.processors.enum.consolidation"

    override getId() {
        ID
    }

    override getName() {
        "Enum"
    }

    override process() {
        if (!getProperty(TRANSFORM_ENUMS)) {
            return
        }
        setModel(model.transform)
    }

    def SCCharts transform(SCCharts sccharts) {
        sccharts => [rootStates.forEach[transform]]
    }

    // -------------------------------------------------------------------------
    @Inject extension AnnotationsExtensions
    @Inject extension KExpressionsValuedObjectExtensions
    @Inject extension KExpressionsDeclarationExtensions
    @Inject extension KExpressionsCreateExtensions
    @Inject extension SCChartsScopeExtensions
    @Inject extension KExtEnumExtensions

    def State transform(State rootState) {

        
        val targetRootState = rootState

        val enums = newArrayList
        val enumRefs = newHashMap

        // Collect enums
        for (scope : targetRootState.getAllScopes.toIterable) {
            for (decl : scope.declarations) {
                if (decl.isEnum) {
                    enums += decl as ClassDeclaration
                } else if (decl.isEnumRef) {
                    enumRefs.put(decl as ReferenceDeclaration, decl.referencedEnum)
                }
            }
        }

        transformEnumAccess(targetRootState)
        transformEnumVars(targetRootState, enumRefs)

        // clear enums
        for (e : enums.filter[!host]) {
            voStore.remove(e.valuedObjects.head)
            e.delete
        }

        targetRootState;
    }

    def void transformEnumAccess(Scope scope) {
        val enumValueVORs = scope.eAllContents.filter(ValuedObjectReference).filter[valuedObject.isEnumValue].toIterable

        for (enumVOR : enumValueVORs) {
            val enumVO = enumVOR.valuedObject
            val enumVODecl = enumVO.declaration
            val enumDecl = enumVODecl.enclosingClass

            if (!enumDecl.host) {
                val replacement = enumVO.initialValue !== null ? enumVO.initialValue.copy : createIntValue(
                        enumVODecl.valuedObjects.indexOf(enumVO))
                replacement.trace(enumVOR)

                var actualVOR = enumVOR
                while (actualVOR.isSubReference) {
                    actualVOR = actualVOR.eContainer as ValuedObjectReference
                    replacement.trace(actualVOR)
                }

                actualVOR.replace(replacement)
            }
        }
    }

    def void transformEnumVars(Scope scope, java.util.Map<ReferenceDeclaration, ClassDeclaration> enumRefs) {
        for (enumRef : enumRefs.entrySet) {
            val ref = enumRef.key
            val enumDecl = enumRef.value

            val newDecl = if (enumDecl.host) {
                    createDeclaration => [
                        access = ref.access
                        valuedObjects += ref.valuedObjects
                        type = ValueType.HOST
                        hostType = enumDecl.hostType.nullOrEmpty ? enumDecl.valuedObjects.head.name : enumDecl.hostType
                        addTagAnnotation(VariableStore.ENUM)
                    ]
                } else {
                    createIntDeclaration => [
                        access = ref.access
                        valuedObjects += ref.valuedObjects
                    ]
                }
            newDecl.valuedObjects.forEach[voStore.update(it, VariableStore.ENUM)]
            ref.replace(newDecl)
        }
    }

    def consolidateEnumDeclarations(State root) {
        val enums = newHashMap
        val consolidate = newHashMap
        for (decl : root.allScopes.map[declarations.iterator].flatten.toIterable) {
            if (decl.isEnum) {
                enums.put(decl.valuedObjects.head, decl)
                if (decl.hasAnnotation(CONSOLIDATION_ANNOTATION)) {
                    consolidate.put(decl.valuedObjects.head, decl)
                }
            }
        }

        val consolidated = newHashMap
        val enumsByOrig = HashMultimap.create
        if (!consolidate.empty) {
            for (e : consolidate.entrySet) {
                enumsByOrig.put((e.value.getAnnotation(CONSOLIDATION_ANNOTATION) as ReferenceAnnotation).object, e.key)
            }

            // copy into root
            for (orig : enumsByOrig.keySet) {
                if (orig instanceof Declaration) {
                    if (!enums.containsKey(orig)) { // if not already in root
                        val newDecl = orig.copy
                        root.declarations += newDecl

                        val enumVO = newDecl.valuedObjects.head
                        enumVO.name = orig.nextScope.name + "_" + enumVO.name
                        voStore.update(enumVO)

                        for (e : enumsByOrig.get(orig)) {
                            consolidated.put(e, enumVO)
                        }
                    } else {
                        for (e : enumsByOrig.get(orig)) {
                            consolidated.put(e, orig.valuedObjects.head)
                        }
                    }
                }
            }

            // fix references
            for (vor : root.eAllContents.filter(ValuedObjectReference).filter[consolidate.containsKey(valuedObject)].
                toIterable) {
                val newVO = consolidated.get(vor.valuedObject)
                vor.valuedObject = newVO

                val valueRef = vor.subReference
                valueRef.valuedObject = newVO.declaration.enumValues.findFirst [
                    it.name.equals(valueRef.valuedObject.name)
                ]

                if (vor.isSubReference) {
                    var topVOR = vor.eContainer as ValuedObjectReference
                    while (vor.isSubReference) {
                        topVOR = topVOR.eContainer as ValuedObjectReference
                    }
                    topVOR.replace(vor)
                }
            }

            // remove consolidated
            for (e : consolidate.values) {
                voStore.remove(e.enumVO)
                e.remove
            }
        }

        // Fix ref decls
        val copyForRefDecls = <ValuedObject, ValuedObject>newHashMap
        for (ref : root.allScopes.map[declarations.filter(ReferenceDeclaration).iterator].flatten.toIterable) {
            if (ref.isEnumRef) {
                val anyCopy = enumsByOrig.get(ref.referencedEnum).head
                if (anyCopy !== null) { // there is already a consolidated copy
                    val newVO = consolidated.get(anyCopy)
                    if (newVO !== null) {
                        ref.reference = newVO
                        ref.referenceContainer = null
                    }
                } else if (ref.referenceContainer !== null) { // referenced enum was not referenced otherwise
                    if (copyForRefDecls.containsKey(ref.reference)) {
                        ref.reference = copyForRefDecls.get(ref.reference)
                        ref.referenceContainer = null
                    } else {
                        val newDecl = ref.referencedEnum.copy

                        val enumVO = newDecl.enumVO
                        enumVO.name = (ref.referenceContainer as NamedObject).name + "_" + enumVO.name
                        voStore.update(enumVO)

                        ref.reference = enumVO
                        ref.referenceContainer = null

                        copyForRefDecls.put(ref.reference as ValuedObject, enumVO)
                    }
                }
            }
        }
        // add new decls
        copyForRefDecls.values.forEach[root.declarations += it.declaration]
    }

    static def markCopyForConsolidation(Declaration copy, Declaration original) {
        copy.annotations += AnnotationsFactory::eINSTANCE.createReferenceAnnotation => [
            it.name = CONSOLIDATION_ANNOTATION
            it.object = original
        ]
    }

}
