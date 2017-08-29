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
package de.cau.cs.kieler.sccharts.extensions

import de.cau.cs.kieler.kexpressions.Expression
import de.cau.cs.kieler.kexpressions.ValuedObject
import java.util.List
import org.eclipse.xtend.lib.annotations.Accessors

/**
 * @author ssm
 * @kieler.design 2017-07-05 proposed 
 * @kieler.rating 2017-07-05 proposed yellow 
 *
 */
class Binding {
    
    @Accessors var Expression sourceExpression = null
    @Accessors var ValuedObject targetValuedObject = null
    @Accessors var List<Expression> targetIndices = null
    @Accessors var BindingType type = BindingType.EXPLICIT
    @Accessors var List<String> errorMessages = <String> newLinkedList
    
    def addErrorMessage(String message) {
        errorMessages += message
    }
    
    def int errors() {
        errorMessages.size
    } 
}