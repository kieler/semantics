/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2023 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.sccharts.extensions

import com.google.common.collect.Iterables
import com.google.common.collect.Sets
import com.google.inject.Inject
import de.cau.cs.kieler.annotations.NamedObject
import de.cau.cs.kieler.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.kexpressions.Expression
import de.cau.cs.kieler.kexpressions.GenericParameterDeclaration
import de.cau.cs.kieler.kexpressions.GenericTypeReference
import de.cau.cs.kieler.kexpressions.Parameter
import de.cau.cs.kieler.kexpressions.ReferenceDeclaration
import de.cau.cs.kieler.kexpressions.ThisExpression
import de.cau.cs.kieler.kexpressions.Value
import de.cau.cs.kieler.kexpressions.ValueType
import de.cau.cs.kieler.kexpressions.ValueTypeReference
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.kexpressions.VariableDeclaration
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsAccessVisibilityExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsDeclarationExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsGenericParameterExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsTypeExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kexpressions.kext.ClassDeclaration
import de.cau.cs.kieler.sccharts.Scope
import de.cau.cs.kieler.sccharts.ScopeCall
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.processors.Reference
import java.util.List
import java.util.Set
import org.eclipse.emf.ecore.EObject

import static extension java.lang.String.format

/**
 * @author als
 *
 */
class SCChartsGenericTypeExtensions {
    
    @Inject extension AnnotationsExtensions
    @Inject extension KExpressionsDeclarationExtensions
    @Inject extension KExpressionsValuedObjectExtensions
    @Inject extension KExpressionsGenericParameterExtensions
    @Inject extension KExpressionsTypeExtensions
    @Inject extension KExpressionsAccessVisibilityExtensions
    @Inject extension SCChartsScopeExtensions
    @Inject extension SCChartsSerializeHRExtensions
    @Inject extension SCChartsInheritanceExtensions
    @Inject extension SCChartsTypeExtensions 
    @Inject extension SCChartsReferenceExtensions
    
    def ValueType inferGenericType(ValuedObject genericTypeVO, EObject context) {
        val genericDecl = genericTypeVO.declaration
        if (genericDecl instanceof GenericParameterDeclaration) {
            val sccClass = genericDecl.eContainer
            if (sccClass instanceof State) {
                val genericIdx = sccClass.genericParameterDeclarations.indexOf(genericDecl)
                // Infer argument
                var root = context.nextScope
                if (root.eContainer !== null) {
                    root = root.rootState as State
                }
                val rootState = root as State
                val baseRef = rootState.allInheritedStateReferencesHierachically.findFirst[it.target === sccClass]
                if (baseRef !== null) {
                    val typeArg = baseRef.genericParameters.get(genericIdx).expression
                    // TODO support further indirection
                    if (typeArg instanceof ValueTypeReference) {
                        return typeArg.valueType
                    }
                }
            }
        }
        return null
    }
}