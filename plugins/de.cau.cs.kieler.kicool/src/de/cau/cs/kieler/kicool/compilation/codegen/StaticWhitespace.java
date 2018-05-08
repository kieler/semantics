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
package de.cau.cs.kieler.kicool.compilation.codegen;

/**
 * Statically pre-calculate common whitespaces for code generation.
 * 
 * @author ssm
 * @kieler.design 2018-05-08 proposed 
 * @kieler.rating 2018-05-08 proposed yellow 
 */
public class StaticWhitespace {

    private static final int PRE_CALCULATED_WHITESPACE = 160;
    
    private static final String[] whitespace = new String[PRE_CALCULATED_WHITESPACE + 1]; 
    
    static {
        whitespace[0] = "";
        for(int i = 1; i < PRE_CALCULATED_WHITESPACE; i++) {
            whitespace[i] = whitespace[i - 1] + " ";
        }
    }
    
    public static String getSpace(int n) {
        if (n <= 0) {
            return "";
        } else if (n < PRE_CALCULATED_WHITESPACE) { 
            return whitespace[n];
        } else {
            String s = "";
            for(int i = 0; i < n; i++) {
                s = s + " ";
            }
            return s;
        }
    }
    
}
