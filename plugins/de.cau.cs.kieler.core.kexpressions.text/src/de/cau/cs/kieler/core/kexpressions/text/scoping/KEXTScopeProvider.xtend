/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2016 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.core.kexpressions.text.scoping

import de.cau.cs.kieler.core.kexpressions.ValuedObject
import de.cau.cs.kieler.core.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.core.kexpressions.keffects.KEffectsPackage
import de.cau.cs.kieler.core.kexpressions.keffects.scoping.KEffectsScopeProvider
import de.cau.cs.kieler.core.kexpressions.text.kext.DeclarationScope
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.scoping.IScope
import org.eclipse.xtext.scoping.Scopes

/**
 * @author ssm
 * @kieler.design 2016-02-16 proposed 
 * @kieler.rating 2016-02-16 proposed yellow
 */
 class KEXTScopeProvider extends KEffectsScopeProvider {

	override getScope(EObject context, EReference reference) {
		// This scope should trigger on every instance of a valued object reference!
		if (context instanceof ValuedObjectReference) {
			return getScopeForValuedObjectReference(context, reference)
		} else if (reference == KEffectsPackage.Literals.ASSIGNMENT__VALUED_OBJECT) {
			return getScopeForValuedObject(context, reference)
		} else if (reference == KEffectsPackage.Literals.EMISSION__VALUED_OBJECT) {
			return getScopeForValuedObject(context, reference)
		}
		return super.getScope(context, reference);
	}
	
	protected def IScope getScopeForValuedObjectReference(EObject context, EReference reference) {
		return context.getScopeHierarchical(reference)
	}
	
	protected def IScope getScopeForValuedObject(EObject context, EReference reference) {
		return context.getScopeHierarchical(reference)
	}
	
	protected def IScope getScopeHierarchical(EObject context, EReference reference) {
		val candidates = <ValuedObject> newArrayList
		var declarationScope = context.nextDeclarationScope
		while (declarationScope != null) {
			for(declaration : declarationScope.declarations) {
				for(VO : declaration.valuedObjects) {
					candidates += VO
				}
			}				
			declarationScope = declarationScope.nextDeclarationScope
		}
		return Scopes.scopeFor(candidates)
	}
	
	
	protected def DeclarationScope getNextDeclarationScope(EObject eObject) {
		var eO = eObject
		while(eO != null) {
			eO = eO.eContainer
			if (eO instanceof DeclarationScope) return eO 
		}
		return null
	}

}


// Xtext example: 

//	override getScope(EObject context, EReference reference) {
//		// We want to define the Scope for the Element's superElement cross-reference
//		if (context instanceof ValuedObjectReference && reference == KextPackage.Literals.TEST_ENTITY__EFFECT) {
//			// Collect a list of candidates by going through the model
//			// EcoreUtil2 provides useful functionality to do that
//			// For example searching for all elements within the root Object's tree
//			val rootElement = EcoreUtil2.getRootContainer(context)
//			val candidates = EcoreUtil2.getAllContentsOfType(rootElement, Element)
//			// Create IEObjectDescriptions and puts them into an IScope instance
//			return Scopes.scopeFor(candidates)
//		}
//		return super.getScope(context, reference);
//	}

