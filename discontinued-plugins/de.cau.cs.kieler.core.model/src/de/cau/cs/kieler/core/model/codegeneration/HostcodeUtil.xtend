/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2016 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.core.model.codegeneration

/**
 * @author ssm
 *
 */
class HostcodeUtil {
    
    def static removeEscapeChars(String string) {
        string.replaceAll("\\\\\\\"", "\"").replaceAll("\\\\\\\\", "\\\\")
    }
}