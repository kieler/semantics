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

import com.google.inject.Inject
import de.cau.cs.kieler.kexpressions.Declaration
import de.cau.cs.kieler.kexpressions.GenericParameterDeclaration
import de.cau.cs.kieler.kexpressions.KExpressionsPackage
import de.cau.cs.kieler.kexpressions.ReferenceDeclaration
import de.cau.cs.kieler.kexpressions.Referenceable
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.kexpressions.VariableDeclaration
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsGenericParameterExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kexpressions.keffects.Assignment
import de.cau.cs.kieler.kexpressions.keffects.KEffectsPackage
import de.cau.cs.kieler.kexpressions.keffects.scoping.KEffectsScopeProvider
import de.cau.cs.kieler.kexpressions.kext.ClassDeclaration
import de.cau.cs.kieler.kexpressions.kext.DeclarationScope
import java.util.Set
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.scoping.IScope
import org.eclipse.xtext.scoping.Scopes
import org.eclipse.xtext.xbase.lib.Functions.Function1

/**
 * @author ssm
 * @kieler.design 2016-02-16 proposed 
 * @kieler.rating 2016-02-16 proposed yellow
 */
 class KExtScopeProvider extends KEffectsScopeProvider {

    @Inject extension KExpressionsGenericParameterExtensions
    @Inject extension KExpressionsValuedObjectExtensions
    
	override getScope(EObject context, EReference reference) {
		// This scope should trigger on every instance of a valued object reference!
		
		switch(context) {
		    ValuedObjectReference: return getScopeForValuedObjectReference(context, reference)
		    ReferenceDeclaration: return getScopeForReferenceDeclaration(context, reference)  
		}
		
		if (reference == KEffectsPackage.Literals.ASSIGNMENT__REFERENCE) {
			return getScopeForValuedObject(context, reference)
		} else if (reference == KEffectsPackage.Literals.EMISSION__REFERENCE) {
			return getScopeForValuedObject(context, reference)
		}
		
		return super.getScope(context, reference);
	}
	
	protected def IScope getScopeForValuedObjectReference(EObject context, EReference reference) {
	    val contextContainer = context.eContainer
        if (reference.eContainer instanceof ValuedObjectReference) {
			val parentVOR = reference.eContainer as ValuedObjectReference
			val declaration = parentVOR.valuedObject.eContainer as Declaration
			if (declaration instanceof ReferenceDeclaration) {
				return Scopes.scopeFor(<ValuedObject> newArrayList(declaration.valuedObjects))
			}
		} else if (contextContainer instanceof ValuedObjectReference && (contextContainer as ValuedObjectReference).subReference === context) {
		    // The context is a subreference!
		    return contextContainer.getScopeForReferencedDeclarationFromSubReference(reference)
		}
		return context.getScopeHierarchical(reference)
	}
	
	protected def IScope getScopeForReferencedDeclarationFromSubReference(EObject context, EReference reference) {
	    if (context instanceof ValuedObjectReference) {
	        if (context.valuedObject !== null) {
    	        if (context.eContainer !== null) {
    	            val parentVODecl = (context as ValuedObjectReference).valuedObject?.declaration
//                    var topLevelVO = parentVO
//                    while(topLevelVO.eContainer instanceof ValuedObjectReference && (topLevelVO.eContainer as ValuedObjectReference).subReference === topLevelVO) {
//                        topLevelVO = topLevelVO.eContainer as ValuedObjectReference
//                    }
                    if (parentVODecl instanceof ReferenceDeclaration) {
                        return parentVODecl.reference.getScopeForReferencedType(context)[ output || input ]
                    }
                    if (parentVODecl instanceof GenericParameterDeclaration) {
                        return parentVODecl.type.getScopeForReferencedType(context)[ output || input ]
                    }
                    if (parentVODecl instanceof ClassDeclaration) {
                        return parentVODecl.getScopeForStruct
                    }
                }
            }
        }
        // SubReferences must only be linked against members of their parents
        return IScope.NULLSCOPE
	}
	
	protected def IScope getScopeForStruct(ClassDeclaration struct) {
	    return Scopes.scopeFor(struct.declarations.map[valuedObjects].flatten)
	}
	
	protected def IScope getScopeForReferencedType(EObject reference, ValuedObjectReference context,
	    Function1<? super VariableDeclaration, Boolean> predicate) {
	    if (reference === null) {
	        // IMPORTANT: This can happen if the resource that should be imported does not exist. 
	        // In this case, the scope given to the linker was null previously. This causes a NPE. 
	        // Return a NullScope instead.
	        return IScope.NULLSCOPE
	    }
	    
        if (reference instanceof DeclarationScope) {
            val declarations = (reference as DeclarationScope).declarations
            val relevantDeclarations = declarations.filter(VariableDeclaration).filter(predicate).toList
            val candidates = <ValuedObject> newArrayList
            relevantDeclarations.forEach [ candidates += it.valuedObjects ]
            return Scopes.scopeFor(candidates)
        } else if (reference instanceof ValuedObject) {
            if (reference.isGenericParamter) {
                return reference.genericParameterDeclaration.type.getScopeForReferencedType(context, predicate)
            }
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
