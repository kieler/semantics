/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2014 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sccharts.text.sct.scoping

import de.cau.cs.kieler.core.kexpressions.ValuedObject
import de.cau.cs.kieler.sccharts.Binding
import de.cau.cs.kieler.sccharts.Region
import de.cau.cs.kieler.sccharts.SCChartsPackage
import de.cau.cs.kieler.sccharts.Scope
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.Transition
import java.util.Collections
import java.util.HashSet
import javax.inject.Inject
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.naming.QualifiedName
import org.eclipse.xtext.resource.EObjectDescription
import org.eclipse.xtext.resource.IEObjectDescription
import org.eclipse.xtext.scoping.IScope
import org.eclipse.xtext.scoping.Scopes
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider
import org.eclipse.xtext.scoping.impl.SimpleScope
import de.cau.cs.kieler.sccharts.Sender
import de.cau.cs.kieler.sccharts.ReferencedNode
import de.cau.cs.kieler.sccharts.Receiver

/**
 * This class implements to scoping for referencedScope (used in KiCoUtil.parse()) and for binding (used in the sct Xtext editor).
 * 
 * @author ssm chsch cmot
 * @kieler.design 2014-06-08 proposed
 * @kieler.rating 2014-06-08 proposed yellow
 *
 */
class SctScopeProvider extends AbstractDeclarativeScopeProvider {

    private val static final SCChartsPackage pack = SCChartsPackage.eINSTANCE;

    @Inject
    SctQualifiedNameProvider nameProvider

    private def boolean isProxy(Object o) {
        return (o as EObject).eIsProxy()
    }

    public def IScope scope_referencedNode_referencedScope(EObject context, EReference reference) {
        val superScope = super.getScope(context.eContainer, reference)

        val res = context.eResource
        if (res != null) {
            val resSet = res.resourceSet
            if (resSet != null) {
                val rIterable = <Scope>newArrayList
                for (r : resSet.resources) {
                    val contentList = r.contents.filter(e|e instanceof State).toList
                    if (!contentList.nullOrEmpty) {
                        for (content : contentList) {
                            rIterable += content as Scope
                        }
                    }
                }
                return Scopes.scopeFor(rIterable, nameProvider, superScope);
            }
        }
        return IScope.NULLSCOPE;
    }
    
    public def IScope referencedNode_SenderScope(EObject context, EReference reference) {
        var EObject theContext = context;

        val obj = theContext.eGet(pack.referencedNode_ReferencedScope, true);
        if (!isProxy(obj)) {
            val refScope = obj as Scope

            val voIterable = <ValuedObject>newArrayList
            refScope.declarations.forEach[
            	if (it.output) voIterable += valuedObjects
            ]

            return Scopes.scopeFor(voIterable);
        } else {
            return IScope.NULLSCOPE;
        }
    }
    
    public def IScope scope_ValuedObjectReference_valuedObject(EObject context, EReference reference) {
		if (context instanceof ReferencedNode) {
			return referencedNode_SenderScope(context, reference)
		}
        return null;
    }    
    
    public def IScope scope_Receiver_valuedObject(EObject context, EReference reference) {
    	val superScope = super.getScope(context.eContainer, reference)
    	
        if (context instanceof Receiver) {
        	if ((context as Receiver).node instanceof ReferencedNode) {
	        	var EObject theContext = (context as Receiver).node as ReferencedNode
        		val obj = theContext.eGet(pack.referencedNode_ReferencedScope, true);
        		if (!isProxy(obj)) {
            		val refScope = obj as Scope

            		val voIterable = <ValuedObject>newArrayList
            		refScope.declarations.forEach[
            			if (it.input) voIterable += valuedObjects
            		]

            		return Scopes.scopeFor(voIterable);
        		} else {
            		return superScope;
        		}
       		} else {
       			return superScope
       		}
   		}
   		return null
    }
    
    public def IScope scope_Scope_referencedScope(EObject context, EReference reference) {
        val superScope = super.getScope(context.eContainer, reference)

        val res = context.eResource
        if (res != null) {
            val resSet = res.resourceSet
            if (resSet != null) {
                val rIterable = <Scope>newArrayList
                for (r : resSet.resources) {
                    val contentList = r.contents.filter(e|e instanceof State).toList
                    if (!contentList.nullOrEmpty) {
                        for (content : contentList) {
                            rIterable += content as Scope
                        }
                    }
                }
                return Scopes.scopeFor(rIterable, nameProvider, superScope);
            }
        }
        return IScope.NULLSCOPE;
    }

    public def IScope scope_Binding_formal(EObject context, EReference reference) {
        var EObject theContext = context;
        if (context instanceof Binding) {
            theContext = context.eContainer;
        }

        val obj = theContext.eGet(pack.getScope_ReferencedScope(), true);
        if (!isProxy(obj)) {
            val refScope = obj as Scope

            val voIterable = <ValuedObject>newArrayList
            refScope.declarations.forEach[voIterable += valuedObjects]

            return Scopes.scopeFor(voIterable);
        } else {
            return IScope.NULLSCOPE;
        }

    }

    public def IScope scope_Transition_targetState(Transition trans, EReference reference) {

        val l = <IEObjectDescription>newLinkedList
        val m = new HashSet<String>
        var String key = null
        val region = (trans.eContainer().eContainer()) as Region
        for (State s : region.states) {
            key = s.getId();
            if (m.contains(key)) {
                key = s.getId()
            }
            l.add(
                new EObjectDescription(QualifiedName.create(key), s,
                    Collections.<String, String>emptyMap()))
            m.add(key);
        }

        return new SimpleScope(l)
    }
}
