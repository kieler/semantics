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
package de.cau.cs.kieler.sccharts.ui.synthesis

import org.eclipse.xtend.lib.annotations.Accessors
import de.cau.cs.kieler.kexpressions.Expression
import de.cau.cs.kieler.kexpressions.keffects.Assignment
import de.cau.cs.kieler.kexpressions.ReferenceDeclaration
import de.cau.cs.kieler.sccharts.Scope
import java.util.Set
import org.eclipse.emf.ecore.EStructuralFeature
import org.eclipse.emf.ecore.EOperation
import org.eclipse.emf.common.util.EList
import java.lang.reflect.InvocationTargetException
import org.eclipse.emf.common.notify.Notification
import de.cau.cs.kieler.kexpressions.OperatorExpression

/**
 * @author ssm
 * @kieler.design 2017-09-26 proposed
 * @kieler.rating 2017-09-26 proposed yellow
 * 
 */
class Wire {

    @Accessors var Set<Expression> names = <Expression> newHashSet
    @Accessors var Wiring wiring = null
    @Accessors var boolean sink = false
    @Accessors var boolean source = false
    @Accessors var ReferenceDeclaration referenceDeclaration = null

    new(Expression expression, Wiring wiring) {
        this.wiring = wiring
        names.add(expression)
    }

    def contains(Expression expression) {
        names.contains(expression)
    }
    
    def getFirstExpression() {
        names.head
    }
    
    def boolean containsOperatorExpression() {
        names.exists[ it instanceof OperatorExpression ]
    }
    
    def Scope getReference() {
        if (referenceDeclaration == null) return null
        return referenceDeclaration.reference as Scope
    }
        
}
