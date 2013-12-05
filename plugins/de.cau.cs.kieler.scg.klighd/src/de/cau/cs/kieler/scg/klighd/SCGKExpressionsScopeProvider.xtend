/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2013 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.scg.klighd

import com.google.inject.Singleton
import de.cau.cs.kieler.core.kexpressions.ValuedObject
import de.cau.cs.kieler.core.kexpressions.scoping.KExpressionsScopeProvider
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scgbb.SCGraphBB
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.scoping.IScope
import org.eclipse.xtext.scoping.Scopes

/** 
 * Specialized SCG KExpression scope provider
 * 
 * Need to retrieve the correct scope for the valued objects in the SCGraph.
 * 
 * @author ssm
 * @kieler.design 2013-10-23 proposed 
 * @kieler.rating 2013-10-23 proposed yellow
 */

@Singleton
class SCGKExpressionsScopeProvider extends KExpressionsScopeProvider {

    private SCGraph parent;

    // Set parent to the SCGraph.
    // All declarations are stored here.
    def void setParent(SCGraph theParent) {
        parent = theParent;
    }
    
    // ValuedObject scope
    def IScope scope_ValuedObject(EObject context, EReference reference) {
        Scopes.scopeFor(parent.getValuedObjects())
    }

    // ValuedObjectReference scope
    def IScope scope_ValuedObjectReference_valuedObject(EObject context, EReference reference) {
  		val scopeObjects = <ValuedObject> newLinkedList
  		scopeObjects.addAll(parent.getValuedObjects)
    	if (parent instanceof SCGraphBB) (parent as SCGraphBB).basicBlocks.forEach[scopeObjects.add(it.guard)]
        Scopes.scopeFor(scopeObjects)
    }

}