/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2012 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.core.annotations.text.formatting;

import org.eclipse.xtext.common.services.DefaultTerminalConverters;
import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverter;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.util.Strings;
import org.eclipse.xtext.nodemodel.INode;

/**
 * TODO: Document.
 * 
 * <p><em>Note:</em> FindBugs complains about method names beginning with capital letters in this
 * class. This seems to be necessary, however, since the method names have to match the names of
 * the actual annotations whose value they extract.
 * 
 * @author chsch
 */
public class AnnotationsValueConverter extends DefaultTerminalConverters {

    /**
     * Provides comment annotation converter dropping/attaching the leading/trailing characters.
     * 
     * @return dedicated value converter
     */
    @ValueConverter(rule = "COMMENT_ANNOTATION")
    public IValueConverter<String> convertCommentAnnotation() {
        return new IValueConverter<String>() {

            public String toValue(final String string, final INode node) {
                return string.replace("/**", "").replace("*/", "").trim();
            }

            public String toString(final String value) {
                if (Strings.isEmpty(value)) {
                    return null;
                } else {
                    return "/** " + value + " */";
                }
            }
        };
    }
    
//    /**
//     * Provides comment annotation converter dropping/attaching the leading/trailing characters.
//     * 
//     * @return dedicated value converter
//     */
//    // CHSCH: registration disabled since TypeId is now realized by means of a data type rule 
//    //  @ValueConverter(rule = "TypeId")
//    public IValueConverter<String> TypeId() {
//        return new IValueConverter<String>() {
//
//            public String toValue(String string, INode node) {
//                return string.substring(1, string.length() - 1).trim();
//            }
//
//            public String toString(String value) {
//                if (Strings.isEmpty(value)) {
//                    return "[]";
//                } else {
//                    return "[" + value + "]";
//                }
//            }
//        };
//    }
    
    /**
     * Provides EString converter dropping/attaching the leading/trailing character.
     * 
     * @return dedicated value converter
     */
    @ValueConverter(rule = "EString")
    public IValueConverter<String> convertEString() {
        return new IValueConverter<String>() {

            public String toValue(final String string, final INode node) {
                if (!Strings.isEmpty(string)) {
                    if (string.startsWith("\"") || string.startsWith("'")) {
                        return string.substring(1, string.length() - 1);
                    } else {
                        return string;
                    }
                }
                return "";
            }

            public String toString(final String value) {
                String res = "\"\"";
                if (!Strings.isEmpty(value)) {
                    try {
                        res = AnnotationsValueConverter.this.getConverter("ID").toString(value);
                    } catch (ValueConverterException e) {
                        res = AnnotationsValueConverter.this.getConverter("STRING").toString(value);
                    }
                }
                return res;
            }
        };
    }
}
