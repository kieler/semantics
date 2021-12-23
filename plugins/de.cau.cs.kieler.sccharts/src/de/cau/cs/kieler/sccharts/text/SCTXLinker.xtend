/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2010 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sccharts.text

import de.cau.cs.kieler.kexpressions.KExpressionsPackage
import de.cau.cs.kieler.kexpressions.ReferenceDeclaration
import de.cau.cs.kieler.sccharts.BaseStateReference
import de.cau.cs.kieler.sccharts.SCChartsPackage
import de.cau.cs.kieler.sccharts.ScopeCall
import de.cau.cs.kieler.sccharts.State
import java.util.HashSet
import java.util.Set
import java.util.function.Predicate
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.CrossReference
import org.eclipse.xtext.GrammarUtil
import org.eclipse.xtext.diagnostics.IDiagnosticConsumer
import org.eclipse.xtext.diagnostics.IDiagnosticProducer
import org.eclipse.xtext.linking.impl.Linker
import org.eclipse.xtext.nodemodel.INode
import de.cau.cs.kieler.kexpressions.GenericParameterDeclaration

/** 
 * A customized Xtext linker linking textual SCCharts models.
 * 
 * @author als
 */
class SCTXLinker extends Linker {
    
    var HashSet<State> acyclicPreLinking = null
    
    override protected doLinkModel(EObject model, IDiagnosticConsumer consumer) {
        acyclicPreLinking = newHashSet
        try {
            super.doLinkModel(model, consumer)
        } finally {
            acyclicPreLinking = null
        }
        
    }

    override boolean isClearAllReferencesRequired(Resource resource) {
        if (resource instanceof SCTXResource) {
            return resource.getClearReferencesBeforeLinking()
        } else {
            return super.isClearAllReferencesRequired(resource)
        }
    }

    override void beforeEnsureIsLinked(EObject obj, EReference ref, IDiagnosticProducer producer) {
        checkUncontainedOpposites(obj, ref)
    }
    
    override ensureLinked(EObject obj, IDiagnosticProducer producer) {
        // Handle special linking of base states (inheritance).
        if (obj instanceof State) {
            // Pre-linking of base states
            if (!obj.baseStateReferences.nullOrEmpty) {
                if (!acyclicPreLinking.contains(obj)) {
                    acyclicPreLinking.add(obj)
                    for (base : obj.baseStateReferences) {
                        ensureLinked(base, producer)
                    }
                }
            } else {
                acyclicPreLinking.add(obj)
            }
        }
            
        // Continue default linking
        super.ensureLinked(obj, producer)
    }
    
    override protected ensureIsLinked(EObject obj, INode node, CrossReference ref, Set<EReference> handledReferences, IDiagnosticProducer producer) {
        val eRef = GrammarUtil.getReference(ref, obj.eClass)
        if (eRef === null) {
            val context = createDiagnosticContext(obj, eRef, node)
            val message = diagnosticMessageProvider.getIllegalCrossReferenceMessage(context, ref)
            producer.addDiagnostic(message)
            return
        }
        
        // Default linking
        super.ensureIsLinked(obj, node, ref, handledReferences, producer)
        
        // Pre link Scope calls for correct binding of inherited variables
        if (obj instanceof ScopeCall) {
            if (eRef === SCChartsPackage.Literals::SCOPE_CALL__TARGET && obj.target !== null && !acyclicPreLinking.contains(obj.target)) {
                ensureLinked(obj.target, producer)
            }
        }
        // Pre link base state references for correct binding of inherited variables
        if (obj instanceof BaseStateReference) {
            if (eRef === SCChartsPackage.Literals::BASE_STATE_REFERENCE__TARGET && obj.target !== null && !acyclicPreLinking.contains(obj.target)) {
                ensureLinked(obj.target, producer)
            }
        }
        // Pre link base type references for correct binding of inherited variables
        if (obj instanceof GenericParameterDeclaration) {
            if (eRef === KExpressionsPackage.Literals::GENERIC_PARAMETER_DECLARATION__REFERENCE && obj.type !== null && !acyclicPreLinking.contains(obj.type)) {
                ensureLinked(obj.type, producer)
            }
        }
        // Pre link targets of reference declarations for correct binding of inherited variables
        if (obj instanceof ReferenceDeclaration) {
            if (eRef === KExpressionsPackage.Literals::REFERENCE_DECLARATION__REFERENCE && obj.reference !== null && !acyclicPreLinking.contains(obj.reference)) {
                ensureLinked(obj.reference, producer)
            }
        }
    }

    /** 
     * Finds and removes elements in eOpposite references which are no longer contained in the
     * model.
     * @param obj
     * @param ref
     */
    def static void checkUncontainedOpposites(EObject obj, EReference ref) {
        val EReference oppRef = ref.getEOpposite()
        if (oppRef !== null) {
            if (ref.isMany()) {
                var EList<EObject> refObjs = (obj.eGet(ref) as EList<EObject>)
                if (refObjs !== null) {
                    // Remove non-contained opposites
                    refObjs.removeIf(new Predicate<EObject>() {
                        Set<EObject> exists = new HashSet<EObject>()

                        override boolean test(EObject t) {
                            var boolean remove = t.eContainer() === null || t.eGet(oppRef) === null
                            if(!remove) exists.add(t)
                            return remove
                        }
                    })
                }
            } else {
                var EObject refObj = (obj.eGet(ref) as EObject)
                if (refObj !== null) {
                    // Remove non-contained opposites
                    if (refObj.eContainer() === null) {
                        obj.eSet(ref, null)
                    }
                }
            }
        }
    }
}
