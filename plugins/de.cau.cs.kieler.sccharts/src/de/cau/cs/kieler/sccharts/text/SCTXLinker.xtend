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

import de.cau.cs.kieler.sccharts.SCChartsPackage
import de.cau.cs.kieler.sccharts.State
import java.util.HashSet
import java.util.List
import java.util.Set
import java.util.function.Predicate
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.CrossReference
import org.eclipse.xtext.GrammarUtil
import org.eclipse.xtext.diagnostics.IDiagnosticProducer
import org.eclipse.xtext.linking.impl.Linker
import org.eclipse.xtext.nodemodel.INode
import de.cau.cs.kieler.sccharts.ScopeCall

/** 
 * A customized Xtext linker linking textual SCCharts models.
 * 
 * @author als
 */
class SCTXLinker extends Linker {
    
    var Set<State> acyclicBaseStateLinking = null

    override boolean isClearAllReferencesRequired(Resource resource) {
        if (resource instanceof SCTXResource) {
            return resource.getClearReferencesBeforeLinking()
        } else {
            return super.isClearAllReferencesRequired(resource)
        }
    }

    override void beforeEnsureIsLinked(EObject obj, EReference ref, IDiagnosticProducer producer) {
        checkUncontainedOpposites(obj, ref)
        
        if (obj instanceof State) {
            if (ref === SCChartsPackage.Literals::STATE__BASE_STATES) {
                throw new IllegalStateException("Base states must not be handled by the default linker!")
            }
        }
    }
    
    override protected ensureIsLinked(EObject obj, INode node, CrossReference ref, Set<EReference> handledReferences, IDiagnosticProducer producer) {
        val eRef = GrammarUtil.getReference(ref, obj.eClass)
        if (eRef === null) {
            val context = createDiagnosticContext(obj, eRef, node)
            val message = diagnosticMessageProvider.getIllegalCrossReferenceMessage(context, ref)
            producer.addDiagnostic(message)
            return
        }
        /*
         * Handle special linking of base states (inheritance)
         */
        if (obj instanceof State && eRef === SCChartsPackage.Literals::STATE__BASE_STATES) {
            handledReferences.add(eRef)
            producer.setTarget(obj, eRef)
            val links = getLinkedObject(obj, eRef, node)
            if (links === null || links.isEmpty()) {
                if (!isNullValidResult(obj, eRef, node)) {
                    val context = createDiagnosticContext(obj, eRef, node)
                    val message = diagnosticMessageProvider.getUnresolvedProxyMessage(context)
                    producer.addDiagnostic(message)
                }
                return
            } else {
                val state = obj as State
                (state.eGet(eRef) as List<EObject>).addAll(links)
                
                // ensure transitive linking in same resource
                val newTransitiveLinking = acyclicBaseStateLinking === null
                if (newTransitiveLinking) {
                    acyclicBaseStateLinking = newHashSet(state)
                }
                for (baseState : state.baseStates) {
                    if (baseState.eResource == state.eResource && !acyclicBaseStateLinking.contains(baseState)) {
                        acyclicBaseStateLinking.add(baseState)
                        ensureLinked(baseState, producer)
                    }
                }
                producer.setNode(node) // set again this node
                if (newTransitiveLinking) {
                    acyclicBaseStateLinking = null
                }
            }
        } else {
            // Default linking
            super.ensureIsLinked(obj, node, ref, handledReferences, producer)
            // Pre link Scope calls for correct binding of inherited variables
            if (obj instanceof ScopeCall) {
                if (obj.scope !== null) {
                    ensureLinked(obj.scope, producer)
                }
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
