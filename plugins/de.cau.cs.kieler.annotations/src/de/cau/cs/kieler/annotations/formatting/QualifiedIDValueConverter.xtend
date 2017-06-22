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

import de.cau.cs.kieler.annotations.formatting.AbstractQualifiedValueConverter
import org.eclipse.xtext.GrammarUtil
import java.util.Set
import org.eclipse.xtext.Grammar
import com.google.common.collect.ImmutableSet

/**
 * @author ssm
 * @kieler.design 2017-06-15 proposed
 * @kieler.rating 2017-06-15 proposed yellow 
 */
class QualifiedIDValueConverter extends AbstractQualifiedValueConverter {
        
    new() {
        super()
    }
    
    override Set<String> computeValuesToEscape(Grammar grammar) {
        return ImmutableSet.copyOf(GrammarUtil.getAllKeywords(grammar));
    }

    override boolean mustEscape(String value) {
        return getValuesToEscape().contains(value);
    }
}