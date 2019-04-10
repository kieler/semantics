/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2012 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.annotations.converter

import com.google.inject.Inject
import org.eclipse.xtext.common.services.DefaultTerminalConverters
import org.eclipse.xtext.conversion.IValueConverter
import org.eclipse.xtext.conversion.ValueConverter
import org.eclipse.xtext.conversion.ValueConverterException
import org.eclipse.xtext.nodemodel.INode
import org.eclipse.xtext.util.Strings

/**
 * Custom
 * {@link org.eclipse.xtext.conversion.impl.AbstractDeclarativeValueConverterService
 * AbstractDeclarativeValueConverterService} that contributes value converters
 * dedicated to the COMMENT_ANNOTATION terminal and the EString data type,
 * defined in the Annotations grammar.
 * 
 * @author chsch ssm
 */
class AnnotationsValueConverter extends DefaultTerminalConverters {

    /**
     * Provides comment annotation converter dropping/attaching the leading/trailing characters.
     * 
     * @return dedicated value converter
     */
    @ValueConverter(rule = "COMMENT_ANNOTATION")
    def IValueConverter<String> convertCommentAnnotation() {
        return new IValueConverter<String>() {

            override String toValue(String string, INode node) {
                
                val lines = string.replace("/**", "").replace("*/", "").replaceAll("\\r", "").trim.split("\n")
                val newLines = <String> newArrayList
                for (i : 0..lines.length - 1) {
                    newLines += lines.get(i).replaceFirst("^\\s*\\*\\s?", "")
                }
                
                val newString = newLines.join("\n")
                return newString
            }
    
            override String toString(String value) {
                if (Strings.isEmpty(value)) {
                    return null;
                } else {
                    val lines = value.split("\n")
                    if (lines.length > 1) for (i : 1..lines.length - 1) {
                        var newLine = lines.get(i).replaceFirst("\\s+\\*", " *")
                        if (!newLine.startsWith(" *") && !newLine.startsWith("/**")) newLine = " * " + newLine
                        lines.set(i, newLine)
                    }                   
                    
                    return "/**\n " + lines.join("\n") + "\n */";
                }
            }
        };
    }
    
    @Inject
    QualifiedIDValueConverter qualifiedIDValueConverter;
    
    @ValueConverter(rule = "QualifiedID") 
    def IValueConverter<String> convertQualifiedID() {
        return qualifiedIDValueConverter;
    }
    
    @Inject
    ExtendedIDValueConverter extendedIDValueConverter;
    
    @ValueConverter(rule = "ExtendedID") 
    def IValueConverter<String> convertExtendedID() {
        return extendedIDValueConverter;
    }    
    
    /**
     * Provides EString converter dropping/attaching the leading/trailing character.
     * 
     * @return dedicated value converter
     */
    @ValueConverter(rule = "EString")
    def IValueConverter<String> convertEString() {
        return genericStringValueConverter(false, false);
    }

    @ValueConverter(rule = "EStringBoolean")
    def IValueConverter<String> convertEStringBoolean() {
        return genericStringValueConverter(true, false);
    }

    @ValueConverter(rule = "EStringAllTypes")
    def IValueConverter<String> convertEStringAllTypes() {
        return genericStringValueConverter(true, true);
    }
    
    def IValueConverter<String> genericStringValueConverter(boolean unquotedBooleans, boolean unqoutedNumbers) {
        return new IValueConverter<String>() {

            override String toValue(String string, INode node) {
                if (!Strings.isEmpty(string)) {
                    if (string.startsWith("\"") || string.startsWith("'")) {
                        return removeEscapeChars(string.substring(1, string.length() - 1));
                    } else {
                        return string;
                    }
                }
                return "";
            }

            override String toString(String value) {
                if (!Strings.isEmpty(value)) {
                    try {
                        if (unquotedBooleans && ("true".equals(value) || "false".equals(value))) {
                            return value
                        }
                        if (unqoutedNumbers && value.matches("-?\\d+(\\.\\d+)?")) {
                            return value
                        }
                        return AnnotationsValueConverter.this.getConverter("ID").toString(value);
                    } catch (ValueConverterException e) {
                        return AnnotationsValueConverter.this.getConverter("STRING").toString(value);
                    }
                }
                return "\"\"";
            }
        };

    }
    
    static def String removeEscapeChars(String string) {
        return string.replaceAll("\\\\\\\"", "\"").replaceAll("\\\\\\\\", "\\\\");
    }    
}
