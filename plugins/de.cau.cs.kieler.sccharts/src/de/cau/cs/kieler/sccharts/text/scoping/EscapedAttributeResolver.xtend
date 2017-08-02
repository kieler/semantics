/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright ${year} by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.sccharts.text.scoping

import org.eclipse.xtext.util.SimpleAttributeResolver
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.conversion.impl.IDValueConverter
import com.google.inject.Inject
import com.google.inject.Injector
import com.google.inject.Guice

/**
 * @author ssm
 * @kieler.design 2017-08-01 proposed 
 * @kieler.rating 2017-08-01 proposed yellow
 *
 */
class EscapedAttributeResolver<K extends EObject, T extends String> extends SimpleAttributeResolver<K, T> {
    
    public static val EscapedAttributeResolver<EObject, String> NAME_RESOLVER = newEscapedResolver(typeof(String), "name");
    
    static def<K extends EObject, T extends String> EscapedAttributeResolver<K, T> newEscapedResolver(Class<T> type, String attributeName) {
        return new EscapedAttributeResolver<K, T>(type, attributeName)
    }    
    
    protected new(Class<T> type, String attributeName) {
        super(type, attributeName)
    }
    
    override T apply(K from) {
        val v = getValue(from) 
        if (v.startsWith("^")) {
            // TODO: Make this safe with an IDConverter and the mustEscape check
            return converter(v) as T
        }
        return v 
    }
    
    protected def String converter(String string) {
        val s = string.substring(1, string.length)
        return s
    }
}