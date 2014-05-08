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
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.naming.QualifiedName
import org.eclipse.xtext.resource.EObjectDescription
import org.eclipse.xtext.resource.IEObjectDescription
import org.eclipse.xtext.scoping.IScope
import org.eclipse.xtext.scoping.Scopes
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider
import org.eclipse.xtext.scoping.impl.SimpleScope

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*

/**
 * @author J
 *
 */
class SctScopeProvider extends AbstractDeclarativeScopeProvider {
    
    private val static final SCChartsPackage pack = SCChartsPackage.eINSTANCE;
    
    private def boolean isProxy(Object o) {
        return (o as EObject).eIsProxy()
    }
    
    public def IScope scope_Binding_formal(EObject context, EReference reference) {
        if (context instanceof Binding) {
            val obj = context.eContainer().eGet(pack.getScope_ReferencedScope(), true);
            if (!isProxy(obj)) {
                val refScope = obj as Scope 

                val voIterable = <ValuedObject> newArrayList 
                refScope.declarations.forEach[ voIterable += valuedObjects ]
                
                return Scopes.scopeFor(voIterable);
            } else {
                return IScope.NULLSCOPE;
            }
        } else if (context instanceof Scope) {
            val obj = context.eGet(pack.getScope_ReferencedScope(), false);
            if (!isProxy(obj)) {
                val refScope = obj as Scope;
                
                val voIterable = refScope.declarations.filter(typeof(ValuedObject))
                
                return Scopes.scopeFor(voIterable);
            } else {
                return IScope.NULLSCOPE;
            }
        } else {
            return IScope.NULLSCOPE;
        }
    }    

    public def IScope scope_Transition_targetState(Transition trans, EReference reference) {
        
        val l = <IEObjectDescription> newLinkedList
        val m = new HashSet<String>
        var String key = null
        for (State s : ((trans.eContainer().eContainer()) as Region).getStates) {
            key = s.getId();
            if (m.contains(key)) {
                key = s.getId()
            }
            l.add(new EObjectDescription(QualifiedName.create(key), s,
                    Collections.<String, String> emptyMap()))
            m.add(key);

        }
        return new SimpleScope(l)
    }    
}