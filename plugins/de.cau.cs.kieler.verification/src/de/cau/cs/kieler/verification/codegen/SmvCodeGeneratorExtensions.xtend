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
package de.cau.cs.kieler.verification.codegen

/** 
 * @author aas
 */
class SmvCodeGeneratorExtensions {
    
    public def static String toSmvExpression(CharSequence kexpression) {
        return kexpression.toString.replace("==", "=").replace("&&", "&").replace("||", "|")
                                   .replaceAll('''\bfalse\b''', " FALSE ").replaceAll('''\btrue\b''', " TRUE ")
                                   .replaceAll('''%''', " mod ").replaceAll("  ", " ").trim
    }
    
    public static def String toKExpression(CharSequence smvExpression) {
        return smvExpression.toString.replace("=", "==").replace("&","&&").replace("|","||")
                                     .replaceAll('''\bFALSE\b'''," false ").replaceAll('''\bTRUE\b'''," true ")
                                     .replaceAll('''\bmod\b''', " % ").replaceAll("  ", " ").trim
                            
    }
}
