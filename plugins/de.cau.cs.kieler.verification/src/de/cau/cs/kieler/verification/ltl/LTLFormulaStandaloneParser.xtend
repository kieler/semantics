/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2023 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.verification.ltl

import de.cau.cs.kieler.kexpressions.Expression
import de.cau.cs.kieler.verification.ltl.lTLFormula.LTLExpression
import java.io.ByteArrayInputStream
import java.nio.charset.Charset
import java.nio.charset.StandardCharsets

/**
 * @author jep
 * 
 */
class LTLFormulaStandaloneParser {

    static val injector = LTLFormulaStandaloneSetup.doSetup

    /**
     * Parses a Expression from the given text.
     */
    static def Expression parseLTLFormula(String text) {
        return text.parseLTLFormula(StandardCharsets.UTF_8)
    }

    /**
     * Parses a LTL formula from the given text with given encoding
     */
    static def Expression parseLTLFormula(String text, Charset encoding) {
        var res = createLTLResource(text, encoding)
        if (!res.contents.empty && res.errors.empty) {
            val formula = res.contents.head
            if (formula instanceof LTLExpression) {
                return formula
            }
        }
        return null
    }
    
    /**
     * Create resource model for given text with given encoding
     */
    static def LTLFormulaResource createLTLResource(String text, Charset encoding) {
        var res = injector.getInstance(LTLFormulaResource)
        res.standaloneParse = true
        res.load(new ByteArrayInputStream(text.getBytes(encoding)), emptyMap)
        return res
    }

}
