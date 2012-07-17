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
package de.cau.cs.kieler.sj;

/**
 * Interface with a single method to combine two values. This class is used to use functions as
 * parameters. This is the standard java closure hack.
 * 
 * @author mhei
 * 
 */
public interface CombinationFunction {

    /**
     * A method with two parameters which should be combined in any way.
     * 
     * @param oldVal
     *            The old value.
     * @param newVal
     *            the new value.
     * @return The result of combine the new and the old value.
     */
    Number call(Number oldVal, Number newVal);

    /**
     * Adds two Numbers oldVal + newVal.
     */
    CombinationFunction ADD = new CombinationFunction() {
        public Number call(final Number oldVal, final Number newVal) {
            if (oldVal instanceof Double || oldVal instanceof Float || newVal instanceof Double
                    || newVal instanceof Float) {
                return oldVal.doubleValue() + newVal.doubleValue();
            } else if (oldVal instanceof Long || newVal instanceof Long) {
                return oldVal.longValue() + newVal.longValue();
            } else {
                return oldVal.intValue() + newVal.intValue();
            }
        }
    };

    /**
     * Multiply two Numbers oldVal * newVal.
     */
    CombinationFunction MULTIPLY = new CombinationFunction() {
        public Number call(final Number oldVal, final Number newVal) {

            if (oldVal instanceof Double || oldVal instanceof Float || newVal instanceof Double
                    || newVal instanceof Float) {
                return oldVal.doubleValue() * newVal.doubleValue();
            } else if (oldVal instanceof Long || newVal instanceof Long) {
                return oldVal.longValue() * newVal.longValue();
            } else {
                return oldVal.intValue() * newVal.intValue();
            }

        }
    };

    /**
     * The maximum of all combined values.
     */
    CombinationFunction MAX = new CombinationFunction() {
        public Number call(final Number oldVal, final Number newVal) {

            if (oldVal instanceof Double || oldVal instanceof Float || newVal instanceof Double
                    || newVal instanceof Float) {
                return Math.max(oldVal.doubleValue(), newVal.doubleValue());
            } else if (oldVal instanceof Long || newVal instanceof Long) {
                return Math.max(oldVal.longValue(), newVal.longValue());
            } else {
                return Math.max(oldVal.intValue(), newVal.intValue());
            }
        }
    };

    /**
     * The minimum of all combined values.
     */
    CombinationFunction MIN = new CombinationFunction() {
        public Number call(final Number oldVal, final Number newVal) {

            if (oldVal instanceof Double || oldVal instanceof Float || newVal instanceof Double
                    || newVal instanceof Float) {
                return Math.min(oldVal.doubleValue(), newVal.doubleValue());
            } else if (oldVal instanceof Long || newVal instanceof Long) {
                return Math.min(oldVal.longValue(), newVal.longValue());
            } else {
                return Math.min(oldVal.intValue(), newVal.intValue());
            }
        }
    };
}
