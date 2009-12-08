/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2009 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 * 
 *****************************************************************************/
package de.cau.cs.kieler.synccharts.labelparser.formatting;

import org.eclipse.xtext.common.services.DefaultTerminalConverters;
import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverter;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.parsetree.AbstractNode;
import org.eclipse.xtext.util.Strings;



/**
 * @author haf
 *
 */
public class ActionLabelValueConverter extends DefaultTerminalConverters {

    /**
     * Standard boolean data type converter to convert standard Java style
     * boolean strings "true" and "false" into Boolean objects and vice versa.
     * @return value converter for standard Java style booleans
     */
    @ValueConverter(rule = "Boolean")
    public IValueConverter<Boolean> Boolean() {
            return new IValueConverter<Boolean>() {
                    
                    public Boolean toValue(String string, AbstractNode node) {
                            if (Strings.isEmpty(string))
                                    throw new ValueConverterException("Couldn't convert empty string to boolean", node, null);
                            try {
                                    return Boolean.valueOf(string);
                            } catch (NumberFormatException e) {
                                    throw new ValueConverterException("Couldn't convert '"+string+"' to boolean", node, e);
                            }
                    }

                    public String toString(Boolean value) {
                            return value.toString();
                    }
            };
    }

    /**
     * Standard boolean data type converter to convert standard Java style
     * boolean strings "true" and "false" into Boolean objects and vice versa.
     * @return value converter for standard Java style booleans
     */
    @ValueConverter(rule = "Float")
    public IValueConverter<Float> Float() {
            return new IValueConverter<Float>() {
                    
                    public Float toValue(String string, AbstractNode node) {
                            if (Strings.isEmpty(string))
                                    throw new ValueConverterException("Couldn't convert empty string to float", node, null);
                            try {
                                    return Float.valueOf(string);
                            } catch (NumberFormatException e) {
                                    throw new ValueConverterException("Couldn't convert '"+string+"' to float", node, e);
                            }
                    }

                    public String toString(Float value) {
                            return value.toString();
                    }
            };
    }

    
}
