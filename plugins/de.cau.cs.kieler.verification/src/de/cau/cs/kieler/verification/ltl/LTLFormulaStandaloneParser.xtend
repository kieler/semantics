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

import java.nio.charset.StandardCharsets
import java.nio.charset.Charset
import java.io.ByteArrayInputStream
import de.cau.cs.kieler.kexpressions.Expression

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
        var res = injector.getInstance(LTLFormulaResource)
        res.standaloneParse = true
        res.load(new ByteArrayInputStream(text.getBytes(encoding)), emptyMap)

        if (!res.contents.empty && res.errors.empty) {
            val formula = res.contents.head
            if (formula instanceof Expression) {
                return formula
            }
        }
        return null
    }

}
