/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2018 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.kexpressions.text.test

import de.cau.cs.kieler.kexpressions.kext.KExtStandaloneSetup
import de.cau.cs.kieler.kexpressions.kext.extensions.KExtSerializeExtensions
import java.io.PrintWriter
import java.io.StringWriter
import org.junit.Test

import static org.junit.Assert.*

import static extension de.cau.cs.kieler.kexpressions.kext.KExtStandaloneParser.*

/** 
 * VERY simple test for the standalone parser.
 * 
 * @author als
 */
class KExtStandaloneParserTest {
    
    static val injector = KExtStandaloneSetup.doSetup
    
    extension KExtSerializeExtensions = injector.getInstance(KExtSerializeExtensions)
    
    @Test def void testExpressionParser() {
        val tests = #[
            "A && (!B || C)"
        ]
        for (test : tests) {
            try {
                val exp = test.parseExpression
                val serialized = exp.serializeHR
                assertTrue("Expression was not parsed correctly. Expected '" + test + "' was '" + serialized + "'", test.equals(serialized))
            } catch (Exception e) {
                fail("Cannot parse expression '" + test + "' because of " + e.toString + "\n" + ((new StringWriter) => [e.printStackTrace(new PrintWriter(it))]).toString())
            }
        }
    }

    @Test
    def void testEffectsParser() {
        val tests = #[
            "x = 5"
        ]
        for (test : tests) {
            try {
                val exp = test.parseEffect
                val serialized = exp.serializeHR
                assertTrue("Effect was not parsed correctly. Expected '" + test + "' was '" + serialized + "'", test.equals(serialized))
            } catch (Exception e) {
                fail("Cannot parse effect '" + test + "' because of " + e.toString + "\n" + ((new StringWriter) => [e.printStackTrace(new PrintWriter(it))]).toString())
            }
        }
    }
}
