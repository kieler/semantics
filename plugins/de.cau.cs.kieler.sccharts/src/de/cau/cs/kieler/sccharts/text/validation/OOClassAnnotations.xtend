/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2022 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.sccharts.text.validation

import com.google.inject.Inject
import de.cau.cs.kieler.annotations.Annotatable
import de.cau.cs.kieler.annotations.Annotation
import de.cau.cs.kieler.annotations.AnnotationsPackage
import de.cau.cs.kieler.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.kexpressions.KExpressionsPackage
import de.cau.cs.kieler.kexpressions.ReferenceDeclaration
import de.cau.cs.kieler.sccharts.SCChartsPackage
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.extensions.SCChartsInheritanceExtensions
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EStructuralFeature
import org.eclipse.xtext.validation.ValidationMessageAcceptor
import de.cau.cs.kieler.annotations.TypedStringAnnotation

/**
 * @author als
 */
class OOClassAnnotations {
    
    enum ClassType {
        INTERFACE, ABSTRACT_CLASS, CLASS, MAIN_CLASS
    }
    
    public static val CLASS_TYPE_NAMES_NICE = #{
        ClassType.INTERFACE -> "Interface",
        ClassType.ABSTRACT_CLASS -> "AbstractClass",
        ClassType.CLASS -> "Class",
        ClassType.MAIN_CLASS -> "MainClass"
    }
    public static val CLASS_TYPE_NAMES = CLASS_TYPE_NAMES_NICE.entrySet.toMap([it.value.toLowerCase], [it.key])
    public static val MULI_INHERITANCE = "multipleinheritance"
    
    @Inject extension AnnotationsExtensions
    @Inject extension SCChartsInheritanceExtensions
    
    
    def validateOOClassAnnotationInSCChart(State state, ValidationMessageAcceptor validator) {
        val type = state.classType
        val baseStates = state.allInheritedStates
        val baseStateTypes = baseStates.toMap([it], [it.classType])
        
        if (type !== null) {
            val msgPrefix = "@" + CLASS_TYPE_NAMES_NICE.get(type) + ": "
            // Check relation to base states
            if (baseStateTypes.values.exists[it === null]) {
                validator.warn(msgPrefix + "The following base states are missing class type annotations: " 
                    + baseStateTypes.entrySet.filter[it.value === null].map[it.key.name].join(", "),
                    state, AnnotationsPackage.eINSTANCE.namedObject_Name)
            }
            if (baseStateTypes.values.exists[it === ClassType.MAIN_CLASS]) {
                validator.warn(msgPrefix + "Do not inherit from " +  CLASS_TYPE_NAMES_NICE.get(ClassType.MAIN_CLASS) + " "
                    + baseStateTypes.entrySet.filter[it.value === ClassType.MAIN_CLASS].join("(", ", ", ")", [it.key.name]),
                     state, AnnotationsPackage.eINSTANCE.namedObject_Name)
            }
            
            // Check constraints on this SCChart
            val methodInfos = state.methodInheritanceInfos
            switch(type) {
                case INTERFACE: {
                    val hasRegions = !state.regions.empty || !state.actions.empty
                    if (baseStateTypes.values.exists[it !== ClassType.INTERFACE && it !== null]) {
                        validator.warn(msgPrefix + "Do not inherit from non-interface "
                            + baseStateTypes.entrySet.filter[it.value !== ClassType.INTERFACE].join("(", ", ", ")", [it.key.name]),
                             state, AnnotationsPackage.eINSTANCE.namedObject_Name)
                    }
                    if (hasRegions) {
                        validator.warn(msgPrefix + "Do not provide behavior implementation in an interface (regions or actions)",
                             state, AnnotationsPackage.eINSTANCE.namedObject_Name)
                    }
                    if (methodInfos.exists[!it.inherited && it.implemented]) {
                        validator.warn(msgPrefix + "Do not provide method implementations in an interface "
                            + methodInfos.filter[!it.inherited && it.implemented].join("(", ", ", ")", [it.name]),
                             state, AnnotationsPackage.eINSTANCE.namedObject_Name)
                    }
                }
                case ABSTRACT_CLASS,
                case CLASS,
                case MAIN_CLASS: {
                    if (type !== ClassType.ABSTRACT_CLASS && methodInfos.exists[!it.implemented && it.overrides.empty]) {
                        validator.warn(msgPrefix + "A concrete class must provide implementations for all methods "
                            + methodInfos.filter[!it.implemented && it.overrides.empty].join("(", ", ", ")", [it.name]),
                             state, AnnotationsPackage.eINSTANCE.namedObject_Name)
                    }
                    if (baseStateTypes.entrySet.filter[it.value !== ClassType.INTERFACE && it.value !== null && state.baseStates.contains(it.key)].size > 1) {
                        var ok = false
                        val anno = state.classTypeAnnotation
                        if (anno instanceof TypedStringAnnotation) {
                            ok = MULI_INHERITANCE.equalsIgnoreCase(anno.type)
                                && !anno.values.empty
                                && "true".equalsIgnoreCase(anno.values.head)
                        }
                        if (!ok) {
                            validator.warn(msgPrefix + "Multiple inheritance is discouraged. "
                                + baseStateTypes.entrySet.filter[it.value !== ClassType.INTERFACE && it.value !== null && state.baseStates.contains(it.key)].join("(", ", ", ")", [it.key.name])
                                + "\n Resolve or add '[MultipleInheritance] true' to the annotation to bypass this rule.",
                                 state, AnnotationsPackage.eINSTANCE.namedObject_Name)
                        }
                    }
                }
            }
        } else if (baseStateTypes.values.exists[it !== null]) {
            validator.warn("At least one of the base states is annotated with a class type annotation. Hence, this SCChart should be annotated as well!", 
                state, AnnotationsPackage.eINSTANCE.namedObject_Name)
        }
        
    }
    def validateOOClassAnnotationInReference(ReferenceDeclaration decl, ValidationMessageAcceptor validator) {
        val state = decl.reference
        if (state instanceof State) {
            val type = state.classType
            if (type !== null) {
                if (type !== ClassType.CLASS) { // Only instantiate classes
                    if (!decl.input || type === ClassType.MAIN_CLASS) {
                        validator.warn("Do not instantiate an annotated SCCharts-based class with type " + CLASS_TYPE_NAMES_NICE.get(type), decl, KExpressionsPackage.eINSTANCE.referenceDeclaration_Reference)
                    }
                }
            }
        }
    }
    
    def ClassType getClassType(Annotatable subject) { 
        val anno = subject.classTypeAnnotation
        if (anno !== null) {
            return CLASS_TYPE_NAMES.get(anno.name.toLowerCase)
        }
        return null
    }
    
    def Annotation getClassTypeAnnotation(Annotatable subject) {
        for (anno : subject.annotations) {
            if (CLASS_TYPE_NAMES.containsKey(anno.name.toLowerCase)) {
                return anno
            }
        }
        return null
    }
    
    
    protected def void warn(ValidationMessageAcceptor validator, String message, EObject source, EStructuralFeature feature, int index) {
        validator.acceptWarning(message, source, feature, index, null)
    }
    protected def void warn(ValidationMessageAcceptor validator, String message, EObject source, EStructuralFeature feature) {
        validator.warn(message, source, feature, ValidationMessageAcceptor.INSIGNIFICANT_INDEX)
    }
}

