/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2010 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 * 
 *****************************************************************************/
package de.cau.cs.kieler.core.annotations.formatting;

import org.eclipse.xtext.common.services.DefaultTerminalConverters;
import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverter;
import org.eclipse.xtext.parsetree.AbstractNode;
import org.eclipse.xtext.util.Strings;


/**
 * 
 * @author chsch
 *
 */
public class AnnotationsValueConverter extends DefaultTerminalConverters {

	
    /**
     * Provides STRING converter dropping/attaching the leading/trailing character.
     * Most important reasons of its presence are debugging purposes.
     * @return dedicated value converter
     */
    @ValueConverter(rule = "STRING")
	public IValueConverter<String> String() {
		return new IValueConverter<String>() {

			public String toValue(String string, AbstractNode node) {
				return Strings.isEmpty(string)?"":string.substring(1, string.length()-1);
			}

			public String toString(String value) {
				if (Strings.isEmpty(value)) {
					return null;
				} else {
					return "\"" + value + "\"";
				}
			}
		};
    }
    
    
    /**
     * Provides EString converter dropping/attaching the leading/trailing character.
     * @return dedicated value converter
     */
    @ValueConverter(rule = "EString")
	public IValueConverter<String> EString() {
		return new IValueConverter<String>() {

			public String toValue(String string, AbstractNode node) {
				if (!Strings.isEmpty(string)) {
					if (string.startsWith("\"") || string.startsWith("'")) {
						return string.substring(1, string.length()-1);
					}
					else {
						return string;
					}
				}
				return "";
			}

			public String toString(String value) {
				if (Strings.isEmpty(value)) {
					return null;
				} else {
					if (value.contains(" ")) {
						return "\"" + value + "\"";
					} else {
						return value;
					}
				}
			}
		};
    }

    

}