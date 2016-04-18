/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2015 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.comparison.core;

/**
 * @author nfl
 */
public enum Language {

    SCCharts,
    Esterel,
    Java,
    C,
    ExecutableCode;

    public static Language fromExtension(String extension) throws LanguageException {
        if (extension != null) {
            switch (extension) {
            case ".sct":
            case "sct":
                return SCCharts;
            case ".strl":
            case "strl":
                return Esterel;
            case ".java":
            case "java":
                return Java;
            case ".c":
            case "c":
                return C;

            default:
            }
        }
        throw new LanguageException("Language could not be parsed from extension " + extension);
    }
}
