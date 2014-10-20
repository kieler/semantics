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
import org.eclipse.xtext.conversion.impl.INTValueConverter;
import org.eclipse.xtext.util.Strings;
import org.eclipse.xtext.nodemodel.INode;

/**
 * Custom
 * {@link org.eclipse.xtext.conversion.impl.AbstractDeclarativeValueConverterService
 * AbstractDeclarativeValueConverterService} that contributes value converters
 * dedicated to the COMMENT_ANNOTATION terminal and the EString data type,
 * defined in the Annotations grammar.
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
    
    /**
     * Customized {@link INTValueConverter} accepting negative {@link Integer Integers}.
     * 
     * @author aum
     */
    public static class ExtendedINTValueConverter extends INTValueConverter {
        
        /**
         * {@inheritDoc}
         */
        @Override
        protected void assertValidValue(final Integer value) {
            // each value is supported!
        }
    }
}
