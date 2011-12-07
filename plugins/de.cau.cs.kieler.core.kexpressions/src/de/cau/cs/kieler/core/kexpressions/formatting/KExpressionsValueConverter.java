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
package de.cau.cs.kieler.core.kexpressions.formatting;

import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverter;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.util.Strings;
import org.eclipse.xtext.nodemodel.INode;

import de.cau.cs.kieler.core.annotations.text.formatting.AnnotationsValueConverter;

/**
 * @author chsch
 * @author haf
 * 
 */
public class KExpressionsValueConverter extends AnnotationsValueConverter {

    /**
     * Standard boolean data type converter to convert standard Java style
     * boolean strings "true" and "false" into Boolean objects and vice versa.
     * 
     * @return value converter for standard Java style booleans
     */
    @ValueConverter(rule = "Boolean")
    public IValueConverter<Boolean> Boolean() {
        return new IValueConverter<Boolean>() {

            public Boolean toValue(String string, INode node) {
                if (Strings.isEmpty(string))
                    throw new ValueConverterException("Couldn't convert empty string to boolean",
                            node, null);
                try {
                    return Boolean.valueOf(string);
                } catch (NumberFormatException e) {
                    throw new ValueConverterException("Couldn't convert '" + string
                            + "' to boolean", node, e);
                }
            }

            public String toString(Boolean value) {
                return value.toString();
            }
        };
    }

    /**
     * Primitive integer data type converter provider allowing negative numbers.
     * 
     * @return value converter for standard Java style ints
     */
    @ValueConverter(rule = "INT")
    public IValueConverter<Integer> INT() {
        return new org.eclipse.xtext.conversion.impl.INTValueConverter() {
            public String toString(Integer value) {
                if (value == null)
                    throw new ValueConverterException(
                            "INT-value may not be null. (null indeed, zero is ok)", null, null);
                return value.toString();
            }
            
            protected void assertValidValue(Integer value) {
                // Nothing to do, super method throws exception if value < 0
//                if (value >= 0) {
//                    throw new ValueConverterException(
//                            "NINT must be < 0", null, null);
//                }
            }
            
            
        };
    }

    /**
     * Standard float data type converter to convert standard Java style floats.
     * 
     * @return value converter for standard Java style floats
     */
    @ValueConverter(rule = "Float")
    public IValueConverter<Float> Float() {
        return new IValueConverter<Float>() {

            public Float toValue(String string, INode node) {
                if (Strings.isEmpty(string))
                    throw new ValueConverterException("Couldn't convert empty string to float",
                            node, null);
                try {
                    return Float.valueOf(string);
                } catch (NumberFormatException e) {
                    throw new ValueConverterException("Couldn't convert '" + string + "' to float",
                            node, e);
                }
            }

            public String toString(Float value) {
                return value.toString();
            }
        };
    }
    
    /**
     * Primitive HOSTCODE data type converter providing proper serialization.
     * 
     * @return value converter for HOSTCODE specializing
     * {@link org.eclipse.xtext.conversion.impl.STRINGValueConverter}
     */
    @ValueConverter(rule = "HOSTCODE")
    public IValueConverter<String> HOSTCODE() {
        return new org.eclipse.xtext.conversion.impl.STRINGValueConverter() {
            public String toString(String value) {
                if (value == null)
                    throw new ValueConverterException(
                            "HOSTCODE may not be 'null'.", null, null);
                return "'" + value.toString() + "'";
            }
        };
    }



}
