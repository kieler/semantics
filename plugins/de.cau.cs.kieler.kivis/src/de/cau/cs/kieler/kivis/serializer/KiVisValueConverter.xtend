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
package de.cau.cs.kieler.kivis.serializer

import org.eclipse.xtext.common.services.DefaultTerminalConverters
import org.eclipse.xtext.conversion.IValueConverter
import org.eclipse.xtext.conversion.ValueConverter
import org.eclipse.xtext.conversion.impl.STRINGValueConverter
import org.eclipse.xtext.util.Strings
import org.eclipse.xtext.nodemodel.INode
import org.eclipse.xtext.conversion.ValueConverterWithValueException
import org.eclipse.xtext.conversion.ValueConverterException

/**
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
class KiVisValueConverter extends DefaultTerminalConverters {
    
    static class SCRIPTValueConverter extends STRINGValueConverter {
        override toEscapedString(String value) {
            return "'" + Strings.convertToJavaString(value, false) + "'";
        }
        
        override toValue(String string, INode node) {
            if (string === null)
                return null;
            try {
                if (string.length() == 1) {
                    throw new ValueConverterWithValueException(getStringNotClosedMessage(), node, "", null);
                }
                return convertFromString(string, node);
            } catch (IllegalArgumentException e) {
                throw new ValueConverterException(e.getMessage(), node, e);
            }
        }
    }
    
    val scriptValueConverter = new SCRIPTValueConverter()
    
    @ValueConverter(rule = "SCRIPT")
    def IValueConverter<String> SCRIPT() {
        return scriptValueConverter
    }
}