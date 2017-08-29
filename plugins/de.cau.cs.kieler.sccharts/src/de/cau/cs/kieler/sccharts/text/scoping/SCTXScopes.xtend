/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2016 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.sccharts.text.scoping

import org.eclipse.xtext.scoping.Scopes
import org.eclipse.xtext.util.SimpleAttributeResolver
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.naming.QualifiedName
import org.eclipse.xtext.resource.IEObjectDescription
import org.eclipse.xtext.scoping.IScope
import org.eclipse.xtext.scoping.impl.SimpleScope

/**
 * @author ssm
 * 
 */
class SCTXScopes extends Scopes {
    
//    public final static val ID_RESOLVER = SimpleAttributeResolver.newResolver(typeof(String), "id")    
    
    public final static val NAME_WRAPPER = QualifiedName.wrapper(EscapedAttributeResolver.NAME_RESOLVER)
//    public final static val ID_WRAPPER = QualifiedName.wrapper(ID_RESOLVER)
    
    
    public static def IScope scopeFor(Iterable<? extends EObject> elements) {
        return scopeFor(elements, IScope.NULLSCOPE);
    }    
    
    public static def IScope scopeFor(Iterable<? extends EObject> elements, IScope outer) {
        val nameScope = scopeFor(elements, NAME_WRAPPER, outer)
        
        return new SimpleScope(nameScope.allElements)
    }    
    
    public static def Iterable<IEObjectDescription> scopedElementsFor(Iterable<? extends EObject> elements) {
        val nameScope = scopedElementsFor(elements, NAME_WRAPPER)
        
        return nameScope
    }
    
}
