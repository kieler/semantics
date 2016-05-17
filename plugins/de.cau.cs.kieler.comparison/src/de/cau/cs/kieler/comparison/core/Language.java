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
package de.cau.cs.kieler.comparison.core;

/**
 * Each test case program is written in a programming language. This enum is used for these
 * languages and specifies which languages are handled in the comparison.
 * 
 * @author nfl
 */
public enum Language {

    SCCharts, Esterel, Java, C, ExecutableCode;

    /**
     * This method can be used to get the language matching to a given file extension.
     * 
     * @param extension
     *            the file extension
     * @return the language using the file extension
     * @throws LanguageException
     *             if no matching language can be found, an exception is thrown
     */
    public static Language fromExtension(final String extension) throws LanguageException {
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
