/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2024 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.kexpressions.scoping

import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.naming.QualifiedName
import org.eclipse.xtext.resource.IEObjectDescription
import org.eclipse.xtext.scoping.IScope
import org.eclipse.xtext.scoping.Scopes
import org.eclipse.xtext.scoping.impl.SimpleScope
import org.eclipse.xtext.util.SimpleAttributeResolver

/**
 * Same as SimpleScope but with fix for overloading.
 * 
 * @author als
 */
class OverloadingAwareSimpleScope extends SimpleScope {

    new(Iterable<? extends EObject> elements) {
        super(IScope.NULLSCOPE,
            Scopes.scopedElementsFor(
                elements, 
                QualifiedName.wrapper(SimpleAttributeResolver.NAME_RESOLVER)
            )
        );
    }
    
    override Iterable<IEObjectDescription> getLocalElementsByEObject(EObject object, URI uri) {
        return getAllLocalElements().filter[ input |
            if (input.getEObjectOrProxy() == object) {
                return canBeFoundByNameAndShadowingKey(object, uri, input);
            }
            if (uri.equals(input.getEObjectURI())) {
                return canBeFoundByNameAndShadowingKey(object, uri, input);
            }
            return false;
        ]
    }
    
    def boolean canBeFoundByNameAndShadowingKey(EObject object, URI uri, IEObjectDescription input) {
        val Iterable<IEObjectDescription> lookUp = getLocalElementsByName(input.getName());
        val Object myShadowingKey = getShadowingKey(input);
        for(IEObjectDescription other: lookUp) {
            if (myShadowingKey.equals(getShadowingKey(other))) {
                if (other == input)
                    return true;
                if (other.getEObjectOrProxy() == object)
                    return true;
                if (uri.equals(other.getEObjectURI()))
                    return true;
                // No return false here to continue testing
            }
        }
        return false;
    }
}
