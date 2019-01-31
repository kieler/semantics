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
package de.cau.cs.kieler.scg.processors.transformators.codegen.smv

import java.util.regex.Pattern

/** 
 * @author aas
 */
class SmvCodeGeneratorExtensions {
    
    private static val NO_IDENTIFIER_CHARACTER_PATTERN = Pattern.compile('''[^a-zA-z0-9_]''')
    
    public def static String toSmvExpression(CharSequence kexpression) {
        return kexpression.toString.replace("==", "=").replace("&&", "&").replace("||", "|")
                                   .replace("false", "FALSE").replace("true", "TRUE")
    }
    
    public static def String toKExpression(CharSequence smvExpression) {
        return smvExpression.toString.replace("=", "==").replace("&","&&").replace("|","||")
                                     .replace("FALSE","false").replace("TRUE","true")
                            
    }
    
    public static def String toSmvIdentifier(String name) {
        val noIdentifierCharacterMatcher = NO_IDENTIFIER_CHARACTER_PATTERN.matcher(name)
        return noIdentifierCharacterMatcher.replaceAll("_")
    }
}
