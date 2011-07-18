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
 */
package de.cau.cs.kieler.synccharts.text.kits.formatting;

import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverter;
import org.eclipse.xtext.util.Strings;
import org.eclipse.xtext.nodemodel.INode;

import de.cau.cs.kieler.synccharts.text.actions.formatting.ActionsValueConverter;

/**
 * Customized {@link IValueConverter}.
 * Realizes the mapping of special terminal symbols to model content.
 * 
 * @author chsch
 */
public class KitsValueConverter extends ActionsValueConverter {

//    /**
//     * Provides customized string converter specializing
//     * {@link org.eclipse.xtext.conversion.impl.STRINGValueConverter}.
//     * 
//     * @return dedicated value converter
//     */
//    @ValueConverter(rule = "STRING")
//    public IValueConverter<String> STRING() {
//        return new org.eclipse.xtext.conversion.impl.STRINGValueConverter() {
//
//            public String toString(String value) {
//                return value == null ? new String("") : super.toString(value);
//            }            
//        };
//    }
    
    
    /**
     * Provides transition label converter dropping/attaching the leading/trailing character.
     * @return dedicated value converter
     */
    @ValueConverter(rule = "TRANSITION_LABEL")
        public IValueConverter<String> TransitionLabalString() {
                return new IValueConverter<String>() {

                        public String toValue(String string, INode node) {
                                return string.replace("%", "").trim();
                        }

                        public String toString(String value) {
                                if (Strings.isEmpty(value)) {
                                        return null;
                                } else {
                                        return "  % " + value + " %";
                                }
                        }
                };
    }
}
