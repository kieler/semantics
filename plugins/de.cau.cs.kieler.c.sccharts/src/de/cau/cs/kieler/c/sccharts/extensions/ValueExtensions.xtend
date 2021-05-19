/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2021 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.c.sccharts.extensions

import de.cau.cs.kieler.kexpressions.extensions.KExpressionsCreateExtensions
import com.google.inject.Inject
import de.cau.cs.kieler.kexpressions.Expression
import org.eclipse.cdt.core.dom.ast.IBasicType
import org.eclipse.cdt.core.dom.ast.IASTLiteralExpression
import org.eclipse.cdt.core.dom.ast.IPointerType
import org.eclipse.cdt.core.dom.ast.IQualifierType

/**
 * Extension for converting CDT literal values to KExpression literals.
 * 
 * @author lan, nre
 */
class ValueExtensions {

    @Inject extension KExpressionsCreateExtensions

    // Creates Value KExpression for a CDT literal node
    def Expression createValue(IASTLiteralExpression value) {
        var Expression valExpr
        val iastType = value.getExpressionType
        switch (iastType) {
            IBasicType: {
                val iastBasicKind = iastType.getKind
                switch (iastBasicKind) {
                    case IBasicType.Kind.eInt: {
                        valExpr = createIntValue(Integer.parseInt(value.toString))
                    }
                    case IBasicType.Kind.eDouble: {
                        valExpr = createFloatValue(Double.parseDouble(value.toString))
                    }
                    case IBasicType.Kind.eFloat: {
                        valExpr = createFloatValue(Float.parseFloat(value.toString))
                    }
                    // char literal is mapped to a String literal.
                    case IBasicType.Kind.eChar,
                    case IBasicType.Kind.eChar16,
                    case IBasicType.Kind.eChar32: {
                        val charWithTicks = value.toString
                        valExpr = createStringValue(charWithTicks.substring(1, charWithTicks.length - 1))
                    }
                    default: {
                        println("ValueExtensions: Type of literal node not defined!")
                    }
                }
            }
            IPointerType case iastType.type instanceof IQualifierType
                && (iastType.type as IQualifierType).type instanceof IBasicType
                && (iastType.type as IQualifierType).isConst
                && ((iastType.type as IQualifierType).type as IBasicType).kind === IBasicType.Kind.eChar: {
                // String literal (with type const char *) is mapped to a String literal.
                val stringWithQuotes = value.toString
                valExpr = createStringValue(stringWithQuotes.substring(1, stringWithQuotes.length - 1))
            }
            default: {
                println("ValueExtensions: Type of literal node not a basic or string type!")
            }
        }

        return valExpr
    }

}
