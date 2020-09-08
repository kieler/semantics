/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2015 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.kexpressions.extensions

import com.google.inject.Inject
import de.cau.cs.kieler.kexpressions.GenericParameterDeclaration
import de.cau.cs.kieler.kexpressions.ValueType
import de.cau.cs.kieler.kexpressions.ValuedObject
import org.eclipse.emf.ecore.EObject

/**
 * @authors als
 */

class KExpressionsGenericParameterExtensions {
	    
    @Inject
    extension KExpressionsValuedObjectExtensions
    
	def boolean isGenericParamter(EObject obj) {
		if (obj instanceof ValuedObject) {
		    if (obj.declaration instanceof GenericParameterDeclaration) {
		        return true
		    }
		}
		return false
	}
	
    def GenericParameterDeclaration getGenericParameterDeclaration(ValuedObject obj) {
        if (obj.declaration instanceof GenericParameterDeclaration) {
            return obj.eContainer as GenericParameterDeclaration
        } else {
            return null 
        }
    }
    
    def boolean isTypeDeclaration(GenericParameterDeclaration decl) {
        return (decl.type !== null && !decl.reference) || (decl.type === null && decl.valueType === ValueType.UNKNOWN)
    }
    def boolean isValueDeclaration(GenericParameterDeclaration decl) {
        return decl.valueType !== ValueType.UNKNOWN
    }
    def boolean isReferenceDeclaration(GenericParameterDeclaration decl) {
        return decl.type !== null && decl.reference
    }
}