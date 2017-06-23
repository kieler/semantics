/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2017 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.annotations.formatting

import org.eclipse.xtext.conversion.impl.AbstractIDValueConverter
import com.google.inject.ImplementedBy
import org.eclipse.xtext.nodemodel.INode

/**
 * @author ssm
 * @kieler.design 2017-06-15 proposed
 * @kieler.rating 2017-06-15 proposed yellow 
 */
@ImplementedBy(QualifiedIDValueConverter)
abstract class AbstractQualifiedValueConverter extends AbstractIDValueConverter {
        
    override String toEscapedString(String value) {
        val segments = value.split("\\.")
        for(i : 0..segments.length-1) {
            if (mustEscape(segments.get(i))) {
                segments.set(i, "^" + segments.get(i))
            }
        }
        
        return segments.join(".")
    }
    
    override String toValue(String string, INode node) {
        if (string == null) return null;
        
        val segments = string.split("\\.")
        for(i : 0..segments.length-1) {
            if (segments.get(i).startsWith("^")) segments.set(i, segments.get(i).substring(1))
        }
        
        return segments.join(".")
    }
}