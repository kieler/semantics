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
package de.cau.cs.kieler.kexpressions.kext

import de.cau.cs.kieler.kexpressions.Expression
import java.nio.charset.StandardCharsets
import java.nio.charset.Charset
import java.io.ByteArrayInputStream
import de.cau.cs.kieler.kexpressions.keffects.Effect
import de.cau.cs.kieler.kexpressions.JsonObjectValue

/**
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
class KExtStandaloneParser {
    
    static val injector = KExtStandaloneSetup.doSetup

    /**
     * Parses a Expression from the given text.
     */
    static def Expression parseExpression(String text) {
        return ("expression " + text).parseScope(StandardCharsets.UTF_8).entities.head?.expression?.expression
    }
    
    /**
     * Parses a JsonObjectValue from the given text.
     */
    static def JsonObjectValue parseJsonObject(String text) {
        val exp = ("json " + text).parseScope(StandardCharsets.UTF_8)?.entities?.head?.expression?.expression
        if (exp instanceof JsonObjectValue) {
            return exp as JsonObjectValue
        }
        return null
    }
    
    /**
     * Parses a Expression from the given text.
     */
    static def Effect parseEffect(String text) {
        return text.parseScope(StandardCharsets.UTF_8).entities.head?.effect
    }
    
    /**
     * Parses a KExt scope from the given text with given encoding
     */
    static def KExtScope parseScope(String text, Charset encoding) {
        var res = injector.getInstance(KExtResource)
        res.standaloneParse = true
        res.load(new ByteArrayInputStream(text.getBytes(encoding)), emptyMap)
        
        if (!res.contents.empty && res.errors.empty) {
            val kext = res.contents.head
            if (kext instanceof Kext) {
                if (!kext.scopes.empty) {
                    return kext.scopes.head
                }
            }
        }
        return null
    }
    
}