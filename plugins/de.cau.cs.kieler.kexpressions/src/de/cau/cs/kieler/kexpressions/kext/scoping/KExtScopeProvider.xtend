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
package de.cau.cs.kieler.kexpressions.kext.scoping

import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.kexpressions.keffects.KEffectsPackage
import de.cau.cs.kieler.kexpressions.keffects.scoping.KEffectsScopeProvider
import de.cau.cs.kieler.kexpressions.kext.DeclarationScope
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.scoping.IScope
import org.eclipse.xtext.scoping.Scopes
import de.cau.cs.kieler.kexpressions.Declaration
import de.cau.cs.kieler.kexpressions.ReferenceDeclaration
import de.cau.cs.kieler.kexpressions.KExpressionsPackage
import java.util.Set
import de.cau.cs.kieler.kexpressions.Referenceable
import de.cau.cs.kieler.kexpressions.VariableDeclaration
import de.cau.cs.kieler.kexpressions.keffects.Assignment
import org.eclipse.xtext.xbase.lib.Functions.Function1

/**
 * @author ssm
 * @kieler.design 2016-02-16 proposed 
 * @kieler.rating 2016-02-16 proposed yellow
 */
 class KExtScopeProvider extends KEffectsScopeProvider {

	override getScope(EObject context, EReference reference) {
		// This scope should trigger on every instance of a valued object reference!
		
		switch(context) {
		    ValuedObjectReference: return getScopeForValuedObjectReference(context, reference)
		    ReferenceDeclaration: return getScopeForReferenceDeclaration(context, reference)  
		    Assignment: return getScopeForAssignment(context, reference) 
		}
		
		if (reference == KEffectsPackage.Literals.ASSIGNMENT__VALUED_OBJECT) {
			return getScopeForValuedObject(context, reference)
		} else if (reference == KEffectsPackage.Literals.EMISSION__VALUED_OBJECT) {
			return getScopeForValuedObject(context, reference)
		}
		
		return super.getScope(context, reference);
	}
	
	protected def IScope getScopeForAssignment(EObject context, EReference reference) {
	    if (context instanceof Assignment) {
	        if (context.subReference != null && context.subReference.valuedObject == null) {
	            return context.getScopeForReferencedDeclarationFromAssignment(reference)
	        }
	    }
	    return context.getScopeHierarchical(reference)
	}
	
	protected def IScope getScopeForValuedObjectReference(EObject context, EReference reference) {
        if (reference.eContainer instanceof ValuedObjectReference) {
			val parentVOR = reference.eContainer as ValuedObjectReference
			val declaration = parentVOR.valuedObject.eContainer as Declaration
			if (declaration instanceof ReferenceDeclaration) {
				return Scopes.scopeFor(<ValuedObject> newArrayList(declaration.valuedObjects))
			}
		} else if (context.eContainer instanceof ValuedObjectReference) {
		    // The context is a subreference!
		    var parentVO = context.eContainer as ValuedObjectReference
		    return parentVO.getScopeForReferencedDeclarationFromSubReference(reference)
		} else if (context instanceof ValuedObjectReference) {
		    if (context.eContainer instanceof Assignment) {
		        // The context is a subreference inside of an assignment!
		        if (context != context.eContainer.asAssignment.expression) {
		          return context.eContainer.getScopeForReferencedDeclarationFromAssignment(reference)
		        }
	       	} else if (context.subReference != null && context.subReference.valuedObject == null) {
		        var parentVO = context as ValuedObjectReference
		        return parentVO.getScopeForReferencedDeclarationFromSubReference(reference)
		    }
        }
		return context.getScopeHierarchical(reference)
	}
	
	 protected def IScope getScopeForReferencedDeclarationFromAssignment(EObject context, EReference reference) {
        if (context instanceof Assignment) {
            if (context.valuedObject != null) {
                if (context.valuedObject.eContainer != null) {
                    if (context.valuedObject.eContainer instanceof ReferenceDeclaration) {
                        return (context.valuedObject.eContainer as ReferenceDeclaration).
                            getScopeForReferencedDeclarationObject[ input ]
                    }
                }
            }
        }
        return context.getScopeHierarchical(reference)      
    }
	
	protected def IScope getScopeForReferencedDeclarationFromSubReference(EObject context, EReference reference) {
	    if (context instanceof ValuedObjectReference) {
	        if (context.valuedObject != null) {
    	        if (context.eContainer != null) {
                    var parentVO = context as ValuedObjectReference
                    while(parentVO.eContainer instanceof ValuedObjectReference) {
                        parentVO = parentVO.eContainer as ValuedObjectReference
                    }
                    if (parentVO.valuedObject.eContainer instanceof ReferenceDeclaration) {
                        return (parentVO.valuedObject.eContainer as ReferenceDeclaration).
                            getScopeForReferencedDeclarationObject[ output ]
                    }
                }
            }
        }
        return context.getScopeHierarchical(reference)	    
	}
	
	protected def IScope getScopeForReferencedDeclarationObject(ReferenceDeclaration declaration,
	    Function1<? super VariableDeclaration, Boolean> predicate
	) {
        if (declaration.reference instanceof DeclarationScope) {
            val declarations = (declaration.reference as DeclarationScope).declarations
            val relevantDeclarations = declarations.filter(VariableDeclaration).filter(predicate).toList
            val candidates = <ValuedObject> newArrayList
            relevantDeclarations.forEach [ candidates += it.valuedObjects ]
            return Scopes.scopeFor(candidates)
       }
	}
	
	protected def IScope getScopeForReferenceDeclaration(EObject context, EReference reference) {
 		if (reference == KExpressionsPackage.Literals.REFERENCE_DECLARATION__REFERENCE) {
			val declaration = context
			if (declaration instanceof ReferenceDeclaration) {
				return Scopes.scopeFor(<ValuedObject> newArrayList(declaration.valuedObjects))
			}
		}
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
	
	protected def Set<Referenceable> getReferenceables(EObject eObject) {
	    eObject.eContents.filter(Referenceable).toSet
	}
	
	private def asAssignment(EObject eObject) {
	    eObject as Assignment
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

