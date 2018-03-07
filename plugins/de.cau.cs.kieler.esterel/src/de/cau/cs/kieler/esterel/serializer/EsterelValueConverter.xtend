/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2011 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.esterel.serializer;

import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverter;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.util.Strings;

import de.cau.cs.kieler.annotations.formatting.AnnotationsValueConverter;
import de.cau.cs.kieler.scl.formatting.SCLValueConverter;

/**
 * Reuse functionality introduced by the KExpressionsValueConverter here.
 * 
 * @author uru
 * @kieler.design 2012-10-08 proposed cmot
 * @kieler.rating 2012-10-08 proposed yellow cmot
 * 
 */
public class EsterelValueConverter extends SCLValueConverter  {
    
//    /**
//     * Standard boolean data type converter to convert standard Java style
//     * boolean strings "true" and "false" into Boolean objects and vice versa.
//     *
//     * @return value converter for standard Java style booleans
//     */
//    @ValueConverter(rule = "BOOLEAN")
//    def IValueConverter<Boolean> _boolean() {
//        return new IValueConverter<Boolean>() {
//
//            def Boolean toValue(String string, INode node) {
//                if (Strings.isEmpty(string))
//                    throw new ValueConverterException("Couldn't convert empty string to boolean",
//                            node, null);
//                try {
//                    return Boolean.valueOf(string);
//                } catch (NumberFormatException e) {
//                    throw new ValueConverterException("Couldn't convert '" + string
//                            + "' to boolean", node, e);
//                }
//            }
//
//            def String toString(Boolean value) {
//                return value.toString();
//            }
//        };
//    }
//
//    /**
//     * Primitive integer data type converter provider allowing negative numbers.
//     *
//     * @return value converter for standard Java style ints
//     */
//    @ValueConverter(rule = "INT")
//    def IValueConverter<Integer> _int() {
//        return new org.eclipse.xtext.conversion.impl.INTValueConverter() {
//            def String toString(Integer value) {
//                if (value == null)
//                    throw new ValueConverterException(
//                            "INT-value may not be null. (null indeed, zero is ok)", null, null);
//                return value.toString();
//            }
//
//            protected def void assertValidValue(Integer value) {
//                // Nothing to do, super method throws exception if value < 0
////                if (value >= 0) {
////                    throw new ValueConverterException(
////                            "NINT must be < 0", null, null);
////                }
//            }
//
//
//        };
//    }
//
//    /**
//     * Standard float data type converter to convert standard Java style floats.
//     *
//     * @return value converter for standard Java style floats
//     */
//    @ValueConverter(rule = "FLOAT")
//    def IValueConverter<Float> _float() {
//        return new IValueConverter<Float>() {
//
//            def Float toValue(String string, INode node) {
//                if (Strings.isEmpty(string))
//                    throw new ValueConverterException("Couldn't convert empty string to float",
//                            node, null);
//                try {
//                    return Float.valueOf(string);
//                } catch (NumberFormatException e) {
//                    throw new ValueConverterException("Couldn't convert '" + string + "' to float",
//                            node, e);
//                }
//            }
//
//            def String toString(Float value) {
//                return value.toString();
//            }
//        };
//    }
//
//    /**
//     * Primitive HOSTCODE data type converter providing proper serialization.
//     *
//     * @return value converter for HOSTCODE specializing
//     * {@link org.eclipse.xtext.conversion.impl.STRINGValueConverter}
//     */
//    @ValueConverter(rule = "HOSTCODE")
//    def IValueConverter<String> _hostcode() {
//        return new org.eclipse.xtext.conversion.impl.STRINGValueConverter() {
//            override String toString(String value) {
//                if (value == null)
//                    throw new ValueConverterException(
//                            "HOSTCODE may not be 'null'.", null, null);
//                return "'" + value.toString() + "'";
//            }
//        };
//    }

    // Important for strings with double quotes
    @ValueConverter(rule = "STRING")
    def IValueConverter<String> _string() {
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
                var String res = "\"\"";
                if (!Strings.isEmpty(value)) {
                    res = "\"" + value + "\"";
                }
                return res;
            }
        };
    }


}