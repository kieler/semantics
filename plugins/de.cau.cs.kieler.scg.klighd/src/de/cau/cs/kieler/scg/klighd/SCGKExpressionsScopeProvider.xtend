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
package de.cau.cs.kieler.scg.klighd

import com.google.inject.Singleton
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.scoping.KExpressionsScopeProvider
import de.cau.cs.kieler.scg.SCGraph
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.scoping.IScope
import org.eclipse.xtext.scoping.Scopesimport java.util.List

/** 
 * Specialized SCG KExpression scope provider
 * 
 * Needed to retrieve the correct scope for the valued objects in the SCGraph.
 * 
 * @author ssm
 * @kieler.design 2013-10-23 proposed 
 * @kieler.rating 2013-10-23 proposed yellow
 */

@Singleton
class SCGKExpressionsScopeProvider extends KExpressionsScopeProvider {

    private SCGraph parent;
    private List<ValuedObject> valuedObjects = <ValuedObject> newArrayList;

    /**
     * Since all declarations are stored in the parent SCG, set parent to the SCGraph.
     *
     * @param theParent
     * 			The root parent of all valued objects.
     * @returns Returns nothing.  
     */
    def void setParent(SCGraph theParent) {
        parent = theParent;
        valuedObjects.clear;
        for(tg : parent.declarations) {
        	valuedObjects.addAll(tg.valuedObjects)
        }
        for(g : parent.guards) {
        	valuedObjects += g.valuedObject
        }
    }
    
	/**
	 * Returns the scope of the valued objects stored in the parent object.
	 * 
	 * @param context context 
	 * @param reference reference
	 * @return Returns the scope of the valued objects stored in the parent object.
	 */
    def IScope scope_ValuedObject(EObject context, EReference reference) {
        Scopes.scopeFor(valuedObjects)
    }

    /**
     * Returns the scope valued objects stored in the parent object. 
     * However, if the graph is an SCGraphBB, the valued object maybe a guard of a basic block. Add them as well.
     * 
     * @param context conect
     * @param reference reference
     * @return Returns the scope of the valued objects stored in the parent object of in its basic blocks.
     */
    def IScope scope_ValuedObjectReference_valuedObject(EObject context, EReference reference) {
  		val scopeObjects = <ValuedObject> newLinkedList
  		scopeObjects.addAll(valuedObjects)
    	if (parent instanceof SCGraph) {
    		(parent as SCGraph).getBasicBlocks.forEach[
    		    schedulingBlocks.forEach[
                    scopeObjects += guards.head.valuedObject
    		    ]
    		]
    	}
        Scopes.scopeFor(scopeObjects)
    }
    
    def IScope scope_Expression(EObject context, EReference reference) {
        Scopes.scopeFor(valuedObjects)
    }

    def IScope scope_IntValue(EObject context, EReference reference) {
        Scopes.scopeFor(valuedObjects)
    }
    
     def IScope scope_FunctionCall(EObject context, EReference reference) {
        Scopes.scopeFor(valuedObjects)
    }
    
    def IScope scope_Guard(EObject context, EReference reference) {
        Scopes.scopeFor(valuedObjects)
    }
    
    def IScope scope_ValuedObjectReference(EObject context, EReference reference) {
		Scopes.scopeFor(valuedObjects)
    }

}